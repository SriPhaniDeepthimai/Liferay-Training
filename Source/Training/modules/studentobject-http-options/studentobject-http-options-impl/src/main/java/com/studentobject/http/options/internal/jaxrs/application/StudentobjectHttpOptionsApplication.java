package com.studentobject.http.options.internal.jaxrs.application;

import javax.annotation.Generated;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author deepthimai.koppulu
 * @generated
 */
@Component(
	property = {
		"liferay.jackson=false",
		"osgi.jaxrs.application.base=/studentobject-http-options",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=StudentobjectHttpOptions"
	},
	service = Application.class
)
@Generated("")
public class StudentobjectHttpOptionsApplication extends Application {
}