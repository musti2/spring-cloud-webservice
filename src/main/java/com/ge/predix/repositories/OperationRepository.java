package com.ge.predix.repositories;

import java.math.BigDecimal;
import com.ge.predix.domain.Operation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "operations", path = "operations")
public interface OperationRepository extends PagingAndSortingRepository<Operation, Long> {
	
	@RestResource(path = "ops", rel="ops")
    Page<Operation> findAll(Pageable pageable);

    @RestResource(exported = false)
    Operation findById(Long id);

    @RestResource(path = "seqnum", rel = "operationseqnum")
    Page<Operation> findByOperationSeqNum(@Param("operation_seq_num") BigDecimal operationSeqNum, Pageable pageable);

}