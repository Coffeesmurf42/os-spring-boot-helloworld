package dk.miracle.helloworld;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class Configuration {

    @Value("${hello.world.dk}")
    private String worldDk;

    @Value("${hello.world.uk}")
    private String worldUk;

    public String getWorldDk() {
        return worldDk;
    }

    public String getWorldUk() {
        return worldUk;
    }
}
