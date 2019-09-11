package spring.cloud.feign.producer.entitys;

import java.text.MessageFormat;

public class Person {

    public Person(String name) {
        this.name = name;
    }
    private String name;

    @Override
    public String toString() {
        return MessageFormat.format("Hello,{0}!", name);
    }
}
