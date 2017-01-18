package hello.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Subject {
    @Id
    private ObjectId id;

    @JsonProperty
    private String name;
}
