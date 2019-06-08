/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;

public class Product{
	
	private String name;
	private String code;
	private double water;
	private int units;
	
	public Product(String name, String code, double water, int units){
		this.name = name;
		this.code = code;
		this.water = water;
		this.units = units;
		
		
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getCode(){
		return code;
	}
	public void setCode(String code){
		this.code = code;
	}
	
	public double getWater(){
		return water;
	}
	public void setWater(double water){
		this.water = water;
	}
	
	public int getUnits(){
		return units;
	}
	public void setUnits(int units){
		this.units = units;
	}
}