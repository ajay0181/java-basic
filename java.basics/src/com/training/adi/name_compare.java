package com.training.adi;

import java.util.Comparator;

public class name_compare implements Comparator<employee>
 {

	@Override
	public int compare(employee o1, employee o2) {
		
		return o1.getEmpName().compareTo(o2.getEmpName());
	}



}
