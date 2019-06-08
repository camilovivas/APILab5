/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 5 y 6 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date: 09/06/2019
*/
package model;
import java.util.*;

public abstract class ManufacturingCompany extends Company{
	
	private ArrayList<Product> products;
	
	public ManufacturingCompany(String nit, String address, String phone, int employees, double assets, String date, String nameLR, int type, String nameRegistry){
		super(nit, address, phone, employees, assets, date, nameLR, type, nameRegistry);
		products =  new ArrayList<Product>();
	}
	
	public  ArrayList<Product> getProducts(){
		return products;
	}
	
	public void addProduct(Product p){
		products.add(p);
	}
}