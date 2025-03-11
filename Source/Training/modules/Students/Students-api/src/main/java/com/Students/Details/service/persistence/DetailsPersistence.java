/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence;

import com.Students.Details.exception.NoSuchDetailsException;
import com.Students.Details.model.Details;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailsUtil
 * @generated
 */
@ProviderType
public interface DetailsPersistence extends BasePersistence<Details> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DetailsUtil} to access the details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching detailses
	 */
	public java.util.List<Details> findByUuid(String uuid);

	/**
	 * Returns a range of all the detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @return the range of matching detailses
	 */
	public java.util.List<Details> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching detailses
	 */
	public java.util.List<Details> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator);

	/**
	 * Returns an ordered range of all the detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching detailses
	 */
	public java.util.List<Details> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching details
	 * @throws NoSuchDetailsException if a matching details could not be found
	 */
	public Details findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Details>
				orderByComparator)
		throws NoSuchDetailsException;

	/**
	 * Returns the first details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching details, or <code>null</code> if a matching details could not be found
	 */
	public Details fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator);

	/**
	 * Returns the last details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching details
	 * @throws NoSuchDetailsException if a matching details could not be found
	 */
	public Details findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Details>
				orderByComparator)
		throws NoSuchDetailsException;

	/**
	 * Returns the last details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching details, or <code>null</code> if a matching details could not be found
	 */
	public Details fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator);

	/**
	 * Returns the detailses before and after the current details in the ordered set where uuid = &#63;.
	 *
	 * @param Student_Id the primary key of the current details
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next details
	 * @throws NoSuchDetailsException if a details with the primary key could not be found
	 */
	public Details[] findByUuid_PrevAndNext(
			int Student_Id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Details>
				orderByComparator)
		throws NoSuchDetailsException;

	/**
	 * Removes all the detailses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching detailses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the details where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDetailsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching details
	 * @throws NoSuchDetailsException if a matching details could not be found
	 */
	public Details findByUUID_G(String uuid, long groupId)
		throws NoSuchDetailsException;

	/**
	 * Returns the details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching details, or <code>null</code> if a matching details could not be found
	 */
	public Details fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching details, or <code>null</code> if a matching details could not be found
	 */
	public Details fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the details where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the details that was removed
	 */
	public Details removeByUUID_G(String uuid, long groupId)
		throws NoSuchDetailsException;

	/**
	 * Returns the number of detailses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching detailses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching detailses
	 */
	public java.util.List<Details> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @return the range of matching detailses
	 */
	public java.util.List<Details> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching detailses
	 */
	public java.util.List<Details> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator);

	/**
	 * Returns an ordered range of all the detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching detailses
	 */
	public java.util.List<Details> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching details
	 * @throws NoSuchDetailsException if a matching details could not be found
	 */
	public Details findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Details>
				orderByComparator)
		throws NoSuchDetailsException;

	/**
	 * Returns the first details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching details, or <code>null</code> if a matching details could not be found
	 */
	public Details fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator);

	/**
	 * Returns the last details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching details
	 * @throws NoSuchDetailsException if a matching details could not be found
	 */
	public Details findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Details>
				orderByComparator)
		throws NoSuchDetailsException;

	/**
	 * Returns the last details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching details, or <code>null</code> if a matching details could not be found
	 */
	public Details fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator);

	/**
	 * Returns the detailses before and after the current details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param Student_Id the primary key of the current details
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next details
	 * @throws NoSuchDetailsException if a details with the primary key could not be found
	 */
	public Details[] findByUuid_C_PrevAndNext(
			int Student_Id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Details>
				orderByComparator)
		throws NoSuchDetailsException;

	/**
	 * Removes all the detailses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching detailses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the detailses where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the matching detailses
	 */
	public java.util.List<Details> findByDepartmentId(int Department_Id);

	/**
	 * Returns a range of all the detailses where Department_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param Department_Id the department_ ID
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @return the range of matching detailses
	 */
	public java.util.List<Details> findByDepartmentId(
		int Department_Id, int start, int end);

	/**
	 * Returns an ordered range of all the detailses where Department_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param Department_Id the department_ ID
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching detailses
	 */
	public java.util.List<Details> findByDepartmentId(
		int Department_Id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator);

	/**
	 * Returns an ordered range of all the detailses where Department_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param Department_Id the department_ ID
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching detailses
	 */
	public java.util.List<Details> findByDepartmentId(
		int Department_Id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching details
	 * @throws NoSuchDetailsException if a matching details could not be found
	 */
	public Details findByDepartmentId_First(
			int Department_Id,
			com.liferay.portal.kernel.util.OrderByComparator<Details>
				orderByComparator)
		throws NoSuchDetailsException;

	/**
	 * Returns the first details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching details, or <code>null</code> if a matching details could not be found
	 */
	public Details fetchByDepartmentId_First(
		int Department_Id,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator);

	/**
	 * Returns the last details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching details
	 * @throws NoSuchDetailsException if a matching details could not be found
	 */
	public Details findByDepartmentId_Last(
			int Department_Id,
			com.liferay.portal.kernel.util.OrderByComparator<Details>
				orderByComparator)
		throws NoSuchDetailsException;

	/**
	 * Returns the last details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching details, or <code>null</code> if a matching details could not be found
	 */
	public Details fetchByDepartmentId_Last(
		int Department_Id,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator);

	/**
	 * Returns the detailses before and after the current details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Student_Id the primary key of the current details
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next details
	 * @throws NoSuchDetailsException if a details with the primary key could not be found
	 */
	public Details[] findByDepartmentId_PrevAndNext(
			int Student_Id, int Department_Id,
			com.liferay.portal.kernel.util.OrderByComparator<Details>
				orderByComparator)
		throws NoSuchDetailsException;

	/**
	 * Removes all the detailses where Department_Id = &#63; from the database.
	 *
	 * @param Department_Id the department_ ID
	 */
	public void removeByDepartmentId(int Department_Id);

	/**
	 * Returns the number of detailses where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the number of matching detailses
	 */
	public int countByDepartmentId(int Department_Id);

	/**
	 * Caches the details in the entity cache if it is enabled.
	 *
	 * @param details the details
	 */
	public void cacheResult(Details details);

	/**
	 * Caches the detailses in the entity cache if it is enabled.
	 *
	 * @param detailses the detailses
	 */
	public void cacheResult(java.util.List<Details> detailses);

	/**
	 * Creates a new details with the primary key. Does not add the details to the database.
	 *
	 * @param Student_Id the primary key for the new details
	 * @return the new details
	 */
	public Details create(int Student_Id);

	/**
	 * Removes the details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Student_Id the primary key of the details
	 * @return the details that was removed
	 * @throws NoSuchDetailsException if a details with the primary key could not be found
	 */
	public Details remove(int Student_Id) throws NoSuchDetailsException;

	public Details updateImpl(Details details);

	/**
	 * Returns the details with the primary key or throws a <code>NoSuchDetailsException</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the details
	 * @return the details
	 * @throws NoSuchDetailsException if a details with the primary key could not be found
	 */
	public Details findByPrimaryKey(int Student_Id)
		throws NoSuchDetailsException;

	/**
	 * Returns the details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the details
	 * @return the details, or <code>null</code> if a details with the primary key could not be found
	 */
	public Details fetchByPrimaryKey(int Student_Id);

	/**
	 * Returns all the detailses.
	 *
	 * @return the detailses
	 */
	public java.util.List<Details> findAll();

	/**
	 * Returns a range of all the detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @return the range of detailses
	 */
	public java.util.List<Details> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detailses
	 */
	public java.util.List<Details> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator);

	/**
	 * Returns an ordered range of all the detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detailses
	 */
	public java.util.List<Details> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Details>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of detailses.
	 *
	 * @return the number of detailses
	 */
	public int countAll();

}