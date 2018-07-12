package com.hackerrank.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CreateLocale {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int payment = in.nextInt();
				
		in.close();
		
		Locale indianLocale = new Locale("en","IN");
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat chaina = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat  india = NumberFormat.getCurrencyInstance(indianLocale);
		
		System.out.println("US: "+us.format(payment) + "\nChaina: "+chaina.format(payment)+
				"\nFrance: "+france.format(payment)+"\nIndia: "+india.format(payment));
		
	}

}
