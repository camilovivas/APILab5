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
		
		while(edifice = edifice[0].length*edifice[0].length){
			
			// movimiento columnas abajo 
			for(int i = 0; i<edifice[avanceColumnas].length-sumador; i++){
				// edifice[i][avanceColumnas]
				if(edifice[i][avanceColumnas].getPosition().equals(position)){
					msj+=edifice[i][avanceColumnas].getEmail();
				}
				int q = edifice[avanceColumnas].length-sumador;
				a = true;
			}
			// movimiento fila adelante
			if(a == true){
				for(int j = q; j<edifice[q].length-sumador; j++){
					if(edifice[q][j].getPosition().equals(position)){
						msj+=edifice[q][j].getEmail();
					}
					int r = edifice[q].length-sumador;
					b = true;
				}
			}
			// movimiento colummnas arriba
			if(b==true){
				for(int f = r; f>sumador; f--){
					if(edifice[f][r].getPosition().equals(position)){
						msj+=edifice[r][f].getEmail();
					}
					int s = sumador;
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
	
}