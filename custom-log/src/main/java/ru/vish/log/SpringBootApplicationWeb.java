package ru.vish.log;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApplicationWeb {
    private static final ScanLogger logger = ScanLogger.getLogger();

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringBootApplicationWeb.class)
                .web(WebApplicationType.NONE).run();

        logger.info("1", "2");

        context.close();
    }
}
