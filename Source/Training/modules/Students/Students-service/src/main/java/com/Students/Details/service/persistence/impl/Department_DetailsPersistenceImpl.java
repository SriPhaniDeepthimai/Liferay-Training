/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.persistence.impl;

import com.Students.Details.exception.NoSuchDepartment_DetailsException;
import com.Students.Details.model.Department_Details;
import com.Students.Details.model.Department_DetailsTable;
import com.Students.Details.model.impl.Department_DetailsImpl;
import com.Students.Details.model.impl.Department_DetailsModelImpl;
import com.Students.Details.service.persistence.Department_DetailsPersistence;
import com.Students.Details.service.persistence.Department_DetailsUtil;
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
 * The persistence implementation for the department_ details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = Department_DetailsPersistence.class)
public class Department_DetailsPersistenceImpl
	extends BasePersistenceImpl<Department_Details>
	implements Department_DetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Department_DetailsUtil</code> to access the department_ details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Department_DetailsImpl.class.getName();

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
	 * Returns all the department_ detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching department_ detailses
	 */
	@Override
	public List<Department_Details> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Department_Details> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Department_Details> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Department_Details> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Department_Details> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Department_Details> orderByComparator,
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

		List<Department_Details> list = null;

		if (useFinderCache) {
			list = (List<Department_Details>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Department_Details department_Details : list) {
					if (!uuid.equals(department_Details.getUuid())) {
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

			sb.append(_SQL_SELECT_DEPARTMENT_DETAILS_WHERE);

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
				sb.append(Department_DetailsModelImpl.ORDER_BY_JPQL);
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

				list = (List<Department_Details>)QueryUtil.list(
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
	 * Returns the first department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	@Override
	public Department_Details findByUuid_First(
			String uuid,
			OrderByComparator<Department_Details> orderByComparator)
		throws NoSuchDepartment_DetailsException {

		Department_Details department_Details = fetchByUuid_First(
			uuid, orderByComparator);

		if (department_Details != null) {
			return department_Details;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDepartment_DetailsException(sb.toString());
	}

	/**
	 * Returns the first department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	@Override
	public Department_Details fetchByUuid_First(
		String uuid, OrderByComparator<Department_Details> orderByComparator) {

		List<Department_Details> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	@Override
	public Department_Details findByUuid_Last(
			String uuid,
			OrderByComparator<Department_Details> orderByComparator)
		throws NoSuchDepartment_DetailsException {

		Department_Details department_Details = fetchByUuid_Last(
			uuid, orderByComparator);

		if (department_Details != null) {
			return department_Details;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDepartment_DetailsException(sb.toString());
	}

	/**
	 * Returns the last department_ details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	@Override
	public Department_Details fetchByUuid_Last(
		String uuid, OrderByComparator<Department_Details> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Department_Details> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Department_Details[] findByUuid_PrevAndNext(
			int Department_Id, String uuid,
			OrderByComparator<Department_Details> orderByComparator)
		throws NoSuchDepartment_DetailsException {

		uuid = Objects.toString(uuid, "");

		Department_Details department_Details = findByPrimaryKey(Department_Id);

		Session session = null;

		try {
			session = openSession();

			Department_Details[] array = new Department_DetailsImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, department_Details, uuid, orderByComparator, true);

			array[1] = department_Details;

			array[2] = getByUuid_PrevAndNext(
				session, department_Details, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Department_Details getByUuid_PrevAndNext(
		Session session, Department_Details department_Details, String uuid,
		OrderByComparator<Department_Details> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_DEPARTMENT_DETAILS_WHERE);

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
			sb.append(Department_DetailsModelImpl.ORDER_BY_JPQL);
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
						department_Details)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Department_Details> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the department_ detailses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Department_Details department_Details :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(department_Details);
		}
	}

	/**
	 * Returns the number of department_ detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching department_ detailses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DEPARTMENT_DETAILS_WHERE);

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
		"department_Details.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(department_Details.uuid IS NULL OR department_Details.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the department_ details where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDepartment_DetailsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	@Override
	public Department_Details findByUUID_G(String uuid, long groupId)
		throws NoSuchDepartment_DetailsException {

		Department_Details department_Details = fetchByUUID_G(uuid, groupId);

		if (department_Details == null) {
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

			throw new NoSuchDepartment_DetailsException(sb.toString());
		}

		return department_Details;
	}

	/**
	 * Returns the department_ details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	@Override
	public Department_Details fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the department_ details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	@Override
	public Department_Details fetchByUUID_G(
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

		if (result instanceof Department_Details) {
			Department_Details department_Details = (Department_Details)result;

			if (!Objects.equals(uuid, department_Details.getUuid()) ||
				(groupId != department_Details.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_DEPARTMENT_DETAILS_WHERE);

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

				List<Department_Details> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Department_Details department_Details = list.get(0);

					result = department_Details;

					cacheResult(department_Details);
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
			return (Department_Details)result;
		}
	}

	/**
	 * Removes the department_ details where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the department_ details that was removed
	 */
	@Override
	public Department_Details removeByUUID_G(String uuid, long groupId)
		throws NoSuchDepartment_DetailsException {

		Department_Details department_Details = findByUUID_G(uuid, groupId);

		return remove(department_Details);
	}

	/**
	 * Returns the number of department_ detailses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching department_ detailses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DEPARTMENT_DETAILS_WHERE);

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
		"department_Details.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(department_Details.uuid IS NULL OR department_Details.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"department_Details.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the department_ detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching department_ detailses
	 */
	@Override
	public List<Department_Details> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Department_Details> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Department_Details> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Department_Details> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Department_Details> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Department_Details> orderByComparator,
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

		List<Department_Details> list = null;

		if (useFinderCache) {
			list = (List<Department_Details>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Department_Details department_Details : list) {
					if (!uuid.equals(department_Details.getUuid()) ||
						(companyId != department_Details.getCompanyId())) {

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

			sb.append(_SQL_SELECT_DEPARTMENT_DETAILS_WHERE);

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
				sb.append(Department_DetailsModelImpl.ORDER_BY_JPQL);
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

				list = (List<Department_Details>)QueryUtil.list(
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
	 * Returns the first department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details
	 * @throws NoSuchDepartment_DetailsException if a matching department_ details could not be found
	 */
	@Override
	public Department_Details findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Department_Details> orderByComparator)
		throws NoSuchDepartment_DetailsException {

		Department_Details department_Details = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (department_Details != null) {
			return department_Details;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDepartment_DetailsException(sb.toString());
	}

	/**
	 * Returns the first department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	@Override
	public Department_Details fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Department_Details> orderByComparator) {

		List<Department_Details> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Department_Details findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Department_Details> orderByComparator)
		throws NoSuchDepartment_DetailsException {

		Department_Details department_Details = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (department_Details != null) {
			return department_Details;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDepartment_DetailsException(sb.toString());
	}

	/**
	 * Returns the last department_ details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	@Override
	public Department_Details fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Department_Details> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Department_Details> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Department_Details[] findByUuid_C_PrevAndNext(
			int Department_Id, String uuid, long companyId,
			OrderByComparator<Department_Details> orderByComparator)
		throws NoSuchDepartment_DetailsException {

		uuid = Objects.toString(uuid, "");

		Department_Details department_Details = findByPrimaryKey(Department_Id);

		Session session = null;

		try {
			session = openSession();

			Department_Details[] array = new Department_DetailsImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, department_Details, uuid, companyId, orderByComparator,
				true);

			array[1] = department_Details;

			array[2] = getByUuid_C_PrevAndNext(
				session, department_Details, uuid, companyId, orderByComparator,
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

	protected Department_Details getByUuid_C_PrevAndNext(
		Session session, Department_Details department_Details, String uuid,
		long companyId, OrderByComparator<Department_Details> orderByComparator,
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

		sb.append(_SQL_SELECT_DEPARTMENT_DETAILS_WHERE);

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
			sb.append(Department_DetailsModelImpl.ORDER_BY_JPQL);
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
						department_Details)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Department_Details> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the department_ detailses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Department_Details department_Details :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(department_Details);
		}
	}

	/**
	 * Returns the number of department_ detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching department_ detailses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DEPARTMENT_DETAILS_WHERE);

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
		"department_Details.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(department_Details.uuid IS NULL OR department_Details.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"department_Details.companyId = ?";

	public Department_DetailsPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Department_Details.class);

		setModelImplClass(Department_DetailsImpl.class);
		setModelPKClass(int.class);

		setTable(Department_DetailsTable.INSTANCE);
	}

	/**
	 * Caches the department_ details in the entity cache if it is enabled.
	 *
	 * @param department_Details the department_ details
	 */
	@Override
	public void cacheResult(Department_Details department_Details) {
		entityCache.putResult(
			Department_DetailsImpl.class, department_Details.getPrimaryKey(),
			department_Details);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				department_Details.getUuid(), department_Details.getGroupId()
			},
			department_Details);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the department_ detailses in the entity cache if it is enabled.
	 *
	 * @param department_Detailses the department_ detailses
	 */
	@Override
	public void cacheResult(List<Department_Details> department_Detailses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (department_Detailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Department_Details department_Details : department_Detailses) {
			if (entityCache.getResult(
					Department_DetailsImpl.class,
					department_Details.getPrimaryKey()) == null) {

				cacheResult(department_Details);
			}
		}
	}

	/**
	 * Clears the cache for all department_ detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Department_DetailsImpl.class);

		finderCache.clearCache(Department_DetailsImpl.class);
	}

	/**
	 * Clears the cache for the department_ details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Department_Details department_Details) {
		entityCache.removeResult(
			Department_DetailsImpl.class, department_Details);
	}

	@Override
	public void clearCache(List<Department_Details> department_Detailses) {
		for (Department_Details department_Details : department_Detailses) {
			entityCache.removeResult(
				Department_DetailsImpl.class, department_Details);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(Department_DetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(Department_DetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		Department_DetailsModelImpl department_DetailsModelImpl) {

		Object[] args = new Object[] {
			department_DetailsModelImpl.getUuid(),
			department_DetailsModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, department_DetailsModelImpl);
	}

	/**
	 * Creates a new department_ details with the primary key. Does not add the department_ details to the database.
	 *
	 * @param Department_Id the primary key for the new department_ details
	 * @return the new department_ details
	 */
	@Override
	public Department_Details create(int Department_Id) {
		Department_Details department_Details = new Department_DetailsImpl();

		department_Details.setNew(true);
		department_Details.setPrimaryKey(Department_Id);

		String uuid = PortalUUIDUtil.generate();

		department_Details.setUuid(uuid);

		department_Details.setCompanyId(CompanyThreadLocal.getCompanyId());

		return department_Details;
	}

	/**
	 * Removes the department_ details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details that was removed
	 * @throws NoSuchDepartment_DetailsException if a department_ details with the primary key could not be found
	 */
	@Override
	public Department_Details remove(int Department_Id)
		throws NoSuchDepartment_DetailsException {

		return remove((Serializable)Department_Id);
	}

	/**
	 * Removes the department_ details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the department_ details
	 * @return the department_ details that was removed
	 * @throws NoSuchDepartment_DetailsException if a department_ details with the primary key could not be found
	 */
	@Override
	public Department_Details remove(Serializable primaryKey)
		throws NoSuchDepartment_DetailsException {

		Session session = null;

		try {
			session = openSession();

			Department_Details department_Details =
				(Department_Details)session.get(
					Department_DetailsImpl.class, primaryKey);

			if (department_Details == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDepartment_DetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(department_Details);
		}
		catch (NoSuchDepartment_DetailsException noSuchEntityException) {
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
	protected Department_Details removeImpl(
		Department_Details department_Details) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(department_Details)) {
				department_Details = (Department_Details)session.get(
					Department_DetailsImpl.class,
					department_Details.getPrimaryKeyObj());
			}

			if (department_Details != null) {
				session.delete(department_Details);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (department_Details != null) {
			clearCache(department_Details);
		}

		return department_Details;
	}

	@Override
	public Department_Details updateImpl(
		Department_Details department_Details) {

		boolean isNew = department_Details.isNew();

		if (!(department_Details instanceof Department_DetailsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(department_Details.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					department_Details);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in department_Details proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Department_Details implementation " +
					department_Details.getClass());
		}

		Department_DetailsModelImpl department_DetailsModelImpl =
			(Department_DetailsModelImpl)department_Details;

		if (Validator.isNull(department_Details.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			department_Details.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (department_Details.getCreateDate() == null)) {
			if (serviceContext == null) {
				department_Details.setCreateDate(date);
			}
			else {
				department_Details.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!department_DetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				department_Details.setModifiedDate(date);
			}
			else {
				department_Details.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(department_Details);
			}
			else {
				department_Details = (Department_Details)session.merge(
					department_Details);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			Department_DetailsImpl.class, department_DetailsModelImpl, false,
			true);

		cacheUniqueFindersCache(department_DetailsModelImpl);

		if (isNew) {
			department_Details.setNew(false);
		}

		department_Details.resetOriginalValues();

		return department_Details;
	}

	/**
	 * Returns the department_ details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the department_ details
	 * @return the department_ details
	 * @throws NoSuchDepartment_DetailsException if a department_ details with the primary key could not be found
	 */
	@Override
	public Department_Details findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDepartment_DetailsException {

		Department_Details department_Details = fetchByPrimaryKey(primaryKey);

		if (department_Details == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDepartment_DetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return department_Details;
	}

	/**
	 * Returns the department_ details with the primary key or throws a <code>NoSuchDepartment_DetailsException</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details
	 * @throws NoSuchDepartment_DetailsException if a department_ details with the primary key could not be found
	 */
	@Override
	public Department_Details findByPrimaryKey(int Department_Id)
		throws NoSuchDepartment_DetailsException {

		return findByPrimaryKey((Serializable)Department_Id);
	}

	/**
	 * Returns the department_ details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details, or <code>null</code> if a department_ details with the primary key could not be found
	 */
	@Override
	public Department_Details fetchByPrimaryKey(int Department_Id) {
		return fetchByPrimaryKey((Serializable)Department_Id);
	}

	/**
	 * Returns all the department_ detailses.
	 *
	 * @return the department_ detailses
	 */
	@Override
	public List<Department_Details> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Department_Details> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Department_Details> findAll(
		int start, int end,
		OrderByComparator<Department_Details> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Department_Details> findAll(
		int start, int end,
		OrderByComparator<Department_Details> orderByComparator,
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

		List<Department_Details> list = null;

		if (useFinderCache) {
			list = (List<Department_Details>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DEPARTMENT_DETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DEPARTMENT_DETAILS;

				sql = sql.concat(Department_DetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Department_Details>)QueryUtil.list(
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
	 * Removes all the department_ detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Department_Details department_Details : findAll()) {
			remove(department_Details);
		}
	}

	/**
	 * Returns the number of department_ detailses.
	 *
	 * @return the number of department_ detailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_DEPARTMENT_DETAILS);

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
		return "Department_Id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DEPARTMENT_DETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Department_DetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the department_ details persistence.
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

		Department_DetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		Department_DetailsUtil.setPersistence(null);

		entityCache.removeCache(Department_DetailsImpl.class.getName());
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

	private static final String _SQL_SELECT_DEPARTMENT_DETAILS =
		"SELECT department_Details FROM Department_Details department_Details";

	private static final String _SQL_SELECT_DEPARTMENT_DETAILS_WHERE =
		"SELECT department_Details FROM Department_Details department_Details WHERE ";

	private static final String _SQL_COUNT_DEPARTMENT_DETAILS =
		"SELECT COUNT(department_Details) FROM Department_Details department_Details";

	private static final String _SQL_COUNT_DEPARTMENT_DETAILS_WHERE =
		"SELECT COUNT(department_Details) FROM Department_Details department_Details WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "department_Details.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Department_Details exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Department_Details exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Department_DetailsPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}