/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;
import java.util.*;
/**
*Description this class is of ServicesCompany
*/
public abstract class ServicesCompany extends Company{
	private Arraylist <Poll> answers;
	
	/*
	*Description this is the build of class 
	*@param nit
	*@param address the address from LegalPersonality
	*@param phone the phone from LegalPersonality
	*@param employees the quantity of employees
	*@param assets the assets from company
	*@param date the date
	*@param nameLR the name of LegalPersonality
	*/
	public ServicesCompany(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int type, String nameRegistry){
		super(nit, address, phone, employees, assets, date, nameLR, type, nameRegistry);
		answers = new ArrayList<poll>();
	}
	
	public ArrayList<Poll> getAnswers(){
		return answers;
	}
	/**
	*Description nthis methos calculate the level of satisfaction
	*@return the level of satisfaction
	*/
	public String levelSatisfaction(){
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i =  0 ; i<50; i++){
			a+=answers.get(i).getServiceRendered();
			b+=answers.get(i).getResponseTime();
			c+=answers.get(i).getCostRelation();
		}
		double prom = (a+b+c)/50;
		double g = prom/3;
		String t = "el nivel de sarisfaccion es"+g;
		return t;
	}
}