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
	
	
}