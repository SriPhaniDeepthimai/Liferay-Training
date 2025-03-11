/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence.test;

import com.Students.Details.exception.NoSuchStudents_MarksException;
import com.Students.Details.model.Students_Marks;
import com.Students.Details.service.Students_MarksLocalServiceUtil;
import com.Students.Details.service.persistence.Students_MarksPersistence;
import com.Students.Details.service.persistence.Students_MarksUtil;

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
public class Students_MarksPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.Students.Details.service"));

	@Before
	public void setUp() {
		_persistence = Students_MarksUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Students_Marks> iterator = _students_Markses.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Students_Marks students_Marks = _persistence.create(pk);

		Assert.assertNotNull(students_Marks);

		Assert.assertEquals(students_Marks.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Students_Marks newStudents_Marks = addStudents_Marks();

		_persistence.remove(newStudents_Marks);

		Students_Marks existingStudents_Marks = _persistence.fetchByPrimaryKey(
			newStudents_Marks.getPrimaryKey());

		Assert.assertNull(existingStudents_Marks);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addStudents_Marks();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Students_Marks newStudents_Marks = _persistence.create(pk);

		newStudents_Marks.setUuid(RandomTestUtil.randomString());

		newStudents_Marks.setGroupId(RandomTestUtil.nextLong());

		newStudents_Marks.setCompanyId(RandomTestUtil.nextLong());

		newStudents_Marks.setUserId(RandomTestUtil.nextLong());

		newStudents_Marks.setUserName(RandomTestUtil.randomString());

		newStudents_Marks.setCreateDate(RandomTestUtil.nextDate());

		newStudents_Marks.setModifiedDate(RandomTestUtil.nextDate());

		newStudents_Marks.setStudent_Marks(RandomTestUtil.randomString());

		_students_Markses.add(_persistence.update(newStudents_Marks));

		Students_Marks existingStudents_Marks = _persistence.findByPrimaryKey(
			newStudents_Marks.getPrimaryKey());

		Assert.assertEquals(
			existingStudents_Marks.getUuid(), newStudents_Marks.getUuid());
		Assert.assertEquals(
			existingStudents_Marks.getStudent_Id(),
			newStudents_Marks.getStudent_Id());
		Assert.assertEquals(
			existingStudents_Marks.getGroupId(),
			newStudents_Marks.getGroupId());
		Assert.assertEquals(
			existingStudents_Marks.getCompanyId(),
			newStudents_Marks.getCompanyId());
		Assert.assertEquals(
			existingStudents_Marks.getUserId(), newStudents_Marks.getUserId());
		Assert.assertEquals(
			existingStudents_Marks.getUserName(),
			newStudents_Marks.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingStudents_Marks.getCreateDate()),
			Time.getShortTimestamp(newStudents_Marks.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingStudents_Marks.getModifiedDate()),
			Time.getShortTimestamp(newStudents_Marks.getModifiedDate()));
		Assert.assertEquals(
			existingStudents_Marks.getStudent_Marks(),
			newStudents_Marks.getStudent_Marks());
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
	public void testCountByStudentId() throws Exception {
		_persistence.countByStudentId(RandomTestUtil.nextInt());

		_persistence.countByStudentId(0);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Students_Marks newStudents_Marks = addStudents_Marks();

		Students_Marks existingStudents_Marks = _persistence.findByPrimaryKey(
			newStudents_Marks.getPrimaryKey());

		Assert.assertEquals(existingStudents_Marks, newStudents_Marks);
	}

	@Test(expected = NoSuchStudents_MarksException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Students_Marks> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Students_Marks", "uuid", true, "Student_Id", true, "groupId", true,
			"companyId", true, "userId", true, "userName", true, "createDate",
			true, "modifiedDate", true, "Student_Marks", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Students_Marks newStudents_Marks = addStudents_Marks();

		Students_Marks existingStudents_Marks = _persistence.fetchByPrimaryKey(
			newStudents_Marks.getPrimaryKey());

		Assert.assertEquals(existingStudents_Marks, newStudents_Marks);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Students_Marks missingStudents_Marks = _persistence.fetchByPrimaryKey(
			pk);

		Assert.assertNull(missingStudents_Marks);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Students_Marks newStudents_Marks1 = addStudents_Marks();
		Students_Marks newStudents_Marks2 = addStudents_Marks();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newStudents_Marks1.getPrimaryKey());
		primaryKeys.add(newStudents_Marks2.getPrimaryKey());

		Map<Serializable, Students_Marks> students_Markses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, students_Markses.size());
		Assert.assertEquals(
			newStudents_Marks1,
			students_Markses.get(newStudents_Marks1.getPrimaryKey()));
		Assert.assertEquals(
			newStudents_Marks2,
			students_Markses.get(newStudents_Marks2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		int pk1 = RandomTestUtil.nextInt();

		int pk2 = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Students_Marks> students_Markses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(students_Markses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Students_Marks newStudents_Marks = addStudents_Marks();

		int pk = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newStudents_Marks.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Students_Marks> students_Markses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, students_Markses.size());
		Assert.assertEquals(
			newStudents_Marks,
			students_Markses.get(newStudents_Marks.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Students_Marks> students_Markses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(students_Markses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Students_Marks newStudents_Marks = addStudents_Marks();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newStudents_Marks.getPrimaryKey());

		Map<Serializable, Students_Marks> students_Markses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, students_Markses.size());
		Assert.assertEquals(
			newStudents_Marks,
			students_Markses.get(newStudents_Marks.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			Students_MarksLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Students_Marks>() {

				@Override
				public void performAction(Students_Marks students_Marks) {
					Assert.assertNotNull(students_Marks);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Students_Marks newStudents_Marks = addStudents_Marks();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Students_Marks.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Student_Id", newStudents_Marks.getStudent_Id()));

		List<Students_Marks> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		Students_Marks existingStudents_Marks = result.get(0);

		Assert.assertEquals(existingStudents_Marks, newStudents_Marks);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Students_Marks.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("Student_Id", RandomTestUtil.nextInt()));

		List<Students_Marks> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Students_Marks newStudents_Marks = addStudents_Marks();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Students_Marks.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Student_Id"));

		Object newStudent_Id = newStudents_Marks.getStudent_Id();

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
			Students_Marks.class, _dynamicQueryClassLoader);

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
		Students_Marks newStudents_Marks = addStudents_Marks();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newStudents_Marks.getPrimaryKey()));
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

		Students_Marks newStudents_Marks = addStudents_Marks();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Students_Marks.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Student_Id", newStudents_Marks.getStudent_Id()));

		List<Students_Marks> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(Students_Marks students_Marks) {
		Assert.assertEquals(
			students_Marks.getUuid(),
			ReflectionTestUtil.invoke(
				students_Marks, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(students_Marks.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				students_Marks, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));

		Assert.assertEquals(
			Integer.valueOf(students_Marks.getStudent_Id()),
			ReflectionTestUtil.<Integer>invoke(
				students_Marks, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "Student_Id"));
	}

	protected Students_Marks addStudents_Marks() throws Exception {
		int pk = RandomTestUtil.nextInt();

		Students_Marks students_Marks = _persistence.create(pk);

		students_Marks.setUuid(RandomTestUtil.randomString());

		students_Marks.setGroupId(RandomTestUtil.nextLong());

		students_Marks.setCompanyId(RandomTestUtil.nextLong());

		students_Marks.setUserId(RandomTestUtil.nextLong());

		students_Marks.setUserName(RandomTestUtil.randomString());

		students_Marks.setCreateDate(RandomTestUtil.nextDate());

		students_Marks.setModifiedDate(RandomTestUtil.nextDate());

		students_Marks.setStudent_Marks(RandomTestUtil.randomString());

		_students_Markses.add(_persistence.update(students_Marks));

		return students_Marks;
	}

	private List<Students_Marks> _students_Markses =
		new ArrayList<Students_Marks>();
	private Students_MarksPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}