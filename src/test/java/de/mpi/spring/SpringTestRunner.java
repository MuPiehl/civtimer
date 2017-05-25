package de.mpi.spring;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


/**
 * Created by matthiaspiehl on 22.05.17.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class SpringTestRunner {
    final static Logger log = LoggerFactory.getLogger(SpringTestRunner.class);


    @Autowired
    private Environment env;
    //  private TransferService transferService;

    @Test
    public void testSpringConfig() {
        String mongodbUrl = env.getProperty("mongodb.url");
        String defaultDb = env.getProperty("mongodb.db");

        log.debug("spring hat Config gelesen:");
        log.debug("mongodbUrl: " + mongodbUrl);
        log.debug("defaultDb: " + defaultDb);

        assertEquals("hello", defaultDb);
    }

}
