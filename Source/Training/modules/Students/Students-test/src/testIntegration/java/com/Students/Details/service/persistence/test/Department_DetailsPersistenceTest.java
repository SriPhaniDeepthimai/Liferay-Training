/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence.test;

import com.Students.Details.exception.NoSuchDepartment_DetailsException;
import com.Students.Details.model.Department_Details;
import com.Students.Details.service.Department_DetailsLocalServiceUtil;
import com.Students.Details.service.persistence.Department_DetailsPersistence;
import com.Students.Details.service.persistence.Department_DetailsUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class Department_DetailsPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.Students.Details.service"));

	@Before
	public void setUp() {
		_persistence = Department_DetailsUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Department_Details> iterator =
			_department_Detailses.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Department_Details department_Details = _persistence.create(pk);

		Assert.assertNotNull(department_Details);

		Assert.assertEquals(department_Details.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Department_Details newDepartment_Details = addDepartment_Details();

		_persistence.remove(newDepartment_Details);

		Department_Details existingDepartment_Details =
			_persistence.fetchByPrimaryKey(
				newDepartment_Details.getPrimaryKey());

		Assert.assertNull(existingDepartment_Details);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addDepartment_Details();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Department_Details newDepartment_Details = _persistence.create(pk);

		newDepartment_Details.setUuid(RandomTestUtil.randomString());

		newDepartment_Details.setGroupId(RandomTestUtil.nextLong());

		newDepartment_Details.setCompanyId(RandomTestUtil.nextLong());

		newDepartment_Details.setUserId(RandomTestUtil.nextLong());

		newDepartment_Details.setUserName(RandomTestUtil.randomString());

		newDepartment_Details.setCreateDate(RandomTestUtil.nextDate());

		newDepartment_Details.setModifiedDate(RandomTestUtil.nextDate());

		newDepartment_Details.setDepartment_Name(RandomTestUtil.randomString());

		_department_Detailses.add(_persistence.update(newDepartment_Details));

		Department_Details existingDepartment_Details =
			_persistence.findByPrimaryKey(
				newDepartment_Details.getPrimaryKey());

		Assert.assertEquals(
			existingDepartment_Details.getUuid(),
			newDepartment_Details.getUuid());
		Assert.assertEquals(
			existingDepartment_Details.getDepartment_Id(),
			newDepartment_Details.getDepartment_Id());
		Assert.assertEquals(
			existingDepartment_Details.getGroupId(),
			newDepartment_Details.getGroupId());
		Assert.assertEquals(
			existingDepartment_Details.getCompanyId(),
			newDepartment_Details.getCompanyId());
		Assert.assertEquals(
			existingDepartment_Details.getUserId(),
			newDepartment_Details.getUserId());
		Assert.assertEquals(
			existingDepartment_Details.getUserName(),
			newDepartment_Details.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingDepartment_Details.getCreateDate()),
			Time.getShortTimestamp(newDepartment_Details.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(
				existingDepartment_Details.getModifiedDate()),
			Time.getShortTimestamp(newDepartment_Details.getModifiedDate()));
		Assert.assertEquals(
			existingDepartment_Details.getDepartment_Name(),
			newDepartment_Details.getDepartment_Name());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G("", RandomTestUtil.nextLong());

		_persistence.countByUUID_G("null", 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C("", RandomTestUtil.nextLong());

		_persistence.countByUuid_C("null", 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Department_Details newDepartment_Details = addDepartment_Details();

		Department_Details existingDepartment_Details =
			_persistence.findByPrimaryKey(
				newDepartment_Details.getPrimaryKey());

		Assert.assertEquals(existingDepartment_Details, newDepartment_Details);
	}

	@Test(expected = NoSuchDepartment_DetailsException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Department_Details> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Department_Details", "uuid", true, "Department_Id", true,
			"groupId", true, "companyId", true, "userId", true, "userName",
			true, "createDate", true, "modifiedDate", true, "Department_Name",
			true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Department_Details newDepartment_Details = addDepartment_Details();

		Department_Details existingDepartment_Details =
			_persistence.fetchByPrimaryKey(
				newDepartment_Details.getPrimaryKey());

		Assert.assertEquals(existingDepartment_Details, newDepartment_Details);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Department_Details missingDepartment_Details =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingDepartment_Details);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Department_Details newDepartment_Details1 = addDepartment_Details();
		Department_Details newDepartment_Details2 = addDepartment_Details();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDepartment_Details1.getPrimaryKey());
		primaryKeys.add(newDepartment_Details2.getPrimaryKey());

		Map<Serializable, Department_Details> department_Detailses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, department_Detailses.size());
		Assert.assertEquals(
			newDepartment_Details1,
			department_Detailses.get(newDepartment_Details1.getPrimaryKey()));
		Assert.assertEquals(
			newDepartment_Details2,
			department_Detailses.get(newDepartment_Details2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		int pk1 = RandomTestUtil.nextInt();

		int pk2 = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Department_Details> department_Detailses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(department_Detailses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Department_Details newDepartment_Details = addDepartment_Details();

		int pk = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDepartment_Details.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Department_Details> department_Detailses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, department_Detailses.size());
		Assert.assertEquals(
			newDepartment_Details,
			department_Detailses.get(newDepartment_Details.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Department_Details> department_Detailses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(department_Detailses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Department_Details newDepartment_Details = addDepartment_Details();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDepartment_Details.getPrimaryKey());

		Map<Serializable, Department_Details> department_Detailses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, department_Detailses.size());
		Assert.assertEquals(
			newDepartment_Details,
			department_Detailses.get(newDepartment_Details.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			Department_DetailsLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<Department_Details>() {

				@Override
				public void performAction(
					Department_Details department_Details) {

					Assert.assertNotNull(department_Details);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Department_Details newDepartment_Details = addDepartment_Details();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Department_Details.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Department_Id", newDepartment_Details.getDepartment_Id()));

		List<Department_Details> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		Department_Details existingDepartment_Details = result.get(0);

		Assert.assertEquals(existingDepartment_Details, newDepartment_Details);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Department_Details.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Department_Id", RandomTestUtil.nextInt()));

		List<Department_Details> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Department_Details newDepartment_Details = addDepartment_Details();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Department_Details.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Department_Id"));

		Object newDepartment_Id = newDepartment_Details.getDepartment_Id();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Department_Id", new Object[] {newDepartment_Id}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingDepartment_Id = result.get(0);

		Assert.assertEquals(existingDepartment_Id, newDepartment_Id);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Department_Details.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Department_Id"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Department_Id", new Object[] {RandomTestUtil.nextInt()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		Department_Details newDepartment_Details = addDepartment_Details();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(
				newDepartment_Details.getPrimaryKey()));
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromDatabase()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(true);
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromSession()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(false);
	}

	private void _testResetOriginalValuesWithDynamicQuery(boolean clearSession)
		throws Exception {

		Department_Details newDepartment_Details = addDepartment_Details();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Department_Details.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Department_Id", newDepartment_Details.getDepartment_Id()));

		List<Department_Details> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(Department_Details department_Details) {
		Assert.assertEquals(
			department_Details.getUuid(),
			ReflectionTestUtil.invoke(
				department_Details, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(department_Details.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				department_Details, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected Department_Details addDepartment_Details() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Department_Details department_Details = _persistence.create(pk);

		department_Details.setUuid(RandomTestUtil.randomString());

		department_Details.setGroupId(RandomTestUtil.nextLong());

		department_Details.setCompanyId(RandomTestUtil.nextLong());

		department_Details.setUserId(RandomTestUtil.nextLong());

		department_Details.setUserName(RandomTestUtil.randomString());

		department_Details.setCreateDate(RandomTestUtil.nextDate());

		department_Details.setModifiedDate(RandomTestUtil.nextDate());

		department_Details.setDepartment_Name(RandomTestUtil.randomString());

		_department_Detailses.add(_persistence.update(department_Details));

		return department_Details;
	}

	private List<Department_Details> _department_Detailses =
		new ArrayList<Department_Details>();
	private Department_DetailsPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}