package com.gcit.training.hibernatejpaapp.dao;

import com.gcit.training.hibernatejpaapp.entity.Author;
import com.gcit.training.hibernatejpaapp.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorDao extends CrudRepository<Author, Integer> {
    Author getByAuthorId(Integer author_Id);

}
