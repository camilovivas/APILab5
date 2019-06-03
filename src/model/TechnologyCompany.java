package model;
import java.util.*;

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
	
	public TechnologyCompany(String nit, String address, String phone, int employees, double assets, int day, int month, int year, String nameLR, int type, String nameRegistry, double energy){
		super(nit, address, phone, employees, assets, day, month, year, nameLR, type, nameRegistry);
		services = new ArrayList<Character>();
		this.energy = energy;
	}
	
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
}