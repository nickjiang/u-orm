/**
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
 */
package org.uorm.dao.dialect;

/**
 *
 * @author <a href="mailto:xunchangguo@gmail.com">郭训常</a>
 * @version 1.0.0
 * ＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝<br/>
 * 修订日期                 修订人            描述<br/>
 * 2012-1-18       郭训常            创建<br/>
 */
public interface Dialect {

	/**
	 * is support offset feature
	 * 
	 * @return
	 */
	public boolean supportsOffset();
	
	/**
	 * Given a limit and an offset, apply the limit clause to the query.
	 *
	 * @param query The query to which to apply the limit.
	 * @param offset The offset of the limit
	 * @param limit The limit of the limit ;)
	 * @return The modified query statement with the limit applied.
	 */
	public String getLimitString(String query, int offset, int limit);
	
	/**
	 * get count sql
	 * @param query
	 * @return
	 */
	public String getCountSql(String query);
	
	/**
	 * get GUID sql
	 * @return
	 */
	public String getSelectGUIDString();
	
	/**
	 * get Sequence Next Value sql
	 * @param tablename
	 * @return
	 */
	public String getSequenceNextValString(String tablename);
	
}