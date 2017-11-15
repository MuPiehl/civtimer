package de.mpi.civ.service;

import de.mpi.civ.exception.TemplateNotFoundException;
import de.mpi.spring.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by MPi on 14.11.2017.
 */
//@RunWith(SpringJUnit4ClassRunner.class)

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = TestConfig.class)
public class TemplateLoaderTest {
    final static Logger log = LoggerFactory.getLogger(TemplateLoaderTest.class);

    @Autowired
    TemplateLoader templateLoader;

    @Test
    public void testeAlles() throws IOException {
        byte[] templatedata = new byte[0];
        boolean exceptionThrown = false;
        try {
            templatedata = templateLoader.loadTemplate("from_tempfile.jpg");
        } catch (TemplateNotFoundException tnfE) {
            exceptionThrown = true;
        }
        assertTrue("Das Template darf jetzt nicht gefunden werden", exceptionThrown);
        exceptionThrown = false;

        try {
            templatedata = templateLoader.loadTemplate("from_class_path.jpg");
        } catch (TemplateNotFoundException tnfE) {
            Assert.fail("Datei muss im Classpath zu finden sein --> keine Exception");
            exceptionThrown = true;
        }
        assertFalse("Das Template muss jetzt gefunden werden", exceptionThrown);
        assertEquals("Daten sollten zu finden sein", 142007, templatedata.length);

        log.info("Test MPi :" + System.getProperty("java.io.tmpdir"));

        FileOutputStream out = new FileOutputStream(System.getProperty("java.io.tmpdir") + "from_tempfile.jpg");
        out.write(templatedata);
        out.close();

        try {
            templatedata = templateLoader.loadTemplate("from_tempfile.jpg");
        } catch (TemplateNotFoundException tnfE) {
            Assert.fail("Datei muss jetzt im Temp zu finden sein --> keine Exception");
            exceptionThrown = true;
        }
        assertFalse("Das Template muss jetzt gefunden werden", exceptionThrown);
        assertEquals("Daten sollten zu finden sein", 142007, templatedata.length);
    }
}
