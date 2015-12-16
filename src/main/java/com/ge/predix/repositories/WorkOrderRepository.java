package com.ge.predix.repositories;

import java.util.List;

import com.ge.predix.domain.WorkOrder;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "WorkOrders", path = "jobs")
public interface WorkOrderRepository extends PagingAndSortingRepository<WorkOrder, Integer> {
	
	//	List<Operation> findByOperationSeqNum(@Param("number") BigDecimal number);
	/*
	 * (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findAll()
	 */
	List<WorkOrder> findAll();
	
}