/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence.impl;

import com.Students.Details.exception.NoSuchTeacherDetailsException;
import com.Students.Details.model.TeacherDetails;
import com.Students.Details.model.TeacherDetailsTable;
import com.Students.Details.model.impl.TeacherDetailsImpl;
import com.Students.Details.model.impl.TeacherDetailsModelImpl;
import com.Students.Details.service.persistence.TeacherDetailsPersistence;
import com.Students.Details.service.persistence.TeacherDetailsUtil;
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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the teacher details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TeacherDetailsPersistence.class)
public class TeacherDetailsPersistenceImpl
	extends BasePersistenceImpl<TeacherDetails>
	implements TeacherDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TeacherDetailsUtil</code> to access the teacher details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TeacherDetailsImpl.class.getName();

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
	 * Returns all the teacher detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching teacher detailses
	 */
	@Override
	public List<TeacherDetails> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TeacherDetails> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<TeacherDetails> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<TeacherDetails> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator,
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

		List<TeacherDetails> list = null;

		if (useFinderCache) {
			list = (List<TeacherDetails>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TeacherDetails teacherDetails : list) {
					if (!uuid.equals(teacherDetails.getUuid())) {
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

			sb.append(_SQL_SELECT_TEACHERDETAILS_WHERE);

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
				sb.append(TeacherDetailsModelImpl.ORDER_BY_JPQL);
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

				list = (List<TeacherDetails>)QueryUtil.list(
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
	 * Returns the first teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails findByUuid_First(
			String uuid, OrderByComparator<TeacherDetails> orderByComparator)
		throws NoSuchTeacherDetailsException {

		TeacherDetails teacherDetails = fetchByUuid_First(
			uuid, orderByComparator);

		if (teacherDetails != null) {
			return teacherDetails;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTeacherDetailsException(sb.toString());
	}

	/**
	 * Returns the first teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails fetchByUuid_First(
		String uuid, OrderByComparator<TeacherDetails> orderByComparator) {

		List<TeacherDetails> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails findByUuid_Last(
			String uuid, OrderByComparator<TeacherDetails> orderByComparator)
		throws NoSuchTeacherDetailsException {

		TeacherDetails teacherDetails = fetchByUuid_Last(
			uuid, orderByComparator);

		if (teacherDetails != null) {
			return teacherDetails;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTeacherDetailsException(sb.toString());
	}

	/**
	 * Returns the last teacher details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails fetchByUuid_Last(
		String uuid, OrderByComparator<TeacherDetails> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<TeacherDetails> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TeacherDetails[] findByUuid_PrevAndNext(
			int Teacher_Id, String uuid,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws NoSuchTeacherDetailsException {

		uuid = Objects.toString(uuid, "");

		TeacherDetails teacherDetails = findByPrimaryKey(Teacher_Id);

		Session session = null;

		try {
			session = openSession();

			TeacherDetails[] array = new TeacherDetailsImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, teacherDetails, uuid, orderByComparator, true);

			array[1] = teacherDetails;

			array[2] = getByUuid_PrevAndNext(
				session, teacherDetails, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected TeacherDetails getByUuid_PrevAndNext(
		Session session, TeacherDetails teacherDetails, String uuid,
		OrderByComparator<TeacherDetails> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_TEACHERDETAILS_WHERE);

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
			sb.append(TeacherDetailsModelImpl.ORDER_BY_JPQL);
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
						teacherDetails)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TeacherDetails> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the teacher detailses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (TeacherDetails teacherDetails :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(teacherDetails);
		}
	}

	/**
	 * Returns the number of teacher detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching teacher detailses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TEACHERDETAILS_WHERE);

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
		"teacherDetails.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(teacherDetails.uuid IS NULL OR teacherDetails.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the teacher details where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTeacherDetailsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails findByUUID_G(String uuid, long groupId)
		throws NoSuchTeacherDetailsException {

		TeacherDetails teacherDetails = fetchByUUID_G(uuid, groupId);

		if (teacherDetails == null) {
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

			throw new NoSuchTeacherDetailsException(sb.toString());
		}

		return teacherDetails;
	}

	/**
	 * Returns the teacher details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the teacher details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails fetchByUUID_G(
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

		if (result instanceof TeacherDetails) {
			TeacherDetails teacherDetails = (TeacherDetails)result;

			if (!Objects.equals(uuid, teacherDetails.getUuid()) ||
				(groupId != teacherDetails.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TEACHERDETAILS_WHERE);

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

				List<TeacherDetails> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					TeacherDetails teacherDetails = list.get(0);

					result = teacherDetails;

					cacheResult(teacherDetails);
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
			return (TeacherDetails)result;
		}
	}

	/**
	 * Removes the teacher details where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the teacher details that was removed
	 */
	@Override
	public TeacherDetails removeByUUID_G(String uuid, long groupId)
		throws NoSuchTeacherDetailsException {

		TeacherDetails teacherDetails = findByUUID_G(uuid, groupId);

		return remove(teacherDetails);
	}

	/**
	 * Returns the number of teacher detailses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching teacher detailses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TEACHERDETAILS_WHERE);

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
		"teacherDetails.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(teacherDetails.uuid IS NULL OR teacherDetails.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"teacherDetails.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the teacher detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching teacher detailses
	 */
	@Override
	public List<TeacherDetails> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TeacherDetails> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<TeacherDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<TeacherDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator,
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

		List<TeacherDetails> list = null;

		if (useFinderCache) {
			list = (List<TeacherDetails>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TeacherDetails teacherDetails : list) {
					if (!uuid.equals(teacherDetails.getUuid()) ||
						(companyId != teacherDetails.getCompanyId())) {

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

			sb.append(_SQL_SELECT_TEACHERDETAILS_WHERE);

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
				sb.append(TeacherDetailsModelImpl.ORDER_BY_JPQL);
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

				list = (List<TeacherDetails>)QueryUtil.list(
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
	 * Returns the first teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws NoSuchTeacherDetailsException {

		TeacherDetails teacherDetails = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (teacherDetails != null) {
			return teacherDetails;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchTeacherDetailsException(sb.toString());
	}

	/**
	 * Returns the first teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<TeacherDetails> orderByComparator) {

		List<TeacherDetails> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TeacherDetails findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws NoSuchTeacherDetailsException {

		TeacherDetails teacherDetails = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (teacherDetails != null) {
			return teacherDetails;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchTeacherDetailsException(sb.toString());
	}

	/**
	 * Returns the last teacher details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<TeacherDetails> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<TeacherDetails> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TeacherDetails[] findByUuid_C_PrevAndNext(
			int Teacher_Id, String uuid, long companyId,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws NoSuchTeacherDetailsException {

		uuid = Objects.toString(uuid, "");

		TeacherDetails teacherDetails = findByPrimaryKey(Teacher_Id);

		Session session = null;

		try {
			session = openSession();

			TeacherDetails[] array = new TeacherDetailsImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, teacherDetails, uuid, companyId, orderByComparator,
				true);

			array[1] = teacherDetails;

			array[2] = getByUuid_C_PrevAndNext(
				session, teacherDetails, uuid, companyId, orderByComparator,
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

	protected TeacherDetails getByUuid_C_PrevAndNext(
		Session session, TeacherDetails teacherDetails, String uuid,
		long companyId, OrderByComparator<TeacherDetails> orderByComparator,
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

		sb.append(_SQL_SELECT_TEACHERDETAILS_WHERE);

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
			sb.append(TeacherDetailsModelImpl.ORDER_BY_JPQL);
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
						teacherDetails)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TeacherDetails> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the teacher detailses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (TeacherDetails teacherDetails :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(teacherDetails);
		}
	}

	/**
	 * Returns the number of teacher detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching teacher detailses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TEACHERDETAILS_WHERE);

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
		"teacherDetails.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(teacherDetails.uuid IS NULL OR teacherDetails.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"teacherDetails.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByDepartmentId;
	private FinderPath _finderPathWithoutPaginationFindByDepartmentId;
	private FinderPath _finderPathCountByDepartmentId;

	/**
	 * Returns all the teacher detailses where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the matching teacher detailses
	 */
	@Override
	public List<TeacherDetails> findByDepartmentId(int Department_Id) {
		return findByDepartmentId(
			Department_Id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TeacherDetails> findByDepartmentId(
		int Department_Id, int start, int end) {

		return findByDepartmentId(Department_Id, start, end, null);
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
	@Override
	public List<TeacherDetails> findByDepartmentId(
		int Department_Id, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return findByDepartmentId(
			Department_Id, start, end, orderByComparator, true);
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
	@Override
	public List<TeacherDetails> findByDepartmentId(
		int Department_Id, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByDepartmentId;
				finderArgs = new Object[] {Department_Id};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByDepartmentId;
			finderArgs = new Object[] {
				Department_Id, start, end, orderByComparator
			};
		}

		List<TeacherDetails> list = null;

		if (useFinderCache) {
			list = (List<TeacherDetails>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TeacherDetails teacherDetails : list) {
					if (Department_Id != teacherDetails.getDepartment_Id()) {
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

			sb.append(_SQL_SELECT_TEACHERDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_DEPARTMENTID_DEPARTMENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TeacherDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(Department_Id);

				list = (List<TeacherDetails>)QueryUtil.list(
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
	 * Returns the first teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails findByDepartmentId_First(
			int Department_Id,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws NoSuchTeacherDetailsException {

		TeacherDetails teacherDetails = fetchByDepartmentId_First(
			Department_Id, orderByComparator);

		if (teacherDetails != null) {
			return teacherDetails;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Department_Id=");
		sb.append(Department_Id);

		sb.append("}");

		throw new NoSuchTeacherDetailsException(sb.toString());
	}

	/**
	 * Returns the first teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails fetchByDepartmentId_First(
		int Department_Id,
		OrderByComparator<TeacherDetails> orderByComparator) {

		List<TeacherDetails> list = findByDepartmentId(
			Department_Id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details
	 * @throws NoSuchTeacherDetailsException if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails findByDepartmentId_Last(
			int Department_Id,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws NoSuchTeacherDetailsException {

		TeacherDetails teacherDetails = fetchByDepartmentId_Last(
			Department_Id, orderByComparator);

		if (teacherDetails != null) {
			return teacherDetails;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Department_Id=");
		sb.append(Department_Id);

		sb.append("}");

		throw new NoSuchTeacherDetailsException(sb.toString());
	}

	/**
	 * Returns the last teacher details in the ordered set where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	@Override
	public TeacherDetails fetchByDepartmentId_Last(
		int Department_Id,
		OrderByComparator<TeacherDetails> orderByComparator) {

		int count = countByDepartmentId(Department_Id);

		if (count == 0) {
			return null;
		}

		List<TeacherDetails> list = findByDepartmentId(
			Department_Id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TeacherDetails[] findByDepartmentId_PrevAndNext(
			int Teacher_Id, int Department_Id,
			OrderByComparator<TeacherDetails> orderByComparator)
		throws NoSuchTeacherDetailsException {

		TeacherDetails teacherDetails = findByPrimaryKey(Teacher_Id);

		Session session = null;

		try {
			session = openSession();

			TeacherDetails[] array = new TeacherDetailsImpl[3];

			array[0] = getByDepartmentId_PrevAndNext(
				session, teacherDetails, Department_Id, orderByComparator,
				true);

			array[1] = teacherDetails;

			array[2] = getByDepartmentId_PrevAndNext(
				session, teacherDetails, Department_Id, orderByComparator,
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

	protected TeacherDetails getByDepartmentId_PrevAndNext(
		Session session, TeacherDetails teacherDetails, int Department_Id,
		OrderByComparator<TeacherDetails> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_TEACHERDETAILS_WHERE);

		sb.append(_FINDER_COLUMN_DEPARTMENTID_DEPARTMENT_ID_2);

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
			sb.append(TeacherDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(Department_Id);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						teacherDetails)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TeacherDetails> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the teacher detailses where Department_Id = &#63; from the database.
	 *
	 * @param Department_Id the department_ ID
	 */
	@Override
	public void removeByDepartmentId(int Department_Id) {
		for (TeacherDetails teacherDetails :
				findByDepartmentId(
					Department_Id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(teacherDetails);
		}
	}

	/**
	 * Returns the number of teacher detailses where Department_Id = &#63;.
	 *
	 * @param Department_Id the department_ ID
	 * @return the number of matching teacher detailses
	 */
	@Override
	public int countByDepartmentId(int Department_Id) {
		FinderPath finderPath = _finderPathCountByDepartmentId;

		Object[] finderArgs = new Object[] {Department_Id};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TEACHERDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_DEPARTMENTID_DEPARTMENT_ID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(Department_Id);

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

	private static final String _FINDER_COLUMN_DEPARTMENTID_DEPARTMENT_ID_2 =
		"teacherDetails.Department_Id = ?";

	public TeacherDetailsPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(TeacherDetails.class);

		setModelImplClass(TeacherDetailsImpl.class);
		setModelPKClass(int.class);

		setTable(TeacherDetailsTable.INSTANCE);
	}

	/**
	 * Caches the teacher details in the entity cache if it is enabled.
	 *
	 * @param teacherDetails the teacher details
	 */
	@Override
	public void cacheResult(TeacherDetails teacherDetails) {
		entityCache.putResult(
			TeacherDetailsImpl.class, teacherDetails.getPrimaryKey(),
			teacherDetails);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				teacherDetails.getUuid(), teacherDetails.getGroupId()
			},
			teacherDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the teacher detailses in the entity cache if it is enabled.
	 *
	 * @param teacherDetailses the teacher detailses
	 */
	@Override
	public void cacheResult(List<TeacherDetails> teacherDetailses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (teacherDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TeacherDetails teacherDetails : teacherDetailses) {
			if (entityCache.getResult(
					TeacherDetailsImpl.class, teacherDetails.getPrimaryKey()) ==
						null) {

				cacheResult(teacherDetails);
			}
		}
	}

	/**
	 * Clears the cache for all teacher detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TeacherDetailsImpl.class);

		finderCache.clearCache(TeacherDetailsImpl.class);
	}

	/**
	 * Clears the cache for the teacher details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TeacherDetails teacherDetails) {
		entityCache.removeResult(TeacherDetailsImpl.class, teacherDetails);
	}

	@Override
	public void clearCache(List<TeacherDetails> teacherDetailses) {
		for (TeacherDetails teacherDetails : teacherDetailses) {
			entityCache.removeResult(TeacherDetailsImpl.class, teacherDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TeacherDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(TeacherDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TeacherDetailsModelImpl teacherDetailsModelImpl) {

		Object[] args = new Object[] {
			teacherDetailsModelImpl.getUuid(),
			teacherDetailsModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, teacherDetailsModelImpl);
	}

	/**
	 * Creates a new teacher details with the primary key. Does not add the teacher details to the database.
	 *
	 * @param Teacher_Id the primary key for the new teacher details
	 * @return the new teacher details
	 */
	@Override
	public TeacherDetails create(int Teacher_Id) {
		TeacherDetails teacherDetails = new TeacherDetailsImpl();

		teacherDetails.setNew(true);
		teacherDetails.setPrimaryKey(Teacher_Id);

		String uuid = PortalUUIDUtil.generate();

		teacherDetails.setUuid(uuid);

		teacherDetails.setCompanyId(CompanyThreadLocal.getCompanyId());

		return teacherDetails;
	}

	/**
	 * Removes the teacher details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details that was removed
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	@Override
	public TeacherDetails remove(int Teacher_Id)
		throws NoSuchTeacherDetailsException {

		return remove((Serializable)Teacher_Id);
	}

	/**
	 * Removes the teacher details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the teacher details
	 * @return the teacher details that was removed
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	@Override
	public TeacherDetails remove(Serializable primaryKey)
		throws NoSuchTeacherDetailsException {

		Session session = null;

		try {
			session = openSession();

			TeacherDetails teacherDetails = (TeacherDetails)session.get(
				TeacherDetailsImpl.class, primaryKey);

			if (teacherDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTeacherDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(teacherDetails);
		}
		catch (NoSuchTeacherDetailsException noSuchEntityException) {
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
	protected TeacherDetails removeImpl(TeacherDetails teacherDetails) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(teacherDetails)) {
				teacherDetails = (TeacherDetails)session.get(
					TeacherDetailsImpl.class,
					teacherDetails.getPrimaryKeyObj());
			}

			if (teacherDetails != null) {
				session.delete(teacherDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (teacherDetails != null) {
			clearCache(teacherDetails);
		}

		return teacherDetails;
	}

	@Override
	public TeacherDetails updateImpl(TeacherDetails teacherDetails) {
		boolean isNew = teacherDetails.isNew();

		if (!(teacherDetails instanceof TeacherDetailsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(teacherDetails.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					teacherDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in teacherDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TeacherDetails implementation " +
					teacherDetails.getClass());
		}

		TeacherDetailsModelImpl teacherDetailsModelImpl =
			(TeacherDetailsModelImpl)teacherDetails;

		if (Validator.isNull(teacherDetails.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			teacherDetails.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (teacherDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				teacherDetails.setCreateDate(date);
			}
			else {
				teacherDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!teacherDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				teacherDetails.setModifiedDate(date);
			}
			else {
				teacherDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(teacherDetails);
			}
			else {
				teacherDetails = (TeacherDetails)session.merge(teacherDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TeacherDetailsImpl.class, teacherDetailsModelImpl, false, true);

		cacheUniqueFindersCache(teacherDetailsModelImpl);

		if (isNew) {
			teacherDetails.setNew(false);
		}

		teacherDetails.resetOriginalValues();

		return teacherDetails;
	}

	/**
	 * Returns the teacher details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the teacher details
	 * @return the teacher details
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	@Override
	public TeacherDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTeacherDetailsException {

		TeacherDetails teacherDetails = fetchByPrimaryKey(primaryKey);

		if (teacherDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTeacherDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return teacherDetails;
	}

	/**
	 * Returns the teacher details with the primary key or throws a <code>NoSuchTeacherDetailsException</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details
	 * @throws NoSuchTeacherDetailsException if a teacher details with the primary key could not be found
	 */
	@Override
	public TeacherDetails findByPrimaryKey(int Teacher_Id)
		throws NoSuchTeacherDetailsException {

		return findByPrimaryKey((Serializable)Teacher_Id);
	}

	/**
	 * Returns the teacher details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details, or <code>null</code> if a teacher details with the primary key could not be found
	 */
	@Override
	public TeacherDetails fetchByPrimaryKey(int Teacher_Id) {
		return fetchByPrimaryKey((Serializable)Teacher_Id);
	}

	/**
	 * Returns all the teacher detailses.
	 *
	 * @return the teacher detailses
	 */
	@Override
	public List<TeacherDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TeacherDetails> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<TeacherDetails> findAll(
		int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<TeacherDetails> findAll(
		int start, int end, OrderByComparator<TeacherDetails> orderByComparator,
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

		List<TeacherDetails> list = null;

		if (useFinderCache) {
			list = (List<TeacherDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TEACHERDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TEACHERDETAILS;

				sql = sql.concat(TeacherDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TeacherDetails>)QueryUtil.list(
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
	 * Removes all the teacher detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TeacherDetails teacherDetails : findAll()) {
			remove(teacherDetails);
		}
	}

	/**
	 * Returns the number of teacher detailses.
	 *
	 * @return the number of teacher detailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_TEACHERDETAILS);

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
		return "Teacher_Id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TEACHERDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TeacherDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the teacher details persistence.
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

		_finderPathWithPaginationFindByDepartmentId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDepartmentId",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"Department_Id"}, true);

		_finderPathWithoutPaginationFindByDepartmentId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDepartmentId",
			new String[] {Integer.class.getName()},
			new String[] {"Department_Id"}, true);

		_finderPathCountByDepartmentId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDepartmentId",
			new String[] {Integer.class.getName()},
			new String[] {"Department_Id"}, false);

		TeacherDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TeacherDetailsUtil.setPersistence(null);

		entityCache.removeCache(TeacherDetailsImpl.class.getName());
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

	private static final String _SQL_SELECT_TEACHERDETAILS =
		"SELECT teacherDetails FROM TeacherDetails teacherDetails";

	private static final String _SQL_SELECT_TEACHERDETAILS_WHERE =
		"SELECT teacherDetails FROM TeacherDetails teacherDetails WHERE ";

	private static final String _SQL_COUNT_TEACHERDETAILS =
		"SELECT COUNT(teacherDetails) FROM TeacherDetails teacherDetails";

	private static final String _SQL_COUNT_TEACHERDETAILS_WHERE =
		"SELECT COUNT(teacherDetails) FROM TeacherDetails teacherDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "teacherDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TeacherDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TeacherDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TeacherDetailsPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}