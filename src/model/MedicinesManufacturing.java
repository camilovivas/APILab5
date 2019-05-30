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
	
	public MedicinesManufacturing(String nit, String address, String phone, int employees, double assets, int day, int month, int year, String nameLR, int type, String nameRegistry, String registrySanitarian, int statusRegistry, String expiring, char modality){
		super(nit, address, phone, employees, assets, day, month, year, nameLR, type, nameRegistry);
		this.registrySanitarian = registrySanitarian;
		this.statusRegistry = statusRegistry;
		this.expiring = expiring;
		this.modality = modality;
		
	}
	// METHODS
	// public waterXtree(){
		
		// de donde el agua?
}