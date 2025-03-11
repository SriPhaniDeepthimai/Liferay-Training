/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link Entity2LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Entity2LocalService
 * @generated
 */
public class Entity2LocalServiceWrapper
	implements Entity2LocalService, ServiceWrapper<Entity2LocalService> {

	public Entity2LocalServiceWrapper() {
		this(null);
	}

	public Entity2LocalServiceWrapper(Entity2LocalService entity2LocalService) {
		_entity2LocalService = entity2LocalService;
	}

	/**
	 * Adds the entity2 to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity2LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity2 the entity2
	 * @return the entity2 that was added
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity2 addEntity2(
		Practical_ServiceBuilder.model.Entity2 entity2) {

		return _entity2LocalService.addEntity2(entity2);
	}

	/**
	 * Creates a new entity2 with the primary key. Does not add the entity2 to the database.
	 *
	 * @param StudentId the primary key for the new entity2
	 * @return the new entity2
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity2 createEntity2(int StudentId) {
		return _entity2LocalService.createEntity2(StudentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity2LocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the entity2 from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity2LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity2 the entity2
	 * @return the entity2 that was removed
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity2 deleteEntity2(
		Practical_ServiceBuilder.model.Entity2 entity2) {

		return _entity2LocalService.deleteEntity2(entity2);
	}

	/**
	 * Deletes the entity2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity2LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param StudentId the primary key of the entity2
	 * @return the entity2 that was removed
	 * @throws PortalException if a entity2 with the primary key could not be found
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity2 deleteEntity2(int StudentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity2LocalService.deleteEntity2(StudentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity2LocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _entity2LocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _entity2LocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _entity2LocalService.dynamicQuery();
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

		return _entity2LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity2ModelImpl</code>.
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

		return _entity2LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity2ModelImpl</code>.
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

		return _entity2LocalService.dynamicQuery(
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

		return _entity2LocalService.dynamicQueryCount(dynamicQuery);
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

		return _entity2LocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public Practical_ServiceBuilder.model.Entity2 fetchEntity2(int StudentId) {
		return _entity2LocalService.fetchEntity2(StudentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _entity2LocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the entity2 with the primary key.
	 *
	 * @param StudentId the primary key of the entity2
	 * @return the entity2
	 * @throws PortalException if a entity2 with the primary key could not be found
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity2 getEntity2(int StudentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity2LocalService.getEntity2(StudentId);
	}

	/**
	 * Returns a range of all the entity2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity2s
	 * @param end the upper bound of the range of entity2s (not inclusive)
	 * @return the range of entity2s
	 */
	@Override
	public java.util.List<Practical_ServiceBuilder.model.Entity2> getEntity2s(
		int start, int end) {

		return _entity2LocalService.getEntity2s(start, end);
	}

	/**
	 * Returns the number of entity2s.
	 *
	 * @return the number of entity2s
	 */
	@Override
	public int getEntity2sCount() {
		return _entity2LocalService.getEntity2sCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _entity2LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _entity2LocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity2LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the entity2 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity2LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity2 the entity2
	 * @return the entity2 that was updated
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity2 updateEntity2(
		Practical_ServiceBuilder.model.Entity2 entity2) {

		return _entity2LocalService.updateEntity2(entity2);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _entity2LocalService.getBasePersistence();
	}

	@Override
	public Entity2LocalService getWrappedService() {
		return _entity2LocalService;
	}

	@Override
	public void setWrappedService(Entity2LocalService entity2LocalService) {
		_entity2LocalService = entity2LocalService;
	}

	private Entity2LocalService _entity2LocalService;

}