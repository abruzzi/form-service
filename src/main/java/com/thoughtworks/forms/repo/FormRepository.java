package com.thoughtworks.forms.repo;

import com.thoughtworks.forms.model.Form;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends MongoRepository<Form, String>, PagingAndSortingRepository<Form, String> {
}
