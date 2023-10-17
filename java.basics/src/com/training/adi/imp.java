package com.training.adi;

public class imp  {

	public static void main(String[] args) {
//		String a = "122";
//		String b ="222";
		fun_interface obj = (x,y) ->  x.equals(y);
		String x="ABC";
		String y="ABC";
		System.out.println(obj.comp_string(x, y));
	}
	
}
