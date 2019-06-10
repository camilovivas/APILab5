/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;
/**
*Description this class is of EducationCompany
*/

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
	/*
	*Description this is the build of class EducationCompany
	*@param nit 
	*@param address the address from LegalPersonality
	*@param phone the phone from LegalPersonality
	*@param employees the quantity of employees
	*@param assets the assets from company
	*@param date the date
	*@param nameLR the name of LegalPersonality
	*@param nameRegistry the nameRegistry
	*@param type the type of compnay
	*@param regitryNumber the nummer of registry 
	*@param yearsAccreditation the years of acreditation
	*@param positionSaber11 the position Saber 11
	*@param positionSaberPro the position saber pro
	*@param rectorName the rector name
	*@param educationSector type of education company
	*@param studentsStratum1and2 quantity of students stratum 1 and 2
	*@param studentsActive quantity of students
	*/
	public EducationCompany(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int type, String nameRegistry, String regitryNumber, String yearsAccreditation, String positionSaber11, String positionSaberPro, String rectorName, char educationSector, int studentsStratum1and2, int studentsActive){
		super(nit, address, phone, employees, assets, date, nameLR, type, nameRegistry);
		this.regitryNumber = regitryNumber;
		this.yearsAccreditation = yearsAccreditation;
		this.positionSaber11 = positionSaber11;
		this.positionSaberPro = positionSaberPro;
		this.rectorName = rectorName;
		this.educationSector = educationSector;
		this.studentsStratum1and2 = studentsStratum1and2;
		this.studentsActive = studentsActive;

	}

	/**
	*Description this methos calculate the percent of procultura
	*@return percent of procultura
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
	
	public String levelSatisfaction(){
		super.levelSatisfaction();
	}
}