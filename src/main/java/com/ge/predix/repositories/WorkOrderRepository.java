package com.ge.predix.repositories;

import java.util.List;

import com.ge.predix.domain.WorkOrder;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/*
 * path can be any string to access this repo.. 
 * i.e - if path is set to jobs then the url string to access jobs repo will be http://url/jobs
 */
@RepositoryRestResource(collectionResourceRel = "WorkOrders", path = "jobs")
public interface WorkOrderRepository extends PagingAndSortingRepository<WorkOrder, Integer> {
	
	/**
	 * 
	 * @param wo
	 * @return
	 */
	List<WorkOrder> findByWorkOrderNum(@Param("workOrderNum") String wo);
	/**
	 * 
	 * @param component
	 * @return
	 */
	List<WorkOrder> findByComponent(@Param("component") String component);
	/**
	 * 
	 * @param cell
	 * @return
	 */
	List<WorkOrder> findByCell(@Param("cell") String cell);
	/**
	 * 
	 * @param machine
	 * @return
	 */
	List<WorkOrder> findByMachine(@Param("machine") String machine);
	/**
	 * 
	 * @param workOrderStatus
	 * @return
	 */
	List<WorkOrder> findByWorkOrderStatus(@Param("workOrderStatus") String workOrderStatus);
}