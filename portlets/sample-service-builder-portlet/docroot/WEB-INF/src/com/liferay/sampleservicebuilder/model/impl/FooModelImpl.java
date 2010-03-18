/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.sampleservicebuilder.model.impl;

import com.liferay.portal.kernel.bean.ReadOnlyBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.sampleservicebuilder.model.Foo;
import com.liferay.sampleservicebuilder.model.FooSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="FooModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the SSB_Foo table in the
 * database.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       FooImpl
 * @see       com.liferay.sampleservicebuilder.model.Foo
 * @see       com.liferay.sampleservicebuilder.model.FooModel
 * @generated
 */
public class FooModelImpl extends BaseModelImpl<Foo> {
	public static final String TABLE_NAME = "SSB_Foo";
	public static final Object[][] TABLE_COLUMNS = {
			{ "fooId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "userName", new Integer(Types.VARCHAR) },
			{ "createDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "field1", new Integer(Types.VARCHAR) },
			{ "field2", new Integer(Types.BOOLEAN) },
			{ "field3", new Integer(Types.INTEGER) },
			{ "field4", new Integer(Types.TIMESTAMP) },
			{ "field5", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table SSB_Foo (fooId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,field1 VARCHAR(75) null,field2 BOOLEAN,field3 INTEGER,field4 DATE null,field5 VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table SSB_Foo";
	public static final String ORDER_BY_JPQL = " ORDER BY foo.field1 ASC";
	public static final String ORDER_BY_SQL = " ORDER BY SSB_Foo.field1 ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.sampleservicebuilder.model.Foo"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.sampleservicebuilder.model.Foo"),
			true);

	public static Foo toModel(FooSoap soapModel) {
		Foo model = new FooImpl();

		model.setFooId(soapModel.getFooId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setField1(soapModel.getField1());
		model.setField2(soapModel.getField2());
		model.setField3(soapModel.getField3());
		model.setField4(soapModel.getField4());
		model.setField5(soapModel.getField5());

		return model;
	}

	public static List<Foo> toModels(FooSoap[] soapModels) {
		List<Foo> models = new ArrayList<Foo>(soapModels.length);

		for (FooSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.sampleservicebuilder.model.Foo"));

	public FooModelImpl() {
	}

	public long getPrimaryKey() {
		return _fooId;
	}

	public void setPrimaryKey(long pk) {
		setFooId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_fooId);
	}

	public long getFooId() {
		return _fooId;
	}

	public void setFooId(long fooId) {
		_fooId = fooId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getField1() {
		if (_field1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _field1;
		}
	}

	public void setField1(String field1) {
		_field1 = field1;
	}

	public boolean getField2() {
		return _field2;
	}

	public boolean isField2() {
		return _field2;
	}

	public void setField2(boolean field2) {
		_field2 = field2;
	}

	public int getField3() {
		return _field3;
	}

	public void setField3(int field3) {
		_field3 = field3;
	}

	public Date getField4() {
		return _field4;
	}

	public void setField4(Date field4) {
		_field4 = field4;
	}

	public String getField5() {
		if (_field5 == null) {
			return StringPool.BLANK;
		}
		else {
			return _field5;
		}
	}

	public void setField5(String field5) {
		_field5 = field5;
	}

	public Foo toEscapedModel() {
		if (isEscapedModel()) {
			return (Foo)this;
		}
		else {
			Foo model = new FooImpl();

			model.setNew(isNew());
			model.setEscapedModel(true);

			model.setFooId(getFooId());
			model.setCompanyId(getCompanyId());
			model.setUserId(getUserId());
			model.setUserName(HtmlUtil.escape(getUserName()));
			model.setCreateDate(getCreateDate());
			model.setModifiedDate(getModifiedDate());
			model.setField1(HtmlUtil.escape(getField1()));
			model.setField2(getField2());
			model.setField3(getField3());
			model.setField4(getField4());
			model.setField5(HtmlUtil.escape(getField5()));

			model = (Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(),
					new Class[] { Foo.class }, new ReadOnlyBeanHandler(model));

			return model;
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					Foo.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		FooImpl clone = new FooImpl();

		clone.setFooId(getFooId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setField1(getField1());
		clone.setField2(getField2());
		clone.setField3(getField3());
		clone.setField4(getField4());
		clone.setField5(getField5());

		return clone;
	}

	public int compareTo(Foo foo) {
		int value = 0;

		value = getField1().compareTo(foo.getField1());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Foo foo = null;

		try {
			foo = (Foo)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = foo.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{fooId=");
		sb.append(getFooId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", field1=");
		sb.append(getField1());
		sb.append(", field2=");
		sb.append(getField2());
		sb.append(", field3=");
		sb.append(getField3());
		sb.append(", field4=");
		sb.append(getField4());
		sb.append(", field5=");
		sb.append(getField5());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sampleservicebuilder.model.Foo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fooId</column-name><column-value><![CDATA[");
		sb.append(getFooId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field1</column-name><column-value><![CDATA[");
		sb.append(getField1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field2</column-name><column-value><![CDATA[");
		sb.append(getField2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field3</column-name><column-value><![CDATA[");
		sb.append(getField3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field4</column-name><column-value><![CDATA[");
		sb.append(getField4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field5</column-name><column-value><![CDATA[");
		sb.append(getField5());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _fooId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _field1;
	private boolean _field2;
	private int _field3;
	private Date _field4;
	private String _field5;
	private transient ExpandoBridge _expandoBridge;
}