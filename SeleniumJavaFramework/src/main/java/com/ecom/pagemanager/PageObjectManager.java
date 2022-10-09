package com.ecom.pagemanager;

import com.ecom.base.SeleniumBase;
import com.ecom.pageobjects.HomePage;
import com.ecom.pageobjects.MobilePage;
import com.ecom.pageobjects.TvPage;


public class PageObjectManager  extends SeleniumBase {
	
	private HomePage hp;
	private MobilePage mp;
	private TvPage tp;
	
	public PageObjectManager() {
		super();                                          
	}

	public HomePage getInstanceHp() {
		if (hp==null) {
			 hp = new HomePage();                                        
		}
		
		return hp;
	}
	
	public MobilePage getInstanceMp() {
		if (mp==null) {
			 mp = new MobilePage();                                        
		}
		
		return mp;
	}
	
	public TvPage getInstanceTp() {
		if (tp==null) {
			 tp = new TvPage();                                        
		}
		
		return tp;
	}
	
	
}
