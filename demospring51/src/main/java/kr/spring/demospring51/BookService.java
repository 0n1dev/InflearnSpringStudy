package kr.spring.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired @Qualifier("testBookRepository")
    BookRepository bookRepository;

    public void printBookRepository() {
        System.out.println(bookRepository.getClass());
    }

//    @Autowired
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
}
