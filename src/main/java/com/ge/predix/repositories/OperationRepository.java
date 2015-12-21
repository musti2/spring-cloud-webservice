package com.ge.predix.repositories;

import java.util.List;

import com.ge.predix.domain.Operation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/*
 * path can be any string to access this repo.. 
 * i.e - if path is set to 'ops' then the url string to access jobs repo will be http://url/ops
 */
@RepositoryRestResource(collectionResourceRel = "operations", path = "ops")
public interface OperationRepository extends PagingAndSortingRepository<Operation, Integer> {

	List<Operation> findByWorkOrderNum(@Param("workOrderNum") String wo);;
}