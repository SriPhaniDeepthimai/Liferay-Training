/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence.test;

import com.Students.Details.exception.NoSuchDetailsException;
import com.Students.Details.model.Details;
import com.Students.Details.service.DetailsLocalServiceUtil;
import com.Students.Details.service.persistence.DetailsPersistence;
import com.Students.Details.service.persistence.DetailsUtil;

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
public class DetailsPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.Students.Details.service"));

	@Before
	public void setUp() {
		_persistence = DetailsUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Details> iterator = _detailses.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Details details = _persistence.create(pk);

		Assert.assertNotNull(details);

		Assert.assertEquals(details.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Details newDetails = addDetails();

		_persistence.remove(newDetails);

		Details existingDetails = _persistence.fetchByPrimaryKey(
			newDetails.getPrimaryKey());

		Assert.assertNull(existingDetails);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addDetails();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Details newDetails = _persistence.create(pk);

		newDetails.setUuid(RandomTestUtil.randomString());

		newDetails.setGroupId(RandomTestUtil.nextLong());

		newDetails.setCompanyId(RandomTestUtil.nextLong());

		newDetails.setUserId(RandomTestUtil.nextLong());

		newDetails.setUserName(RandomTestUtil.randomString());

		newDetails.setCreateDate(RandomTestUtil.nextDate());

		newDetails.setModifiedDate(RandomTestUtil.nextDate());

		newDetails.setStudent_Name(RandomTestUtil.randomString());

		newDetails.setDepartment_Id(RandomTestUtil.nextInt());

		_detailses.add(_persistence.update(newDetails));

		Details existingDetails = _persistence.findByPrimaryKey(
			newDetails.getPrimaryKey());

		Assert.assertEquals(existingDetails.getUuid(), newDetails.getUuid());
		Assert.assertEquals(
			existingDetails.getStudent_Id(), newDetails.getStudent_Id());
		Assert.assertEquals(
			existingDetails.getGroupId(), newDetails.getGroupId());
		Assert.assertEquals(
			existingDetails.getCompanyId(), newDetails.getCompanyId());
		Assert.assertEquals(
			existingDetails.getUserId(), newDetails.getUserId());
		Assert.assertEquals(
			existingDetails.getUserName(), newDetails.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingDetails.getCreateDate()),
			Time.getShortTimestamp(newDetails.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingDetails.getModifiedDate()),
			Time.getShortTimestamp(newDetails.getModifiedDate()));
		Assert.assertEquals(
			existingDetails.getStudent_Name(), newDetails.getStudent_Name());
		Assert.assertEquals(
			existingDetails.getDepartment_Id(), newDetails.getDepartment_Id());
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
	public void testCountByDepartmentId() throws Exception {
		_persistence.countByDepartmentId(RandomTestUtil.nextInt());

		_persistence.countByDepartmentId(0);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Details newDetails = addDetails();

		Details existingDetails = _persistence.findByPrimaryKey(
			newDetails.getPrimaryKey());

		Assert.assertEquals(existingDetails, newDetails);
	}

	@Test(expected = NoSuchDetailsException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Details> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Student_Details", "uuid", true, "Student_Id", true, "groupId",
			true, "companyId", true, "userId", true, "userName", true,
			"createDate", true, "modifiedDate", true, "Student_Name", true,
			"Department_Id", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Details newDetails = addDetails();

		Details existingDetails = _persistence.fetchByPrimaryKey(
			newDetails.getPrimaryKey());

		Assert.assertEquals(existingDetails, newDetails);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Details missingDetails = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingDetails);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Details newDetails1 = addDetails();
		Details newDetails2 = addDetails();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDetails1.getPrimaryKey());
		primaryKeys.add(newDetails2.getPrimaryKey());

		Map<Serializable, Details> detailses = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, detailses.size());
		Assert.assertEquals(
			newDetails1, detailses.get(newDetails1.getPrimaryKey()));
		Assert.assertEquals(
			newDetails2, detailses.get(newDetails2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		int pk1 = RandomTestUtil.nextInt();

		int pk2 = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Details> detailses = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(detailses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Details newDetails = addDetails();

		int pk = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDetails.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Details> detailses = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, detailses.size());
		Assert.assertEquals(
			newDetails, detailses.get(newDetails.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Details> detailses = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(detailses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Details newDetails = addDetails();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDetails.getPrimaryKey());

		Map<Serializable, Details> detailses = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, detailses.size());
		Assert.assertEquals(
			newDetails, detailses.get(newDetails.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			DetailsLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Details>() {

				@Override
				public void performAction(Details details) {
					Assert.assertNotNull(details);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Details newDetails = addDetails();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Details.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Student_Id", newDetails.getStudent_Id()));

		List<Details> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Details existingDetails = result.get(0);

		Assert.assertEquals(existingDetails, newDetails);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Details.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("Student_Id", RandomTestUtil.nextInt()));

		List<Details> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Details newDetails = addDetails();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Details.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Student_Id"));

		Object newStudent_Id = newDetails.getStudent_Id();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Student_Id", new Object[] {newStudent_Id}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingStudent_Id = result.get(0);

		Assert.assertEquals(existingStudent_Id, newStudent_Id);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Details.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Student_Id"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Student_Id", new Object[] {RandomTestUtil.nextInt()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		Details newDetails = addDetails();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newDetails.getPrimaryKey()));
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

		Details newDetails = addDetails();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Details.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Student_Id", newDetails.getStudent_Id()));

		List<Details> result = _persistence.findWithDynamicQuery(dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(Details details) {
		Assert.assertEquals(
			details.getUuid(),
			ReflectionTestUtil.invoke(
				details, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(details.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				details, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected Details addDetails() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Details details = _persistence.create(pk);

		details.setUuid(RandomTestUtil.randomString());

		details.setGroupId(RandomTestUtil.nextLong());

		details.setCompanyId(RandomTestUtil.nextLong());

		details.setUserId(RandomTestUtil.nextLong());

		details.setUserName(RandomTestUtil.randomString());

		details.setCreateDate(RandomTestUtil.nextDate());

		details.setModifiedDate(RandomTestUtil.nextDate());

		details.setStudent_Name(RandomTestUtil.randomString());

		details.setDepartment_Id(RandomTestUtil.nextInt());

		_detailses.add(_persistence.update(details));

		return details;
	}

	private List<Details> _detailses = new ArrayList<Details>();
	private DetailsPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}