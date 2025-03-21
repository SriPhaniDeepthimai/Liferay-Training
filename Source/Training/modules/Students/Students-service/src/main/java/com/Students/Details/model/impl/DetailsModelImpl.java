/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.model.impl;

import com.Students.Details.model.Details;
import com.Students.Details.model.DetailsModel;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Details service. Represents a row in the &quot;Student_Details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>DetailsModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DetailsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailsImpl
 * @generated
 */
public class DetailsModelImpl
	extends BaseModelImpl<Details> implements DetailsModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a details model instance should use the <code>Details</code> interface instead.
	 */
	public static final String TABLE_NAME = "Student_Details";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"Student_Id", Types.INTEGER},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"Student_Name", Types.VARCHAR}, {"Department_Id", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Student_Id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("Student_Name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Department_Id", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Student_Details (uuid_ VARCHAR(75) null,Student_Id INTEGER not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,Student_Name VARCHAR(75) null,Department_Id INTEGER)";

	public static final String TABLE_SQL_DROP = "drop table Student_Details";

	public static final String ORDER_BY_JPQL =
		" ORDER BY details.Student_Id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Student_Details.Student_Id ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long DEPARTMENT_ID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long STUDENT_ID_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public DetailsModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _Student_Id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setStudent_Id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Student_Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Details.class;
	}

	@Override
	public String getModelClassName() {
		return Details.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Details, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Details, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Details, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Details)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Details, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Details, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Details)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Details, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Details, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<Details, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<Details, Object>> attributeGetterFunctions =
				new LinkedHashMap<String, Function<Details, Object>>();

			attributeGetterFunctions.put("uuid", Details::getUuid);
			attributeGetterFunctions.put("Student_Id", Details::getStudent_Id);
			attributeGetterFunctions.put("groupId", Details::getGroupId);
			attributeGetterFunctions.put("companyId", Details::getCompanyId);
			attributeGetterFunctions.put("userId", Details::getUserId);
			attributeGetterFunctions.put("userName", Details::getUserName);
			attributeGetterFunctions.put("createDate", Details::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", Details::getModifiedDate);
			attributeGetterFunctions.put(
				"Student_Name", Details::getStudent_Name);
			attributeGetterFunctions.put(
				"Department_Id", Details::getDepartment_Id);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<Details, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<Details, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<Details, ?>>();

			attributeSetterBiConsumers.put(
				"uuid", (BiConsumer<Details, String>)Details::setUuid);
			attributeSetterBiConsumers.put(
				"Student_Id",
				(BiConsumer<Details, Integer>)Details::setStudent_Id);
			attributeSetterBiConsumers.put(
				"groupId", (BiConsumer<Details, Long>)Details::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId", (BiConsumer<Details, Long>)Details::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId", (BiConsumer<Details, Long>)Details::setUserId);
			attributeSetterBiConsumers.put(
				"userName", (BiConsumer<Details, String>)Details::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<Details, Date>)Details::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<Details, Date>)Details::setModifiedDate);
			attributeSetterBiConsumers.put(
				"Student_Name",
				(BiConsumer<Details, String>)Details::setStudent_Name);
			attributeSetterBiConsumers.put(
				"Department_Id",
				(BiConsumer<Details, Integer>)Details::setDepartment_Id);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@Override
	public int getStudent_Id() {
		return _Student_Id;
	}

	@Override
	public void setStudent_Id(int Student_Id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_Student_Id = Student_Id;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@Override
	public String getStudent_Name() {
		if (_Student_Name == null) {
			return "";
		}
		else {
			return _Student_Name;
		}
	}

	@Override
	public void setStudent_Name(String Student_Name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_Student_Name = Student_Name;
	}

	@Override
	public int getDepartment_Id() {
		return _Department_Id;
	}

	@Override
	public void setDepartment_Id(int Department_Id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_Department_Id = Department_Id;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public int getOriginalDepartment_Id() {
		return GetterUtil.getInteger(
			this.<Integer>getColumnOriginalValue("Department_Id"));
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Details.class.getName()));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public Details toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Details>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DetailsImpl detailsImpl = new DetailsImpl();

		detailsImpl.setUuid(getUuid());
		detailsImpl.setStudent_Id(getStudent_Id());
		detailsImpl.setGroupId(getGroupId());
		detailsImpl.setCompanyId(getCompanyId());
		detailsImpl.setUserId(getUserId());
		detailsImpl.setUserName(getUserName());
		detailsImpl.setCreateDate(getCreateDate());
		detailsImpl.setModifiedDate(getModifiedDate());
		detailsImpl.setStudent_Name(getStudent_Name());
		detailsImpl.setDepartment_Id(getDepartment_Id());

		detailsImpl.resetOriginalValues();

		return detailsImpl;
	}

	@Override
	public Details cloneWithOriginalValues() {
		DetailsImpl detailsImpl = new DetailsImpl();

		detailsImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		detailsImpl.setStudent_Id(
			this.<Integer>getColumnOriginalValue("Student_Id"));
		detailsImpl.setGroupId(this.<Long>getColumnOriginalValue("groupId"));
		detailsImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		detailsImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		detailsImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		detailsImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		detailsImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		detailsImpl.setStudent_Name(
			this.<String>getColumnOriginalValue("Student_Name"));
		detailsImpl.setDepartment_Id(
			this.<Integer>getColumnOriginalValue("Department_Id"));

		return detailsImpl;
	}

	@Override
	public int compareTo(Details details) {
		int primaryKey = details.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Details)) {
			return false;
		}

		Details details = (Details)object;

		int primaryKey = details.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Details> toCacheModel() {
		DetailsCacheModel detailsCacheModel = new DetailsCacheModel();

		detailsCacheModel.uuid = getUuid();

		String uuid = detailsCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			detailsCacheModel.uuid = null;
		}

		detailsCacheModel.Student_Id = getStudent_Id();

		detailsCacheModel.groupId = getGroupId();

		detailsCacheModel.companyId = getCompanyId();

		detailsCacheModel.userId = getUserId();

		detailsCacheModel.userName = getUserName();

		String userName = detailsCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			detailsCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			detailsCacheModel.createDate = createDate.getTime();
		}
		else {
			detailsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			detailsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			detailsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		detailsCacheModel.Student_Name = getStudent_Name();

		String Student_Name = detailsCacheModel.Student_Name;

		if ((Student_Name != null) && (Student_Name.length() == 0)) {
			detailsCacheModel.Student_Name = null;
		}

		detailsCacheModel.Department_Id = getDepartment_Id();

		return detailsCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Details, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Details, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Details, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Details)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Details>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Details.class, ModelWrapper.class);

	}

	private String _uuid;
	private int _Student_Id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _Student_Name;
	private int _Department_Id;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Details, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Details)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("Student_Id", _Student_Id);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("Student_Name", _Student_Name);
		_columnOriginalValues.put("Department_Id", _Department_Id);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("Student_Id", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("Student_Name", 256L);

		columnBitmasks.put("Department_Id", 512L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Details _escapedModel;

}