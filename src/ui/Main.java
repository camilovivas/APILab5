/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package ui;
import model.*;
import java.util.Scanner;

public class Main{
	private Holding relacion;
	private Scanner reader;
	
	public Main(){
		init();
		reader = new Scanner (System.in);
		
	}
	public static void main(String [] args){
		Main m = new Main();
		
	}
	public void ShowMenu(){
		int option = 0;
		while(option =! 4){
			System.out.println("ingrese el numeor de la opcion que desea realizar");
			System.out.println("1. registrar un 
			System.out.println("2. 
			System.out.println("3. buscar extencion de un trabajador");
			System.out.println("4. ver los correos electronicos de los trabajadores de un cargo");
			
			
			
			option = reader,nextInt();
			switch(option){
			case :
		
		
			case :
		
		
			case :
		
		
			case :
			System.out.println("ingrse el nombre del trabajador");
			String name = reader.next();
			System.out.println("ingrese numero del metodo por el cual desea realizar la busqueda");
			System.out.println("1.busqueda en L");
			System.out.println("2.busqueda en Z");
			System.out.println("3.busqueda en X");
			System.out.println("4.busqueda en O");
			System.out.println("5.busqueda en E");
			int method = reader.nextInt();
		
			case :

		}
	
	}
	public void init()[
	
	
	}

}