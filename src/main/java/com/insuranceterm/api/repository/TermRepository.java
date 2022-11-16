package com.insuranceterm.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.insuranceterm.api.object.Term;

@RepositoryRestResource
public interface TermRepository extends CrudRepository<Term, Integer>, TermRepositoryCustom {
    
}
