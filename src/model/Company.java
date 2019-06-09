/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;
import java.util.*;
/**
*Descriptioon this is the class of Company
*/

public  abstract class Company extends LegalPersonality{
	// CONSTANTES
	public static final int FARMING_HUNTING_FORESTRY_FISHING = 1;
	public static final int MINING_QUARRIES = 2;
	public static final int MANUFACTURING_INDUSTRY = 3;
	public static final int ELECTRICITY_GAS_STEAM = 4;
	public static final int BUILDING = 5;
	public static final int WHOLESALE_AND_RETAIL = 6;
	public static final int TRANSPORT_STORAGE_COMMUNICATION = 7;
	public static final int FINANCIAL_INSURANCE_IMMOVABLES_COMPANIES = 8;
	public static final int COMMUNAL_SOCIAL = 9;
	// ATRIBUTOS
	private String nameRegistry;
	private int type;

	/*
	*Description this is the build of class 
	*@param nit
	*@param address the address from LegalPersonality
	*@param phone the phone from LegalPersonality
	*@param employees the quantity of employees
	*@param assets the assets from company
	*@param date the date
	*@param nameLR the name of LegalPersonality
	*@param nameRegistry the nameRegistry
	*@param type the type of compnay
	*/
	public Company(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int type, String nameRegistry){
		super(nit, address, phone, employees, assets, date, nameLR);
		this.type = type;
		this.nameRegistry = nameRegistry;
		
	}
	
}