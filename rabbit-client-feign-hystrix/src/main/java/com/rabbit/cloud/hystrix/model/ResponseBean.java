package com.rabbit.cloud.hystrix.model;

import java.io.Serializable;

public class ResponseBean implements Serializable{
	private static final long serialVersionUID = -6896690177461037728L;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
