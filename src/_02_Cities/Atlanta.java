package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		
		double save = (growthRate*2)*population;
		
		
		
		
		return save;
	}

}
