package kr.spring.demospring51;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Spring Framework에서는 WebMvcConfigurer을 통해 ConversionService에 등록해야함
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new EventConverter.StringToEventConverter()); // 컨버터 등록
        registry.addFormatter(new EventFormatter()); // 포매터 등록
    }
}
