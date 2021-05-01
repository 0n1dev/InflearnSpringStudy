package kr.spring.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository myBookRepository; // 필드이름이 동일해도 주입가능 (추천 X)

    public void printBookRepository() {
//        this.bookRepository.forEach(System.out::println);
        System.out.println(myBookRepository.getClass());
    }

//    @Autowired
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
}
