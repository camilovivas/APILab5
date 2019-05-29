package model;
import java.util.*;

public class Company extends LegalPersonality{
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

	
	public Company(int type, String nameRegistry){
		super();
		this.type = type;
		this.nameRegistry = nameRegistry;
		
	}
	
}