package org.eason.workflowengine.domain.common.dao.impl.mysql;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.eason.workflowengine.domain.common.model.TaskEvent;
import org.eason.workflowengine.domain.common.model.TaskEventExample;

public interface TaskEventMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	int countByExample(TaskEventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	int deleteByExample(TaskEventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	int insert(TaskEvent record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	int insertSelective(TaskEvent record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	List<TaskEvent> selectByExampleWithBLOBs(TaskEventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	List<TaskEvent> selectByExample(TaskEventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	TaskEvent selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	int updateByExampleSelective(@Param("record") TaskEvent record,
			@Param("example") TaskEventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	int updateByExampleWithBLOBs(@Param("record") TaskEvent record,
			@Param("example") TaskEventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	int updateByExample(@Param("record") TaskEvent record,
			@Param("example") TaskEventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	int updateByPrimaryKeySelective(TaskEvent record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	int updateByPrimaryKeyWithBLOBs(TaskEvent record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_event
	 * @mbggenerated  Mon Feb 23 20:44:45 CST 2015
	 */
	int updateByPrimaryKey(TaskEvent record);
}