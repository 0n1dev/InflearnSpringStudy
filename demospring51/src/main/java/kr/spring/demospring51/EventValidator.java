package kr.spring.demospring51;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Event.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notEmpty", "Empty title is now allowed.");

        // 위에랑 아래랑 동일
        Event event = (Event) target;

        if (event.getTitle() != null) {
            errors.rejectValue("title", "notEmpty", "ddd");
        }
    }
}
