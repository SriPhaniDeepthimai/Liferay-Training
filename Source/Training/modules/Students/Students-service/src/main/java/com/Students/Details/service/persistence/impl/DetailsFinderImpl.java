package com.Students.Details.service.persistence.impl;

import com.Students.Details.model.Details;
import com.Students.Details.model.impl.DetailsImpl;

import com.Students.Details.service.persistence.DetailsFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
//import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = DetailsFinder.class)
public class DetailsFinderImpl extends DetailsFinderBaseImpl implements DetailsFinder {
	
	private static final Log _log = LogFactoryUtil.getLog(DetailsFinderImpl.class);
	
    public List<Details> findByDetails(int departmentId) {
    	
    	_log.info("First step");
    	Session session=null;
        
        
        	 session = openSession();
        	 
        	 _log.info("Second step");

            String sql = _customSQL.get(getClass(),"Query1");
            _log.info(sql);
            SQLQuery q = session.createSQLQuery(sql);
            q.setCacheable(false);
            q.addEntity("Details", DetailsImpl.class); // Fix: Correct entity name
            _log.info("After the Add Entity" );
            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(departmentId);
            List<Details> results;            
            results= (List<Details>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
            _log.info(results);
			/*
			 * List<Details> results = (List<Details>) QueryUtil.list(q, getDialect(),
			 * QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			 */

            return results; // Fix: Properly handling the result
        
    }

   

    @Reference
    private CustomSQL _customSQL;
}
