package model;

public class PublicServices extends ServicesCompany implements Procultura{
	// CONSTANTES
	public static final char SEWERAGE= 'S';
	public static final char ENERGY = 'E';
	public static final char AQUEDUCT = 'A';
	// ATRIBUTO
	private char typeServices;
	private int subscribers;
	private int subscribersStratum1and2;
	
	public PublicServices(String nit, String address, String phone, int employees, double assets, int day, int month, int year, String nameLR, int type, String nameRegistry, char typeServices, int subscribers, int subscribersStratum1and2){
		super(nit, address, phone, employees, assets, day, month, year, nameLR, type, nameRegistry);
		this.typeServices = typeServices;
		this.subscribers = subscribers;
		this.subscribersStratum1and2 = subscribersStratum1and2;
	}
}