package com.gcit.training.hibernatejpaapp.service;

import com.gcit.training.hibernatejpaapp.dao.AuthorDao;
import com.gcit.training.hibernatejpaapp.dao.BookDao;
import com.gcit.training.hibernatejpaapp.entity.Author;
import com.gcit.training.hibernatejpaapp.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorDao authorDao;
    @Autowired
    private BookDao bookDao;
    public Author getAuthor(Integer authorId)
    {
        return authorDao.getByAuthorId(authorId);
    }
    public Iterable<Book> getBooks(Integer authorId)
    {
        return bookDao.getByAuthorId(authorId);
    }
}
