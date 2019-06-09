/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;

public class MedicinesManufacturing extends ManufacturingCompany implements ConsumptionXTree{
	// CONSTANTES
	public static final int VALID = 1;
	public static final int NOT_RENEWED = 2;
	public final static char MANUFACTURE_EXPORT = 'm';
	public final static char MANUFACTURE_SELL = 's';
	public final static char IMPORT_SELL = 'i';
	
	// ATRBUTOS
	private String registrySanitarian;
	private int statusRegistry;
	private String expiring;
	private char modality;
	
	/*
	*Description this is the build of class 
	*@param nit
	*@param address the address from LegalPersonality
	*@param phone the phone from LegalPersonality
	*@param employees the quantity of employees
	*@param assets the assets from company
	*@param date the date
	*@param nameLR the name of LegalPersonality
	*@param registrySanitarian the Regulatory information given by the invima
	*@param statusRegistry the Regulatory information given by the invima
	*@param expiring the Regulatory information given by the invima
	*@param modality the Regulatory information given by the invima
	*/
	public MedicinesManufacturing(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int type, String nameRegistry, String registrySanitarian, int statusRegistry, String expiring, char modality){
		super(nit, address, phone, employees, assets, date, nameLR, type, nameRegistry);
		this.registrySanitarian = registrySanitarian;
		this.statusRegistry = statusRegistry;
		this.expiring = expiring;
		this.modality = modality;
		
	}
	// METHODS
	/**
	*Description this method calculate the quantity of tree to plant
	*@return the quantity of tree to plant
	*/
	public int waterXtree(){
		double ltrs = 0;
		int tree = 0;
		for(int i = 0; i<getProducts().size(); i++){
			if(getProducts().get(i).getWater()>0){
				ltrs += getProducts().get(i).getWater();
			}
		}
		if(ltrs >1 && ltrs<140){
			tree = 6;
		}
		else if(ltrs>141 && ltrs< 800){
			tree = 25;
		}
		else{
			tree = 200;
		}
		return tree;
	}
	public int energyXtree(){
		return 0;
	}
}