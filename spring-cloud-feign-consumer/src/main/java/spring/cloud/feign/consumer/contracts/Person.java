package spring.cloud.feign.consumer.contracts;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer")
public interface Person {

    @RequestMapping(value = "/person")
    String get(@RequestParam(value = "name") String name);
}
