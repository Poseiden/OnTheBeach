package hello.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;

public class Subject {
    @JsonProperty("_id")
    private ObjectId id;

    @JsonProperty
    private String name;
}
