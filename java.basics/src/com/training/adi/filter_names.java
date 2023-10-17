package com.training.adi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class filter_names {
	public static void main(String[] args )
	{
		List<String> names =Arrays.asList("ajay","sara","sargam","seema","sahil");
		Stream<String> filterednames=names.stream();
		filterednames.filter(x->x.startsWith("s")).map(y->y+" rawat").sorted().forEach(t->System.out.println(t));
	
			
	}
}
