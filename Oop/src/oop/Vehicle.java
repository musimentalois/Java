package oop;

public class Vehicle {
	public String name ="";
	public String color ="";
	public String model = "";
	public String company ="";
	
	public Vehicle() {		
}
	public Vehicle(String name,String color,String model,String company) {
	this.name = name;
	this.color =color;
	this.model=model;
	this.company=company;
	}
	public void setName(String name) {
		this.name =name;
	}

}
