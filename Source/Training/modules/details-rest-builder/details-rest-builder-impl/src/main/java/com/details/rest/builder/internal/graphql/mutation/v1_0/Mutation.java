package com.details.rest.builder.internal.graphql.mutation.v1_0;

import com.details.rest.builder.dto.v1_0.DetailsObject;
import com.details.rest.builder.resource.v1_0.DetailsObjectResource;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

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

	public static void setDetailsObjectResourceComponentServiceObjects(
		ComponentServiceObjects<DetailsObjectResource>
			detailsObjectResourceComponentServiceObjects) {

		_detailsObjectResourceComponentServiceObjects =
			detailsObjectResourceComponentServiceObjects;
	}

	@GraphQLField
	public DetailsObject createStudent(
			@GraphQLName("detailsObject") DetailsObject detailsObject)
		throws Exception {

		return _applyComponentServiceObjects(
			_detailsObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			detailsObjectResource -> detailsObjectResource.createStudent(
				detailsObject));
	}

	@GraphQLField
	public DetailsObject updateStudent(
			@GraphQLName("detailsObject") DetailsObject detailsObject)
		throws Exception {

		return _applyComponentServiceObjects(
			_detailsObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			detailsObjectResource -> detailsObjectResource.updateStudent(
				detailsObject));
	}

	@GraphQLField
	public DetailsObject deleteStudentByStudentId(
			@GraphQLName("studentId") Integer studentId)
		throws Exception {

		return _applyComponentServiceObjects(
			_detailsObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			detailsObjectResource ->
				detailsObjectResource.deleteStudentByStudentId(studentId));
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
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}