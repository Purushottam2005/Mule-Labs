package com.training.ops;

public class Sleep {
	
	public String sleep(String s) throws InterruptedException{
		Thread.sleep(5000);
		return s;
	}

}
