package model;

public class FoodManufacturing extends  ManufacturingCompany{
	public static char ROOM_TEMPERATURE = 'T';
	public static char REFRIGERATION = 'R';
	public static char FREEZER = 'F';
	private String importer;
	private String maker;
	private char conservation;
	

	public FoodManufacturing(String nit, String address, String phone, int employees, double assets, int day, int month, int year, String nameLR, int type, String nameRegistry){
		super(nit, address, phone, employees, assets, day, month, year, nameLR, type, nameRegistry);
		
		
	}
	
}