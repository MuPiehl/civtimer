package de.mpi.civ.data;

import com.mongodb.DBObject;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by matthiaspiehl on 13.07.16.
 */
@Document
public class MongoOverviewDto {
    @Id
    private String _id;
    private Integer test;



    public MongoOverviewDto(ObjectId id, Integer test) {
        this._id = id.toString();
        this.test = test;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getTest() {
        return test;
    }

    public void setTest(Integer test) {
        this.test = test;
    }

}
