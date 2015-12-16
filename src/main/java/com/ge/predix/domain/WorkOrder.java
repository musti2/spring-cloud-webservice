package com.ge.predix.domain;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WorkOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name="id", unique=true, nullable=false)
	private Integer id;

	private Timestamp created, modified;
	
	private BigDecimal orgId, requiredTotalHours, actualTotalHours, timeRemainingTotalHours;
	
	private String workOrderNum, salesOrderNum, workOrderDesc, machine, component, cell, workOrderTypeCode, workOrderStatus;
	
	private Date startDate, completionDate, otdDate;
	
	private Boolean ncrStatus;
	
	/**
	 * 
	 * @param id
	 * @param created
	 * @param modified
	 * @param orgId
	 * @param requiredTotalHours
	 * @param actualTotalHours
	 * @param timeRemainingTotalHours
	 * @param workOrderNum
	 * @param salesOrderNum
	 * @param workOrderDesc
	 * @param machine
	 * @param component
	 * @param cell
	 * @param workOrderTypeCode
	 * @param workOrderStatus
	 * @param startDate
	 * @param completionDate
	 * @param otdDate
	 * @param ncrStatus
	 */
	public WorkOrder(int id, Timestamp created, Timestamp modified, BigDecimal orgId,BigDecimal requiredTotalHours,BigDecimal actualTotalHours, BigDecimal timeRemainingTotalHours, String workOrderNum, String salesOrderNum, String workOrderDesc, String machine, String component, String cell, String workOrderTypeCode, String workOrderStatus, Date startDate, Date completionDate, Date otdDate, Boolean ncrStatus) {
		this.id = id;
		this.created = created;
		this.modified = modified;
		this.orgId = orgId;
		this.requiredTotalHours = requiredTotalHours;
		this.actualTotalHours = actualTotalHours;
		this.timeRemainingTotalHours = timeRemainingTotalHours;
		this.workOrderNum = workOrderNum;
		this.salesOrderNum = salesOrderNum;
		this.workOrderDesc = workOrderDesc; this.machine = machine; this.component = component; this.cell = cell; this.workOrderTypeCode = workOrderTypeCode; 
		this.workOrderStatus = workOrderStatus;
		this.startDate = startDate; this.completionDate = completionDate; this.otdDate = otdDate;
		this.ncrStatus = ncrStatus;
    }

	/**
	 * @return the ncrStatus
	 */
	public Boolean getNcrStatus() {
		return ncrStatus;
	}

	/**
	 * @param ncrStatus the ncrStatus to set
	 */
	public void setNcrStatus(Boolean ncrStatus) {
		this.ncrStatus = ncrStatus;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

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
	 * @return the orgId
	 */
	public BigDecimal getOrgId() {
		return orgId;
	}

	/**
	 * @param orgId the orgId to set
	 */
	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the requiredTotalHours
	 */
	public BigDecimal getRequiredTotalHours() {
		return requiredTotalHours;
	}

	/**
	 * @param requiredTotalHours the requiredTotalHours to set
	 */
	public void setRequiredTotalHours(BigDecimal requiredTotalHours) {
		this.requiredTotalHours = requiredTotalHours;
	}

	/**
	 * @return the actualTotalHours
	 */
	public BigDecimal getActualTotalHours() {
		return actualTotalHours;
	}

	/**
	 * @param actualTotalHours the actualTotalHours to set
	 */
	public void setActualTotalHours(BigDecimal actualTotalHours) {
		this.actualTotalHours = actualTotalHours;
	}

	/**
	 * @return the timeRemainingTotalHours
	 */
	public BigDecimal getTimeRemainingTotalHours() {
		return timeRemainingTotalHours;
	}

	/**
	 * @param timeRemainingTotalHours the timeRemainingTotalHours to set
	 */
	public void setTimeRemainingTotalHours(BigDecimal timeRemainingTotalHours) {
		this.timeRemainingTotalHours = timeRemainingTotalHours;
	}

	/**
	 * @return the workOrderNum
	 */
	public String getWorkOrderNum() {
		return workOrderNum;
	}

	/**
	 * @param workOrderNum the workOrderNum to set
	 */
	public void setWorkOrderNum(String workOrderNum) {
		this.workOrderNum = workOrderNum;
	}

	/**
	 * @return the salesOrderNum
	 */
	public String getSalesOrderNum() {
		return salesOrderNum;
	}

	/**
	 * @param salesOrderNum the salesOrderNum to set
	 */
	public void setSalesOrderNum(String salesOrderNum) {
		this.salesOrderNum = salesOrderNum;
	}

	/**
	 * @return the workOrderDesc
	 */
	public String getWorkOrderDesc() {
		return workOrderDesc;
	}

	/**
	 * @param workOrderDesc the workOrderDesc to set
	 */
	public void setWorkOrderDesc(String workOrderDesc) {
		this.workOrderDesc = workOrderDesc;
	}

	/**
	 * @return the machine
	 */
	public String getMachine() {
		return machine;
	}

	/**
	 * @param machine the machine to set
	 */
	public void setMachine(String machine) {
		this.machine = machine;
	}

	/**
	 * @return the component
	 */
	public String getComponent() {
		return component;
	}

	/**
	 * @param component the component to set
	 */
	public void setComponent(String component) {
		this.component = component;
	}

	/**
	 * @return the cell
	 */
	public String getCell() {
		return cell;
	}

	/**
	 * @param cell the cell to set
	 */
	public void setCell(String cell) {
		this.cell = cell;
	}

	/**
	 * @return the workOrderTypeCode
	 */
	public String getWorkOrderTypeCode() {
		return workOrderTypeCode;
	}

	/**
	 * @param workOrderTypeCode the workOrderTypeCode to set
	 */
	public void setWorkOrderTypeCode(String workOrderTypeCode) {
		this.workOrderTypeCode = workOrderTypeCode;
	}

	/**
	 * @return the workOrderStatus
	 */
	public String getWorkOrderStatus() {
		return workOrderStatus;
	}

	/**
	 * @param workOrderStatus the workOrderStatus to set
	 */
	public void setWorkOrderStatus(String workOrderStatus) {
		this.workOrderStatus = workOrderStatus;
	}

	/**
	 * @return the completionDate
	 */
	public Date getCompletionDate() {
		return completionDate;
	}

	/**
	 * @param completionDate the completionDate to set
	 */
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	/**
	 * @return the otdDate
	 */
	public Date getOtdDate() {
		return otdDate;
	}

	/**
	 * @param otdDate the otdDate to set
	 */
	public void setOtdDate(Date otdDate) {
		this.otdDate = otdDate;
	}

	
}
