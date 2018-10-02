package dk.miracle.helloworld;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private Configuration configuration;

    @Autowired
    public HelloController(Configuration configuration) {
        this.configuration = configuration;
    }

    @RequestMapping("/")
    public String index() {
        return "You've reached the hello service";
    }

    @RequestMapping("/healthcheck")
    public String healthCheck() {
        return "OK";
    }

    @RequestMapping("/helloworld")
    public String helloWorld() {
        return String.format("Why hello there, %s!", configuration.getWorldUk());
    }

    @RequestMapping("/hello/{name}")
    public String helloWhoever(@PathVariable String name) {
        return String.format("Hello %s!", name);
    }

}