package com.boot.myspringbootexternaldata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topic_details")
public class Topic {
	@Id
	//@Column(name="Id")
	private String id;
	//@Column(name="Name")
	private String name;
	//@Column(name="Desc")
	private String description;
	
	public Topic() {
		// Required for Marshalling and Unmarshalling
	}
	
	
	public Topic(String name, String desc) {
		this.name = name;
		this.description = desc;
	}


	public String getId() {
		return id;
	}	
	public void setId(String id) {
		this.id = id;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	
	
}
