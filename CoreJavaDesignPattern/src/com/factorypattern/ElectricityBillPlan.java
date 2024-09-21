package com.factorypattern;

public abstract class ElectricityBillPlan {
	
	double amount;
	
	
	 abstract void getAmount();
	 
	 public void calculatebill(int unit) {
		 System.out.println(unit*amount);
	 }
	
	
}
	
	class DomsticPlan extends ElectricityBillPlan{

		@Override
		 void getAmount() {
			
			double amount=6.5;
		}
		
	}
	
	
	class CommercialPlan extends ElectricityBillPlan{

		@Override
		 void getAmount() {
			double amount=10.5;
			
		}
		
		
	}
	
	
	class IndutrialPlan extends ElectricityBillPlan{

		@Override
		 void getAmount() {
			
			double amount=15.5;
		}
		
	}


