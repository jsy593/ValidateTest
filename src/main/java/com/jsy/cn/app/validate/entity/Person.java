package com.jsy.cn.app.validate.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.jsy.cn.app.validate.service.ValidateBirthday;

public class Person {
	
	@NotNull(message="name不能为空")
	private String name;
	
	@NotNull(message="address不能为空")
	private String address;
	
	@NotNull(message="birthday不能为空")
	@ValidateBirthday(message = "{values}不能为未来日期", values = "birthday")
	private Date birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
