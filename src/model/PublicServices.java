/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
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
	
	public PublicServices(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int type, String nameRegistry, char typeServices, int subscribers, int subscribersStratum1and2){
		super(nit, address, phone, employees, assets, date, nameLR, type, nameRegistry);
		this.typeServices = typeServices;
		this.subscribers = subscribers;
		this.subscribersStratum1and2 = subscribersStratum1and2;
	}
	
	public String percentProcultura2(){
		
		double procultura = 40-(subscribers/subscribersStratum1and2)*100;
		String msj;
		if(procultura < 0){
			msj= "la empresa queda eximida de cobrar el procultura";
		}
		else{
			msj = "el valor a pagar de procultura es:"+procultura;
		}

		return msj;
	}
	
	public String percentProcultura(){
		return " ";
	}

	
}