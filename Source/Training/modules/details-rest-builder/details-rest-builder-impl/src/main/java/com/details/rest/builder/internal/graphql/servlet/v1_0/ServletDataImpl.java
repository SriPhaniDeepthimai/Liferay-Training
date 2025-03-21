package com.details.rest.builder.internal.graphql.servlet.v1_0;

import com.details.rest.builder.internal.graphql.mutation.v1_0.Mutation;
import com.details.rest.builder.internal.graphql.query.v1_0.Query;
import com.details.rest.builder.resource.v1_0.DetailsObjectResource;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

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
		Mutation.setDetailsObjectResourceComponentServiceObjects(
			_detailsObjectResourceComponentServiceObjects);

		Query.setDetailsObjectResourceComponentServiceObjects(
			_detailsObjectResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/details-rest-builder-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<DetailsObjectResource>
		_detailsObjectResourceComponentServiceObjects;

}