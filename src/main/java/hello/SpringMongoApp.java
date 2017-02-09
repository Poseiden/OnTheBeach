package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringMongoApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringMongoApp.class, args);
    }
}
