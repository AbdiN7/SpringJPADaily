package com.gcit.training.hibernatejpaapp.controller;

import com.gcit.training.hibernatejpaapp.dao.PublisherDao;
import com.gcit.training.hibernatejpaapp.entity.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/lms")
public class PublisherController {

	@Autowired
	private PublisherDao publisherDao;
	
	@GetMapping("/publisher")
	public List<Publisher> getAllPublisher() {
	    return publisherDao.findAll();
	}
	
	
	// Create a new Note
	@PostMapping("/publisher")
	public Publisher createNote(@Valid @RequestBody Publisher publisher) {
	    return publisherDao.save(publisher);
	}
}
