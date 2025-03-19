package com.studentobject.http.options.internal.graphql.query.v1_0;

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

import com.studentobject.http.options.dto.v1_0.StudentsObject;
import com.studentobject.http.options.resource.v1_0.StudentsObjectResource;

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

	public static void setStudentsObjectResourceComponentServiceObjects(
		ComponentServiceObjects<StudentsObjectResource>
			studentsObjectResourceComponentServiceObjects) {

		_studentsObjectResourceComponentServiceObjects =
			studentsObjectResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {studentObjects{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public StudentsObjectPage studentObjects() throws Exception {
		return _applyComponentServiceObjects(
			_studentsObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			studentsObjectResource -> new StudentsObjectPage(
				studentsObjectResource.getStudentObjects()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {deleteStudentObject(studentId: ___){studentId, studentName, departmentId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public StudentsObject deleteStudentObject(
			@GraphQLName("studentId") Integer studentId)
		throws Exception {

		return _applyComponentServiceObjects(
			_studentsObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			studentsObjectResource ->
				studentsObjectResource.deleteStudentObject(studentId));
	}

	@GraphQLName("StudentsObjectPage")
	public class StudentsObjectPage {

		public StudentsObjectPage(Page studentsObjectPage) {
			actions = studentsObjectPage.getActions();

			items = studentsObjectPage.getItems();
			lastPage = studentsObjectPage.getLastPage();
			page = studentsObjectPage.getPage();
			pageSize = studentsObjectPage.getPageSize();
			totalCount = studentsObjectPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<StudentsObject> items;

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
			StudentsObjectResource studentsObjectResource)
		throws Exception {

		studentsObjectResource.setContextAcceptLanguage(_acceptLanguage);
		studentsObjectResource.setContextCompany(_company);
		studentsObjectResource.setContextHttpServletRequest(
			_httpServletRequest);
		studentsObjectResource.setContextHttpServletResponse(
			_httpServletResponse);
		studentsObjectResource.setContextUriInfo(_uriInfo);
		studentsObjectResource.setContextUser(_user);
		studentsObjectResource.setGroupLocalService(_groupLocalService);
		studentsObjectResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<StudentsObjectResource>
		_studentsObjectResourceComponentServiceObjects;

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