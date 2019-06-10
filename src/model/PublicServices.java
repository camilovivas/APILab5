/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;
/**
*Decription this class is of PublicServices
*/
public class PublicServices extends ServicesCompany implements Procultura{
	// CONSTANTES
	public static final char SEWERAGE= 'S';
	public static final char ENERGY = 'E';
	public static final char AQUEDUCT = 'A';
	// ATRIBUTO
	private char typeServices;
	private int subscribers;
	private int subscribersStratum1and2;
	
	/*
	*Description this is the build of class PublicServices
	*@param nit
	*@param address the address from LegalPersonality
	*@param phone the phone from LegalPersonality
	*@param employees the quantity of employees
	*@param assets the assets from company
	*@param date the date
	*@param nameLR the name of LegalPersonality
	*@param nameRegistry the nameRegistry
	*@param type the type of compnay
	*@param typeServices the type of service taken
	*@param subscribersthe quantity of subscribers
	*@param subscribersStratum1and2 quantity of subscribers stratum 1 and 2
	*/
	public PublicServices(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int type, String nameRegistry, char typeServices, int subscribers, int subscribersStratum1and2){
		super(nit, address, phone, employees, assets, date, nameLR, type, nameRegistry);
		this.typeServices = typeServices;
		this.subscribers = subscribers;
		this.subscribersStratum1and2 = subscribersStratum1and2;
	}
	/**
	*Description this methos calculate the percent of procultura
	*@return percent of procultura
	*/
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
	public String levelSatisfaction(){
		super.levelSatisfaction();
	}
	public void AddPoll(Pool c){
		super.AddPoll(c);
	}
	
}