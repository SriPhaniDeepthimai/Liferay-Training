/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence.test;

import com.Students.Details.exception.NoSuchTeacherDetailsException;
import com.Students.Details.model.TeacherDetails;
import com.Students.Details.service.TeacherDetailsLocalServiceUtil;
import com.Students.Details.service.persistence.TeacherDetailsPersistence;
import com.Students.Details.service.persistence.TeacherDetailsUtil;

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
public class TeacherDetailsPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.Students.Details.service"));

	@Before
	public void setUp() {
		_persistence = TeacherDetailsUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<TeacherDetails> iterator = _teacherDetailses.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		int pk = RandomTestUtil.nextInt();

		TeacherDetails teacherDetails = _persistence.create(pk);

		Assert.assertNotNull(teacherDetails);

		Assert.assertEquals(teacherDetails.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		TeacherDetails newTeacherDetails = addTeacherDetails();

		_persistence.remove(newTeacherDetails);

		TeacherDetails existingTeacherDetails = _persistence.fetchByPrimaryKey(
			newTeacherDetails.getPrimaryKey());

		Assert.assertNull(existingTeacherDetails);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addTeacherDetails();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		int pk = RandomTestUtil.nextInt();

		TeacherDetails newTeacherDetails = _persistence.create(pk);

		newTeacherDetails.setUuid(RandomTestUtil.randomString());

		newTeacherDetails.setGroupId(RandomTestUtil.nextLong());

		newTeacherDetails.setCompanyId(RandomTestUtil.nextLong());

		newTeacherDetails.setUserId(RandomTestUtil.nextLong());

		newTeacherDetails.setUserName(RandomTestUtil.randomString());

		newTeacherDetails.setCreateDate(RandomTestUtil.nextDate());

		newTeacherDetails.setModifiedDate(RandomTestUtil.nextDate());

		newTeacherDetails.setTeacher_Name(RandomTestUtil.randomString());

		newTeacherDetails.setDepartment_Id(RandomTestUtil.nextInt());

		_teacherDetailses.add(_persistence.update(newTeacherDetails));

		TeacherDetails existingTeacherDetails = _persistence.findByPrimaryKey(
			newTeacherDetails.getPrimaryKey());

		Assert.assertEquals(
			existingTeacherDetails.getUuid(), newTeacherDetails.getUuid());
		Assert.assertEquals(
			existingTeacherDetails.getTeacher_Id(),
			newTeacherDetails.getTeacher_Id());
		Assert.assertEquals(
			existingTeacherDetails.getGroupId(),
			newTeacherDetails.getGroupId());
		Assert.assertEquals(
			existingTeacherDetails.getCompanyId(),
			newTeacherDetails.getCompanyId());
		Assert.assertEquals(
			existingTeacherDetails.getUserId(), newTeacherDetails.getUserId());
		Assert.assertEquals(
			existingTeacherDetails.getUserName(),
			newTeacherDetails.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingTeacherDetails.getCreateDate()),
			Time.getShortTimestamp(newTeacherDetails.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingTeacherDetails.getModifiedDate()),
			Time.getShortTimestamp(newTeacherDetails.getModifiedDate()));
		Assert.assertEquals(
			existingTeacherDetails.getTeacher_Name(),
			newTeacherDetails.getTeacher_Name());
		Assert.assertEquals(
			existingTeacherDetails.getDepartment_Id(),
			newTeacherDetails.getDepartment_Id());
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
		TeacherDetails newTeacherDetails = addTeacherDetails();

		TeacherDetails existingTeacherDetails = _persistence.findByPrimaryKey(
			newTeacherDetails.getPrimaryKey());

		Assert.assertEquals(existingTeacherDetails, newTeacherDetails);
	}

	@Test(expected = NoSuchTeacherDetailsException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<TeacherDetails> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Teacher_Details", "uuid", true, "Teacher_Id", true, "groupId",
			true, "companyId", true, "userId", true, "userName", true,
			"createDate", true, "modifiedDate", true, "Teacher_Name", true,
			"Department_Id", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		TeacherDetails newTeacherDetails = addTeacherDetails();

		TeacherDetails existingTeacherDetails = _persistence.fetchByPrimaryKey(
			newTeacherDetails.getPrimaryKey());

		Assert.assertEquals(existingTeacherDetails, newTeacherDetails);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		TeacherDetails missingTeacherDetails = _persistence.fetchByPrimaryKey(
			pk);

		Assert.assertNull(missingTeacherDetails);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		TeacherDetails newTeacherDetails1 = addTeacherDetails();
		TeacherDetails newTeacherDetails2 = addTeacherDetails();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTeacherDetails1.getPrimaryKey());
		primaryKeys.add(newTeacherDetails2.getPrimaryKey());

		Map<Serializable, TeacherDetails> teacherDetailses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, teacherDetailses.size());
		Assert.assertEquals(
			newTeacherDetails1,
			teacherDetailses.get(newTeacherDetails1.getPrimaryKey()));
		Assert.assertEquals(
			newTeacherDetails2,
			teacherDetailses.get(newTeacherDetails2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		int pk1 = RandomTestUtil.nextInt();

		int pk2 = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, TeacherDetails> teacherDetailses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(teacherDetailses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		TeacherDetails newTeacherDetails = addTeacherDetails();

		int pk = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTeacherDetails.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, TeacherDetails> teacherDetailses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, teacherDetailses.size());
		Assert.assertEquals(
			newTeacherDetails,
			teacherDetailses.get(newTeacherDetails.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, TeacherDetails> teacherDetailses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(teacherDetailses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		TeacherDetails newTeacherDetails = addTeacherDetails();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTeacherDetails.getPrimaryKey());

		Map<Serializable, TeacherDetails> teacherDetailses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, teacherDetailses.size());
		Assert.assertEquals(
			newTeacherDetails,
			teacherDetailses.get(newTeacherDetails.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			TeacherDetailsLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<TeacherDetails>() {

				@Override
				public void performAction(TeacherDetails teacherDetails) {
					Assert.assertNotNull(teacherDetails);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		TeacherDetails newTeacherDetails = addTeacherDetails();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			TeacherDetails.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Teacher_Id", newTeacherDetails.getTeacher_Id()));

		List<TeacherDetails> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		TeacherDetails existingTeacherDetails = result.get(0);

		Assert.assertEquals(existingTeacherDetails, newTeacherDetails);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			TeacherDetails.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("Teacher_Id", RandomTestUtil.nextInt()));

		List<TeacherDetails> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		TeacherDetails newTeacherDetails = addTeacherDetails();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			TeacherDetails.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Teacher_Id"));

		Object newTeacher_Id = newTeacherDetails.getTeacher_Id();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Teacher_Id", new Object[] {newTeacher_Id}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingTeacher_Id = result.get(0);

		Assert.assertEquals(existingTeacher_Id, newTeacher_Id);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			TeacherDetails.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Teacher_Id"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Teacher_Id", new Object[] {RandomTestUtil.nextInt()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		TeacherDetails newTeacherDetails = addTeacherDetails();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newTeacherDetails.getPrimaryKey()));
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

		TeacherDetails newTeacherDetails = addTeacherDetails();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			TeacherDetails.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Teacher_Id", newTeacherDetails.getTeacher_Id()));

		List<TeacherDetails> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(TeacherDetails teacherDetails) {
		Assert.assertEquals(
			teacherDetails.getUuid(),
			ReflectionTestUtil.invoke(
				teacherDetails, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(teacherDetails.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				teacherDetails, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected TeacherDetails addTeacherDetails() throws Exception {
		int pk = RandomTestUtil.nextInt();

		TeacherDetails teacherDetails = _persistence.create(pk);

		teacherDetails.setUuid(RandomTestUtil.randomString());

		teacherDetails.setGroupId(RandomTestUtil.nextLong());

		teacherDetails.setCompanyId(RandomTestUtil.nextLong());

		teacherDetails.setUserId(RandomTestUtil.nextLong());

		teacherDetails.setUserName(RandomTestUtil.randomString());

		teacherDetails.setCreateDate(RandomTestUtil.nextDate());

		teacherDetails.setModifiedDate(RandomTestUtil.nextDate());

		teacherDetails.setTeacher_Name(RandomTestUtil.randomString());

		teacherDetails.setDepartment_Id(RandomTestUtil.nextInt());

		_teacherDetailses.add(_persistence.update(teacherDetails));

		return teacherDetails;
	}

	private List<TeacherDetails> _teacherDetailses =
		new ArrayList<TeacherDetails>();
	private TeacherDetailsPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}