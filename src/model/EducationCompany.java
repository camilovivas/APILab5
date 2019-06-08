/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;

public class EducationCompany extends ServicesCompany implements Procultura{
	public final static char UNIVERSITY = 'u';
	public final static char HIGH_SCHOOL = 'h';

	private String regitryNumber;
	private String yearsAccreditation;
	private String positionSaber11;
	private String positionSaberPro;
	private String rectorName;
	private char educationSector;
	private int studentsStratum1and2;
	private int studentsActive;

	public EducationCompany(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int type, String nameRegistry){
		super(nit, address, phone, employees, assets, date, nameLR, type, nameRegistry);

	}

	/**
	*
	*
	*/
	public String percentProcultura(){
		
		double procultura = 20-(studentsStratum1and2/studentsActive)*100;
		String msj;
		if(procultura < 0){
			msj= "la empresa queda eximida de cobrar el procultura";
		}
		else{
			msj = "el valor a pagar de procultura es:"+procultura;
		}

		return msj;
	}
	
	public String percentProcultura2(){
		return " ";
	}
}