package com.demo.repository;



import org.springframework.data.repository.CrudRepository;

import com.demo.model.*;

public interface UserRepository extends CrudRepository<TenderBasicDetails, Long> {



}
