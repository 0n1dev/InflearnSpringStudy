package kr.spring.springapplicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beanDefinitionNames));

        BookService beanService = (BookService) ac.getBean("bookService");
        System.out.println(beanService != null);
    }

}
