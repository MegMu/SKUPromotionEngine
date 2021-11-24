package com.example.promotionengine.service;

import com.example.promotionengine.model.RequestSKU;
import com.example.promotionengine.model.TotalResponse;

public interface CalculateTotalPriceService {
	
	TotalResponse CalculateTotalPrice(RequestSKU requestSKU);

}
