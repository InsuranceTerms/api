package com.insuranceterm.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.insuranceterm.api.object.TestOutcome;

@RepositoryRestResource
public interface TestOutcomeRepository extends CrudRepository<TestOutcome, Integer> {
    
}
