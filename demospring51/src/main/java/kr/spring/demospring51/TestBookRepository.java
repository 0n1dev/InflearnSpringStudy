package kr.spring.demospring51;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary // 스프링 빈 타입이 겹칠 때 우선 주입을 시키겠다는 어노테이션
public class TestBookRepository implements BookRepository {
}
