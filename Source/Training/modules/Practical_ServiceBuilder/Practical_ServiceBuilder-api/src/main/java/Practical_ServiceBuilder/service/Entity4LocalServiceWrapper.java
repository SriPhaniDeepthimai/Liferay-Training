/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link Entity4LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Entity4LocalService
 * @generated
 */
public class Entity4LocalServiceWrapper
	implements Entity4LocalService, ServiceWrapper<Entity4LocalService> {

	public Entity4LocalServiceWrapper() {
		this(null);
	}

	public Entity4LocalServiceWrapper(Entity4LocalService entity4LocalService) {
		_entity4LocalService = entity4LocalService;
	}

	/**
	 * Adds the entity4 to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity4LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity4 the entity4
	 * @return the entity4 that was added
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity4 addEntity4(
		Practical_ServiceBuilder.model.Entity4 entity4) {

		return _entity4LocalService.addEntity4(entity4);
	}

	/**
	 * Creates a new entity4 with the primary key. Does not add the entity4 to the database.
	 *
	 * @param Department_Id the primary key for the new entity4
	 * @return the new entity4
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity4 createEntity4(
		int Department_Id) {

		return _entity4LocalService.createEntity4(Department_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity4LocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the entity4 from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity4LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity4 the entity4
	 * @return the entity4 that was removed
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity4 deleteEntity4(
		Practical_ServiceBuilder.model.Entity4 entity4) {

		return _entity4LocalService.deleteEntity4(entity4);
	}

	/**
	 * Deletes the entity4 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity4LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Department_Id the primary key of the entity4
	 * @return the entity4 that was removed
	 * @throws PortalException if a entity4 with the primary key could not be found
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity4 deleteEntity4(
			int Department_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity4LocalService.deleteEntity4(Department_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity4LocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _entity4LocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _entity4LocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _entity4LocalService.dynamicQuery();
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

		return _entity4LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity4ModelImpl</code>.
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

		return _entity4LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity4ModelImpl</code>.
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

		return _entity4LocalService.dynamicQuery(
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

		return _entity4LocalService.dynamicQueryCount(dynamicQuery);
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

		return _entity4LocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public Practical_ServiceBuilder.model.Entity4 fetchEntity4(
		int Department_Id) {

		return _entity4LocalService.fetchEntity4(Department_Id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _entity4LocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the entity4 with the primary key.
	 *
	 * @param Department_Id the primary key of the entity4
	 * @return the entity4
	 * @throws PortalException if a entity4 with the primary key could not be found
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity4 getEntity4(int Department_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity4LocalService.getEntity4(Department_Id);
	}

	/**
	 * Returns a range of all the entity4s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity4ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity4s
	 * @param end the upper bound of the range of entity4s (not inclusive)
	 * @return the range of entity4s
	 */
	@Override
	public java.util.List<Practical_ServiceBuilder.model.Entity4> getEntity4s(
		int start, int end) {

		return _entity4LocalService.getEntity4s(start, end);
	}

	/**
	 * Returns the number of entity4s.
	 *
	 * @return the number of entity4s
	 */
	@Override
	public int getEntity4sCount() {
		return _entity4LocalService.getEntity4sCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _entity4LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _entity4LocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity4LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the entity4 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity4LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity4 the entity4
	 * @return the entity4 that was updated
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity4 updateEntity4(
		Practical_ServiceBuilder.model.Entity4 entity4) {

		return _entity4LocalService.updateEntity4(entity4);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _entity4LocalService.getBasePersistence();
	}

	@Override
	public Entity4LocalService getWrappedService() {
		return _entity4LocalService;
	}

	@Override
	public void setWrappedService(Entity4LocalService entity4LocalService) {
		_entity4LocalService = entity4LocalService;
	}

	private Entity4LocalService _entity4LocalService;

}