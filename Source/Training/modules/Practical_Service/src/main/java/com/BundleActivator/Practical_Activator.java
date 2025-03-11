package com.BundleActivator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import Practical_Api.api.Practical_Api;

public class Practical_Activator implements BundleActivator
{
     ServiceRegistration<Practical_Api> serviceRegist;
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		Practical_Api exampleService = name -> "Hello from Bundle Activator, " + name + "!";
        serviceRegist= context.registerService(Practical_Api.class, exampleService, null);
        System.out.println("Service registered via Bundle Activator.");
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		serviceRegist.unregister();
        System.out.println("Service  unregistered.");
		
	}

}
