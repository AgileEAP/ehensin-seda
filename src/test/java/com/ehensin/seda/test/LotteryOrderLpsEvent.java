/* @()LotteryOrderAcceptEvent.java
 *
 * (c) COPYRIGHT 2009-2013 Newcosoft INC. All rights reserved.
 * Newcosoft CONFIDENTIAL PROPRIETARY
 * Newcosoft Advanced Technology and Software Operations
 *
 * REVISION HISTORY:
 * Author             Date                   Brief Description
 * -----------------  ----------     ---------------------------------------
 * User            上午11:44:03                init version
 * 
 */
package com.ehensin.seda.test;

import com.ehensin.seda.StageEvent;
import com.ehensin.seda.spi.IEvent;


/** 
 * <pre>
 * CLASS:
 * Describe class, extends and implements relationships to other classes.
 * 
 * RESPONSIBILITIES:
 * High level list of things that the class does
 * -) 
 * 
 * COLABORATORS:
 * List of descriptions of relationships with other classes, i.e. uses, contains, creates, calls...
 * -) class   relationship
 * -) class   relationship
 * 
 * USAGE:
 * Description of typical usage of class.  Include code samples.
 * 
 * 
 **/
public class LotteryOrderLpsEvent extends StageEvent{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String order;
    
    
	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	@Override
	public Object getResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStageName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEvent copy(IEvent event) {
		// TODO Auto-generated method stub
		return null;
	}

}
