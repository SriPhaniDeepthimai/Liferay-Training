/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence;

import com.Students.Details.model.Students_Marks;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the students_ marks service. This utility wraps <code>com.Students.Details.service.persistence.impl.Students_MarksPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Students_MarksPersistence
 * @generated
 */
public class Students_MarksUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Students_Marks students_Marks) {
		getPersistence().clearCache(students_Marks);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Students_Marks> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Students_Marks> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Students_Marks> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Students_Marks> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Students_Marks> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Students_Marks update(Students_Marks students_Marks) {
		return getPersistence().update(students_Marks);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Students_Marks update(
		Students_Marks students_Marks, ServiceContext serviceContext) {

		return getPersistence().update(students_Marks, serviceContext);
	}

	/**
	 * Returns all the students_ markses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching students_ markses
	 */
	public static List<Students_Marks> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the students_ markses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Students_MarksModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of students_ markses
	 * @param end the upper bound of the range of students_ markses (not inclusive)
	 * @return the range of matching students_ markses
	 */
	public static List<Students_Marks> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the students_ markses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Students_MarksModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of students_ markses
	 * @param end the upper bound of the range of students_ markses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students_ markses
	 */
	public static List<Students_Marks> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Students_Marks> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the students_ markses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Students_MarksModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of students_ markses
	 * @param end the upper bound of the range of students_ markses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students_ markses
	 */
	public static List<Students_Marks> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Students_Marks> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public static Students_Marks findByUuid_First(
			String uuid, OrderByComparator<Students_Marks> orderByComparator)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public static Students_Marks fetchByUuid_First(
		String uuid, OrderByComparator<Students_Marks> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public static Students_Marks findByUuid_Last(
			String uuid, OrderByComparator<Students_Marks> orderByComparator)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public static Students_Marks fetchByUuid_Last(
		String uuid, OrderByComparator<Students_Marks> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the students_ markses before and after the current students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param Student_Id the primary key of the current students_ marks
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next students_ marks
	 * @throws NoSuchStudents_MarksException if a students_ marks with the primary key could not be found
	 */
	public static Students_Marks[] findByUuid_PrevAndNext(
			int Student_Id, String uuid,
			OrderByComparator<Students_Marks> orderByComparator)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().findByUuid_PrevAndNext(
			Student_Id, uuid, orderByComparator);
	}

	/**
	 * Removes all the students_ markses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of students_ markses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching students_ markses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the students_ marks where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchStudents_MarksException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public static Students_Marks findByUUID_G(String uuid, long groupId)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the students_ marks where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public static Students_Marks fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the students_ marks where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public static Students_Marks fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the students_ marks where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the students_ marks that was removed
	 */
	public static Students_Marks removeByUUID_G(String uuid, long groupId)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of students_ markses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching students_ markses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the students_ markses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching students_ markses
	 */
	public static List<Students_Marks> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the students_ markses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Students_MarksModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of students_ markses
	 * @param end the upper bound of the range of students_ markses (not inclusive)
	 * @return the range of matching students_ markses
	 */
	public static List<Students_Marks> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the students_ markses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Students_MarksModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of students_ markses
	 * @param end the upper bound of the range of students_ markses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students_ markses
	 */
	public static List<Students_Marks> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Students_Marks> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the students_ markses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Students_MarksModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of students_ markses
	 * @param end the upper bound of the range of students_ markses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students_ markses
	 */
	public static List<Students_Marks> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Students_Marks> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first students_ marks in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public static Students_Marks findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Students_Marks> orderByComparator)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first students_ marks in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public static Students_Marks fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Students_Marks> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last students_ marks in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public static Students_Marks findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Students_Marks> orderByComparator)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last students_ marks in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public static Students_Marks fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Students_Marks> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the students_ markses before and after the current students_ marks in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param Student_Id the primary key of the current students_ marks
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next students_ marks
	 * @throws NoSuchStudents_MarksException if a students_ marks with the primary key could not be found
	 */
	public static Students_Marks[] findByUuid_C_PrevAndNext(
			int Student_Id, String uuid, long companyId,
			OrderByComparator<Students_Marks> orderByComparator)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().findByUuid_C_PrevAndNext(
			Student_Id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the students_ markses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of students_ markses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching students_ markses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the students_ marks where Student_Id = &#63; or throws a <code>NoSuchStudents_MarksException</code> if it could not be found.
	 *
	 * @param Student_Id the student_ ID
	 * @return the matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public static Students_Marks findByStudentId(int Student_Id)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().findByStudentId(Student_Id);
	}

