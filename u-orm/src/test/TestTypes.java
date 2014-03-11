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
 * 文件：test.TestTypes.java
 * 日 期：Wed Oct 30 15:50:46 CST 2013
 */
package test;

import java.io.Serializable;
import java.sql.Timestamp;
import org.uorm.orm.annotation.ClassMapping;
import org.uorm.orm.annotation.FieldMapping;

/**
 *
 * this file is generated by the uorm pojo tools.
 *
 * @author <a href="mailto:xunchangguo@gmail.com">郭训常</a>
 * @version 1.0.0
 */
@ClassMapping(tableName = "TEST_TYPES", keyGenerator = "increment")
public class TestTypes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_ADDRESS = "ADDRESS";
	public static String PROP_FIELD_1 = "FIELD_1";
	public static String PROP_FIELD_2 = "FIELD_2";
	public static String PROP_FIELD_3 = "FIELD_3";
	public static String PROP_FIELD_4 = "FIELD_4";
	public static String PROP_ID = "ID";
	public static String PROP_NAME = "NAME";
	
	//primary key field of id
	@FieldMapping(columnName = "ID", columnType = 2, primary = true)
	private Long id;
	@FieldMapping(columnName = "ADDRESS", columnType = 12)
	private String address;
	@FieldMapping(columnName = "FIELD_1", columnType = 1)
	private String field1;
	@FieldMapping(columnName = "FIELD_2", columnType = 93)
	private Timestamp field2;
	@FieldMapping(columnName = "FIELD_3", columnType = -1)
	private String field3;
	@FieldMapping(columnName = "FIELD_4", columnType = 2011)
	private byte[] field4;
	@FieldMapping(columnName = "NAME", columnType = -9)
	private String name;
	
	public TestTypes() {
		super();
	}

	public TestTypes(Long id) {
		this.id = id;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String value) {
		this.address = value;
	}

	/**
	 * @return the field1
	 */
	public String getField1() {
		return this.field1;
	}
	
	/**
	 * @param field1 the field1 to set
	 */
	public void setField1(String value) {
		this.field1 = value;
	}

	/**
	 * @return the field2
	 */
	public Timestamp getField2() {
		return this.field2;
	}
	
	/**
	 * @param field2 the field2 to set
	 */
	public void setField2(Timestamp value) {
		this.field2 = value;
	}

	/**
	 * @return the field3
	 */
	public String getField3() {
		return this.field3;
	}
	
	/**
	 * @param field3 the field3 to set
	 */
	public void setField3(String value) {
		this.field3 = value;
	}

	/**
	 * @return the field4
	 */
	public byte[] getField4() {
		return this.field4;
	}
	
	/**
	 * @param field4 the field4 to set
	 */
	public void setField4(byte[] value) {
		this.field4 = value;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long value) {
		this.id = value;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String value) {
		this.name = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof TestTypes)) {
			return false;
		}
		TestTypes other = (TestTypes)o;
		if (null == this.id) {
			if (other.id != null)
				return false;
		} else if (!this.id.equals(other.id))
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
}