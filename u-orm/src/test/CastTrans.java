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
 * 文件：test.CastTrans.java
 * 日 期：Fri May 24 16:42:39 CST 2013
 */
package test;

import java.io.Serializable;
import org.uorm.orm.annotation.ClassMapping;
import org.uorm.orm.annotation.FieldMapping;

/**
 *
 * this file is generated by the uorm pojo tools.
 *
 * @author <a href="mailto:xunchangguo@gmail.com">郭训常</a>
 * @version 1.0.0
 */
@ClassMapping(tableName = "Cast_Trans", keyGenerator = "native")
public class CastTrans implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_APP_OBJID = "appObjId";
	public static String PROP_APP_OBJSOURCE = "appObjSource";
	public static String PROP_APP_OBJTYPE = "appObjType";
	public static String PROP_CHANNEL_NAME = "channelName";
	public static String PROP_COLUMN_NAME = "columnName";
	public static String PROP_CREATE_TIME = "createTime";
	public static String PROP_DURATION = "duration";
	public static String PROP_FILE_PATH = "filePath";
	public static String PROP_OVER_TIME = "overTime";
	public static String PROP_PROGRAM_NAME = "programName";
	public static String PROP_STATUS_DES = "statusDes";
	public static String PROP_TASK_ID = "taskId";
	public static String PROP_TRANS_STATUS = "transStatus";
	
	//primary key field of taskId
	@FieldMapping(columnName = "Task_ID", columnType = 12, primary = true)
	private String taskId;
	@FieldMapping(columnName = "App_ObjID", columnType = 12)
	private String appObjId;
	@FieldMapping(columnName = "App_ObjSource", columnType = -5)
	private Long appObjSource;
	@FieldMapping(columnName = "App_ObjType", columnType = -5)
	private Long appObjType;
	@FieldMapping(columnName = "Channel_Name", columnType = 12)
	private String channelName;
	@FieldMapping(columnName = "Column_Name", columnType = 12)
	private String columnName;
	@FieldMapping(columnName = "Create_Time", columnType = 12)
	private String createTime;
	@FieldMapping(columnName = "Duration", columnType = 4)
	private Integer duration;
	@FieldMapping(columnName = "File_Path", columnType = 12)
	private String filePath;
	@FieldMapping(columnName = "Over_Time", columnType = 12)
	private String overTime;
	@FieldMapping(columnName = "Program_Name", columnType = 12)
	private String programName;
	@FieldMapping(columnName = "Status_Des", columnType = 12)
	private String statusDes;
	@FieldMapping(columnName = "Trans_Status", columnType = 4)
	private Integer transStatus;
	
	public CastTrans() {
		super();
	}

	public CastTrans(String taskId) {
		this.taskId = taskId;
	}

	/**
	 * @return the appObjId
	 */
	public String getAppObjId() {
		return this.appObjId;
	}
	
	/**
	 * @param appObjId the appObjId to set
	 */
	public void setAppObjId(String value) {
		this.appObjId = value;
	}

	/**
	 * @return the appObjSource
	 */
	public Long getAppObjSource() {
		return this.appObjSource;
	}
	
	/**
	 * @param appObjSource the appObjSource to set
	 */
	public void setAppObjSource(Long value) {
		this.appObjSource = value;
	}

	/**
	 * @return the appObjType
	 */
	public Long getAppObjType() {
		return this.appObjType;
	}
	
	/**
	 * @param appObjType the appObjType to set
	 */
	public void setAppObjType(Long value) {
		this.appObjType = value;
	}

	/**
	 * @return the channelName
	 */
	public String getChannelName() {
		return this.channelName;
	}
	
	/**
	 * @param channelName the channelName to set
	 */
	public void setChannelName(String value) {
		this.channelName = value;
	}

	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return this.columnName;
	}
	
	/**
	 * @param columnName the columnName to set
	 */
	public void setColumnName(String value) {
		this.columnName = value;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String value) {
		this.createTime = value;
	}

	/**
	 * @return the duration
	 */
	public Integer getDuration() {
		return this.duration;
	}
	
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Integer value) {
		this.duration = value;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return this.filePath;
	}
	
	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String value) {
		this.filePath = value;
	}

	/**
	 * @return the overTime
	 */
	public String getOverTime() {
		return this.overTime;
	}
	
	/**
	 * @param overTime the overTime to set
	 */
	public void setOverTime(String value) {
		this.overTime = value;
	}

	/**
	 * @return the programName
	 */
	public String getProgramName() {
		return this.programName;
	}
	
	/**
	 * @param programName the programName to set
	 */
	public void setProgramName(String value) {
		this.programName = value;
	}

	/**
	 * @return the statusDes
	 */
	public String getStatusDes() {
		return this.statusDes;
	}
	
	/**
	 * @param statusDes the statusDes to set
	 */
	public void setStatusDes(String value) {
		this.statusDes = value;
	}

	/**
	 * @return the taskId
	 */
	public String getTaskId() {
		return this.taskId;
	}
	
	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(String value) {
		this.taskId = value;
	}

	/**
	 * @return the transStatus
	 */
	public Integer getTransStatus() {
		return this.transStatus;
	}
	
	/**
	 * @param transStatus the transStatus to set
	 */
	public void setTransStatus(Integer value) {
		this.transStatus = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof CastTrans)) {
			return false;
		}
		CastTrans other = (CastTrans)o;
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