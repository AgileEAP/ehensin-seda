/*
 * Copyright 2013 The Ehensin SEDA Project
 *
 * The Ehensin SEDA Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ehensin.seda;

import java.util.concurrent.atomic.AtomicInteger;

import com.ehensin.seda.spi.IEvent;
/**
 * 
 * 
 * */
public abstract class StageEvent implements IEvent{
	static AtomicInteger ID_SEQ = new AtomicInteger(0);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    public StageEvent(){
    	int value = ID_SEQ.incrementAndGet();
    	if( value == Integer.MAX_VALUE )
    		ID_SEQ.set(0);    	    		
    	id = value;
    }
    public int getId(){
    	return id;
    }

    public abstract String getStageName();

    public abstract Object getResult();
}
