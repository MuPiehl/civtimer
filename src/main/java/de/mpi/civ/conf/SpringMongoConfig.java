package de.mpi.civ.conf;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by matthiaspiehl on 13.07.16.
 */
@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "mongo_test";
    }

    @Override
    @Bean
    public MongoClient mongo() throws Exception {
        return new MongoClient("192.168.99.100", 32768);
    }
}
