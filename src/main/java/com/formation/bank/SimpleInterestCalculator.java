package com.formation.bank;

public class SimpleInterestCalculator implements InterestCalculator{
	
	private double rate;

	@Override
	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double calculate(double amount, double year) {
		if(amount < 0 || year < 0) {
			throw new IllegalArgumentException("Le montant et la durée doivent être positif");
		}
		if(amount < 0 || year < 0) {
			throw new IllegalArgumentException("Le montant et la durée doivent être positif");
		}
		return amount * year * rate;
	}

	@Override
	public double devide(double num) {
		return num / 0.00;
	}

	@Override
	public void boucleInfini() {
		while(1<2) {
			System.out.println("boucle Infini");
		}
	}
}
