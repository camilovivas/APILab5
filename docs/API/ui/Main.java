		}
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
			System.out.println("1. registrar una empresa");
			System.out.println("2. ver todas las empresas");
			System.out.println("3. buscar extencion de un trabajador");
			System.out.println("4. ver los correos electronicos de los trabajadores de un cargo");
			System.out.println("5. agregar un nuevo trabajador");
			
			option = reader,nextInt();
			switch(option){
			case 1:
		
		
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
			
	
	}
	public void init()[
	
	
	}

}