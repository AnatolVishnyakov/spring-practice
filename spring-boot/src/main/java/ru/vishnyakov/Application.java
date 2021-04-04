package ru.vishnyakov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.vishnyakov.dto.UserDto;

import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
//@EnableWebMvc
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
    @Bean
    public UserDto userDto() {
        return new UserDto(ThreadLocalRandom.current().nextLong(30));
    }
}
