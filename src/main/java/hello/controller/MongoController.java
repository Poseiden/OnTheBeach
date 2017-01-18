package hello.controller;

import hello.entity.Student;
import hello.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@RestController
@RequestMapping("/db/students")
public class MongoController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping()
    public Student save(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping("/id={id}")
    public Student findById(@PathVariable String id) {
        return studentRepo.findOne(id);
    }

    @GetMapping("/age={age}")
    public List<Student> findByAge(@PathVariable String age) {
        Criteria criteria = where("age").is(age);
        return mongoTemplate.find(new Query(criteria), Student.class);
    }

    @GetMapping("/subject={subjectName}")
    public List<Student> findBySubject(@PathVariable String subjectName) {
        Criteria criteria = where("subjects.name").is(subjectName);
        return mongoTemplate.find(new Query(criteria), Student.class);
    }

    @GetMapping
    public List<Student> findAll() {
        return mongoTemplate.findAll(Student.class);
    }
}
