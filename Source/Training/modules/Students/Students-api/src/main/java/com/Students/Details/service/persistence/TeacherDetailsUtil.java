/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence;

import com.Students.Details.model.TeacherDetails;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the teacher details service. This utility wraps <code>com.Students.Details.service.persistence.impl.TeacherDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeacherDetailsPersistence
 * @generated
 */
public class TeacherDetailsUtil {

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
	public static void clearCache(TeacherDetails teacherDetails) {
		getPersistence().clearCache(teacherDetails);
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
	public static Map<Serializable, TeacherDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TeacherDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TeacherDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TeacherDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TeacherDetails update(TeacherDetails teacherDetails) {
		return getPersistence().update(teacherDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TeacherDetails update(
		TeacherDetails teacherDetails, ServiceContext serviceContext) {

		return getPersistence().update(teacherDetails, serviceContext);
	}

	/**
	 * Returns all the teacher detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching teacher detailses
	 */
	public static List<TeacherDetails> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the teacher detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @return the range of matching teacher detailses
	 */
	public static List<TeacherDetails> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the teacher detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching teacher detailses
	 */
	public static List<TeacherDetails> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the teacher detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching teacher detailses
	 */
	public static List<TeacherDetails> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public static TeacherDetails findByUuid_First(
			String uuid, OrderByComparator<TeacherDetails> orderByComparator)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public static TeacherDetails fetchByUuid_First(
		String uuid, OrderByComparator<TeacherDetails> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public static TeacherDetails findByUuid_Last(
			String uuid, OrderByComparator<TeacherDetails> orderByComparator)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public static TeacherDetails fetchByUuid_Last(
		String uuid, OrderByComparator<TeacherDetails> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the teacher detailses before and after the current teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param Teacher_Id the primary key of the current teacher details
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next teacher details
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	public static TeacherDetails[] findByUuid_PrevAndNext(
			int Teacher_Id, String uuid,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().findByUuid_PrevAndNext(
			Teacher_Id, uuid, orderByComparator);
	}

	/**
	 * Removes all the teacher detailses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of teacher detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching teacher detailses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the teacher details where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTeacherDetailsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public static TeacherDetails findByUUID_G(String uuid, long groupId)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the teacher details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public static TeacherDetails fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the teacher details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public static TeacherDetails fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the teacher details where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the teacher details that was removed
	 */
	public static TeacherDetails removeByUUID_G(String uuid, long groupId)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of teacher detailses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching teacher detailses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the teacher detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching teacher detailses
	 */
	public static List<TeacherDetails> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the teacher detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @return the range of matching teacher detailses
	 */
	public static List<TeacherDetails> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the teacher detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching teacher detailses
	 */
	public static List<TeacherDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the teacher detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching teacher detailses
	 */
	public static List<TeacherDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public static TeacherDetails findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public static TeacherDetails fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public static TeacherDetails findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public static TeacherDetails fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the teacher detailses before and after the current teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param Teacher_Id the primary key of the current teacher details
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next teacher details
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	public static TeacherDetails[] findByUuid_C_PrevAndNext(
			int Teacher_Id, String uuid, long companyId,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			Teacher_Id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the teacher detailses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of teacher detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching teacher detailses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the teacher detailses where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the matching teacher detailses
	 */
	public static List<TeacherDetails> findByDepartmentId(int Department_Id) {
		return getPersistence().findByDepartmentId(Department_Id);
	}

	/**
	 * Returns a range of all the teacher detailses where Department_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param Department_Id the department_ ID
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @return the range of matching teacher detailses
	 */
	public static List<TeacherDetails> findByDepartmentId(
		int Department_Id, int start, int end) {

		return getPersistence().findByDepartmentId(Department_Id, start, end);
	}

	/**
	 * Returns an ordered range of all the teacher detailses where Department_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param Department_Id the department_ ID
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching teacher detailses
	 */
	public static List<TeacherDetails> findByDepartmentId(
		int Department_Id, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return getPersistence().findByDepartmentId(
			Department_Id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the teacher detailses where Department_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param Department_Id the department_ ID
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching teacher detailses
	 */
	public static List<TeacherDetails> findByDepartmentId(
		int Department_Id, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByDepartmentId(
			Department_Id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public static TeacherDetails findByDepartmentId_First(
			int Department_Id,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().findByDepartmentId_First(
			Department_Id, orderByComparator);
	}

	/**
	 * Returns the first teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public static TeacherDetails fetchByDepartmentId_First(
		int Department_Id,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return getPersistence().fetchByDepartmentId_First(
			Department_Id, orderByComparator);
	}

	/**
	 * Returns the last teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public static TeacherDetails findByDepartmentId_Last(
			int Department_Id,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().findByDepartmentId_Last(
			Department_Id, orderByComparator);
	}

	/**
	 * Returns the last teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public static TeacherDetails fetchByDepartmentId_Last(
		int Department_Id,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return getPersistence().fetchByDepartmentId_Last(
			Department_Id, orderByComparator);
	}

	/**
	 * Returns the teacher detailses before and after the current teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Teacher_Id the primary key of the current teacher details
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next teacher details
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	public static TeacherDetails[] findByDepartmentId_PrevAndNext(
			int Teacher_Id, int Department_Id,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().findByDepartmentId_PrevAndNext(
			Teacher_Id, Department_Id, orderByComparator);
	}

	/**
	 * Removes all the teacher detailses where Department_Id = &#63; from the database.
	 *
	 * @param Department_Id the department_ ID
	 */
	public static void removeByDepartmentId(int Department_Id) {
		getPersistence().removeByDepartmentId(Department_Id);
	}

	/**
	 * Returns the number of teacher detailses where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the number of matching teacher detailses
	 */
	public static int countByDepartmentId(int Department_Id) {
		return getPersistence().countByDepartmentId(Department_Id);
	}

	/**
	 * Caches the teacher details in the entity cache if it is enabled.
	 *
	 * @param teacherDetails the teacher details
	 */
	public static void cacheResult(TeacherDetails teacherDetails) {
		getPersistence().cacheResult(teacherDetails);
	}

	/**
	 * Caches the teacher detailses in the entity cache if it is enabled.
	 *
	 * @param teacherDetailses the teacher detailses
	 */
	public static void cacheResult(List<TeacherDetails> teacherDetailses) {
		getPersistence().cacheResult(teacherDetailses);
	}

	/**
	 * Creates a new teacher details with the primary key. Does not add the teacher details to the database.
	 *
	 * @param Teacher_Id the primary key for the new teacher details
	 * @return the new teacher details
	 */
	public static TeacherDetails create(int Teacher_Id) {
		return getPersistence().create(Teacher_Id);
	}

	/**
	 * Removes the teacher details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details that was removed
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	public static TeacherDetails remove(int Teacher_Id)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().remove(Teacher_Id);
	}

	public static TeacherDetails updateImpl(TeacherDetails teacherDetails) {
		return getPersistence().updateImpl(teacherDetails);
	}

	/**
	 * Returns the teacher details with the primary key or throws a <code>NoSuchTeacherDetailsException</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	public static TeacherDetails findByPrimaryKey(int Teacher_Id)
		throws com.Students.Details.exception.NoSuchTeacherDetailsException {

		return getPersistence().findByPrimaryKey(Teacher_Id);
	}

	/**
	 * Returns the teacher details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details, or <code>null</code> if a teacher details with the primary key could not be found
	 */
	public static TeacherDetails fetchByPrimaryKey(int Teacher_Id) {
		return getPersistence().fetchByPrimaryKey(Teacher_Id);
	}

	/**
	 * Returns all the teacher detailses.
	 *
	 * @return the teacher detailses
	 */
	public static List<TeacherDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the teacher detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @return the range of teacher detailses
	 */
	public static List<TeacherDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the teacher detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of teacher detailses
	 */
	public static List<TeacherDetails> findAll(
		int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the teacher detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of teacher detailses
	 */
	public static List<TeacherDetails> findAll(
		int start, int end, OrderByComparator<TeacherDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the teacher detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of teacher detailses.
	 *
	 * @return the number of teacher detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TeacherDetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(TeacherDetailsPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile TeacherDetailsPersistence _persistence;

}