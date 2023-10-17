package com.training.adi;
import java.util.*;
import java.util.function.Predicate;

public class string_match {
	public static void main(String[] args) {
		Predicate<String> p1= i->i=="helloi";
		System.out.println(p1.test("indiua"));
		
	}

}
