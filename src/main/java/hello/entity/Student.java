package hello.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Student{
    @Id
    private ObjectId id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String age;

    @JsonProperty
    private List<Subject> subjects;
}
