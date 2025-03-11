package PhasesExample.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import PhasesExample.constants.PhasesExamplePortletKeys;


@Component(
	    property = {
	    	"javax.portlet.name=" + PhasesExamplePortletKeys.PHASESEXAMPLE,
	        "mvc.command.name=/student-resource"
	    },
	    service = MVCResourceCommand.class
	)
public class StudentsMVCResource implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		return false;
	}

}
