package com.factorypattern;

public class GetPanFactory {
	
	
// factory method here 
	public ElectricityBillPlan getBillPlan(String plan) {
		if (plan == null) {
			return null;
		}

		if (plan == "Domestic") {
			return new DomsticPlan();
		}
		if (plan == "commercial") {
			return new CommercialPlan();
		}
		if (plan == "Indutrial") {
			return new IndutrialPlan();
		}
		return null;

	}

}
