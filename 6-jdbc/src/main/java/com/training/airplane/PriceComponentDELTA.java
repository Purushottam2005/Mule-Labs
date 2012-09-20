package com.training.airplane;


public class PriceComponentDELTA {

	public String getPrice(String destination) {
		if (destination != null && "SFO".equalsIgnoreCase(destination.trim())) {
			return "8000";
		} else if (destination != null && "BOS".equalsIgnoreCase(destination.trim())) {
			return "4000";
		} else if (destination != null && "LAX".equalsIgnoreCase(destination.trim())) {
			return "5000";
		} else {
			return "This destination is not available";
		}
		
	}
}
