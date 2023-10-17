package com.training.adi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class product {
	public int product_id;
	public String product_name;
	public String product_category;
	public int product_price;
	
	public product(int product_id,String product_name,String product_category,int product_price) {
		this.product_id= product_id;
		this.product_name = product_name;
		this.product_category = product_category;
		this.product_price = product_price;
		
		
		
	}
	
	
	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public int getProduct_price() {
		return product_price;
	}


	public String getProduct_category() {
		return product_category;
	}


	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}


	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}


	public static void main(String[] args) {
		List<product> mylist = new ArrayList<>();
		mylist.add(new  product(1,"car","vehicle",80000));
		mylist.add(new  product(2,"motorcycler","vehicle",5000));
		mylist.add(new  product(3,"scooter","vehicle",6000));
		mylist.add(new  product(4,"mobile","gadget",9000));
		mylist.add(new  product(5,"utensils","household",80000));
		Stream<product> myylist=mylist.stream();
		List<product> ans = myylist.filter(x->x.getProduct_price() >6000).filter(x->x.getProduct_category() =="vehicle").collect(Collectors.toList());
		ans.stream().distinct().forEach(t->System.out.println(t.getProduct_name()));
	}
	
	

	

}
