package spring.cloud.feign.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.feign.producer.entitys.Person;

@RestController
public class PersonProducerController {

    @RequestMapping("/person")
    public String get(@RequestParam String name) {
        return new Person(name).toString();
    }
}
