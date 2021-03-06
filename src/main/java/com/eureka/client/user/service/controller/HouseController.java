package com.eureka.client.user.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.user.service.bean.HouseInfo;

@RestController
public class HouseController {
	
	@GetMapping("/house/data")
	public HouseInfo getData(@RequestParam("name") String name) {
		return new HouseInfo( "上海", "虹口", "东体小区");
	}
	
	@GetMapping("/house/data/{name}")
	public String getData2(@PathVariable("name") String name) {
		return "8081:"+name;
	}
	
	@PostMapping("/house/save")
	public String addData(@RequestBody HouseInfo houseInfo) {
		System.out.println(houseInfo.getCity());
		return houseInfo.getCity();
	}
}
