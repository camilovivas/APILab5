/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;

public class Cubicle{
	
	private String nameEmployee;
	private String position;
	private String email;
	private String extension;
	
	public Cubicle(String nameEmployee, String position, String email, String extension){
		this.nameEmployee = nameEmployee;
		this.position = position;
		this.email = email;
		this.extension = extension; 
		
	}
	
	public String getNameEmployee(){
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee){
		this.nameEmployee = nameEmployee;
	}
	
	public String getPosition(){
		return position;
	}
	public void setPosition(String position){
		this.position = position;
	}
	
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getExtension(){
		return extension;
	}
	public void setExtension(String extension){
		this.extension = extension; 
	}
	
}