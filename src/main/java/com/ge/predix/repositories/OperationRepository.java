package com.ge.predix.repositories;

import java.util.List;

import com.ge.predix.domain.Operation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "operations", path = "operations")
public interface OperationRepository extends PagingAndSortingRepository<Operation, Long> {
	
	List<Operation> findAll();
}