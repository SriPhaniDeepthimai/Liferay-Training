/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TeacherDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TeacherDetailsLocalService
 * @generated
 */
public class TeacherDetailsLocalServiceWrapper
	implements ServiceWrapper<TeacherDetailsLocalService>,
			   TeacherDetailsLocalService {

	public TeacherDetailsLocalServiceWrapper() {
		this(null);
	}

	public TeacherDetailsLocalServiceWrapper(
		TeacherDetailsLocalService teacherDetailsLocalService) {

		_teacherDetailsLocalService = teacherDetailsLocalService;
	}

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
	@Override
	public com.Students.Details.model.TeacherDetails addTeacherDetails(
		com.Students.Details.model.TeacherDetails teacherDetails) {

		return _teacherDetailsLocalService.addTeacherDetails(teacherDetails);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _teacherDetailsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new teacher details with the primary key. Does not add the teacher details to the database.
	 *
	 * @param Teacher_Id the primary key for the new teacher details
	 * @return the new teacher details
	 */
	@Override
	public com.Students.Details.model.TeacherDetails createTeacherDetails(
		int Teacher_Id) {

		return _teacherDetailsLocalService.createTeacherDetails(Teacher_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _teacherDetailsLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.Students.Details.model.TeacherDetails deleteTeacherDetails(
			int Teacher_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _teacherDetailsLocalService.deleteTeacherDetails(Teacher_Id);
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
	@Override
	public com.Students.Details.model.TeacherDetails deleteTeacherDetails(
		com.Students.Details.model.TeacherDetails teacherDetails) {

		return _teacherDetailsLocalService.deleteTeacherDetails(teacherDetails);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _teacherDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _teacherDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _teacherDetailsLocalService.dynamicQuery();
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

		return _teacherDetailsLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _teacherDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _teacherDetailsLocalService.dynamicQuery(
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

		return _teacherDetailsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _teacherDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.Students.Details.model.TeacherDetails fetchTeacherDetails(
		int Teacher_Id) {

		return _teacherDetailsLocalService.fetchTeacherDetails(Teacher_Id);
	}

	/**
	 * Returns the teacher details matching the UUID and group.
	 *
	 * @param uuid the teacher details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching teacher details, or <code>null</code> if a matching teacher details could not be found
	 */
	@Override
	public com.Students.Details.model.TeacherDetails
		fetchTeacherDetailsByUuidAndGroupId(String uuid, long groupId) {

		return _teacherDetailsLocalService.fetchTeacherDetailsByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _teacherDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _teacherDetailsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _teacherDetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _teacherDetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _teacherDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the teacher details with the primary key.
	 *
	 * @param Teacher_Id the primary key of the teacher details
	 * @return the teacher details
	 * @throws PortalException if a teacher details with the primary key could not be found
	 */
	@Override
	public com.Students.Details.model.TeacherDetails getTeacherDetails(
			int Teacher_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _teacherDetailsLocalService.getTeacherDetails(Teacher_Id);
	}

	/**
	 * Returns the teacher details matching the UUID and group.
	 *
	 * @param uuid the teacher details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching teacher details
	 * @throws PortalException if a matching teacher details could not be found
	 */
	@Override
	public com.Students.Details.model.TeacherDetails
			getTeacherDetailsByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _teacherDetailsLocalService.getTeacherDetailsByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.Students.Details.model.TeacherDetails>
		getTeacherDetailses(int start, int end) {

		return _teacherDetailsLocalService.getTeacherDetailses(start, end);
	}

	/**
	 * Returns all the teacher detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the teacher detailses
	 * @param companyId the primary key of the company
	 * @return the matching teacher detailses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.Students.Details.model.TeacherDetails>
		getTeacherDetailsesByUuidAndCompanyId(String uuid, long companyId) {

		return _teacherDetailsLocalService.
			getTeacherDetailsesByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.Students.Details.model.TeacherDetails>
		getTeacherDetailsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.Students.Details.model.TeacherDetails> orderByComparator) {

		return _teacherDetailsLocalService.
			getTeacherDetailsesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of teacher detailses.
	 *
	 * @return the number of teacher detailses
	 */
	@Override
	public int getTeacherDetailsesCount() {
		return _teacherDetailsLocalService.getTeacherDetailsesCount();
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
	@Override
	public com.Students.Details.model.TeacherDetails updateTeacherDetails(
		com.Students.Details.model.TeacherDetails teacherDetails) {

		return _teacherDetailsLocalService.updateTeacherDetails(teacherDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _teacherDetailsLocalService.getBasePersistence();
	}

	@Override
	public TeacherDetailsLocalService getWrappedService() {
		return _teacherDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		TeacherDetailsLocalService teacherDetailsLocalService) {

		_teacherDetailsLocalService = teacherDetailsLocalService;
	}

	private TeacherDetailsLocalService _teacherDetailsLocalService;

}