/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service;

import com.Students.Details.model.Details;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Details. This utility wraps
 * <code>com.Students.Details.service.impl.DetailsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DetailsLocalService
 * @generated
 */
public class DetailsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.Students.Details.service.impl.DetailsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param details the details
	 * @return the details that was added
	 */
	public static Details addDetails(Details details) {
		return getService().addDetails(details);
	}

	/**
	 * Creates a new details with the primary key. Does not add the details to the database.
	 *
	 * @param Student_Id the primary key for the new details
	 * @return the new details
	 */
	public static Details createDetails(int Student_Id) {
		return getService().createDetails(Student_Id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void createStudent(int stud_id, String name, int dep_Id) {
		getService().createStudent(stud_id, name, dep_Id);
	}

	public static void createStudents(
		int studentId, String studentName, int departmentId, long groupId,
		long companyId, long userId, String userName,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		getService().createStudents(
			studentId, studentName, departmentId, groupId, companyId, userId,
			userName, serviceContext);
	}

	/**
	 * Deletes the details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param details the details
	 * @return the details that was removed
	 */
	public static Details deleteDetails(Details details) {
		return getService().deleteDetails(details);
	}

	/**
	 * Deletes the details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Student_Id the primary key of the details
	 * @return the details that was removed
	 * @throws PortalException if a details with the primary key could not be found
	 */
	public static Details deleteDetails(int Student_Id) throws PortalException {
		return getService().deleteDetails(Student_Id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static void deleteStudent(int stud_Id) throws PortalException {
		getService().deleteStudent(stud_Id);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.DetailsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.DetailsModelImpl</code>.
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

	public static Details fetchDetails(int Student_Id) {
		return getService().fetchDetails(Student_Id);
	}

	/**
	 * Returns the details matching the UUID and group.
	 *
	 * @param uuid the details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching details, or <code>null</code> if a matching details could not be found
	 */
	public static Details fetchDetailsByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchDetailsByUuidAndGroupId(uuid, groupId);
	}

	public static Details finding(int id)
		throws com.Students.Details.exception.NoSuchDetailsException {

		return getService().finding(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the details with the primary key.
	 *
	 * @param Student_Id the primary key of the details
	 * @return the details
	 * @throws PortalException if a details with the primary key could not be found
	 */
	public static Details getDetails(int Student_Id) throws PortalException {
		return getService().getDetails(Student_Id);
	}

	/**
	 * Returns the details matching the UUID and group.
	 *
	 * @param uuid the details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching details
	 * @throws PortalException if a matching details could not be found
	 */
	public static Details getDetailsByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getDetailsByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @return the range of detailses
	 */
	public static List<Details> getDetailses(int start, int end) {
		return getService().getDetailses(start, end);
	}

	/**
	 * Returns all the detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the detailses
	 * @param companyId the primary key of the company
	 * @return the matching detailses, or an empty list if no matches were found
	 */
	public static List<Details> getDetailsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getDetailsesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the detailses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of detailses
	 * @param end the upper bound of the range of detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching detailses, or an empty list if no matches were found
	 */
	public static List<Details> getDetailsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Details> orderByComparator) {

		return getService().getDetailsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of detailses.
	 *
	 * @return the number of detailses
	 */
	public static int getDetailsesCount() {
		return getService().getDetailsesCount();
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

	public static List<Details> getStudentsByDepartment(int Department_Id) {
		return getService().getStudentsByDepartment(Department_Id);
	}

	public static List<Details> getStudentsByDynamicQuery(int Department_Id) {
		return getService().getStudentsByDynamicQuery(Department_Id);
	}

	public static Details studDetails(int stud_Id) throws PortalException {
		return getService().studDetails(stud_Id);
	}

	/**
	 * Updates the details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param details the details
	 * @return the details that was updated
	 */
	public static Details updateDetails(Details details) {
		return getService().updateDetails(details);
	}

	public static void updateStudent(int stud_Id, String name, int dep_Id)
		throws PortalException {

		getService().updateStudent(stud_Id, name, dep_Id);
	}

	public static DetailsLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<DetailsLocalService> _serviceSnapshot =
		new Snapshot<>(
			DetailsLocalServiceUtil.class, DetailsLocalService.class);

}