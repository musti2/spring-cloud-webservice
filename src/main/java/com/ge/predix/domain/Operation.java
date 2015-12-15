package com.ge.predix.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name="id", unique=true, nullable=false)
	private Integer id;
	
	private Timestamp created, modified, startDate, completionDate;
	/**
	 * Strings or SQL Character columns
	 */
	private String workOrderNum, operationDesc, operationStatus;
	
	private BigDecimal operationSeqNum, requiredHours, actualHours, timeRemaining, resourceId;
	
	private String[] ssoList, nameList;
	/**
	 * @return the created
	 */
	public Timestamp getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(Timestamp created) {
		this.created = created;
	}

	/**
	 * @return the modified
	 */
	public Timestamp getModified() {
		return modified;
	}

	/**
	 * @param modified the modified to set
	 */
	public void setModified(Timestamp modified) {
		this.modified = modified;
	}

	/**
	 * @return the workOrderNumber
	 */
	public String getWorkOrderNum() {
		return workOrderNum;
	}

	/**
	 * @param workOrderNumber the workOrderNumber to set
	 */
	public void setWorkOrderNum(String workOrderNum) {
		this.workOrderNum = workOrderNum;
	}

	/**
	 * @return the operationDesc
	 */
	public String getOperationDesc() {
		return operationDesc;
	}

	/**
	 * @param operationDesc the operationDesc to set
	 */
	public void setOperationDesc(String operationDesc) {
		this.operationDesc = operationDesc;
	}

	/**
	 * @return the operationStatus
	 */
	public String getOperationStatus() {
		return operationStatus;
	}

	/**
	 * @param operationStatus the operationStatus to set
	 */
	public void setOperationStatus(String operationStatus) {
		this.operationStatus = operationStatus;
	}

	/**
	 * @return the operationSeqNum
	 */
	public BigDecimal getOperationSeqNum() {
		return operationSeqNum;
	}

	/**
	 * @param operationSeqNum the operationSeqNum to set
	 */
	public void setOperationSeqNum(BigDecimal operationSeqNum) {
		this.operationSeqNum = operationSeqNum;
	}

	/**
	 * @return the requiredHours
	 */
	public BigDecimal getRequiredHours() {
		return requiredHours;
	}

	/**
	 * @param requiredHours the requiredHours to set
	 */
	public void setRequiredHours(BigDecimal requiredHours) {
		this.requiredHours = requiredHours;
	}

	/**
	 * @return the actualHours
	 */
	public BigDecimal getActualHours() {
		return actualHours;
	}

	/**
	 * @param actualHours the actualHours to set
	 */
	public void setActualHours(BigDecimal actualHours) {
		this.actualHours = actualHours;
	}

	/**
	 * @return the timeRemaining
	 */
	public BigDecimal getTimeRemaining() {
		return timeRemaining;
	}

	/**
	 * @param timeRemaining the timeRemaining to set
	 */
	public void setTimeRemaining(BigDecimal timeRemaining) {
		this.timeRemaining = timeRemaining;
	}

	/**
	 * @return the resourceId
	 */
	public BigDecimal getResourceId() {
		return resourceId;
	}

	/**
	 * @param resourceId the resourceId to set
	 */
	public void setResourceId(BigDecimal resourceId) {
		this.resourceId = resourceId;
	}

	/**
	 * @return the ssoList
	 */
	public String[] getSsoList() {
		return ssoList;
	}

	/**
	 * @param ssoList the ssoList to set
	 */
	public void setSsoList(String[] ssoList) {
		this.ssoList = ssoList;
	}

	/**
	 * @return the nameList
	 */
	public String[] getNameList() {
		return nameList;
	}

	/**
	 * @param nameList the nameList to set
	 */
	public void setNameList(String[] nameList) {
		this.nameList = nameList;
	}

	/**
	 * @return the startDate
	 */
	public Timestamp getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the completionDate
	 */
	public Timestamp getCompletionDate() {
		return completionDate;
	}

	/**
	 * @param completionDate the completionDate to set
	 */
	public void setCompletionDate(Timestamp completionDate) {
		this.completionDate = completionDate;
	}

	public Integer getId(Integer id) {
		// TODO Auto-generated method stub
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}

	public Operation(int id, Timestamp created, Timestamp modified, Timestamp startDate, Timestamp completionDate, String workOrderNum, String operationDesc, String operationStatus, BigDecimal operationSeqNum, BigDecimal requiredHours, BigDecimal actualHours, BigDecimal timeRemaining, BigDecimal resourceId, String[] ssoList, String[] nameList) {
		this.id = id;
		this.created = created;
		this.startDate = startDate;
		this.completionDate = completionDate;
		this.workOrderNum = workOrderNum;
		this.operationDesc = operationDesc;
		this.operationStatus = operationStatus;
		this.operationSeqNum = operationSeqNum;
		this.requiredHours = requiredHours;
		this.actualHours = actualHours; 
		this.timeRemaining = timeRemaining; 
		this.resourceId = resourceId; 
		this.ssoList = ssoList; 
		this.nameList = nameList;
    }

	public Operation() {
		// TODO Auto-generated constructor stub
	}

	public void add(Operation operation) {
		// TODO Auto-generated method stub
		
	}

	
}