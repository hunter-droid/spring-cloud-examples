package spring.cloud.feign.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.feign.consumer.contracts.Person;

@RestController
public class PersonConsumerController {

    @Autowired
    private Person person;

    @RequestMapping("/person")
    public String get(@RequestParam String name) {
        return person.get(name);
    }

}
