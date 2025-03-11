/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service;

import com.Students.Details.model.Students_Marks;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Students_Marks. This utility wraps
 * <code>com.Students.Details.service.impl.Students_MarksLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see Students_MarksLocalService
 * @generated
 */
public class Students_MarksLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.Students.Details.service.impl.Students_MarksLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the students_ marks to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Students_MarksLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param students_Marks the students_ marks
	 * @return the students_ marks that was added
	 */
	public static Students_Marks addStudents_Marks(
		Students_Marks students_Marks) {

		return getService().addStudents_Marks(students_Marks);
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
	 * Creates a new students_ marks with the primary key. Does not add the students_ marks to the database.
	 *
	 * @param Student_Id the primary key for the new students_ marks
	 * @return the new students_ marks
	 */
	public static Students_Marks createStudents_Marks(int Student_Id) {
		return getService().createStudents_Marks(Student_Id);
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
	 * Deletes the students_ marks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Students_MarksLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks that was removed
	 * @throws PortalException if a students_ marks with the primary key could not be found
	 */
	public static Students_Marks deleteStudents_Marks(int Student_Id)
		throws PortalException {

		return getService().deleteStudents_Marks(Student_Id);
	}

	/**
	 * Deletes the students_ marks from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Students_MarksLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param students_Marks the students_ marks
	 * @return the students_ marks that was removed
	 */
	public static Students_Marks deleteStudents_Marks(
		Students_Marks students_Marks) {

		return getService().deleteStudents_Marks(students_Marks);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.Students_MarksModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.Students_MarksModelImpl</code>.
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

	public static Students_Marks fetchStudents_Marks(int Student_Id) {
		return getService().fetchStudents_Marks(Student_Id);
	}

	/**
	 * Returns the students_ marks matching the UUID and group.
	 *
	 * @param uuid the students_ marks's UUID
	 * @param groupId the primary key of the group
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	public static Students_Marks fetchStudents_MarksByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchStudents_MarksByUuidAndGroupId(uuid, groupId);
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
	 * Returns the students_ marks with the primary key.
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks
	 * @throws PortalException if a students_ marks with the primary key could not be found
	 */
	public static Students_Marks getStudents_Marks(int Student_Id)
		throws PortalException {

		return getService().getStudents_Marks(Student_Id);
	}

	/**
	 * Returns the students_ marks matching the UUID and group.
	 *
	 * @param uuid the students_ marks's UUID
	 * @param groupId the primary key of the group
	 * @return the matching students_ marks
	 * @throws PortalException if a matching students_ marks could not be found
	 */
	public static Students_Marks getStudents_MarksByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getStudents_MarksByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the students_ markses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.Students_MarksModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students_ markses
	 * @param end the upper bound of the range of students_ markses (not inclusive)
	 * @return the range of students_ markses
	 */
	public static List<Students_Marks> getStudents_Markses(int start, int end) {
		return getService().getStudents_Markses(start, end);
	}

	/**
	 * Returns all the students_ markses matching the UUID and company.
	 *
	 * @param uuid the UUID of the students_ markses
	 * @param companyId the primary key of the company
	 * @return the matching students_ markses, or an empty list if no matches were found
	 */
	public static List<Students_Marks> getStudents_MarksesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getStudents_MarksesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of students_ markses matching the UUID and company.
	 *
	 * @param uuid the UUID of the students_ markses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of students_ markses
	 * @param end the upper bound of the range of students_ markses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching students_ markses, or an empty list if no matches were found
	 */
	public static List<Students_Marks> getStudents_MarksesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Students_Marks> orderByComparator) {

		return getService().getStudents_MarksesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of students_ markses.
	 *
	 * @return the number of students_ markses
	 */
	public static int getStudents_MarksesCount() {
		return getService().getStudents_MarksesCount();
	}

	/**
	 * Updates the students_ marks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Students_MarksLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param students_Marks the students_ marks
	 * @return the students_ marks that was updated
	 */
	public static Students_Marks updateStudents_Marks(
		Students_Marks students_Marks) {

		return getService().updateStudents_Marks(students_Marks);
	}

	public static Students_MarksLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<Students_MarksLocalService> _serviceSnapshot =
		new Snapshot<>(
			Students_MarksLocalServiceUtil.class,
			Students_MarksLocalService.class);

}