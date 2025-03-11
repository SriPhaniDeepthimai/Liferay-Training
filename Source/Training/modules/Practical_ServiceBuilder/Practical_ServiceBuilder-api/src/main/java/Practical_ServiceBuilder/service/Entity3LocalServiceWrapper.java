/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link Entity3LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Entity3LocalService
 * @generated
 */
public class Entity3LocalServiceWrapper
	implements Entity3LocalService, ServiceWrapper<Entity3LocalService> {

	public Entity3LocalServiceWrapper() {
		this(null);
	}

	public Entity3LocalServiceWrapper(Entity3LocalService entity3LocalService) {
		_entity3LocalService = entity3LocalService;
	}

	/**
	 * Adds the entity3 to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity3LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity3 the entity3
	 * @return the entity3 that was added
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity3 addEntity3(
		Practical_ServiceBuilder.model.Entity3 entity3) {

		return _entity3LocalService.addEntity3(entity3);
	}

	/**
	 * Creates a new entity3 with the primary key. Does not add the entity3 to the database.
	 *
	 * @param Teacher_Id the primary key for the new entity3
	 * @return the new entity3
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity3 createEntity3(
		int Teacher_Id) {

		return _entity3LocalService.createEntity3(Teacher_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity3LocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the entity3 from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity3LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity3 the entity3
	 * @return the entity3 that was removed
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity3 deleteEntity3(
		Practical_ServiceBuilder.model.Entity3 entity3) {

		return _entity3LocalService.deleteEntity3(entity3);
	}

	/**
	 * Deletes the entity3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity3LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Teacher_Id the primary key of the entity3
	 * @return the entity3 that was removed
	 * @throws PortalException if a entity3 with the primary key could not be found
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity3 deleteEntity3(int Teacher_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity3LocalService.deleteEntity3(Teacher_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity3LocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _entity3LocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _entity3LocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _entity3LocalService.dynamicQuery();
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

		return _entity3LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity3ModelImpl</code>.
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

		return _entity3LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity3ModelImpl</code>.
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

		return _entity3LocalService.dynamicQuery(
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

		return _entity3LocalService.dynamicQueryCount(dynamicQuery);
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

		return _entity3LocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public Practical_ServiceBuilder.model.Entity3 fetchEntity3(int Teacher_Id) {
		return _entity3LocalService.fetchEntity3(Teacher_Id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _entity3LocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the entity3 with the primary key.
	 *
	 * @param Teacher_Id the primary key of the entity3
	 * @return the entity3
	 * @throws PortalException if a entity3 with the primary key could not be found
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity3 getEntity3(int Teacher_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity3LocalService.getEntity3(Teacher_Id);
	}

	/**
	 * Returns a range of all the entity3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity3ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity3s
	 * @param end the upper bound of the range of entity3s (not inclusive)
	 * @return the range of entity3s
	 */
	@Override
	public java.util.List<Practical_ServiceBuilder.model.Entity3> getEntity3s(
		int start, int end) {

		return _entity3LocalService.getEntity3s(start, end);
	}

	/**
	 * Returns the number of entity3s.
	 *
	 * @return the number of entity3s
	 */
	@Override
	public int getEntity3sCount() {
		return _entity3LocalService.getEntity3sCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _entity3LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _entity3LocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity3LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the entity3 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity3LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity3 the entity3
	 * @return the entity3 that was updated
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity3 updateEntity3(
		Practical_ServiceBuilder.model.Entity3 entity3) {

		return _entity3LocalService.updateEntity3(entity3);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _entity3LocalService.getBasePersistence();
	}

	@Override
	public Entity3LocalService getWrappedService() {
		return _entity3LocalService;
	}

	@Override
	public void setWrappedService(Entity3LocalService entity3LocalService) {
		_entity3LocalService = entity3LocalService;
	}

	private Entity3LocalService _entity3LocalService;

}