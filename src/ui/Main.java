
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
		while(option =! 7){
			System.out.println("ingrese el numeor de la opcion que desea realizar");
			System.out.println("1. registrar una empresa");
			System.out.println("2. ver todas las empresas");
			System.out.println("3. buscar extencion de un trabajador");
			System.out.println("4. ver los correos electronicos de los trabajadores de un cargo");
			System.out.println("5. agregar un nuevo trabajador");
			System.out.println("6. ingresar una encuesta a una empresa");
			System.out.println("7. salir");
			
			option = reader,nextInt();
			switch(option){
			case 1:
			System.out.println("ingrese el nit");
		
			case 2:
		
		
		
			case 3:
			System.out.println("ingrse el nombre del trabajador");
			String name = reader.next();
			System.out.println("ingrese numero del metodo por el cual desea realizar la busqueda");
			System.out.println("1.busqueda en L");
			System.out.println("2.busqueda en Z");
			System.out.println("3.busqueda en X");
			System.out.println("4.busqueda en O");
			System.out.println("5.busqueda en E");
			int method = reader.nextInt();
			switch(method){
				case 1:
				relacion.searchExtensionL(name)
				case 2:
				relacion.searchExtensionZ(name)
				case 3:
				relacion.searchExtensionX(name)
				case 4:
				relacion.searchExtensionO(name)
				case 5:
				relacion.searchExtensionE(name)
			}
		
			case 4:
			System.out.println("ingrese el cargo");
			String position = reader.next();
			
			System.out.println(relacion.spiral(position));
			System.out.println("
			
			case 5:
			System.out.println("ingrese el nombre del empleado");
			String employee = reader.next();			
			System.out.println("ingrese el cargo a ocupar");
			String position = reader.next();			
			System.out.println("ingrese el correo electronico");
			String email = reader.next();			
			relacion.addEmployee(employee, position, email);
			case 6:
			System.out.println("ingrese la empresa a la que le va a ingresar la encuesta");
			System.out.println("1. empresa de tecnologia");
			System.out.println("2. empresa de servicios publicos");
			System.out.println("3. empresa de educacion");
			int company = reader.nextInt();
			System.out.println("calificaion de 1  a 5 para servicios prestados");
			int question1 = reader.nextInt();
			System.out.println("calificaion de 1  a 5 para tiempo de respuesta");
			int question2 = reader.nextInt();
			System.out.println("calificaion de 1  a 5 para relacios costo");
			int question3 = reader.nextInt();
			Poll f = new Poll(question1, question2, question3);
			switch(company){
				case 1:
				
				case 2:
				
				case 3:
			}
			
	
	}
	public void init()[
		Poll a = new Poll(5,5,5);
		Poll b = new Poll(5,5,5);
		Poll c = new Poll(5,5,5);
		
		PublicServices  p = new PublicServices('E', 10, 5);
		p.AddPoll(a);
		p.AddPoll(b);
		p.AddPoll(c);
		
		Product e = new Product("dolex", "234", 35.6, 13);
		Product d = new Product("aspirina", "254", 3.6, 16);
		Product f = new Product("acetominofem", "236", 34.3, 19);
		
		MedicinesManufacturing m = new MedicinesManufacturing("2109", 1, "10",'S');
		m.addProduct(e);
		m.addProduct(d);
		m.addProduct(f);
	
	}

}