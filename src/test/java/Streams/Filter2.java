package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter2 {
	int id;
	String Name;
	float price;
	


	public  Filter2(int id, String name, float price) {
	        this.id = id;
	        this.Name = name;
	        this.price = price;
	    }
	 
	 
	 public static void main(String[] args) {
		  List<Filter2> productsList = new ArrayList <Filter2>();
		    productsList.add(new Filter2(1, "HP Laptop", 25000f));
		    productsList.add(new Filter2(2, "Dell Laptop", 30000f));
		    productsList.add(new Filter2(3, "Lenevo Laptop", 28000f));
		    productsList.add(new Filter2(4, "Sony Laptop", 28000f));
		    productsList.add(new Filter2(5, "Apple Laptop", 90000f));

		  List<Filter2>newList =  productsList.stream().filter(s->s.price<35000f).collect(Collectors.toList());
		  newList.forEach(s->System.out.println(s.Name));
	 }
	 
}
