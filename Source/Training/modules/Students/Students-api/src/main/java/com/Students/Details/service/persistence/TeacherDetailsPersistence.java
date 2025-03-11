/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence;

import com.Students.Details.exception.NoSuchTeacherDetailsException;
import com.Students.Details.model.TeacherDetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the teacher details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeacherDetailsUtil
 * @generated
 */
@ProviderType
public interface TeacherDetailsPersistence
	extends BasePersistence<TeacherDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TeacherDetailsUtil} to access the teacher details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the teacher detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching teacher detailses
	 */
	public java.util.List<TeacherDetails> findByUuid(String uuid);

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
	public java.util.List<TeacherDetails> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<TeacherDetails> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator);

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
	public java.util.List<TeacherDetails> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public TeacherDetails findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
				orderByComparator)
		throws NoSuchTeacherDetailsException;

	/**
	 * Returns the first teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public TeacherDetails fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator);

	/**
	 * Returns the last teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public TeacherDetails findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
				orderByComparator)
		throws NoSuchTeacherDetailsException;

	/**
	 * Returns the last teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public TeacherDetails fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator);

	/**
	 * Returns the teacher detailses before and after the current teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param Teacher_Id the primary key of the current teacher details
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next teacher details
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	public TeacherDetails[] findByUuid_PrevAndNext(
			int Teacher_Id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
				orderByComparator)
		throws NoSuchTeacherDetailsException;

	/**
	 * Removes all the teacher detailses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of teacher detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching teacher detailses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the teacher details where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTeacherDetailsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public TeacherDetails findByUUID_G(String uuid, long groupId)
		throws NoSuchTeacherDetailsException;

	/**
	 * Returns the teacher details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public TeacherDetails fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the teacher details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public TeacherDetails fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the teacher details where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the teacher details that was removed
	 */
	public TeacherDetails removeByUUID_G(String uuid, long groupId)
		throws NoSuchTeacherDetailsException;

	/**
	 * Returns the number of teacher detailses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching teacher detailses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the teacher detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching teacher detailses
	 */
	public java.util.List<TeacherDetails> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<TeacherDetails> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<TeacherDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator);

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
	public java.util.List<TeacherDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public TeacherDetails findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
				orderByComparator)
		throws NoSuchTeacherDetailsException;

	/**
	 * Returns the first teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public TeacherDetails fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator);

	/**
	 * Returns the last teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public TeacherDetails findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
				orderByComparator)
		throws NoSuchTeacherDetailsException;

	/**
	 * Returns the last teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public TeacherDetails fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator);

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
	public TeacherDetails[] findByUuid_C_PrevAndNext(
			int Teacher_Id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
				orderByComparator)
		throws NoSuchTeacherDetailsException;

	/**
	 * Removes all the teacher detailses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of teacher detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching teacher detailses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the teacher detailses where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the matching teacher detailses
	 */
	public java.util.List<TeacherDetails> findByDepartmentId(int Department_Id);

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
	public java.util.List<TeacherDetails> findByDepartmentId(
		int Department_Id, int start, int end);

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
	public java.util.List<TeacherDetails> findByDepartmentId(
		int Department_Id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator);

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
	public java.util.List<TeacherDetails> findByDepartmentId(
		int Department_Id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public TeacherDetails findByDepartmentId_First(
			int Department_Id,
			com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
				orderByComparator)
		throws NoSuchTeacherDetailsException;

	/**
	 * Returns the first teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public TeacherDetails fetchByDepartmentId_First(
		int Department_Id,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator);

	/**
	 * Returns the last teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	public TeacherDetails findByDepartmentId_Last(
			int Department_Id,
			com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
				orderByComparator)
		throws NoSuchTeacherDetailsException;

	/**
	 * Returns the last teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public TeacherDetails fetchByDepartmentId_Last(
		int Department_Id,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator);

	/**
	 * Returns the teacher detailses before and after the current teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Teacher_Id the primary key of the current teacher details
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next teacher details
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	public TeacherDetails[] findByDepartmentId_PrevAndNext(
			int Teacher_Id, int Department_Id,
			com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
				orderByComparator)
		throws NoSuchTeacherDetailsException;

	/**
	 * Removes all the teacher detailses where Department_Id = &#63; from the database.
	 *
	 * @param Department_Id the department_ ID
	 */
	public void removeByDepartmentId(int Department_Id);

	/**
	 * Returns the number of teacher detailses where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the number of matching teacher detailses
	 */
	public int countByDepartmentId(int Department_Id);

	/**
	 * Caches the teacher details in the entity cache if it is enabled.
	 *
	 * @param teacherDetails the teacher details
	 */
	public void cacheResult(TeacherDetails teacherDetails);

	/**
	 * Caches the teacher detailses in the entity cache if it is enabled.
	 *
	 * @param teacherDetailses the teacher detailses
	 */
	public void cacheResult(java.util.List<TeacherDetails> teacherDetailses);

	/**
	 * Creates a new teacher details with the primary key. Does not add the teacher details to the database.
	 *
	 * @param Teacher_Id the primary key for the new teacher details
	 * @return the new teacher details
	 */
	public TeacherDetails create(int Teacher_Id);

	/**
	 * Removes the teacher details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details that was removed
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	public TeacherDetails remove(int Teacher_Id)
		throws NoSuchTeacherDetailsException;

	public TeacherDetails updateImpl(TeacherDetails teacherDetails);

	/**
	 * Returns the teacher details with the primary key or throws a <code>NoSuchTeacherDetailsException</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	public TeacherDetails findByPrimaryKey(int Teacher_Id)
		throws NoSuchTeacherDetailsException;

	/**
	 * Returns the teacher details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details, or <code>null</code> if a teacher details with the primary key could not be found
	 */
	public TeacherDetails fetchByPrimaryKey(int Teacher_Id);

	/**
	 * Returns all the teacher detailses.
	 *
	 * @return the teacher detailses
	 */
	public java.util.List<TeacherDetails> findAll();

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
	public java.util.List<TeacherDetails> findAll(int start, int end);

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
	public java.util.List<TeacherDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator);

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
	public java.util.List<TeacherDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TeacherDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the teacher detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of teacher detailses.
	 *
	 * @return the number of teacher detailses
	 */
	public int countAll();

}