package com.training.airplane;


public class PriceComponentSAS {

	public String getPrice(String destination) {
		if (destination != null && "SFO".equalsIgnoreCase(destination.trim())) {
			return "98329";
		} else if (destination != null && "BOS".equalsIgnoreCase(destination.trim())) {
			return "32322";
		} else if (destination != null && "LAX".equalsIgnoreCase(destination.trim())) {
			return "521211";
		} else {
			return "This destination is not available ";
		}
		
	}
}
