package com.example.demo.model;

public class LimitConfiguration {
	
	private Integer maximum;
	private Integer minimum;
	private String enviroment;
	public LimitConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LimitConfiguration(Integer maximum, Integer minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
		//this.enviroment=enviroment;
	}
	public LimitConfiguration(Integer maximum, Integer minimum, String enviroment) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
		this.enviroment = enviroment;
	}
	public Integer getMaximum() {
		return maximum;
	}
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	public Integer getMinimum() {
		return minimum;
	}
	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}
	public String getEnviroment() {
		return enviroment;
	}
	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}
	

}
