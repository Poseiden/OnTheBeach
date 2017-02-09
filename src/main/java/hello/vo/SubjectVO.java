package hello.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import hello.entity.Subject;

public class SubjectVO {
    @JsonProperty
    private String id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String age;

    @JsonProperty("subject")
    private Subject subjects;

}
