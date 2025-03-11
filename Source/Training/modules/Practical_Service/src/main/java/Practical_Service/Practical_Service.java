package Practical_Service;

import org.osgi.service.component.annotations.Component;

import Practical_Api.api.Practical_Api;

/**
 * @author deepthimai.koppulu
 */
@Component(
	property = {
		// TODO enter required service properties
	},
	service = Practical_Api.class
)
public class Practical_Service implements Practical_Api {

	// TODO enter required service methods
	public String printName(String name) {
		return "MY NAME is: "+name;
	}
	

}