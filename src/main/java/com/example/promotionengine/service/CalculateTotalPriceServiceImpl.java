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
		System.out.println(calculate.totalPriceofA(requestSKU.getSKUA()));
		System.out.println("TotalPrice : " + totalPrice);
		totalPrice = (requestSKU.getSKUB()!=null) ? (totalPrice + calculate.totalPriceofB(requestSKU.getSKUB())) : totalPrice;
		System.out.println(calculate.totalPriceofB(requestSKU.getSKUB()));
		System.out.println("TotalPrice : " + totalPrice);
		if((requestSKU.getSKUC()!=null && requestSKU.getSKUC()>0) && (requestSKU.getSKUD()!=null && requestSKU.getSKUD()>0)) {
			totalPrice = totalPrice + calculate.totalPriceofCD(requestSKU.getSKUC(), requestSKU.getSKUD());
			System.out.println("TotalPrice : " + totalPrice);
		}else if(requestSKU.getSKUC() != null) {
			totalPrice = totalPrice + calculate.totalPriceofC(requestSKU.getSKUC());
			System.out.println("TotalPrice : " + totalPrice);
		}else if (requestSKU.getSKUD() !=null) {
			totalPrice = totalPrice + calculate.totalPriceofD(requestSKU.getSKUD());
			System.out.println("TotalPrice : " + totalPrice);
		}
		
		totalResponse.setTotalPrice(totalPrice);
		
		return totalResponse;
		
	}

}
