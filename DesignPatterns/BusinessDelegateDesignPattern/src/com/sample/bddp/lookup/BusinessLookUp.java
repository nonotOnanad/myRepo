package com.sample.bddp.lookup;

import com.sample.bddp.inter.BusinessService;
import com.sample.bddp.inter.impl.EJBService;
import com.sample.bddp.inter.impl.JMSService;

public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType){
		if(serviceType.equalsIgnoreCase("EJB")){
			return new EJBService();
		}else{
			return new JMSService();
		}
	}
}
