/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;
/**
*Description this class is of FoodManufacturing
*/
public class FoodManufacturing extends  ManufacturingCompany{
	public static char ROOM_TEMPERATURE = 'T';
	public static char REFRIGERATION = 'R';
	public static char FREEZER = 'F';
	private String importer;
	private String maker;
	private char conservation;
	
	/*
	*Description this is the build of class 
	*@param nit
	*@param address the address from LegalPersonality
	*@param phone the phone from LegalPersonality
	*@param employees the quantity of employees
	*@param assets the assets from company
	*@param date the date
	*@param nameLR the name of LegalPersonality
	*@param importer the Regulatory information given by the invima
	*@param maker the Regulatory information given by the invima
	*@param conservation the Regulatory information given by the invima
	*/
	public FoodManufacturing(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int type, String nameRegistry){
		super(nit, address, phone, employees, assets, date, nameLR, type, nameRegistry);
		this.importer = importer;
		this.maker = maker;
		this.conservation = conservation;
	}
	
	public void addProduct(Product p){
		super.addProduct(p);
	}
	
}