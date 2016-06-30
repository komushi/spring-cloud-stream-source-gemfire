package org.springframework.cloud.stream.app.gemfire.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by lei_xu on 6/29/16.
 */
@SpringBootApplication
public class GemfireSourceRabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GemfireSourceRabbitApplication.class, args);
    }
}
