package com.dengdongdong.myshiro.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping("/logintest")
	@ResponseBody
	public List<LoginRespObj> loginTest() {
		List<LoginRespObj> list = new ArrayList<LoginRespObj>();
		list.add(new LoginRespObj("ddd", "jyq", "10000"));
		return list;
	}
}
