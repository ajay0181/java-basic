package com.training.adi;

import java.util.Comparator;

public class id_compare implements Comparator<employee> {

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmpId()>o2.getEmpId()) return 1;
		if(o1.getEmpId()<o2.getEmpId()) return -1;
		else return 0;



	}

	

}
