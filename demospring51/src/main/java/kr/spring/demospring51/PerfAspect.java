package kr.spring.demospring51;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerfAspect {

    @Around("@annotation(TimeCheck)")
    public Object logPerf(ProceedingJoinPoint jp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retVal = jp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }
}
