package com.chen4du.chap18.demo2;

//引用类型
public class Prototype implements Cloneable{
	private String name;
	public Object clone() {
		try {
			return super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
