package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/save/{key}/{value}")
    public void save(@PathVariable("key") String key, @PathVariable("value") String value) {
        redisTemplate.opsForHash().put("map", key, value);
        redisTemplate.exec();
    }

    @GetMapping("/saveValue")
    public void saveValue() {
        redisTemplate.opsForValue().set("a", "a");
    }

    @GetMapping("/get/{key}")
    public Object get(@PathVariable("key") String key) {
        Map<String, String> entry = redisTemplate.opsForHash().entries("map");

        return redisTemplate.opsForHash().get("map", key);
    }
}
