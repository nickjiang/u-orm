/*
 * Copyright (c) 北京捷成世纪科技股份有限公司. All Rights Reserved.
 * 文件：test.CimData.java
 * 日 期：Sun Jan 29 13:06:11 CST 2012
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
@ClassMapping(tableName = "CIM_DATA", keyOrder = "cimClassId,id")
public class CimData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static String PROP_CIM_CLASS_ID = "cimClassId";
	public static String PROP_CIM_INST = "cimInst";
	public static String PROP_CIM_OP = "cimOp";
	public static String PROP_ID = "id";
	
	//primary key field of cimClassId
	@FieldMapping(columnName = "CIM_CLASS_ID", columnType = 4, primary = true)
	private Integer cimClassId;
	//primary key field of id
	@FieldMapping(columnName = "ID", columnType = 4, primary = true)
	private Integer id;
	@FieldMapping(columnName = "CIM_INST", columnType = -4)
	private byte[] cimInst;
	@FieldMapping(columnName = "CIM_OP", columnType = -4)
	private byte[] cimOp;
	
	public CimData() {
		super();
	}

	public CimData(Integer cimClassId, Integer id) {
		this.cimClassId = cimClassId;
		this.id = id;
	}

	/**
	 * @return the cimClassId
	 */
	public Integer getCimClassId() {
		return this.cimClassId;
	}
	
	/**
	 * @param cimClassId the cimClassId to set
	 */
	public void setCimClassId(Integer value) {
		this.cimClassId = value;
	}

	/**
	 * @return the cimInst
	 */
	public byte[] getCimInst() {
		return this.cimInst;
	}
	
	/**
	 * @param cimInst the cimInst to set
	 */
	public void setCimInst(byte[] value) {
		this.cimInst = value;
	}

	/**
	 * @return the cimOp
	 */
	public byte[] getCimOp() {
		return this.cimOp;
	}
	
	/**
	 * @param cimOp the cimOp to set
	 */
	public void setCimOp(byte[] value) {
		this.cimOp = value;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return this.id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if ((o == null) || !(o instanceof CimData)) {
			return false;
		}
		CimData other = (CimData)o;
		if (null == this.cimClassId) {
			if (other.cimClassId != null)
				return false;
		} else if (!this.cimClassId.equals(other.cimClassId))
			return false;
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
		result = prime * result + ((cimClassId == null) ? 0 : cimClassId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
}