package home.example.webapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class WebApp1Controller {
    @RestController
    public class WebApp1Controller {
        @GetMapping("/hello");
        public String hello(/*@RequestParam(required = false) String name*/){
            return "Hello! "; // + name;
        }
    }
}
