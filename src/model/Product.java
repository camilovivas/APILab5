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