/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence;

import com.Students.Details.model.Department_Details;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the department_ details service. This utility wraps <code>com.Students.Details.service.persistence.impl.Department_DetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Department_DetailsPersistence
 * @generated
 */
public class Department_DetailsUtil {

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
	public static void clearCache(Department_Details department_Details) {
		getPersistence().clearCache(department_Details);
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
	public static Map<Serializable, Department_Details> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Department_Details> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Department_Details> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Department_Details> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Department_Details> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Department_Details update(
		Department_Details department_Details) {

		return getPersistence().update(department_Details);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Department_Details update(
		Department_Details department_Details, ServiceContext serviceContext) {

		return getPersistence().update(department_Details, serviceContext);
	}

	/**
	 * Returns all the department_ detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching department_ detailses
	 */
	public static List<Department_Details> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the department_ detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Department_DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of department_ detailses
	 * @param end the upper bound of the range of department_ detailses (not inclusive)
	 * @return the range of matching department_ detailses
	 */
	public static List<Department_Details> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the department_ detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Department_DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of department_ detailses
	 * @param end the upper bound of the range of department_ detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching department_ detailses
	 */
	public static List<Department_Details> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Department_Details> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the department_ detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Department_DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of department_ detailses
	 * @param end the upper bound of the range of department_ detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching department_ detailses
	 */
	public static List<Department_Details> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Department_Details> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	public static Department_Details findByUuid_First(
			String uuid,
			OrderByComparator<Department_Details> orderByComparator)
		throws com.Students.Details.exception.
			NoSuchDepartment_DetailsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public static Department_Details fetchByUuid_First(
		String uuid, OrderByComparator<Department_Details> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	public static Department_Details findByUuid_Last(
			String uuid,
			OrderByComparator<Department_Details> orderByComparator)
		throws com.Students.Details.exception.
			NoSuchDepartment_DetailsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public static Department_Details fetchByUuid_Last(
		String uuid, OrderByComparator<Department_Details> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the department_ detailses before and after the current department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param Department_Id the primary key of the current department_ details
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next department_ details
	 * @throws NoSuchDepartment_DetailsException if a department_ details with the primary key could not be found
	 */
	public static Department_Details[] findByUuid_PrevAndNext(
			int Department_Id, String uuid,
			OrderByComparator<Department_Details> orderByComparator)
		throws com.Students.Details.exception.
			NoSuchDepartment_DetailsException {

		return getPersistence().findByUuid_PrevAndNext(
			Department_Id, uuid, orderByComparator);
	}

	/**
	 * Removes all the department_ detailses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of department_ detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching department_ detailses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the department_ details where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDepartment_DetailsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	public static Department_Details findByUUID_G(String uuid, long groupId)
		throws com.Students.Details.exception.
			NoSuchDepartment_DetailsException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the department_ details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public static Department_Details fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the department_ details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public static Department_Details fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the department_ details where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the department_ details that was removed
	 */
	public static Department_Details removeByUUID_G(String uuid, long groupId)
		throws com.Students.Details.exception.
			NoSuchDepartment_DetailsException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of department_ detailses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching department_ detailses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the department_ detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching department_ detailses
	 */
	public static List<Department_Details> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the department_ detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Department_DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of department_ detailses
	 * @param end the upper bound of the range of department_ detailses (not inclusive)
	 * @return the range of matching department_ detailses
	 */
	public static List<Department_Details> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the department_ detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Department_DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of department_ detailses
	 * @param end the upper bound of the range of department_ detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching department_ detailses
	 */
	public static List<Department_Details> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Department_Details> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the department_ detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Department_DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of department_ detailses
	 * @param end the upper bound of the range of department_ detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching department_ detailses
	 */
	public static List<Department_Details> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Department_Details> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	public static Department_Details findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Department_Details> orderByComparator)
		throws com.Students.Details.exception.
			NoSuchDepartment_DetailsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public static Department_Details fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Department_Details> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	public static Department_Details findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Department_Details> orderByComparator)
		throws com.Students.Details.exception.
			NoSuchDepartment_DetailsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public static Department_Details fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Department_Details> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the department_ detailses before and after the current department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param Department_Id the primary key of the current department_ details
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next department_ details
	 * @throws NoSuchDepartment_DetailsException if a department_ details with the primary key could not be found
	 */
	public static Department_Details[] findByUuid_C_PrevAndNext(
			int Department_Id, String uuid, long companyId,
			OrderByComparator<Department_Details> orderByComparator)
		throws com.Students.Details.exception.
			NoSuchDepartment_DetailsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			Department_Id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the department_ detailses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of department_ detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching department_ detailses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the department_ details in the entity cache if it is enabled.
	 *
	 * @param department_Details the department_ details
	 */
	public static void cacheResult(Department_Details department_Details) {
		getPersistence().cacheResult(department_Details);
	}

	/**
	 * Caches the department_ detailses in the entity cache if it is enabled.
	 *
	 * @param department_Detailses the department_ detailses
	 */
	public static void cacheResult(
		List<Department_Details> department_Detailses) {

		getPersistence().cacheResult(department_Detailses);
	}

	/**
	 * Creates a new department_ details with the primary key. Does not add the department_ details to the database.
	 *
	 * @param Department_Id the primary key for the new department_ details
	 * @return the new department_ details
	 */
	public static Department_Details create(int Department_Id) {
		return getPersistence().create(Department_Id);
	}

	/**
	 * Removes the department_ details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details that was removed
	 * @throws NoSuchDepartment_DetailsException if a department_ details with the primary key could not be found
	 */
	public static Department_Details remove(int Department_Id)
		throws com.Students.Details.exception.
			NoSuchDepartment_DetailsException {

		return getPersistence().remove(Department_Id);
	}

	public static Department_Details updateImpl(
		Department_Details department_Details) {

		return getPersistence().updateImpl(department_Details);
	}

	/**
	 * Returns the department_ details with the primary key or throws a <code>NoSuchDepartment_DetailsException</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details
	 * @throws NoSuchDepartment_DetailsException if a department_ details with the primary key could not be found
	 */
	public static Department_Details findByPrimaryKey(int Department_Id)
		throws com.Students.Details.exception.
			NoSuchDepartment_DetailsException {

		return getPersistence().findByPrimaryKey(Department_Id);
	}

	/**
	 * Returns the department_ details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details, or <code>null</code> if a department_ details with the primary key could not be found
	 */
	public static Department_Details fetchByPrimaryKey(int Department_Id) {
		return getPersistence().fetchByPrimaryKey(Department_Id);
	}

	/**
	 * Returns all the department_ detailses.
	 *
	 * @return the department_ detailses
	 */
	public static List<Department_Details> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the department_ detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Department_DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of department_ detailses
	 * @param end the upper bound of the range of department_ detailses (not inclusive)
	 * @return the range of department_ detailses
	 */
	public static List<Department_Details> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the department_ detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Department_DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of department_ detailses
	 * @param end the upper bound of the range of department_ detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of department_ detailses
	 */
	public static List<Department_Details> findAll(
		int start, int end,
		OrderByComparator<Department_Details> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the department_ detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Department_DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of department_ detailses
	 * @param end the upper bound of the range of department_ detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of department_ detailses
	 */
	public static List<Department_Details> findAll(
		int start, int end,
		OrderByComparator<Department_Details> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the department_ detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of department_ detailses.
	 *
	 * @return the number of department_ detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Department_DetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		Department_DetailsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile Department_DetailsPersistence _persistence;

}