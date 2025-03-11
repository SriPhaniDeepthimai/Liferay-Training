/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.Students.Details.service.base;

import com.Students.Details.model.Department_Details;
import com.Students.Details.service.Department_DetailsLocalService;
import com.Students.Details.service.persistence.Department_DetailsPersistence;
import com.Students.Details.service.persistence.DetailsFinder;
import com.Students.Details.service.persistence.DetailsPersistence;
import com.Students.Details.service.persistence.Students_MarksPersistence;
import com.Students.Details.service.persistence.TeacherDetailsPersistence;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the department_ details local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.Students.Details.service.impl.Department_DetailsLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.Students.Details.service.impl.Department_DetailsLocalServiceImpl
 * @generated
 */
public abstract class Department_DetailsLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, Department_DetailsLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>Department_DetailsLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.Students.Details.service.Department_DetailsLocalServiceUtil</code>.
	 */

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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Department_Details addDepartment_Details(
		Department_Details department_Details) {

		department_Details.setNew(true);

		return department_DetailsPersistence.update(department_Details);
	}

	/**
	 * Creates a new department_ details with the primary key. Does not add the department_ details to the database.
	 *
	 * @param Department_Id the primary key for the new department_ details
	 * @return the new department_ details
	 */
	@Override
	@Transactional(enabled = false)
	public Department_Details createDepartment_Details(int Department_Id) {
		return department_DetailsPersistence.create(Department_Id);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Department_Details deleteDepartment_Details(int Department_Id)
		throws PortalException {

		return department_DetailsPersistence.remove(Department_Id);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Department_Details deleteDepartment_Details(
		Department_Details department_Details) {

		return department_DetailsPersistence.remove(department_Details);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return department_DetailsPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Department_Details.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return department_DetailsPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return department_DetailsPersistence.findWithDynamicQuery(
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return department_DetailsPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return department_DetailsPersistence.countWithDynamicQuery(
			dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return department_DetailsPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Department_Details fetchDepartment_Details(int Department_Id) {
		return department_DetailsPersistence.fetchByPrimaryKey(Department_Id);
	}

	/**
	 * Returns the department_ details matching the UUID and group.
	 *
	 * @param uuid the department_ details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching department_ details, or <code>null</code> if a matching department_ details could not be found
	 */
	@Override
	public Department_Details fetchDepartment_DetailsByUuidAndGroupId(
		String uuid, long groupId) {

		return department_DetailsPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the department_ details with the primary key.
	 *
	 * @param Department_Id the primary key of the department_ details
	 * @return the department_ details
	 * @throws PortalException if a department_ details with the primary key could not be found
	 */
	@Override
	public Department_Details getDepartment_Details(int Department_Id)
		throws PortalException {

		return department_DetailsPersistence.findByPrimaryKey(Department_Id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			department_DetailsLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Department_Details.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("Department_Id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			department_DetailsLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Department_Details.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"Department_Id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			department_DetailsLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Department_Details.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("Department_Id");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<Department_Details>() {

				@Override
				public void performAction(Department_Details department_Details)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, department_Details);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(Department_Details.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return department_DetailsPersistence.create(
			((Integer)primaryKeyObj).intValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement Department_DetailsLocalServiceImpl#deleteDepartment_Details(Department_Details) to avoid orphaned data");
		}

		return department_DetailsLocalService.deleteDepartment_Details(
			(Department_Details)persistedModel);
	}

	@Override
	public BasePersistence<Department_Details> getBasePersistence() {
		return department_DetailsPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return department_DetailsPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the department_ detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the department_ detailses
	 * @param companyId the primary key of the company
	 * @return the matching department_ detailses, or an empty list if no matches were found
	 */
	@Override
	public List<Department_Details> getDepartment_DetailsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return department_DetailsPersistence.findByUuid_C(uuid, companyId);
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
	public List<Department_Details> getDepartment_DetailsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Department_Details> orderByComparator) {

		return department_DetailsPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public Department_Details getDepartment_DetailsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return department_DetailsPersistence.findByUUID_G(uuid, groupId);
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
	public List<Department_Details> getDepartment_Detailses(
		int start, int end) {

		return department_DetailsPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of department_ detailses.
	 *
	 * @return the number of department_ detailses
	 */
	@Override
	public int getDepartment_DetailsesCount() {
		return department_DetailsPersistence.countAll();
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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Department_Details updateDepartment_Details(
		Department_Details department_Details) {

		return department_DetailsPersistence.update(department_Details);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			Department_DetailsLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		department_DetailsLocalService =
			(Department_DetailsLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return Department_DetailsLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Department_Details.class;
	}

	protected String getModelClassName() {
		return Department_Details.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				department_DetailsPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	protected Department_DetailsLocalService department_DetailsLocalService;

	@Reference
	protected Department_DetailsPersistence department_DetailsPersistence;

	@Reference
	protected DetailsPersistence detailsPersistence;

	@Reference
	protected DetailsFinder detailsFinder;

	@Reference
	protected Students_MarksPersistence students_MarksPersistence;

	@Reference
	protected TeacherDetailsPersistence teacherDetailsPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		Department_DetailsLocalServiceBaseImpl.class);

}