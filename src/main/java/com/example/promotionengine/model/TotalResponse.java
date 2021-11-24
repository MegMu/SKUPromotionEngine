package com.example.promotionengine.model;

import org.springframework.stereotype.Component;

@Component
public class TotalResponse {
	
	private Integer totalPrice;

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
