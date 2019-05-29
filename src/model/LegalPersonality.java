package model;

public class LegalPersonality{
	
	private String nit;
	private String address;
	private String phone;
	private int employees;
	private double assets;
	private int day;
	private int month;
	private int year;
	private String nameLR;
	
	public LegalPersonality(String nit, String address, String phone, int employees, double assets,  int day, int month, int year, String nameLR){
		
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		this.employees = employees;
		this.assets = assets;
		this.nameLR = nameLR;
		
	}
	public String date(){
		String msj = day+"/"+month+"/"+year;
		
		return msj;
	}
	
	
}