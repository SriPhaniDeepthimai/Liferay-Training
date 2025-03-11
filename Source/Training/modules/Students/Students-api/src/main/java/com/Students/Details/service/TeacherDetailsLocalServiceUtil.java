/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service;

import com.Students.Details.model.TeacherDetails;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TeacherDetails. This utility wraps
 * <code>com.Students.Details.service.impl.TeacherDetailsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TeacherDetailsLocalService
 * @generated
 */
public class TeacherDetailsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.Students.Details.service.impl.TeacherDetailsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the teacher details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TeacherDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param teacherDetails the teacher details
	 * @return the teacher details that was added
	 */
	public static TeacherDetails addTeacherDetails(
		TeacherDetails teacherDetails) {

		return getService().addTeacherDetails(teacherDetails);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new teacher details with the primary key. Does not add the teacher details to the database.
	 *
	 * @param Teacher_Id the primary key for the new teacher details
	 * @return the new teacher details
	 */
	public static TeacherDetails createTeacherDetails(int Teacher_Id) {
		return getService().createTeacherDetails(Teacher_Id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the teacher details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TeacherDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details that was removed
	 * @throws PortalException if a teacher details with the primary key could not be found
	 */
	public static TeacherDetails deleteTeacherDetails(int Teacher_Id)
		throws PortalException {

		return getService().deleteTeacherDetails(Teacher_Id);
	}

	/**
	 * Deletes the teacher details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TeacherDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param teacherDetails the teacher details
	 * @return the teacher details that was removed
	 */
	public static TeacherDetails deleteTeacherDetails(
		TeacherDetails teacherDetails) {

		return getService().deleteTeacherDetails(teacherDetails);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static TeacherDetails fetchTeacherDetails(int Teacher_Id) {
		return getService().fetchTeacherDetails(Teacher_Id);
	}

	/**
	 * Returns the teacher details matching the UUID and group.
	 *
	 * @param uuid the teacher details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	public static TeacherDetails fetchTeacherDetailsByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchTeacherDetailsByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the teacher details with the primary key.
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details
	 * @throws PortalException if a teacher details with the primary key could not be found
	 */
	public static TeacherDetails getTeacherDetails(int Teacher_Id)
		throws PortalException {

		return getService().getTeacherDetails(Teacher_Id);
	}

	/**
	 * Returns the teacher details matching the UUID and group.
	 *
	 * @param uuid the teacher details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching teacher details
	 * @throws PortalException if a matching teacher details could not be found
	 */
	public static TeacherDetails getTeacherDetailsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getTeacherDetailsByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the teacher detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.TeacherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @return the range of teacher detailses
	 */
	public static List<TeacherDetails> getTeacherDetailses(int start, int end) {
		return getService().getTeacherDetailses(start, end);
	}

	/**
	 * Returns all the teacher detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the teacher detailses
	 * @param companyId the primary key of the company
	 * @return the matching teacher detailses, or an empty list if no matches were found
	 */
	public static List<TeacherDetails> getTeacherDetailsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getTeacherDetailsesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of teacher detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the teacher detailses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of teacher detailses
	 * @param end the upper bound of the range of teacher detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching teacher detailses, or an empty list if no matches were found
	 */
	public static List<TeacherDetails> getTeacherDetailsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TeacherDetails> orderByComparator) {

		return getService().getTeacherDetailsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of teacher detailses.
	 *
	 * @return the number of teacher detailses
	 */
	public static int getTeacherDetailsesCount() {
		return getService().getTeacherDetailsesCount();
	}

	/**
	 * Updates the teacher details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TeacherDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param teacherDetails the teacher details
	 * @return the teacher details that was updated
	 */
	public static TeacherDetails updateTeacherDetails(
		TeacherDetails teacherDetails) {

		return getService().updateTeacherDetails(teacherDetails);
	}

	public static TeacherDetailsLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<TeacherDetailsLocalService> _serviceSnapshot =
		new Snapshot<>(
			TeacherDetailsLocalServiceUtil.class,
			TeacherDetailsLocalService.class);

}