package com.example.promotionengine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.promotionengine.model.RequestSKU;
import com.example.promotionengine.model.TotalResponse;
import com.example.promotionengine.util.promotionCalculationUtil;

@Service
public class CalculateTotalPriceServiceImpl implements CalculateTotalPriceService{
	
	@Autowired
	TotalResponse totalResponse;
	
	@Autowired
	promotionCalculationUtil calculate;
	
	@Override
	public TotalResponse CalculateTotalPrice(RequestSKU requestSKU) {
		
		Integer totalPrice = 0;
		
		totalPrice = (requestSKU.getSKUA()!=null) ? calculate.totalPriceofA(requestSKU.getSKUA()) : totalPrice;
		totalPrice = (requestSKU.getSKUB()!=null) ? totalPrice + calculate.totalPriceofB(requestSKU.getSKUB()) : totalPrice                ;
		if((requestSKU.getSKUC()!=null && requestSKU.getSKUC()>0) && (requestSKU.getSKUD()!=null && requestSKU.getSKUD()>0)) {
			totalPrice = totalPrice + calculate.totalPriceofCD(requestSKU.getSKUC(), requestSKU.getSKUD());
		}else if(requestSKU.getSKUC() != null) {
			totalPrice = totalPrice + calculate.totalPriceofC(requestSKU.getSKUC());
		}else if (requestSKU.getSKUD() !=null) {
			totalPrice = totalPrice + calculate.totalPriceofD(requestSKU.getSKUD());
		}
		
		totalResponse.setTotalPrice(totalPrice);
		
		return totalResponse;
		
	}

}
