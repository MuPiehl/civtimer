package de.mpi.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by matthiaspiehl on 22.05.17.
 */
@Configuration()
@ComponentScan(basePackages = { "de.mpi" })
@PropertySource("config.properties")
public class TestConfig {
    //1.2.3.4
    @Value("${mongodb.url}")
    private String mongodbUrl;

    //hello
    @Value("${mongodb.db}")
    private String defaultDb;

    public String getMongodbUrl() {
        return mongodbUrl;
    }

    public String getDefaultDb() {
        return defaultDb;
    }
}
