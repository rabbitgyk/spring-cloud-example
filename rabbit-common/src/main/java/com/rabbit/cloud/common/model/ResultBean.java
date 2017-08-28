package com.rabbit.cloud.common.model;

import java.io.Serializable;

public class ResultBean implements Serializable {
	private static final long serialVersionUID = 5806778739190976644L;
	private String code;
	private String msg;
	private int age;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
