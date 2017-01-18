package hello.repository;

import hello.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String>{
}
