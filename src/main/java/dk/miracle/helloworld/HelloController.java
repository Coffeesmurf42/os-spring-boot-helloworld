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
        return "Why hello there, " + configuration.getWorldUk();
    }

}