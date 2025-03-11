/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DetailsLocalService
 * @generated
 */
public class DetailsLocalServiceWrapper
	implements DetailsLocalService, ServiceWrapper<DetailsLocalService> {

	public DetailsLocalServiceWrapper() {
		this(null);
	}

	public DetailsLocalServiceWrapper(DetailsLocalService detailsLocalService) {
		_detailsLocalService = detailsLocalService;
	}

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
	@Override
	public com.Students.Details.model.Details addDetails(
		com.Students.Details.model.Details details) {

		return _detailsLocalService.addDetails(details);
	}

	/**
	 * Creates a new details with the primary key. Does not add the details to the database.
	 *
	 * @param Student_Id the primary key for the new details
	 * @return the new details
	 */
	@Override
	public com.Students.Details.model.Details createDetails(int Student_Id) {
		return _detailsLocalService.createDetails(Student_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailsLocalService.createPersistedModel(primaryKeyObj);
	}

	@Override
	public void createStudent(int stud_id, String name, int dep_Id) {
		_detailsLocalService.createStudent(stud_id, name, dep_Id);
	}

	@Override
	public void createStudents(
		int studentId, String studentName, int departmentId, long groupId,
		long companyId, long userId, String userName,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		_detailsLocalService.createStudents(
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
	@Override
	public com.Students.Details.model.Details deleteDetails(
		com.Students.Details.model.Details details) {

		return _detailsLocalService.deleteDetails(details);
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
	@Override
	public com.Students.Details.model.Details deleteDetails(int Student_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailsLocalService.deleteDetails(Student_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public void deleteStudent(int stud_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		_detailsLocalService.deleteStudent(stud_Id);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _detailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _detailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _detailsLocalService.dynamicQuery();
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

		return _detailsLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _detailsLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _detailsLocalService.dynamicQuery(
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

		return _detailsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _detailsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.Students.Details.model.Details fetchDetails(int Student_Id) {
		return _detailsLocalService.fetchDetails(Student_Id);
	}

	/**
	 * Returns the details matching the UUID and group.
	 *
	 * @param uuid the details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching details, or <code>null</code> if a matching details could not be found
	 */
	@Override
	public com.Students.Details.model.Details fetchDetailsByUuidAndGroupId(
		String uuid, long groupId) {

		return _detailsLocalService.fetchDetailsByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.Students.Details.model.Details finding(int id)
		throws com.Students.Details.exception.NoSuchDetailsException {

		return _detailsLocalService.finding(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _detailsLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the details with the primary key.
	 *
	 * @param Student_Id the primary key of the details
	 * @return the details
	 * @throws PortalException if a details with the primary key could not be found
	 */
	@Override
	public com.Students.Details.model.Details getDetails(int Student_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailsLocalService.getDetails(Student_Id);
	}

	/**
	 * Returns the details matching the UUID and group.
	 *
	 * @param uuid the details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching details
	 * @throws PortalException if a matching details could not be found
	 */
	@Override
	public com.Students.Details.model.Details getDetailsByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailsLocalService.getDetailsByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.Students.Details.model.Details> getDetailses(
		int start, int end) {

		return _detailsLocalService.getDetailses(start, end);
	}

	/**
	 * Returns all the detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the detailses
	 * @param companyId the primary key of the company
	 * @return the matching detailses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.Students.Details.model.Details>
		getDetailsesByUuidAndCompanyId(String uuid, long companyId) {

		return _detailsLocalService.getDetailsesByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.Students.Details.model.Details>
		getDetailsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.Students.Details.model.Details> orderByComparator) {

		return _detailsLocalService.getDetailsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of detailses.
	 *
	 * @return the number of detailses
	 */
	@Override
	public int getDetailsesCount() {
		return _detailsLocalService.getDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _detailsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _detailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _detailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailsLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<com.Students.Details.model.Details>
		getStudentsByDepartment(int Department_Id) {

		return _detailsLocalService.getStudentsByDepartment(Department_Id);
	}

	@Override
	public java.util.List<com.Students.Details.model.Details>
		getStudentsByDynamicQuery(int Department_Id) {

		return _detailsLocalService.getStudentsByDynamicQuery(Department_Id);
	}

	@Override
	public com.Students.Details.model.Details studDetails(int stud_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailsLocalService.studDetails(stud_Id);
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
	@Override
	public com.Students.Details.model.Details updateDetails(
		com.Students.Details.model.Details details) {

		return _detailsLocalService.updateDetails(details);
	}

	@Override
	public void updateStudent(int stud_Id, String name, int dep_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		_detailsLocalService.updateStudent(stud_Id, name, dep_Id);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _detailsLocalService.getBasePersistence();
	}

	@Override
	public DetailsLocalService getWrappedService() {
		return _detailsLocalService;
	}

	@Override
	public void setWrappedService(DetailsLocalService detailsLocalService) {
		_detailsLocalService = detailsLocalService;
	}

	private DetailsLocalService _detailsLocalService;

}