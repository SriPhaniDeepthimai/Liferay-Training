/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Practical_ServiceBuilder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link Entity1LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Entity1LocalService
 * @generated
 */
public class Entity1LocalServiceWrapper
	implements Entity1LocalService, ServiceWrapper<Entity1LocalService> {

	public Entity1LocalServiceWrapper() {
		this(null);
	}

	public Entity1LocalServiceWrapper(Entity1LocalService entity1LocalService) {
		_entity1LocalService = entity1LocalService;
	}

	/**
	 * Adds the entity1 to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity1 the entity1
	 * @return the entity1 that was added
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity1 addEntity1(
		Practical_ServiceBuilder.model.Entity1 entity1) {

		return _entity1LocalService.addEntity1(entity1);
	}

	/**
	 * Creates a new entity1 with the primary key. Does not add the entity1 to the database.
	 *
	 * @param Student_Id the primary key for the new entity1
	 * @return the new entity1
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity1 createEntity1(
		long Student_Id) {

		return _entity1LocalService.createEntity1(Student_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity1LocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the entity1 from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity1 the entity1
	 * @return the entity1 that was removed
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity1 deleteEntity1(
		Practical_ServiceBuilder.model.Entity1 entity1) {

		return _entity1LocalService.deleteEntity1(entity1);
	}

	/**
	 * Deletes the entity1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Student_Id the primary key of the entity1
	 * @return the entity1 that was removed
	 * @throws PortalException if a entity1 with the primary key could not be found
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity1 deleteEntity1(long Student_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity1LocalService.deleteEntity1(Student_Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity1LocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _entity1LocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _entity1LocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _entity1LocalService.dynamicQuery();
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

		return _entity1LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity1ModelImpl</code>.
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

		return _entity1LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity1ModelImpl</code>.
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

		return _entity1LocalService.dynamicQuery(
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

		return _entity1LocalService.dynamicQueryCount(dynamicQuery);
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

		return _entity1LocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public Practical_ServiceBuilder.model.Entity1 fetchEntity1(
		long Student_Id) {

		return _entity1LocalService.fetchEntity1(Student_Id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _entity1LocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the entity1 with the primary key.
	 *
	 * @param Student_Id the primary key of the entity1
	 * @return the entity1
	 * @throws PortalException if a entity1 with the primary key could not be found
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity1 getEntity1(long Student_Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity1LocalService.getEntity1(Student_Id);
	}

	/**
	 * Returns a range of all the entity1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Practical_ServiceBuilder.model.impl.Entity1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity1s
	 * @param end the upper bound of the range of entity1s (not inclusive)
	 * @return the range of entity1s
	 */
	@Override
	public java.util.List<Practical_ServiceBuilder.model.Entity1> getEntity1s(
		int start, int end) {

		return _entity1LocalService.getEntity1s(start, end);
	}

	/**
	 * Returns the number of entity1s.
	 *
	 * @return the number of entity1s
	 */
	@Override
	public int getEntity1sCount() {
		return _entity1LocalService.getEntity1sCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _entity1LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _entity1LocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entity1LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the entity1 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Entity1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entity1 the entity1
	 * @return the entity1 that was updated
	 */
	@Override
	public Practical_ServiceBuilder.model.Entity1 updateEntity1(
		Practical_ServiceBuilder.model.Entity1 entity1) {

		return _entity1LocalService.updateEntity1(entity1);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _entity1LocalService.getBasePersistence();
	}

	@Override
	public Entity1LocalService getWrappedService() {
		return _entity1LocalService;
	}

	@Override
	public void setWrappedService(Entity1LocalService entity1LocalService) {
		_entity1LocalService = entity1LocalService;
	}

	private Entity1LocalService _entity1LocalService;

}