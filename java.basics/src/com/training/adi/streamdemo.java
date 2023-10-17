package com.training.adi;

import java.util.*;

public class streamdemo {
	List<Integer> numbers =Arrays.asList(10,12,34,2211,11,234,34);
	Stream<Integer> numstream = numbers.Stream(x->x>15).map(n->n*n).for each(t->System.out.println(t));
	

}
