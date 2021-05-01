package kr.spring.demospring51;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
@PropertySource("classpath:/app.properties") // app.properties를 사용하겠다.
public class Demospring51Application {

    public static void main(String[] args) {
        SpringApplication.run(Demospring51Application.class, args);
    }
}
