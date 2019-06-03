package model;
import java.util.*;

public class Holding extends LegalPersonality{
	public static final int FILAS = 7;
	public static final int COLUMNAS = 20;
	private Cubicle [][] edifice;
	
	public Holding(String nit, String address, String phone, int employees, double assets, int day, int month, int year, String nameLR){
		super(nit, address, phone, employees, assets, day, month, year, nameLR);
		edifice = new Cubicle [FILAS][COLUMNAS];
	}
	
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
		
		
		while(edifice == FILAS*COLUMNAS){
			
			// movimiento columnas abajo 
			for(int i = 0; i<edifice.length-sumador; i++){
				// edifice[i][avanceColumnas]
				if(edifice[i][avanceColumnas].getPosition().equals(position)){
					msj+=edifice[i][avanceColumnas].getEmail();
				}
				
				a = true;
			}
			// movimiento fila adelante
			if(a == true){
				for(int j = q; j<edifice[q].length-sumador; j++){
					if(edifice[q][j].getPosition().equals(position)){
						msj+=edifice[q][j].getEmail();
					}
					
					b = true;
				}
			}
			// movimiento colummnas arriba
			if(b==true){
				for(int f = r; f>sumador; f--){
					if(edifice[f][r].getPosition().equals(position)){
						msj+=edifice[r][f].getEmail();
					}
					c = true;
				}
			}
			// movimiento fila atras
			if(c== true){
				for(int k = edifice[sumador].length-1; k<restador; k--){
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
	
	public String SearchExtensionL(String name){
		String ext;
		boolean found = false;
		int a = edifice[0].length;
		for(int i = 0; i<edifice.length && !found; i++){
			if(edifice[i][0].getNameEmployee().equals(name)){
				ext = edifice[i][0].getExtension();
				found = true;
			}
			
		}
		for(int j = a; j<edifice[a].length && !found; j++){//como hacer que pase de un for a otro
			if(edifice[a][j].getNameEmployee().equals(name)){
				ext = edifice[a][j].getExtension();
				found = true;
			}
			
		}
		return ext;
	}
	
	public String SearchExtensioZ(String name){
		String ext;
		boolean found = false;
		int  r = edifice.length;
		int b = edifice[0].length;
		
		for(int i = 0; i<edifice[0].length && !found; i++){
			if(edifice[0][i].getNameEmployee().equals(name)){
				ext = edifice[0][i].getExtension();
				found = true;
			}
			
		}
		
		// recorre diagonal
		for(int j = 0; j<r++ && !found; j++){
			for(int k = b; k>0 ;k--){
					
				if(edifice[j][k].getNameEmployee().equals(name)){
					ext = edifice[j][k].getExtension();
					found = true;
				}
			}
		}
		
		for(int f = 0; f<edifice[r].length; f++){
			if(edifice[r][f].getNameEmployee().equals(name)){
				ext = edifice[r][f].getExtension();
				found = true;
			}
			
		}
		return ext;
	}
	
	public String SearchExtensionX(String name){
		String ext;
		int b = edifice[0].length;
		int c =  edifice.length;
		// diagonal de paa atras
		for(int i = 0; i<c++; i++){
			for(int j = b; j<0; j--){
				if(edifice[i][j].getNameEmployee().equals(name)){
					ext = edifice[i][j].getExtension();
				}
			}
		}
		// diagonal hacia adelante
		for(int k = 0; k<c++; k++){
			for(int h = 0; h<b; h++){
				if(edifice[k][h].getNameEmployee().equals(name)){
					ext = edifice[k][h].getExtension();
				}
			}
		}
		return ext;
	}
	// con el encontrado diferente ya no entra a los demas ciclos?
	public String SearchExtensionO(String name){
		String ext;
		int e =edifice[0].length;
		int d = edifice.length;
		for(int i = 0; i<e; i++){
			if(edifice[0][i].getNameEmployee().equals(name)){
				ext = edifice[0][i].getExtension();
			}
		}
		for(int r = 0; r<d; r++){
			if(edifice[r][e].getNameEmployee().equals(name)){
				ext =edifice[r][e].getExtension();		
			}
		}
		for(int y = e; y < 0; y--){
			if(edifice[d][y].getNameEmployee().equals(name)){
				ext = edifice[d][y].getExtension();		
			}
		}
		for(int j = d; j< 0 ; j--){
			if(edifice[j][0].getNameEmployee().equals(name)){
				ext = edifice[j][0].getExtension();	
			}
		}
		return ext;
	}	
	
	public String SearchExtensionE(String name){
		if(FILAS == COlUMNAS){
			
			
		}
		
		
	}	
}