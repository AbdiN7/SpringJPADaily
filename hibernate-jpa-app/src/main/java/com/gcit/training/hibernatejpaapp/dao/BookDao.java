package com.gcit.training.hibernatejpaapp.dao;

import com.gcit.training.hibernatejpaapp.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao extends CrudRepository<Book,Integer> {
    Book getByBookId(Integer bookId);
    List<Book> getByAuthorId(Integer author_Id);
}
