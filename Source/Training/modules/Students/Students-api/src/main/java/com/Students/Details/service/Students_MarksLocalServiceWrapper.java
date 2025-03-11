/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link Students_MarksLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Students_MarksLocalService
 * @generated
 */
public class Students_MarksLocalServiceWrapper
	implements ServiceWrapper<Students_MarksLocalService>,
			   Students_MarksLocalService {

	public Students_MarksLocalServiceWrapper() {
		this(null);
	}

	public Students_MarksLocalServiceWrapper(
		Students_MarksLocalService students_MarksLocalService) {

		_students_MarksLocalService = students_MarksLocalService;
	}

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
	@Override
	public com.Students.Details.model.Students_Marks addStudents_Marks(
		com.Students.Details.model.Students_Marks students_Marks) {

		return _students_MarksLocalService.addStudents_Marks(students_Marks);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _students_MarksLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new students_ marks with the primary key. Does not add the students_ marks to the database.
	 *
	 * @param Student_Id the primary key for the new students_ marks
	 * @return the new students_ marks
	 */
	@Override
	public com.Students.Details.model.Students_Marks createStudents_Marks(
		int Student_Id) {

		return _students_MarksLocalService.createStudents_Marks(Student_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _students_MarksLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.Students.Details.model.Students_Marks deleteStudents_Marks(
			int Student_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _students_MarksLocalService.deleteStudents_Marks(Student_Id);
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
	@Override
	public com.Students.Details.model.Students_Marks deleteStudents_Marks(
		com.Students.Details.model.Students_Marks students_Marks) {

		return _students_MarksLocalService.deleteStudents_Marks(students_Marks);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _students_MarksLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _students_MarksLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _students_MarksLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _students_MarksLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _students_MarksLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _students_MarksLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _students_MarksLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _students_MarksLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.Students.Details.model.Students_Marks fetchStudents_Marks(
		int Student_Id) {

		return _students_MarksLocalService.fetchStudents_Marks(Student_Id);
	}

	/**
	 * Returns the students_ marks matching the UUID and group.
	 *
	 * @param uuid the students_ marks's UUID
	 * @param groupId the primary key of the group
	 * @return the matching students_ marks, or <code>null</code> if a matching students_ marks could not be found
	 */
	@Override
	public com.Students.Details.model.Students_Marks
		fetchStudents_MarksByUuidAndGroupId(String uuid, long groupId) {

		return _students_MarksLocalService.fetchStudents_MarksByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _students_MarksLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _students_MarksLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _students_MarksLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _students_MarksLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _students_MarksLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the students_ marks with the primary key.
	 *
	 * @param Student_Id the primary key of the students_ marks
	 * @return the students_ marks
	 * @throws PortalException if a students_ marks with the primary key could not be found
	 */
	@Override
	public com.Students.Details.model.Students_Marks getStudents_Marks(
			int Student_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _students_MarksLocalService.getStudents_Marks(Student_Id);
	}

	/**
	 * Returns the students_ marks matching the UUID and group.
	 *
	 * @param uuid the students_ marks's UUID
	 * @param groupId the primary key of the group
	 * @return the matching students_ marks
	 * @throws PortalException if a matching students_ marks could not be found
	 */
	@Override
	public com.Students.Details.model.Students_Marks
			getStudents_MarksByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _students_MarksLocalService.getStudents_MarksByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.Students.Details.model.Students_Marks>
		getStudents_Markses(int start, int end) {

		return _students_MarksLocalService.getStudents_Markses(start, end);
	}

	/**
	 * Returns all the students_ markses matching the UUID and company.
	 *
	 * @param uuid the UUID of the students_ markses
	 * @param companyId the primary key of the company
	 * @return the matching students_ markses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.Students.Details.model.Students_Marks>
		getStudents_MarksesByUuidAndCompanyId(String uuid, long companyId) {

		return _students_MarksLocalService.
			getStudents_MarksesByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.Students.Details.model.Students_Marks>
		getStudents_MarksesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.Students.Details.model.Students_Marks> orderByComparator) {

		return _students_MarksLocalService.
			getStudents_MarksesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of students_ markses.
	 *
	 * @return the number of students_ markses
	 */
	@Override
	public int getStudents_MarksesCount() {
		return _students_MarksLocalService.getStudents_MarksesCount();
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
	@Override
	public com.Students.Details.model.Students_Marks updateStudents_Marks(
		com.Students.Details.model.Students_Marks students_Marks) {

		return _students_MarksLocalService.updateStudents_Marks(students_Marks);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _students_MarksLocalService.getBasePersistence();
	}

	@Override
	public Students_MarksLocalService getWrappedService() {
		return _students_MarksLocalService;
	}

	@Override
	public void setWrappedService(
		Students_MarksLocalService students_MarksLocalService) {

		_students_MarksLocalService = students_MarksLocalService;
	}

	private Students_MarksLocalService _students_MarksLocalService;

}