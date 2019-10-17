package com.gcit.training.hibernatejpaapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_publisher")
public class Publisher {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer publisherId;
    
	private String publisherName;
    
	private String publisherAddress;
	
	public Integer getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherAddress() {
		return publisherAddress;
	}
	public void setPublisherAddress(String publisherAddress) {
		this.publisherAddress = publisherAddress;
	}
	
}
