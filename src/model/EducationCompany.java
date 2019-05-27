package model;

public class EducationCompany extends ServicesCompany{
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
	
	public EducationCompany(){
		
		
	}
	
	/**
	*
	*
	*/
	public String percentProcultura(){
		double procultura = 20-  //porcentaje de studentsStratum1and2 
		
		if(procultura < 0){
			msj= "la empresa queda eximida de cobrar el procultura";
		}
		else{
			msj = "el valor a pagar de procultura es:"+procultura;
		}
		
		return msj;
	}
}