package com.binde.spring;

import java.util.Iterator;
import java.util.Properties;

public class TestBean implements Test {
	@SuppressWarnings("unused")
	private Properties proper;
    
	public void setProper(Properties proper) {
		this.proper = proper;
	}

	public void display(){
    System.out.println(proper);
	}

}
