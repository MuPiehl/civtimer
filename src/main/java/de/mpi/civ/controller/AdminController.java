package de.mpi.civ.controller;

import com.mongodb.*;


import de.mpi.civ.data.MongoOverviewDto;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matthiaspiehl on 13.07.16.
 */
@RestController
public class AdminController {
    @Autowired
    private Mongo mongo;

    @RequestMapping(value = {"/mongo"}, method = RequestMethod.GET)
    public List<MongoOverviewDto> getMongoOverview() {
        List<MongoOverviewDto> result = new ArrayList<>();

        BasicDBObject basicDBObject = new BasicDBObject();

//        DBCursor dbCursor =

        DBCollection collection = mongo.getDB("mongo_test").getCollection("vorgaenge");

        long count = collection.count();

        DBCursor dbCursor = collection.find(basicDBObject);

        while (dbCursor.hasNext()) {
            DBObject next = dbCursor.next();
            MongoOverviewDto dto = new MongoOverviewDto((ObjectId)next.get("_id"), new Integer(((Double)next.get("test")).intValue()));
            result.add(dto);
        }
/*
        MongoClient mongo = new MongoClient("192.168.99.100", 32769);



        MongoCollection<Document> collection = mongo.getDatabase("mongo_test").
                getCollection("vorgaenge");
//                find(basicDBObject,  MongoOverviewDto.class);
/*
        FindIterable<Document> cursor = collection.find();
        while (cursor.
                hasNext()) {
            System.out.println(cursor.next());
        }
        */
        /*
        FindIterable<Document> documents = collection.find(basicDBObject);
        MongoCursor<Document> iterator = documents.iterator();

        while (iterator.hasNext()) {
            iterator.next();
*/
//            result.add(new MongoOverviewDto());
//        }

        return result;
    }
}
