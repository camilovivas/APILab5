/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;
import java.util.*;
/**
*Description this class is of Holding
*/
public class Holding extends LegalPersonality{
	public static final int COLUMNAS = 20;
	private Cubicle [][] edifice;
	private int filas;
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
	public Holding(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int filas){
		super(nit, address, phone, employees, assets, date, nameLR);
		this.filas = filas;
		edifice = new Cubicle [filas][COLUMNAS];
	}
	
	public int getFilas(){
		return filas;
	}
	public void setFilas(int filas){
		this.filas = filas;
	}
	/**
	*Description this method search the email from employees of a position
	*@param position the position of employee
	*@return all emails
	*/
	public String spiral(String position){
		String msj=" ";
		int avanceColumnas = 0;
		int sumador= 0;
		int restador=1;
		boolean a= false;
		boolean b= false;
		boolean c= false;
		int q = edifice.length-sumador;
		int r = edifice[q].length-sumador;
		int s = sumador;
		int contador = 0;
		
		
		while(contador == filas*COLUMNAS){
			
			// movimiento columnas abajo 
			for(int i = 0; i<edifice.length-sumador; i++){
				contador++;
				if(edifice[i][avanceColumnas].getPosition().equals(position)){
					msj+=edifice[i][avanceColumnas].getEmail();
				}
				
				a = true;
			}
			// movimiento fila adelante
			if(a == true){
				for(int j = q; j<edifice[q].length-sumador; j++){
					contador++;
					if(edifice[q][j].getPosition().equals(position)){
						msj+=edifice[q][j].getEmail();
					}
					
					b = true;
				}
			}
			// movimiento colummnas arriba
			if(b==true){
				for(int f = r; f>sumador; f--){
					contador++;
					if(edifice[f][r].getPosition().equals(position)){
						msj+=edifice[r][f].getEmail();
					}
					c = true;
				}
			}
			// movimiento fila atras
			if(c== true){
				for(int k = edifice[sumador].length-1; k<restador; k--){
					contador++;
					if(edifice[s][k].getPosition().equals(position)){
						msj+=edifice[s][k].getEmail();
					}
				}
			}
			
			a= false;
			b= false;
			c= false;
			sumador++;
			restador++;
			avanceColumnas++;
		}
		return msj;
	}
	/**
	*Description this method search in L the extension from a employee 
	*@param name name of employee to find
	*@return the extension
	*/
	public String searchExtensionL(String name){
		String ext = "";
		boolean found = false;
		int a = edifice[0].length;
		for(int i = 0; i<edifice.length && !found; i++){
			if(edifice[i][0].getNameEmployee().equals(name)){
				ext += edifice[i][0].getExtension();
				found = true;
			}
			
		}
		for(int j = a; j<edifice[a].length && !found; j++){//como hacer que pase de un for a otro
			if(edifice[a][j].getNameEmployee().equals(name)){
				ext += edifice[a][j].getExtension();
				found = true;
			}
			
		}
		return ext;
	}
	/**
	*Description this method search in Z the extension from a employee 
	*@param name name of employee to find
	*@return the extension
	*/
	public String searchExtensioZ(String name){
		String ext= "";
		boolean found = false;
		int  r = edifice.length;
		int b = edifice[0].length;
		
		for(int i = 0; i<edifice[0].length && !found; i++){
			if(edifice[0][i].getNameEmployee().equals(name)){
				ext += edifice[0][i].getExtension();
				found = true;
			}
			
		}
		
		// recorre diagonal
		for(int j = 0; j<r++ && !found; j++){
			for(int k = b; k>0 ;k--){
					
				if(edifice[j][k].getNameEmployee().equals(name)){
					ext += edifice[j][k].getExtension();
					found = true;
				}
			}
		}
		
		for(int f = 0; f<edifice[r].length; f++){
			if(edifice[r][f].getNameEmployee().equals(name)){
				ext += edifice[r][f].getExtension();
				found = true;
			}
			
		}
		return ext;
	}
	/**
	*Description this method search in X the extension from a employee
	*@param name name of employee to find	
	*@return the extension
	*/
	public String searchExtensionX(String name){
		String ext = "";
		int b = edifice[0].length;
		int c =  edifice.length;
		// diagonal de paa atras
		if(filas == COLUMNAS){
			for(int i = 0; i<c++; i++){
				for(int j = b; j<0; j--){
					if(edifice[i][j].getNameEmployee().equals(name)){
						ext += edifice[i][j].getExtension();
					}
				}
			}
		
			// diagonal hacia adelante
			for(int k = 0; k<c++; k++){
				for(int h = 0; h<b; h++){
					if(edifice[k][h].getNameEmployee().equals(name)){
						ext += edifice[k][h].getExtension();
					}
				}
			}
		}
		else{
			ext = "no se puede realizar este metodo de busqueda";
		}
		return ext;
	}
	/**
	*Description this method search in O the extension from a employee 
	*@param name name of employee to find
	*@return the extension
	*/
	public String searchExtensionO(String name){
		String ext = "";
		int e =edifice[0].length;
		int d = edifice.length;
		for(int i = 0; i<e; i++){
			if(edifice[0][i].getNameEmployee().equals(name)){
				ext += edifice[0][i].getExtension();
			}
		}
		for(int r = 0; r<d; r++){
			if(edifice[r][e].getNameEmployee().equals(name)){
				ext +=edifice[r][e].getExtension();		
			}
		}
		for(int y = e; y < 0; y--){
			if(edifice[d][y].getNameEmployee().equals(name)){
				ext += edifice[d][y].getExtension();		
			}
		}
		for(int j = d; j< 0 ; j--){
			if(edifice[j][0].getNameEmployee().equals(name)){
				ext += edifice[j][0].getExtension();	
			}
		}
		return ext;
	}	
	/**
	*Description this method search in E the extension from a employee 
	*@param name name of employee to find
	*@return the extension
	*/
	public String searchExtensionE(String name){
		String ext = "";
		boolean change = false;
		boolean found = false;
		int h = edifice.length;
		int f = edifice[0].length;
		int fila = 0;
		
		if(filas%2 != 0){
			while(fila == filas){
				if(change == false){
					for(int i = 0; i<f && !found; i++){
						if(edifice[fila][i].getNameEmployee().equals(name)){
							ext += edifice[fila][i].getExtension();
							found = true;
						}
						else{
							if(i == f){
								change = true;
								fila++;
							}
						}
					}	
				}
				else{
					for(int j = f; j>0 && !found; j--){
						if(edifice[fila][j].getNameEmployee().equals(name)){
							ext += edifice[fila][j].getExtension();
							found = true;
						}
						else{
							if(j == 0){
								change = true;
								fila++;
							}
						}
					}	
				}
			}
		}
		else{
			ext += "no se puede realizar este metodo de busqueda";
		}
		
		return ext;
	}	
	
	/**
	*Description this method add the extencion to all Cubicles
	*post: has been add the extension to all Cubicles
	*/
	public void fillMatriz(){
		int ext = 1000;
		for(int i = 0; i<edifice.length; i++){
			for(int j = 0; j<edifice[0].length; j++){
				Cubicle c = new Cubicle(" "," "," ", ext+j);
				edifice[i][j] = c;
				ext += i*1000;
			}
		}
		
	}
	/**
	*Description this methos add the new employees to the firsh cubicle empty from edifice
	*@param nameEmployee the name of employee
	*@param position the position of employee
	*@param email the email of employee
	*post: has been add the employee 
	*/
	public void addEmployee(String nameEmployee, String position, String email){
		int extencion = 0;
		 
		for(int i = 0; i<edifice.length; i++){
			for(int j = 0; j<edifice[0].length; j++){
				if(edifice[i][j].getNameEmployee()== " "){
					extencion = edifice[i][j].getExtension();
					Cubicle n = new Cubicle(nameEmployee, position, email, extencion);
					edifice[i][j] = n;
				}	
			}	
		}	
	}
}