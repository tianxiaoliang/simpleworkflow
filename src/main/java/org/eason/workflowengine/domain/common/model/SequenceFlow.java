package org.eason.workflowengine.domain.common.model;

public class SequenceFlow {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sequence_flow.id
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sequence_flow.workflow_Id
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	private Long workflowId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sequence_flow.from_task
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	private String fromTask;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sequence_flow.to_task
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	private String toTask;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sequence_flow.interval_time
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	private Long intervalTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sequence_flow.create_time
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	private Long createTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sequence_flow.id
	 * @return  the value of sequence_flow.id
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sequence_flow.id
	 * @param id  the value for sequence_flow.id
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sequence_flow.workflow_Id
	 * @return  the value of sequence_flow.workflow_Id
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public Long getWorkflowId() {
		return workflowId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sequence_flow.workflow_Id
	 * @param workflowId  the value for sequence_flow.workflow_Id
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public void setWorkflowId(Long workflowId) {
		this.workflowId = workflowId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sequence_flow.from_task
	 * @return  the value of sequence_flow.from_task
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public String getFromTask() {
		return fromTask;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sequence_flow.from_task
	 * @param fromTask  the value for sequence_flow.from_task
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public void setFromTask(String fromTask) {
		this.fromTask = fromTask;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sequence_flow.to_task
	 * @return  the value of sequence_flow.to_task
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public String getToTask() {
		return toTask;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sequence_flow.to_task
	 * @param toTask  the value for sequence_flow.to_task
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public void setToTask(String toTask) {
		this.toTask = toTask;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sequence_flow.interval_time
	 * @return  the value of sequence_flow.interval_time
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public Long getIntervalTime() {
		return intervalTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sequence_flow.interval_time
	 * @param intervalTime  the value for sequence_flow.interval_time
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public void setIntervalTime(Long intervalTime) {
		this.intervalTime = intervalTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sequence_flow.create_time
	 * @return  the value of sequence_flow.create_time
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public Long getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sequence_flow.create_time
	 * @param createTime  the value for sequence_flow.create_time
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
}