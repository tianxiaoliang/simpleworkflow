package org.eason.workflowengine.domain.common.model;

public class TaskWithBLOBs extends Task {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task.data
	 * @mbggenerated  Mon Feb 23 17:56:10 CST 2015
	 */
	private String data;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task.result
	 * @mbggenerated  Mon Feb 23 17:56:10 CST 2015
	 */
	private String result;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task.data
	 * @return  the value of task.data
	 * @mbggenerated  Mon Feb 23 17:56:10 CST 2015
	 */
	public String getData() {
		return data;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task.data
	 * @param data  the value for task.data
	 * @mbggenerated  Mon Feb 23 17:56:10 CST 2015
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task.result
	 * @return  the value of task.result
	 * @mbggenerated  Mon Feb 23 17:56:10 CST 2015
	 */
	public String getResult() {
		return result;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task.result
	 * @param result  the value for task.result
	 * @mbggenerated  Mon Feb 23 17:56:10 CST 2015
	 */
	public void setResult(String result) {
		this.result = result;
	}
}