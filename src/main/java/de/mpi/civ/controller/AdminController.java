package de.mpi.civ.controller;

import com.mongodb.*;


import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import de.mpi.civ.data.MongoOverviewDto;


import org.bson.BSON;
import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created by matthiaspiehl on 13.07.16.
 */
@RestController
public class AdminController {
    final static Logger log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private MongoClient mongo;

    @RequestMapping(value = {"/mongo"}, method = RequestMethod.GET)
    public List<MongoOverviewDto> getMongoOverview() {
        List<MongoOverviewDto> result = new ArrayList<>();

//        BasicDBObject basicDBObject = new BasicDBObject();

//        DBCursor dbCursor =


        MongoCollection<Document> collection = mongo.getDatabase("mongo_test").getCollection("vorgaenge");

        long count = collection.count();
        log.debug("Dokumente gefunden in Vorgaenge: " + count);

        Stream<Document> documentStream = StreamSupport.stream(collection
                .find(new Document("test", new Document("$gte", 125))).spliterator(), false);
//        DBCursor dbCursor = collection.find(basicDBObject);
//        FindIterable<Document> documents = collection.find(new Document("test", "$gt:5"));

//        log.debug("gefiltert (\"$gte\", 125): " + documentStream.count());
        documentStream.forEach((document) -> {
                    ObjectId id = (ObjectId) document.get("_id");
                    Integer test = new Integer(document.getDouble("test").intValue());

                    log.debug("id: " + id);
                    log.debug("test: " + test);
                    MongoOverviewDto dto = new MongoOverviewDto(id, test);

                    result.add(dto);
                }

        );
        //  while (dbCursor.hasNext()) {
//        {
//            DBObject next = dbCursor.next();
//        }
//            MongoOverviewDto dto = new MongoOverviewDto((ObjectId)next.get("_id"), new Integer(((Double)next.get("test")).intValue()));
//            result.add(dto);
//        }
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
