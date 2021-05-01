package kr.spring.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;


@Component
public class AppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Event event = new Event();
        event.setTitle("dd");
        EventValidator eventValidator = new EventValidator();

        Errors errors = new BeanPropertyBindingResult(event, "event");

        eventValidator.validate(event, errors);

        System.out.println(errors.hasErrors());

        errors.getAllErrors().forEach(e -> {
            System.out.println("========= ERROR CODE =========");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
    }
}
