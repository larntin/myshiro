package com.dengdongdong.myshiro.login.controller;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class LoginRespObj {
	
	public LoginRespObj () {
		
	}
	
	public LoginRespObj (String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	private String name;
	private String addr;
	private String phone;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
