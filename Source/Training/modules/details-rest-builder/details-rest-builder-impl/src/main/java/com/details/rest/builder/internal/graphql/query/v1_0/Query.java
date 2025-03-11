package com.details.rest.builder.internal.graphql.query.v1_0;

import com.details.rest.builder.dto.v1_0.DetailsObject;
import com.details.rest.builder.resource.v1_0.DetailsObjectResource;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author deepthimai.koppulu
 * @generated
 */
@Generated("")
public class Query {

	public static void setDetailsObjectResourceComponentServiceObjects(
		ComponentServiceObjects<DetailsObjectResource>
			detailsObjectResourceComponentServiceObjects) {

		_detailsObjectResourceComponentServiceObjects =
			detailsObjectResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {studentByDepartmentId(departmentId: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DetailsObjectPage studentByDepartmentId(
			@GraphQLName("departmentId") Integer departmentId)
		throws Exception {

		return _applyComponentServiceObjects(
			_detailsObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			detailsObjectResource -> new DetailsObjectPage(
				detailsObjectResource.getStudentByDepartmentId(departmentId)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {students(page: ___, pageSize: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DetailsObjectPage students(
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_detailsObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			detailsObjectResource -> new DetailsObjectPage(
				detailsObjectResource.getStudents(
					Pagination.of(page, pageSize))));
	}

	@GraphQLName("DetailsObjectPage")
	public class DetailsObjectPage {

		public DetailsObjectPage(Page detailsObjectPage) {
			actions = detailsObjectPage.getActions();

			items = detailsObjectPage.getItems();
			lastPage = detailsObjectPage.getLastPage();
			page = detailsObjectPage.getPage();
			pageSize = detailsObjectPage.getPageSize();
			totalCount = detailsObjectPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<DetailsObject> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(
			DetailsObjectResource detailsObjectResource)
		throws Exception {

		detailsObjectResource.setContextAcceptLanguage(_acceptLanguage);
		detailsObjectResource.setContextCompany(_company);
		detailsObjectResource.setContextHttpServletRequest(_httpServletRequest);
		detailsObjectResource.setContextHttpServletResponse(
			_httpServletResponse);
		detailsObjectResource.setContextUriInfo(_uriInfo);
		detailsObjectResource.setContextUser(_user);
		detailsObjectResource.setGroupLocalService(_groupLocalService);
		detailsObjectResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<DetailsObjectResource>
		_detailsObjectResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}