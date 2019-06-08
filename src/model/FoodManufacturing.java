/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;

public class FoodManufacturing extends  ManufacturingCompany{
	public static char ROOM_TEMPERATURE = 'T';
	public static char REFRIGERATION = 'R';
	public static char FREEZER = 'F';
	private String importer;
	private String maker;
	private char conservation;
	

	public FoodManufacturing(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int type, String nameRegistry){
		super(nit, address, phone, employees, assets, date, nameLR, type, nameRegistry);
		
		
	}
	
}