package com.example.promotionengine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.promotionengine.model.RequestSKU;
import com.example.promotionengine.model.TotalResponse;
import com.example.promotionengine.service.CalculateTotalPriceService;


@RestController
@RequestMapping("/promotionEngine/v1/calculateTotalPrice/")
public class promotionEngineController {
	
	private final CalculateTotalPriceService ctpService;

	@Autowired
	public promotionEngineController(CalculateTotalPriceService ctpService) {
		this.ctpService = ctpService;
	}
	
	
	@PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public TotalResponse CalculateTotalPrice(@RequestBody RequestSKU requestSKU) {

		return ctpService.CalculateTotalPrice(requestSKU);

	}
	
	

}
