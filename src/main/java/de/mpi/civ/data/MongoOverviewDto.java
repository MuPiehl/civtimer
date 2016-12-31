package de.mpi.civ.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by matthiaspiehl on 13.07.16.
 */
//@Document
@JsonIgnoreProperties(ignoreUnknown=true)
public class MongoOverviewDto {
//    @Id
//   private ObjectId _id;
    private Double test;

    public MongoOverviewDto() {

    }

    public MongoOverviewDto(ObjectId id, Double test) {
//        this._id = id;
        this.test = test;
    }

//    public ObjectId get_id() {
//        return _id;
//    }

//    public void set_id(ObjectId _id) {
//        this._id = _id;
//    }

    public Double getTest() {
        return test;
    }

    public void setTest(Double test) {
        this.test = test;
    }

}
