package de.mpi.civ.service;

import de.mpi.spring.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by MPi on 14.11.2017.
 */
//@RunWith(SpringJUnit4ClassRunner.class)

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = TestConfig.class)
public class TemplateLoaderTest {
    @Autowired
    TemplateLoader templateLoader;

    @Test
    public void testeAlles() {
        byte[] templatedata;
        templatedata = templateLoader.loadTemplate("abc123");

        Assert.assertEquals(0, templatedata.length);
    }
}
