package com.studentobject.http.options.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import com.studentobject.http.options.dto.v1_0.StudentsObject;
import com.studentobject.http.options.resource.v1_0.StudentsObjectResource;

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
public class Mutation {

	public static void setStudentsObjectResourceComponentServiceObjects(
		ComponentServiceObjects<StudentsObjectResource>
			studentsObjectResourceComponentServiceObjects) {

		_studentsObjectResourceComponentServiceObjects =
			studentsObjectResourceComponentServiceObjects;
	}

	@GraphQLField
	public StudentsObject createStudentObject(
			@GraphQLName("studentsObject") StudentsObject studentsObject)
		throws Exception {

		return _applyComponentServiceObjects(
			_studentsObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			studentsObjectResource ->
				studentsObjectResource.createStudentObject(studentsObject));
	}

	@GraphQLField
	public StudentsObject updateStudent(
			@GraphQLName("studentsObject") StudentsObject studentsObject)
		throws Exception {

		return _applyComponentServiceObjects(
			_studentsObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			studentsObjectResource -> studentsObjectResource.updateStudent(
				studentsObject));
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

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
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
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}