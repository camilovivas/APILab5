package model;
import java.util.*;

public class ManufacturingCompany extends Company{
	
	private ArrayList<Product> products;
	
	public ManufacturingCompany(String nit, String address, String phone, int employees, double assets, int day, int month, int year, String nameLR, int type, String nameRegistry){
		super(nit, address, phone, employees, assets, day, month, year, nameLR, type, nameRegistry);
		products =  new ArrayList<Product>();
	}
	
	public  ArrayList<Product> getProducts(){
		return products;
	}
	
	public void addProduct(Product p){
		products.add(p);
	}
}