/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence;

import com.Students.Details.exception.NoSuchStudents_MarksException;
import com.Students.Details.model.Students_Marks;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the students_ marks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Students_MarksUtil
 * @generated
 */
@ProviderType
public interface Students_MarksPersistence
	extends BasePersistence<Students_Marks> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Students_MarksUtil} to access the students_ marks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the students_ markses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching students_ markses
	 */
	public java.util.List<Students_Marks> findByUuid(String uuid);

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
	public java.util.List<Students_Marks> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Students_Marks> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
			orderByComparator);

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
	public java.util.List<Students_Marks> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public Students_Marks findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
				orderByComparator)
		throws NoSuchStudents_MarksException;

	/**
	 * Returns the first students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public Students_Marks fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
			orderByComparator);

	/**
	 * Returns the last students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public Students_Marks findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
				orderByComparator)
		throws NoSuchStudents_MarksException;

	/**
	 * Returns the last students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public Students_Marks fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
			orderByComparator);

	/**
	 * Returns the students_ markses before and after the current students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param Student_Id the primary key of the current students_ marks
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next students_ marks
	 * @throws NoSuchStudents_MarksException if a students_ marks with the primary key could not be found
	 */
	public Students_Marks[] findByUuid_PrevAndNext(
			int Student_Id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
				orderByComparator)
		throws NoSuchStudents_MarksException;

	/**
	 * Removes all the students_ markses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of students_ markses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching students_ markses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the students_ marks where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchStudents_MarksException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public Students_Marks findByUUID_G(String uuid, long groupId)
		throws NoSuchStudents_MarksException;

	/**
	 * Returns the students_ marks where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public Students_Marks fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the students_ marks where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public Students_Marks fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the students_ marks where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the students_ marks that was removed
	 */
	public Students_Marks removeByUUID_G(String uuid, long groupId)
		throws NoSuchStudents_MarksException;

	/**
	 * Returns the number of students_ markses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching students_ markses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the students_ markses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching students_ markses
	 */
	public java.util.List<Students_Marks> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<Students_Marks> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Students_Marks> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
			orderByComparator);

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
	public java.util.List<Students_Marks> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first students_ marks in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public Students_Marks findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
				orderByComparator)
		throws NoSuchStudents_MarksException;

	/**
	 * Returns the first students_ marks in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public Students_Marks fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
			orderByComparator);

	/**
	 * Returns the last students_ marks in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public Students_Marks findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
				orderByComparator)
		throws NoSuchStudents_MarksException;

	/**
	 * Returns the last students_ marks in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public Students_Marks fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
			orderByComparator);

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
	public Students_Marks[] findByUuid_C_PrevAndNext(
			int Student_Id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
				orderByComparator)
		throws NoSuchStudents_MarksException;

	/**
	 * Removes all the students_ markses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of students_ markses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching students_ markses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the students_ marks where Student_Id = &#63; or throws a <code>NoSuchStudents_MarksException</code> if it could not be found.
	 *
	 * @param Student_Id the student_ ID
	 * @return the matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	public Students_Marks findByStudentId(int Student_Id)
		throws NoSuchStudents_MarksException;

	/**
	 * Returns the students_ marks where Student_Id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param Student_Id the student_ ID
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public Students_Marks fetchByStudentId(int Student_Id);

	/**
	 * Returns the students_ marks where Student_Id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param Student_Id the student_ ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public Students_Marks fetchByStudentId(
		int Student_Id, boolean useFinderCache);

	/**
	 * Removes the students_ marks where Student_Id = &#63; from the database.
	 *
	 * @param Student_Id the student_ ID
	 * @return the students_ marks that was removed
	 */
	public Students_Marks removeByStudentId(int Student_Id)
		throws NoSuchStudents_MarksException;

	/**
	 * Returns the number of students_ markses where Student_Id = &#63;.
	 *
	 * @param Student_Id the student_ ID
	 * @return the number of matching students_ markses
	 */
	public int countByStudentId(int Student_Id);

	/**
	 * Caches the students_ marks in the entity cache if it is enabled.
	 *
	 * @param students_Marks the students_ marks
	 */
	public void cacheResult(Students_Marks students_Marks);

	/**
	 * Caches the students_ markses in the entity cache if it is enabled.
	 *
	 * @param students_Markses the students_ markses
	 */
	public void cacheResult(java.util.List<Students_Marks> students_Markses);

	/**
	 * Creates a new students_ marks with the primary key. Does not add the students_ marks to the database.
	 *
	 * @param Student_Id the primary key for the new students_ marks
	 * @return the new students_ marks
	 */
	public Students_Marks create(int Student_Id);

	/**
	 * Removes the students_ marks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks that was removed
	 * @throws NoSuchStudents_MarksException if a students_ marks with the primary key could not be found
	 */
	public Students_Marks remove(int Student_Id)
		throws NoSuchStudents_MarksException;

	public Students_Marks updateImpl(Students_Marks students_Marks);

	/**
	 * Returns the students_ marks with the primary key or throws a <code>NoSuchStudents_MarksException</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks
	 * @throws NoSuchStudents_MarksException if a students_ marks with the primary key could not be found
	 */
	public Students_Marks findByPrimaryKey(int Student_Id)
		throws NoSuchStudents_MarksException;

	/**
	 * Returns the students_ marks with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks, or <code>null</code> if a students_ marks with the primary key could not be found
	 */
	public Students_Marks fetchByPrimaryKey(int Student_Id);

	/**
	 * Returns all the students_ markses.
	 *
	 * @return the students_ markses
	 */
	public java.util.List<Students_Marks> findAll();

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
	public java.util.List<Students_Marks> findAll(int start, int end);

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
	public java.util.List<Students_Marks> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
			orderByComparator);

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
	public java.util.List<Students_Marks> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Students_Marks>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the students_ markses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of students_ markses.
	 *
	 * @return the number of students_ markses
	 */
	public int countAll();

}