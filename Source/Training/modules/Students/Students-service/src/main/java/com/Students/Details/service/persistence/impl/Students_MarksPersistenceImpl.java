/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence.impl;

import com.Students.Details.exception.NoSuchStudents_MarksException;
import com.Students.Details.model.Students_Marks;
import com.Students.Details.model.Students_MarksTable;
import com.Students.Details.model.impl.Students_MarksImpl;
import com.Students.Details.model.impl.Students_MarksModelImpl;
import com.Students.Details.service.persistence.Students_MarksPersistence;
import com.Students.Details.service.persistence.Students_MarksUtil;
import com.Students.Details.service.persistence.impl.constants.Students_DetailsPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the students_ marks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = Students_MarksPersistence.class)
public class Students_MarksPersistenceImpl
	extends BasePersistenceImpl<Students_Marks>
	implements Students_MarksPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Students_MarksUtil</code> to access the students_ marks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Students_MarksImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the students_ markses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching students_ markses
	 */
	@Override
	public List<Students_Marks> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Students_Marks> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Students_Marks> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Students_Marks> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Students_Marks> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Students_Marks> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Students_Marks> list = null;

		if (useFinderCache) {
			list = (List<Students_Marks>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Students_Marks students_Marks : list) {
					if (!uuid.equals(students_Marks.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_STUDENTS_MARKS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Students_MarksModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Students_Marks>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks findByUuid_First(
			String uuid, OrderByComparator<Students_Marks> orderByComparator)
		throws NoSuchStudents_MarksException {

		Students_Marks students_Marks = fetchByUuid_First(
			uuid, orderByComparator);

		if (students_Marks != null) {
			return students_Marks;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchStudents_MarksException(sb.toString());
	}

	/**
	 * Returns the first students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks fetchByUuid_First(
		String uuid, OrderByComparator<Students_Marks> orderByComparator) {

		List<Students_Marks> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks findByUuid_Last(
			String uuid, OrderByComparator<Students_Marks> orderByComparator)
		throws NoSuchStudents_MarksException {

		Students_Marks students_Marks = fetchByUuid_Last(
			uuid, orderByComparator);

		if (students_Marks != null) {
			return students_Marks;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchStudents_MarksException(sb.toString());
	}

	/**
	 * Returns the last students_ marks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks fetchByUuid_Last(
		String uuid, OrderByComparator<Students_Marks> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Students_Marks> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Students_Marks[] findByUuid_PrevAndNext(
			int Student_Id, String uuid,
			OrderByComparator<Students_Marks> orderByComparator)
		throws NoSuchStudents_MarksException {

		uuid = Objects.toString(uuid, "");

		Students_Marks students_Marks = findByPrimaryKey(Student_Id);

		Session session = null;

		try {
			session = openSession();

			Students_Marks[] array = new Students_MarksImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, students_Marks, uuid, orderByComparator, true);

			array[1] = students_Marks;

			array[2] = getByUuid_PrevAndNext(
				session, students_Marks, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Students_Marks getByUuid_PrevAndNext(
		Session session, Students_Marks students_Marks, String uuid,
		OrderByComparator<Students_Marks> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_STUDENTS_MARKS_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(Students_MarksModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						students_Marks)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Students_Marks> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the students_ markses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Students_Marks students_Marks :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(students_Marks);
		}
	}

	/**
	 * Returns the number of students_ markses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching students_ markses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_STUDENTS_MARKS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"students_Marks.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(students_Marks.uuid IS NULL OR students_Marks.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the students_ marks where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchStudents_MarksException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks findByUUID_G(String uuid, long groupId)
		throws NoSuchStudents_MarksException {

		Students_Marks students_Marks = fetchByUUID_G(uuid, groupId);

		if (students_Marks == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchStudents_MarksException(sb.toString());
		}

		return students_Marks;
	}

	/**
	 * Returns the students_ marks where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the students_ marks where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof Students_Marks) {
			Students_Marks students_Marks = (Students_Marks)result;

			if (!Objects.equals(uuid, students_Marks.getUuid()) ||
				(groupId != students_Marks.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_STUDENTS_MARKS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<Students_Marks> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Students_Marks students_Marks = list.get(0);

					result = students_Marks;

					cacheResult(students_Marks);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Students_Marks)result;
		}
	}

	/**
	 * Removes the students_ marks where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the students_ marks that was removed
	 */
	@Override
	public Students_Marks removeByUUID_G(String uuid, long groupId)
		throws NoSuchStudents_MarksException {

		Students_Marks students_Marks = findByUUID_G(uuid, groupId);

		return remove(students_Marks);
	}

	/**
	 * Returns the number of students_ markses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching students_ markses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_STUDENTS_MARKS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"students_Marks.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(students_Marks.uuid IS NULL OR students_Marks.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"students_Marks.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the students_ markses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching students_ markses
	 */
	@Override
	public List<Students_Marks> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Students_Marks> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Students_Marks> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Students_Marks> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Students_Marks> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Students_Marks> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<Students_Marks> list = null;

		if (useFinderCache) {
			list = (List<Students_Marks>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Students_Marks students_Marks : list) {
					if (!uuid.equals(students_Marks.getUuid()) ||
						(companyId != students_Marks.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_STUDENTS_MARKS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Students_MarksModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<Students_Marks>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Students_Marks findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Students_Marks> orderByComparator)
		throws NoSuchStudents_MarksException {

		Students_Marks students_Marks = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (students_Marks != null) {
			return students_Marks;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchStudents_MarksException(sb.toString());
	}

	/**
	 * Returns the first students_ marks in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Students_Marks> orderByComparator) {

		List<Students_Marks> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Students_Marks findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Students_Marks> orderByComparator)
		throws NoSuchStudents_MarksException {

		Students_Marks students_Marks = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (students_Marks != null) {
			return students_Marks;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchStudents_MarksException(sb.toString());
	}

	/**
	 * Returns the last students_ marks in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Students_Marks> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Students_Marks> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Students_Marks[] findByUuid_C_PrevAndNext(
			int Student_Id, String uuid, long companyId,
			OrderByComparator<Students_Marks> orderByComparator)
		throws NoSuchStudents_MarksException {

		uuid = Objects.toString(uuid, "");

		Students_Marks students_Marks = findByPrimaryKey(Student_Id);

		Session session = null;

		try {
			session = openSession();

			Students_Marks[] array = new Students_MarksImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, students_Marks, uuid, companyId, orderByComparator,
				true);

			array[1] = students_Marks;

			array[2] = getByUuid_C_PrevAndNext(
				session, students_Marks, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Students_Marks getByUuid_C_PrevAndNext(
		Session session, Students_Marks students_Marks, String uuid,
		long companyId, OrderByComparator<Students_Marks> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_STUDENTS_MARKS_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(Students_MarksModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						students_Marks)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Students_Marks> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the students_ markses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Students_Marks students_Marks :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(students_Marks);
		}
	}

	/**
	 * Returns the number of students_ markses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching students_ markses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_STUDENTS_MARKS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"students_Marks.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(students_Marks.uuid IS NULL OR students_Marks.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"students_Marks.companyId = ?";

	private FinderPath _finderPathFetchByStudentId;
	private FinderPath _finderPathCountByStudentId;

	/**
	 * Returns the students_ marks where Student_Id = &#63; or throws a <code>NoSuchStudents_MarksException</code> if it could not be found.
	 *
	 * @param Student_Id the student_ ID
	 * @return the matching students_ marks
	 * @throws NoSuchStudents_MarksException if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks findByStudentId(int Student_Id)
		throws NoSuchStudents_MarksException {

		Students_Marks students_Marks = fetchByStudentId(Student_Id);

		if (students_Marks == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("Student_Id=");
			sb.append(Student_Id);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchStudents_MarksException(sb.toString());
		}

		return students_Marks;
	}

	/**
	 * Returns the students_ marks where Student_Id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param Student_Id the student_ ID
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks fetchByStudentId(int Student_Id) {
		return fetchByStudentId(Student_Id, true);
	}

	/**
	 * Returns the students_ marks where Student_Id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param Student_Id the student_ ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	@Override
	public Students_Marks fetchByStudentId(
		int Student_Id, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {Student_Id};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByStudentId, finderArgs, this);
		}

		if (result instanceof Students_Marks) {
			Students_Marks students_Marks = (Students_Marks)result;

			if (Student_Id != students_Marks.getStudent_Id()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_STUDENTS_MARKS_WHERE);

			sb.append(_FINDER_COLUMN_STUDENTID_STUDENT_ID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(Student_Id);

				List<Students_Marks> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByStudentId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {Student_Id};
							}

							_log.warn(
								"Students_MarksPersistenceImpl.fetchByStudentId(int, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Students_Marks students_Marks = list.get(0);

					result = students_Marks;

					cacheResult(students_Marks);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Students_Marks)result;
		}
	}

	/**
	 * Removes the students_ marks where Student_Id = &#63; from the database.
	 *
	 * @param Student_Id the student_ ID
	 * @return the students_ marks that was removed
	 */
	@Override
	public Students_Marks removeByStudentId(int Student_Id)
		throws NoSuchStudents_MarksException {

		Students_Marks students_Marks = findByStudentId(Student_Id);

		return remove(students_Marks);
	}

	/**
	 * Returns the number of students_ markses where Student_Id = &#63;.
	 *
	 * @param Student_Id the student_ ID
	 * @return the number of matching students_ markses
	 */
	@Override
	public int countByStudentId(int Student_Id) {
		FinderPath finderPath = _finderPathCountByStudentId;

		Object[] finderArgs = new Object[] {Student_Id};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_STUDENTS_MARKS_WHERE);

			sb.append(_FINDER_COLUMN_STUDENTID_STUDENT_ID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(Student_Id);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_STUDENTID_STUDENT_ID_2 =
		"students_Marks.Student_Id = ?";

	public Students_MarksPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Students_Marks.class);

		setModelImplClass(Students_MarksImpl.class);
		setModelPKClass(int.class);

		setTable(Students_MarksTable.INSTANCE);
	}

	/**
	 * Caches the students_ marks in the entity cache if it is enabled.
	 *
	 * @param students_Marks the students_ marks
	 */
	@Override
	public void cacheResult(Students_Marks students_Marks) {
		entityCache.putResult(
			Students_MarksImpl.class, students_Marks.getPrimaryKey(),
			students_Marks);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				students_Marks.getUuid(), students_Marks.getGroupId()
			},
			students_Marks);

		finderCache.putResult(
			_finderPathFetchByStudentId,
			new Object[] {students_Marks.getStudent_Id()}, students_Marks);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the students_ markses in the entity cache if it is enabled.
	 *
	 * @param students_Markses the students_ markses
	 */
	@Override
	public void cacheResult(List<Students_Marks> students_Markses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (students_Markses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Students_Marks students_Marks : students_Markses) {
			if (entityCache.getResult(
					Students_MarksImpl.class, students_Marks.getPrimaryKey()) ==
						null) {

				cacheResult(students_Marks);
			}
		}
	}

	/**
	 * Clears the cache for all students_ markses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Students_MarksImpl.class);

		finderCache.clearCache(Students_MarksImpl.class);
	}

	/**
	 * Clears the cache for the students_ marks.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Students_Marks students_Marks) {
		entityCache.removeResult(Students_MarksImpl.class, students_Marks);
	}

	@Override
	public void clearCache(List<Students_Marks> students_Markses) {
		for (Students_Marks students_Marks : students_Markses) {
			entityCache.removeResult(Students_MarksImpl.class, students_Marks);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(Students_MarksImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(Students_MarksImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		Students_MarksModelImpl students_MarksModelImpl) {

		Object[] args = new Object[] {
			students_MarksModelImpl.getUuid(),
			students_MarksModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, students_MarksModelImpl);

		args = new Object[] {students_MarksModelImpl.getStudent_Id()};

		finderCache.putResult(
			_finderPathCountByStudentId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByStudentId, args, students_MarksModelImpl);
	}

	/**
	 * Creates a new students_ marks with the primary key. Does not add the students_ marks to the database.
	 *
	 * @param Student_Id the primary key for the new students_ marks
	 * @return the new students_ marks
	 */
	@Override
	public Students_Marks create(int Student_Id) {
		Students_Marks students_Marks = new Students_MarksImpl();

		students_Marks.setNew(true);
		students_Marks.setPrimaryKey(Student_Id);

		String uuid = PortalUUIDUtil.generate();

		students_Marks.setUuid(uuid);

		students_Marks.setCompanyId(CompanyThreadLocal.getCompanyId());

		return students_Marks;
	}

	/**
	 * Removes the students_ marks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks that was removed
	 * @throws NoSuchStudents_MarksException if a students_ marks with the primary key could not be found
	 */
	@Override
	public Students_Marks remove(int Student_Id)
		throws NoSuchStudents_MarksException {

		return remove((Serializable)Student_Id);
	}

	/**
	 * Removes the students_ marks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the students_ marks
	 * @return the students_ marks that was removed
	 * @throws NoSuchStudents_MarksException if a students_ marks with the primary key could not be found
	 */
	@Override
	public Students_Marks remove(Serializable primaryKey)
		throws NoSuchStudents_MarksException {

		Session session = null;

		try {
			session = openSession();

			Students_Marks students_Marks = (Students_Marks)session.get(
				Students_MarksImpl.class, primaryKey);

			if (students_Marks == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStudents_MarksException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(students_Marks);
		}
		catch (NoSuchStudents_MarksException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Students_Marks removeImpl(Students_Marks students_Marks) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(students_Marks)) {
				students_Marks = (Students_Marks)session.get(
					Students_MarksImpl.class,
					students_Marks.getPrimaryKeyObj());
			}

			if (students_Marks != null) {
				session.delete(students_Marks);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (students_Marks != null) {
			clearCache(students_Marks);
		}

		return students_Marks;
	}

	@Override
	public Students_Marks updateImpl(Students_Marks students_Marks) {
		boolean isNew = students_Marks.isNew();

		if (!(students_Marks instanceof Students_MarksModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(students_Marks.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					students_Marks);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in students_Marks proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Students_Marks implementation " +
					students_Marks.getClass());
		}

		Students_MarksModelImpl students_MarksModelImpl =
			(Students_MarksModelImpl)students_Marks;

		if (Validator.isNull(students_Marks.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			students_Marks.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (students_Marks.getCreateDate() == null)) {
			if (serviceContext == null) {
				students_Marks.setCreateDate(date);
			}
			else {
				students_Marks.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!students_MarksModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				students_Marks.setModifiedDate(date);
			}
			else {
				students_Marks.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(students_Marks);
			}
			else {
				students_Marks = (Students_Marks)session.merge(students_Marks);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			Students_MarksImpl.class, students_MarksModelImpl, false, true);

		cacheUniqueFindersCache(students_MarksModelImpl);

		if (isNew) {
			students_Marks.setNew(false);
		}

		students_Marks.resetOriginalValues();

		return students_Marks;
	}

	/**
	 * Returns the students_ marks with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the students_ marks
	 * @return the students_ marks
	 * @throws NoSuchStudents_MarksException if a students_ marks with the primary key could not be found
	 */
	@Override
	public Students_Marks findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStudents_MarksException {

		Students_Marks students_Marks = fetchByPrimaryKey(primaryKey);

		if (students_Marks == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStudents_MarksException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return students_Marks;
	}

	/**
	 * Returns the students_ marks with the primary key or throws a <code>NoSuchStudents_MarksException</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks
	 * @throws NoSuchStudents_MarksException if a students_ marks with the primary key could not be found
	 */
	@Override
	public Students_Marks findByPrimaryKey(int Student_Id)
		throws NoSuchStudents_MarksException {

		return findByPrimaryKey((Serializable)Student_Id);
	}

	/**
	 * Returns the students_ marks with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks, or <code>null</code> if a students_ marks with the primary key could not be found
	 */
	@Override
	public Students_Marks fetchByPrimaryKey(int Student_Id) {
		return fetchByPrimaryKey((Serializable)Student_Id);
	}

	/**
	 * Returns all the students_ markses.
	 *
	 * @return the students_ markses
	 */
	@Override
	public List<Students_Marks> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Students_Marks> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Students_Marks> findAll(
		int start, int end,
		OrderByComparator<Students_Marks> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Students_Marks> findAll(
		int start, int end, OrderByComparator<Students_Marks> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Students_Marks> list = null;

		if (useFinderCache) {
			list = (List<Students_Marks>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_STUDENTS_MARKS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_STUDENTS_MARKS;

				sql = sql.concat(Students_MarksModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Students_Marks>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the students_ markses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Students_Marks students_Marks : findAll()) {
			remove(students_Marks);
		}
	}

	/**
	 * Returns the number of students_ markses.
	 *
	 * @return the number of students_ markses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_STUDENTS_MARKS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "Student_Id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_STUDENTS_MARKS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Students_MarksModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the students_ marks persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathFetchByStudentId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByStudentId",
			new String[] {Integer.class.getName()}, new String[] {"Student_Id"},
			true);

		_finderPathCountByStudentId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStudentId",
			new String[] {Integer.class.getName()}, new String[] {"Student_Id"},
			false);

		Students_MarksUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		Students_MarksUtil.setPersistence(null);

		entityCache.removeCache(Students_MarksImpl.class.getName());
	}

	@Override
	@Reference(
		target = Students_DetailsPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = Students_DetailsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = Students_DetailsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_STUDENTS_MARKS =
		"SELECT students_Marks FROM Students_Marks students_Marks";

	private static final String _SQL_SELECT_STUDENTS_MARKS_WHERE =
		"SELECT students_Marks FROM Students_Marks students_Marks WHERE ";

	private static final String _SQL_COUNT_STUDENTS_MARKS =
		"SELECT COUNT(students_Marks) FROM Students_Marks students_Marks";

	private static final String _SQL_COUNT_STUDENTS_MARKS_WHERE =
		"SELECT COUNT(students_Marks) FROM Students_Marks students_Marks WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "students_Marks.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Students_Marks exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Students_Marks exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Students_MarksPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}