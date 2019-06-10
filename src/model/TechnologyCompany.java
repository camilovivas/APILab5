/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;
import java.util.*;
/**
*Description this is the class of TechnologyCompany
*/
public class TechnologyCompany extends ServicesCompany implements ConsumptionXTree{
	// CONSTANTES
	public final static char CONSULTANCY = 'c';
	public final static char TRAINING = 't';
	public final static char SOFTWARE_DEVELOPMENT='d';
	public final static char INFRASTRUCTURE = 'i';
	public final static char SOFTWARE_SERVICE = 's';
	public final static char PLATFORM_SERVICE = 'p';
	// ATRIBUTOS
	private ArrayList<Character> services;
	private double energy;
	/**
	*Description this is the build of class 
	*@param nit
	*@param address the address from LegalPersonality
	*@param phone the phone from LegalPersonality
	*@param employees the quantity of employees
	*@param assets the assets from company
	*@param date the date
	*@param nameLR the name of LegalPersonality
	*@param type 
	*@param nameRegistry
	*@param energy the energy used
	*/
	public TechnologyCompany(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int type, String nameRegistry, double energy){
		super(nit, address, phone, employees, assets, date, nameLR, type, nameRegistry);
		services = new ArrayList<Character>();
		this.energy = energy;
	}
	/**
	*Description this method calculate the quantity of tree to plant
	*@return the quantity of tree to plant
	*/
	public int energyXtree(){
		int tree = 0;
		if(energy > 1 && energy< 1000){
			tree = 8;
		}
		else if(energy> 1001 && energy< 3000){
			tree = 35;
		}
		else{
			tree = 500;
		}
		return tree;
	}
	public int waterXtree(){
		return 0;
	}
	
	public String levelSatisfaction(){
		super.levelSatisfaction();
	}
	
}