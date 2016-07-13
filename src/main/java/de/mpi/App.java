package de.mpi;

import de.mpi.civ.conf.SpringMongoConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoOperations;


@ComponentScan
@Configuration
@Import(SpringMongoConfig.class)
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
    //    ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
      //  MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");

        SpringApplication.run(App.class);
    }
}
