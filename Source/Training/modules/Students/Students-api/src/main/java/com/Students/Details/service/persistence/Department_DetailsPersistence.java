/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence;

import com.Students.Details.exception.NoSuchDepartment_DetailsException;
import com.Students.Details.model.Department_Details;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the department_ details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Department_DetailsUtil
 * @generated
 */
@ProviderType
public interface Department_DetailsPersistence
	extends BasePersistence<Department_Details> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Department_DetailsUtil} to access the department_ details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the department_ detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching department_ detailses
	 */
	public java.util.List<Department_Details> findByUuid(String uuid);

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
	public java.util.List<Department_Details> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Department_Details> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
			orderByComparator);

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
	public java.util.List<Department_Details> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	public Department_Details findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
				orderByComparator)
		throws NoSuchDepartment_DetailsException;

	/**
	 * Returns the first department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public Department_Details fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
			orderByComparator);

	/**
	 * Returns the last department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	public Department_Details findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
				orderByComparator)
		throws NoSuchDepartment_DetailsException;

	/**
	 * Returns the last department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public Department_Details fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
			orderByComparator);

	/**
	 * Returns the department_ detailses before and after the current department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param Department_Id the primary key of the current department_ details
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next department_ details
	 * @throws NoSuchDepartment_DetailsException if a department_ details with the primary key could not be found
	 */
	public Department_Details[] findByUuid_PrevAndNext(
			int Department_Id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
				orderByComparator)
		throws NoSuchDepartment_DetailsException;

	/**
	 * Removes all the department_ detailses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of department_ detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching department_ detailses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the department_ details where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDepartment_DetailsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	public Department_Details findByUUID_G(String uuid, long groupId)
		throws NoSuchDepartment_DetailsException;

	/**
	 * Returns the department_ details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public Department_Details fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the department_ details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public Department_Details fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the department_ details where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the department_ details that was removed
	 */
	public Department_Details removeByUUID_G(String uuid, long groupId)
		throws NoSuchDepartment_DetailsException;

	/**
	 * Returns the number of department_ detailses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching department_ detailses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the department_ detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching department_ detailses
	 */
	public java.util.List<Department_Details> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<Department_Details> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Department_Details> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
			orderByComparator);

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
	public java.util.List<Department_Details> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	public Department_Details findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
				orderByComparator)
		throws NoSuchDepartment_DetailsException;

	/**
	 * Returns the first department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public Department_Details fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
			orderByComparator);

	/**
	 * Returns the last department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	public Department_Details findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
				orderByComparator)
		throws NoSuchDepartment_DetailsException;

	/**
	 * Returns the last department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	public Department_Details fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
			orderByComparator);

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
	public Department_Details[] findByUuid_C_PrevAndNext(
			int Department_Id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
				orderByComparator)
		throws NoSuchDepartment_DetailsException;

	/**
	 * Removes all the department_ detailses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of department_ detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching department_ detailses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the department_ details in the entity cache if it is enabled.
	 *
	 * @param department_Details the department_ details
	 */
	public void cacheResult(Department_Details department_Details);

	/**
	 * Caches the department_ detailses in the entity cache if it is enabled.
	 *
	 * @param department_Detailses the department_ detailses
	 */
	public void cacheResult(
		java.util.List<Department_Details> department_Detailses);

	/**
	 * Creates a new department_ details with the primary key. Does not add the department_ details to the database.
	 *
	 * @param Department_Id the primary key for the new department_ details
	 * @return the new department_ details
	 */
	public Department_Details create(int Department_Id);

	/**
	 * Removes the department_ details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details that was removed
	 * @throws NoSuchDepartment_DetailsException if a department_ details with the primary key could not be found
	 */
	public Department_Details remove(int Department_Id)
		throws NoSuchDepartment_DetailsException;

	public Department_Details updateImpl(Department_Details department_Details);

	/**
	 * Returns the department_ details with the primary key or throws a <code>NoSuchDepartment_DetailsException</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details
	 * @throws NoSuchDepartment_DetailsException if a department_ details with the primary key could not be found
	 */
	public Department_Details findByPrimaryKey(int Department_Id)
		throws NoSuchDepartment_DetailsException;

	/**
	 * Returns the department_ details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details, or <code>null</code> if a department_ details with the primary key could not be found
	 */
	public Department_Details fetchByPrimaryKey(int Department_Id);

	/**
	 * Returns all the department_ detailses.
	 *
	 * @return the department_ detailses
	 */
	public java.util.List<Department_Details> findAll();

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
	public java.util.List<Department_Details> findAll(int start, int end);

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
	public java.util.List<Department_Details> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
			orderByComparator);

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
	public java.util.List<Department_Details> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Department_Details>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the department_ detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of department_ detailses.
	 *
	 * @return the number of department_ detailses
	 */
	public int countAll();

}