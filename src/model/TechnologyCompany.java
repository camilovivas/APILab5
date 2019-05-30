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
	
	public TechnologyCompany(String nit, String address, String phone, int employees, double assets, int day, int month, int year, String nameLR, int type, String nameRegistry){
		super(nit, address, phone, employees, assets, day, month, year, nameLR, type, nameRegistry);
		services = new ArrayList<Character>();
	}
	
}