	/**
	 * Returns the students_ marks where Student_Id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param Student_Id the student_ ID
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public static Students_Marks fetchByStudentId(int Student_Id) {
		return getPersistence().fetchByStudentId(Student_Id);
	}

	/**
	 * Returns the students_ marks where Student_Id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param Student_Id the student_ ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public static Students_Marks fetchByStudentId(
		int Student_Id, boolean useFinderCache) {

		return getPersistence().fetchByStudentId(Student_Id, useFinderCache);
	}

	/**
	 * Removes the students_ marks where Student_Id = &#63; from the database.
	 *
	 * @param Student_Id the student_ ID
	 * @return the students_ marks that was removed
	 */
	public static Students_Marks removeByStudentId(int Student_Id)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().removeByStudentId(Student_Id);
	}

	/**
	 * Returns the number of students_ markses where Student_Id = &#63;.
	 *
	 * @param Student_Id the student_ ID
	 * @return the number of matching students_ markses
	 */
	public static int countByStudentId(int Student_Id) {
		return getPersistence().countByStudentId(Student_Id);
	}

	/**
	 * Caches the students_ marks in the entity cache if it is enabled.
	 *
	 * @param students_Marks the students_ marks
	 */
	public static void cacheResult(Students_Marks students_Marks) {
		getPersistence().cacheResult(students_Marks);
	}

	/**
	 * Caches the students_ markses in the entity cache if it is enabled.
	 *
	 * @param students_Markses the students_ markses
	 */
	public static void cacheResult(List<Students_Marks> students_Markses) {
		getPersistence().cacheResult(students_Markses);
	}

	/**
	 * Creates a new students_ marks with the primary key. Does not add the students_ marks to the database.
	 *
	 * @param Student_Id the primary key for the new students_ marks
	 * @return the new students_ marks
	 */
	public static Students_Marks create(int Student_Id) {
		return getPersistence().create(Student_Id);
	}

	/**
	 * Removes the students_ marks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks that was removed
	 * @throws NoSuchStudents_MarksException if a students_ marks with the primary key could not be found
	 */
	public static Students_Marks remove(int Student_Id)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().remove(Student_Id);
	}

	public static Students_Marks updateImpl(Students_Marks students_Marks) {
		return getPersistence().updateImpl(students_Marks);
	}

	/**
	 * Returns the students_ marks with the primary key or throws a <code>NoSuchStudents_MarksException</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks
	 * @throws NoSuchStudents_MarksException if a students_ marks with the primary key could not be found
	 */
	public static Students_Marks findByPrimaryKey(int Student_Id)
		throws com.Students.Details.exception.NoSuchStudents_MarksException {

		return getPersistence().findByPrimaryKey(Student_Id);
	}

	/**
	 * Returns the students_ marks with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks, or <code>null</code> if a students_ marks with the primary key could not be found
	 */
	public static Students_Marks fetchByPrimaryKey(int Student_Id) {
		return getPersistence().fetchByPrimaryKey(Student_Id);
	}

	/**
	 * Returns all the students_ markses.
	 *
	 * @return the students_ markses
	 */
	public static List<Students_Marks> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the students_ markses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Students_MarksModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students_ markses
	 * @param end the upper bound of the range of students_ markses (not inclusive)
	 * @return the range of students_ markses
	 */
	public static List<Students_Marks> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the students_ markses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Students_MarksModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students_ markses
	 * @param end the upper bound of the range of students_ markses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of students_ markses
	 */
	public static List<Students_Marks> findAll(
		int start, int end,
		OrderByComparator<Students_Marks> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the students_ markses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Students_MarksModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students_ markses
	 * @param end the upper bound of the range of students_ markses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of students_ markses
	 */
	public static List<Students_Marks> findAll(
		int start, int end, OrderByComparator<Students_Marks> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the students_ markses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of students_ markses.
	 *
	 * @return the number of students_ markses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Students_MarksPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(Students_MarksPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile Students_MarksPersistence _persistence;

}