package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		Map<String,String>parm=new HashMap();
		parm.put("from", from);
		parm.put("to", to);
		ResponseEntity<CurrencyConversionBean>res=new RestTemplate().getForEntity("http://localhost:8001/currency-exchange/from/{from}/to/{to}",CurrencyConversionBean.class,parm);
		CurrencyConversionBean response=res.getBody();
		response.setQuantity(quantity);
		response.setConverteValue(quantity.multiply(response.getConversionMultiple()));
		return response;
		
	}

}
