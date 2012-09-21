package com.training.airplane;


public class PriceComponentRyanAir implements PriceComponentServiceInterface {

	public String getPrice(String destination) {
		if (destination != null && "SFO".equalsIgnoreCase(destination.trim())) {
			return "1";
		} else if (destination != null && "BOS".equalsIgnoreCase(destination.trim())) {
			return "2";
		} else if (destination != null && "LAX".equalsIgnoreCase(destination.trim())) {
			return "3";
		} else {
			return "This destination is not available";
		}
		
	}
}
