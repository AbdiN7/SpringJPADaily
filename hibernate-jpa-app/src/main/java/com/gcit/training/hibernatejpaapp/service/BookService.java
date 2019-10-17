package com.gcit.training.hibernatejpaapp.service;

import com.gcit.training.hibernatejpaapp.dao.BookDao;
import com.gcit.training.hibernatejpaapp.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public Book getBook(Integer bookId)
    {
        return bookDao.getByBookId(bookId);
    }
    public Book save(Book book)
    {
        return bookDao.save(book);
    }
    public Iterable<Book> allBooks()
    {
        return bookDao.findAll();
    }
    public void delete(Integer bookId)
    {
        Book book = getBook(bookId);
        bookDao.delete(book);
    }
}
