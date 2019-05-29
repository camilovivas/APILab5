package model;
import java.util.*;

public class ManufacturingCompany extends Company{
	
	private ArrayList<Product> products;
	
	public ManufacturingCompany(){
		super();
		products =  new ArrayList<Product>();
	}
	
}