/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service.persistence;

import Practical_ServiceBuilder.exception.NoSuchEntity2Exception;

import Practical_ServiceBuilder.model.Entity2;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the entity2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity2Util
 * @generated
 */
@ProviderType
public interface Entity2Persistence extends BasePersistence<Entity2> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Entity2Util} to access the entity2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the entity2s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity2s
	 */
	public java.util.List<Entity2> findByUuid(String uuid);

	/**
	 * Returns a range of all the entity2s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @return the range of matching entity2s
	 */
	public java.util.List<Entity2> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the entity2s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity2s
	 */
	public java.util.List<Entity2> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity2>
			orderByComparator);

	/**
	 * Returns an ordered range of all the entity2s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity2s
	 */
	public java.util.List<Entity2> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity2>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	public Entity2 findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity2>
				orderByComparator)
		throws NoSuchEntity2Exception;

	/**
	 * Returns the first entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	public Entity2 fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Entity2>
			orderByComparator);

	/**
	 * Returns the last entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	public Entity2 findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity2>
				orderByComparator)
		throws NoSuchEntity2Exception;

	/**
	 * Returns the last entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	public Entity2 fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Entity2>
			orderByComparator);

	/**
	 * Returns the entity2s before and after the current entity2 in the ordered set where uuid = &#63;.
	 *
	 * @param StudentId the primary key of the current entity2
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity2
	 * @throws NoSuchEntity2Exception if a entity2 with the primary key could not be found
	 */
	public Entity2[] findByUuid_PrevAndNext(
			int StudentId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entity2>
				orderByComparator)
		throws NoSuchEntity2Exception;

	/**
	 * Removes all the entity2s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of entity2s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity2s
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the entity2s where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @return the matching entity2s
	 */
	public java.util.List<Entity2> findByStudents(int StudentId);

	/**
	 * Returns a range of all the entity2s where StudentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param StudentId the student ID
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @return the range of matching entity2s
	 */
	public java.util.List<Entity2> findByStudents(
		int StudentId, int start, int end);

	/**
	 * Returns an ordered range of all the entity2s where StudentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param StudentId the student ID
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity2s
	 */
	public java.util.List<Entity2> findByStudents(
		int StudentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity2>
			orderByComparator);

	/**
	 * Returns an ordered range of all the entity2s where StudentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param StudentId the student ID
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity2s
	 */
	public java.util.List<Entity2> findByStudents(
		int StudentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity2>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	public Entity2 findByStudents_First(
			int StudentId,
			com.liferay.portal.kernel.util.OrderByComparator<Entity2>
				orderByComparator)
		throws NoSuchEntity2Exception;

	/**
	 * Returns the first entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	public Entity2 fetchByStudents_First(
		int StudentId,
		com.liferay.portal.kernel.util.OrderByComparator<Entity2>
			orderByComparator);

	/**
	 * Returns the last entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2
	 * @throws NoSuchEntity2Exception if a matching entity2 could not be found
	 */
	public Entity2 findByStudents_Last(
			int StudentId,
			com.liferay.portal.kernel.util.OrderByComparator<Entity2>
				orderByComparator)
		throws NoSuchEntity2Exception;

	/**
	 * Returns the last entity2 in the ordered set where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity2, or <code>null</code> if a matching entity2 could not be found
	 */
	public Entity2 fetchByStudents_Last(
		int StudentId,
		com.liferay.portal.kernel.util.OrderByComparator<Entity2>
			orderByComparator);

	/**
	 * Removes all the entity2s where StudentId = &#63; from the database.
	 *
	 * @param StudentId the student ID
	 */
	public void removeByStudents(int StudentId);

	/**
	 * Returns the number of entity2s where StudentId = &#63;.
	 *
	 * @param StudentId the student ID
	 * @return the number of matching entity2s
	 */
	public int countByStudents(int StudentId);

	/**
	 * Caches the entity2 in the entity cache if it is enabled.
	 *
	 * @param entity2 the entity2
	 */
	public void cacheResult(Entity2 entity2);

	/**
	 * Caches the entity2s in the entity cache if it is enabled.
	 *
	 * @param entity2s the entity2s
	 */
	public void cacheResult(java.util.List<Entity2> entity2s);

	/**
	 * Creates a new entity2 with the primary key. Does not add the entity2 to the database.
	 *
	 * @param StudentId the primary key for the new entity2
	 * @return the new entity2
	 */
	public Entity2 create(int StudentId);

	/**
	 * Removes the entity2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param StudentId the primary key of the entity2
	 * @return the entity2 that was removed
	 * @throws NoSuchEntity2Exception if a entity2 with the primary key could not be found
	 */
	public Entity2 remove(int StudentId) throws NoSuchEntity2Exception;

	public Entity2 updateImpl(Entity2 entity2);

	/**
	 * Returns the entity2 with the primary key or throws a <code>NoSuchEntity2Exception</code> if it could not be found.
	 *
	 * @param StudentId the primary key of the entity2
	 * @return the entity2
	 * @throws NoSuchEntity2Exception if a entity2 with the primary key could not be found
	 */
	public Entity2 findByPrimaryKey(int StudentId)
		throws NoSuchEntity2Exception;

	/**
	 * Returns the entity2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param StudentId the primary key of the entity2
	 * @return the entity2, or <code>null</code> if a entity2 with the primary key could not be found
	 */
	public Entity2 fetchByPrimaryKey(int StudentId);

	/**
	 * Returns all the entity2s.
	 *
	 * @return the entity2s
	 */
	public java.util.List<Entity2> findAll();

	/**
	 * Returns a range of all the entity2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @return the range of entity2s
	 */
	public java.util.List<Entity2> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the entity2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of entity2s
	 */
	public java.util.List<Entity2> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity2>
			orderByComparator);

	/**
	 * Returns an ordered range of all the entity2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of entity2s
	 */
	public java.util.List<Entity2> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entity2>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the entity2s from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of entity2s.
	 *
	 * @return the number of entity2s
	 */
	public int countAll();

}