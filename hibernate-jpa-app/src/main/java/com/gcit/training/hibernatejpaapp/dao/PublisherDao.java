package com.gcit.training.hibernatejpaapp.dao;

import com.gcit.training.hibernatejpaapp.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherDao extends JpaRepository<Publisher, Long> {

}
