//package com.expando.user;
//
//import com.liferay.expando.kernel.model.ExpandoColumn;
//import com.liferay.expando.kernel.model.ExpandoColumnConstants;
//import com.liferay.expando.kernel.model.ExpandoTable;
//import com.liferay.expando.kernel.service.ExpandoColumnLocalService;
//import com.liferay.expando.kernel.service.ExpandoTableLocalService;
//import com.liferay.expando.kernel.service.ExpandoValueLocalService;
//import com.liferay.headless.commerce.admin.account.dto.v1_0.User;
//import com.liferay.portal.kernel.events.ActionException;
//import com.liferay.portal.kernel.events.LifecycleAction;
//import com.liferay.portal.kernel.events.LifecycleEvent;
//import com.liferay.portal.kernel.log.Log;
//import com.liferay.portal.kernel.log.LogFactoryUtil;
//import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
//import com.liferay.portal.kernel.service.UserLocalService;
//
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.component.annotations.Reference;
//import org.osgi.service.log.LogService;
//
///**
// * @author deepthimai.koppulu
// */
//@Component(
//	property = {"key=application.startup.events"
//		// TODO enter required service properties
//	},
//	service = LifecycleAction.class
//)
//public class ExpandoUser implements LifecycleAction {
//
//	@Override
//	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
//		
//		_logger.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<CAME INSIDE THE EVENT METHOD>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//		
//		long companyId=CompanyThreadLocal.getCompanyId();
//		
//		try {
//			ExpandoTable expandoTable;
////			=_expandoTableLocalService.getDefaultTable(companyId,User.class.getName());
////			if(expandoTable==null) {
////				expandoTable=_expandoTableLocalService.addDefaultTable(companyId, User.class.getName());
////			}
//			
//			try {
//		        expandoTable = _expandoTableLocalService.getDefaultTable(companyId, User.class.getName());
//		    } catch (Exception e) {
//		        _logger.warn("ExpandoTable not found. Creating a new one.");
//		        expandoTable = _expandoTableLocalService.addDefaultTable(companyId, User.class.getName());
//		    }
//			
//			ExpandoColumn expandoColumn=_expandoColumnLocalService.getColumn(expandoTable.getTableId(), "Linked_In_Profile");
////			if(expandoColumn==null) {
////				_expandoColumnLocalService.addColumn(expandoTable.getTableId(), "Linked_In_Profile",ExpandoColumnConstants.STRING);
////			}
//	
//			 try {
//				 expandoColumn = _expandoColumnLocalService.getColumn(expandoTable.getTableId(), "Linked_In_Profile");
//			    } catch (Exception e) {
//			        _logger.warn("ExpandoColumn not found. Creating a new one.");
//			        expandoColumn = _expandoColumnLocalService.addColumn(expandoTable.getTableId(), "Linked_In_Profile", ExpandoColumnConstants.STRING);
//			    }
//
//		}
//		catch(Exception e){
//			_logger.error("Error while creating Expando fields", e);
//		}
//	}
//	@Reference
//	private ExpandoTableLocalService _expandoTableLocalService;
//	@Reference
//	private ExpandoColumnLocalService _expandoColumnLocalService;
//	@Reference
//	private ExpandoValueLocalService _expandoValueLocalService;
//	@Reference
//	private LogService _log;
//	@Reference
//	private UserLocalService _userLocalService;
//	@Reference
//	private static Log _logger=LogFactoryUtil.getLog(ExpandoUser.class);
//
//	
//
//}




package com.expando.user;

//import com.liferay.expando.kernel.model.ExpandoColumn;
import com.liferay.expando.kernel.model.ExpandoColumnConstants;
import com.liferay.expando.kernel.model.ExpandoTable;
import com.liferay.expando.kernel.service.ExpandoColumnLocalService;
import com.liferay.expando.kernel.service.ExpandoTableLocalService;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.model.User;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * ExpandoUser LifecycleAction for adding custom fields.
 */
@Component(
    property = "key=application.startup.events",
    service = LifecycleAction.class
)
public class ExpandoUser implements LifecycleAction {

    private static final Log _logger = LogFactoryUtil.getLog(ExpandoUser.class);

    @Override
    public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
        _logger.info("<<<<<<<<<<<< Inside ExpandoUser Lifecycle Event >>>>>>>>>>");

        long companyId = CompanyThreadLocal.getCompanyId();

        try {
            // Step 1: Get or Create ExpandoTable
            ExpandoTable expandoTable;
            try {
                expandoTable = _expandoTableLocalService.getDefaultTable(companyId, User.class.getName());
            } catch (Exception e) {
                _logger.warn("ExpandoTable not found. Creating a new one.");
                expandoTable = _expandoTableLocalService.addDefaultTable(companyId, User.class.getName());
            }

            // Step 2: Add ExpandoColumn (No need to check if it exists)
            _expandoColumnLocalService.addColumn(expandoTable.getTableId(), "Linked_In_Profile", ExpandoColumnConstants.STRING);

            _logger.info("Expando Table and Column setup complete.");

        } catch (Exception e) {
            _logger.error("Error while creating Expando fields", e);
        }
    }

    @Reference
    private ExpandoTableLocalService _expandoTableLocalService;

    @Reference
    private ExpandoColumnLocalService _expandoColumnLocalService;

    @Reference
    private UserLocalService _userLocalService;
}

