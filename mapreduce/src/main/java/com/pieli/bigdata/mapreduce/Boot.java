package com.pieli.bigdata.mapreduce;

import java.util.Calendar;
import java.util.Date;

public class Boot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2008);
		c.set(Calendar.MONTH, 3);
		c.set(Calendar.DAY_OF_MONTH, 13);
		
		Date d = c.getTime();
		System.out.println(d);
		
		c.set(Calendar.YEAR, 2010);
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 14);
		
		Date d2 = c.getTime();
		System.out.println(d2);
		
		System.out.println((d2.getTime() - d.getTime())/ (1000 * 3600 * 24));
		
		c.set(Calendar.YEAR, 2010);
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 18);
		
		Date d3 = c.getTime();
		System.out.println(d3);
		
		c.set(Calendar.YEAR, 2011);
		c.set(Calendar.MONTH, 3);
		c.set(Calendar.DAY_OF_MONTH, 1);
		
		Date d4 = c.getTime();
		System.out.println(d4);
		
		System.out.println((d4.getTime() - d3.getTime())/ (1000 * 3600 * 24));
		
		
		c.set(Calendar.YEAR, 2011);
		c.set(Calendar.MONTH, 3);
		c.set(Calendar.DAY_OF_MONTH, 14);
		
		Date d5 = c.getTime();
		System.out.println(d5);
		
		c.set(Calendar.YEAR, 2013);
		c.set(Calendar.MONTH, 4);
		c.set(Calendar.DAY_OF_MONTH, 17);
		
		Date d6 = c.getTime();
		System.out.println(d6);
		
		System.out.println((d6.getTime() - d5.getTime())/ (1000 * 3600 * 24));
		
		System.out.println((641 + 438 + 764) * 1.0 /365);
		System.out.println((641 + 438 + 764) - 365 * 5);
		
		
	}

}
