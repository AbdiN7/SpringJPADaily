package com.gcit.training.hibernatejpaapp.controller;

import com.gcit.training.hibernatejpaapp.dao.AuthorDao;
import com.gcit.training.hibernatejpaapp.dao.BookDao;
import com.gcit.training.hibernatejpaapp.entity.Author;
import com.gcit.training.hibernatejpaapp.entity.Book;
import com.gcit.training.hibernatejpaapp.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lms")
public class AuthorController {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private AuthorDao authorDao;
    @Autowired
    private AuthorService authorService;
    @GetMapping("/authors/")
    private Iterable<Author> authors()
    {
        return authorDao.findAll();
    }
    @GetMapping("/authors/{a_id}")
    private @ResponseBody Author getAuthor(@PathVariable Integer a_id)
    {
        return authorService.getAuthor(a_id);
    }
    @GetMapping("authors/{a_id}/books")
    private @ResponseBody
    List<Book> getBooks(@PathVariable Integer a_id)
    {
       Author author = authorService.getAuthor(a_id);
        return bookDao.getByAuthorId(author.getAuthorId());

    }
}
