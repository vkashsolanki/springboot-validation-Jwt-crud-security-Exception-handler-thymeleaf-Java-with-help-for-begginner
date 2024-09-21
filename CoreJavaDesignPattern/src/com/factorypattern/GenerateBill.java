package com.factorypattern;

import java.util.Scanner;

public class GenerateBill {

	
	public static void main(String[] args) {
		
		
		GetPanFactory factory = new GetPanFactory();
		System.out.println("Enter the name of plan");	
		Scanner sc= new Scanner(System.in);
		String plan = sc.next();
		
		System.out.println("Enter the umber of Unit");	
		int unit = sc.nextInt();
		
		
		ElectricityBillPlan billPlan = factory.getBillPlan(plan);
		billPlan.getAmount();
		billPlan.calculatebill(unit);
	}
}
