/*
 * Copyright 2010-2016 the original author or authors.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 文件：test.NmpTaskinfo.java
 * 日 期：Fri Jan 03 13:15:40 CST 2014
 */
package test;

import java.io.Serializable;
import org.uorm.orm.annotation.ClassMapping;
import org.uorm.orm.annotation.FieldMapping;

/**
 *
 * 任务信息
 * this file is generated by the uorm pojo tools.
 *
 * @author <a href="mailto:xunchangguo@gmail.com">郭训常</a>
 * @version 1.0.0
 */
@ClassMapping(tableName = "NMP_TASKINFO", keyGenerator = "increment")
public class NmpTaskinfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_BEGIN_TIME = "BEGIN_TIME";
	public static String PROP_COLL_TYPE = "COLL_TYPE";
	public static String PROP_DETAILS = "DETAILS";
	public static String PROP_END_TIME = "END_TIME";
	public static String PROP_SYS_CODE = "SYS_CODE";
	public static String PROP_TASK_ID = "TASK_ID";
	public static String PROP_TASK_PERIOD = "TASK_PERIOD";
	public static String PROP_TASK_TYPE = "TASK_TYPE";
	public static String PROP_WEEK_MASK = "WEEK_MASK";
	
	/**
	 * primary key field of taskId
	 * 任务ID
	 */
	@FieldMapping(columnName = "TASK_ID", columnType = 4, primary = true)
	private Long taskId;
	/** 任务开始时间 null：代表立即执行 */
	@FieldMapping(columnName = "BEGIN_TIME", columnType = 12)
	private String beginTime;
	/** 采集任务类型 */
	@FieldMapping(columnName = "COLL_TYPE", columnType = 12)
	private String collType;
	/** 任务详细信息 */
	@FieldMapping(columnName = "DETAILS", columnType = -3)
	private byte[] details;
	/** 任务结束时间 null: 代表长期有效 */
	@FieldMapping(columnName = "END_TIME", columnType = 12)
	private String endTime;
	/** 业务系统代码 null:代表无业务系统 */
	@FieldMapping(columnName = "SYS_CODE", columnType = 12)
	private String sysCode;
	/** 任务采集周期，秒 */
	@FieldMapping(columnName = "TASK_PERIOD", columnType = 4)
	private Long taskPeriod;
	/** 任务类型，1：单次任务，缺省,2：周期任务 */
	@FieldMapping(columnName = "TASK_TYPE", columnType = 4)
	private Integer taskType;
	/** 周任务星期，逗号分开 */
	@FieldMapping(columnName = "WEEK_MASK", columnType = 12)
	private String weekMask;
	
	public NmpTaskinfo() {
		super();
	}

	public NmpTaskinfo(Long taskId) {
		this.taskId = taskId;
	}

	public NmpTaskinfo(Integer taskType) {
		this.taskType = taskType;
	}

	/**
	 * @return the beginTime 任务开始时间 null：代表立即执行
	 */
	public String getBeginTime() {
		return this.beginTime;
	}
	
	/**
	 * 任务开始时间 null：代表立即执行
	 * @param beginTime the beginTime to set
	 */
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	/**
	 * @return the collType 采集任务类型
	 */
	public String getCollType() {
		return this.collType;
	}
	
	/**
	 * 采集任务类型
	 * @param collType the collType to set
	 */
	public void setCollType(String collType) {
		this.collType = collType;
	}

	/**
	 * @return the details 任务详细信息
	 */
	public byte[] getDetails() {
		return this.details;
	}
	
	/**
	 * 任务详细信息
	 * @param details the details to set
	 */
	public void setDetails(byte[] details) {
		this.details = details;
	}

	/**
	 * @return the endTime 任务结束时间 null: 代表长期有效
	 */
	public String getEndTime() {
		return this.endTime;
	}
	
	/**
	 * 任务结束时间 null: 代表长期有效
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the sysCode 业务系统代码 null:代表无业务系统
	 */
	public String getSysCode() {
		return this.sysCode;
	}
	
	/**
	 * 业务系统代码 null:代表无业务系统
	 * @param sysCode the sysCode to set
	 */
	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	/**
	 * @return the taskId 任务ID
	 */
	public Long getTaskId() {
		return this.taskId;
	}
	
	/**
	 * 任务ID
	 * @param taskId the taskId to set
	 */
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	/**
	 * @return the taskPeriod 任务采集周期，秒
	 */
	public Long getTaskPeriod() {
		return this.taskPeriod;
	}
	
	/**
	 * 任务采集周期，秒
	 * @param taskPeriod the taskPeriod to set
	 */
	public void setTaskPeriod(Long taskPeriod) {
		this.taskPeriod = taskPeriod;
	}

	/**
	 * @return the taskType 任务类型，1：单次任务，缺省,2：周期任务
	 */
	public Integer getTaskType() {
		return this.taskType;
	}
	
	/**
	 * 任务类型，1：单次任务，缺省,2：周期任务
	 * @param taskType the taskType to set
	 */
	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
	}

	/**
	 * @return the weekMask 周任务星期，逗号分开
	 */
	public String getWeekMask() {
		return this.weekMask;
	}
	
	/**
	 * 周任务星期，逗号分开
	 * @param weekMask the weekMask to set
	 */
	public void setWeekMask(String weekMask) {
		this.weekMask = weekMask;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof NmpTaskinfo)) {
			return false;
		}
		NmpTaskinfo other = (NmpTaskinfo)o;
		if (null == this.taskId) {
			if (other.taskId != null)
				return false;
		} else if (!this.taskId.equals(other.taskId))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((taskId == null) ? 0 : taskId.hashCode());
		return result;
	}
	
}