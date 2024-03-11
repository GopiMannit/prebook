package com.mannit.site.prebook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mannit.site.prebook.model.Prebookdetails;

public interface Prebookrepo extends MongoRepository<Prebookdetails, String> {

}
