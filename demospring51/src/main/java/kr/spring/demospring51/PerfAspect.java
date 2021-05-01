package kr.spring.demospring51;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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

    @Before("bean(simpleEventService)") // 해당 빈의 모든 메서드 실행 이전
    public void hello() {
        System.out.println("=====================");
    }
}
