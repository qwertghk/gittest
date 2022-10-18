package com.jin;

import com.jin.dao.BookDao;
import com.jin.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mp01ApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void textGetAll() {
        List<Book> bookList = bookDao.selectList(null);
        System.out.println(bookList);
    }

}
