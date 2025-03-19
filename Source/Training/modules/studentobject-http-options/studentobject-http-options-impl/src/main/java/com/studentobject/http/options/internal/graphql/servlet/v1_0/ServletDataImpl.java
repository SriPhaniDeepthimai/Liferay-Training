package com.studentobject.http.options.internal.graphql.servlet.v1_0;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import com.studentobject.http.options.internal.graphql.mutation.v1_0.Mutation;
import com.studentobject.http.options.internal.graphql.query.v1_0.Query;
import com.studentobject.http.options.resource.v1_0.StudentsObjectResource;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author deepthimai.koppulu
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setStudentsObjectResourceComponentServiceObjects(
			_studentsObjectResourceComponentServiceObjects);

		Query.setStudentsObjectResourceComponentServiceObjects(
			_studentsObjectResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/studentobject-http-options-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<StudentsObjectResource>
		_studentsObjectResourceComponentServiceObjects;

}