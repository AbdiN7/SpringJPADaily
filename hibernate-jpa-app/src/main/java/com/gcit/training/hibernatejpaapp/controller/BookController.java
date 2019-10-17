package com.gcit.training.hibernatejpaapp.controller;

import com.gcit.training.hibernatejpaapp.dao.BookDao;
import com.gcit.training.hibernatejpaapp.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lms/")
public class BookController {


    @Autowired
    private BookDao bookDao;


//    @GetMapping("authors/{a_id}/books")
//    public  Iterable<Book> getAllBooksByAuthorId(@PathVariable Integer a_id)
//    {
//        return bookDao.getByAuthorId(a_id);
//    }
}
