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
 * 文件：test.UserGroup.java
 * 日 期：Mon Dec 30 14:52:13 CST 2013
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
@ClassMapping(tableName = "UserGroup", keyGenerator = "increment")
public class UserGroup implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_PARENTUSERID = "parentUserID";
	public static String PROP_USERID = "UserId";
	public static String PROP_USERNAME = "UserName";
	
	/** primary key field of userId */
	@FieldMapping(columnName = "UserId", columnType = -5, primary = true)
	private Long userId;
	/** foreign key field of UserGroup.UserId */
	@FieldMapping(columnName = "parentUserID", columnType = -5)
	private Long parentUserId;
	@FieldMapping(columnName = "UserName", columnType = -15)
	private String userName;
	
	public UserGroup() {
		super();
	}

	public UserGroup(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the parentUserId
	 */
	public Long getParentUserId() {
		return this.parentUserId;
	}
	
	/**
	 * @param parentUserId the parentUserId to set
	 */
	public void setParentUserId(Long value) {
		this.parentUserId = value;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return this.userId;
	}
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long value) {
		this.userId = value;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return this.userName;
	}
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String value) {
		this.userName = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof UserGroup)) {
			return false;
		}
		UserGroup other = (UserGroup)o;
		if (null == this.userId) {
			if (other.userId != null)
				return false;
		} else if (!this.userId.equals(other.userId))
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
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	
}