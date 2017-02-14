package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableAutoConfiguration
@Profile("application-dev.properties")
public class SpringMongoApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringMongoApp.class, args);
    }

}
