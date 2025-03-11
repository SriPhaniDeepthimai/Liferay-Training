/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link Department_DetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Department_DetailsLocalService
 * @generated
 */
public class Department_DetailsLocalServiceWrapper
	implements Department_DetailsLocalService,
			   ServiceWrapper<Department_DetailsLocalService> {

	public Department_DetailsLocalServiceWrapper() {
		this(null);
	}

	public Department_DetailsLocalServiceWrapper(
		Department_DetailsLocalService department_DetailsLocalService) {

		_department_DetailsLocalService = department_DetailsLocalService;
	}

	/**
	 * Adds the department_ details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Department_DetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param department_Details the department_ details
	 * @return the department_ details that was added
	 */
	@Override
	public com.Students.Details.model.Department_Details addDepartment_Details(
		com.Students.Details.model.Department_Details department_Details) {

		return _department_DetailsLocalService.addDepartment_Details(
			department_Details);
	}

	/**
	 * Creates a new department_ details with the primary key. Does not add the department_ details to the database.
	 *
	 * @param Department_Id the primary key for the new department_ details
	 * @return the new department_ details
	 */
	@Override
	public com.Students.Details.model.Department_Details
		createDepartment_Details(int Department_Id) {

		return _department_DetailsLocalService.createDepartment_Details(
			Department_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _department_DetailsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the department_ details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Department_DetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param department_Details the department_ details
	 * @return the department_ details that was removed
	 */
	@Override
	public com.Students.Details.model.Department_Details
		deleteDepartment_Details(
			com.Students.Details.model.Department_Details department_Details) {

		return _department_DetailsLocalService.deleteDepartment_Details(
			department_Details);
	}

	/**
	 * Deletes the department_ details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Department_DetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details that was removed
	 * @throws PortalException if a department_ details with the primary key could not be found
	 */
	@Override
	public com.Students.Details.model.Department_Details
			deleteDepartment_Details(int Department_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _department_DetailsLocalService.deleteDepartment_Details(
			Department_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _department_DetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _department_DetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _department_DetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _department_DetailsLocalService.dynamicQuery();
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

		return _department_DetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.Department_DetailsModelImpl</code>.
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

		return _department_DetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.Department_DetailsModelImpl</code>.
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

		return _department_DetailsLocalService.dynamicQuery(
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

		return _department_DetailsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _department_DetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.Students.Details.model.Department_Details
		fetchDepartment_Details(int Department_Id) {

		return _department_DetailsLocalService.fetchDepartment_Details(
			Department_Id);
	}

	/**
	 * Returns the department_ details matching the UUID and group.
	 *
	 * @param uuid the department_ details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	@Override
	public com.Students.Details.model.Department_Details
		fetchDepartment_DetailsByUuidAndGroupId(String uuid, long groupId) {

		return _department_DetailsLocalService.
			fetchDepartment_DetailsByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _department_DetailsLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the department_ details with the primary key.
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details
	 * @throws PortalException if a department_ details with the primary key could not be found
	 */
	@Override
	public com.Students.Details.model.Department_Details getDepartment_Details(
			int Department_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _department_DetailsLocalService.getDepartment_Details(
			Department_Id);
	}

	/**
	 * Returns the department_ details matching the UUID and group.
	 *
	 * @param uuid the department_ details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching department_ details
	 * @throws PortalException if a matching department_ details could not be found
	 */
	@Override
	public com.Students.Details.model.Department_Details
			getDepartment_DetailsByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _department_DetailsLocalService.
			getDepartment_DetailsByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the department_ detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Students.Details.model.impl.Department_DetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of department_ detailses
	 * @param end the upper bound of the range of department_ detailses (not inclusive)
	 * @return the range of department_ detailses
	 */
	@Override
	public java.util.List<com.Students.Details.model.Department_Details>
		getDepartment_Detailses(int start, int end) {

		return _department_DetailsLocalService.getDepartment_Detailses(
			start, end);
	}

	/**
	 * Returns all the department_ detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the department_ detailses
	 * @param companyId the primary key of the company
	 * @return the matching department_ detailses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.Students.Details.model.Department_Details>
		getDepartment_DetailsesByUuidAndCompanyId(String uuid, long companyId) {

		return _department_DetailsLocalService.
			getDepartment_DetailsesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of department_ detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the department_ detailses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of department_ detailses
	 * @param end the upper bound of the range of department_ detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching department_ detailses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.Students.Details.model.Department_Details>
		getDepartment_DetailsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.Students.Details.model.Department_Details>
					orderByComparator) {

		return _department_DetailsLocalService.
			getDepartment_DetailsesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of department_ detailses.
	 *
	 * @return the number of department_ detailses
	 */
	@Override
	public int getDepartment_DetailsesCount() {
		return _department_DetailsLocalService.getDepartment_DetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _department_DetailsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _department_DetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _department_DetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _department_DetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the department_ details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Department_DetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param department_Details the department_ details
	 * @return the department_ details that was updated
	 */
	@Override
	public com.Students.Details.model.Department_Details
		updateDepartment_Details(
			com.Students.Details.model.Department_Details department_Details) {

		return _department_DetailsLocalService.updateDepartment_Details(
			department_Details);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _department_DetailsLocalService.getBasePersistence();
	}

	@Override
	public Department_DetailsLocalService getWrappedService() {
		return _department_DetailsLocalService;
	}

	@Override
	public void setWrappedService(
		Department_DetailsLocalService department_DetailsLocalService) {

		_department_DetailsLocalService = department_DetailsLocalService;
	}

	private Department_DetailsLocalService _department_DetailsLocalService;

}