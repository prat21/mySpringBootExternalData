package com.boot.myspringbootexternaldata.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.myspringbootexternaldata.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
