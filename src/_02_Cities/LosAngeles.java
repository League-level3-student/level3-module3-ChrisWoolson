package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		
		double save = population * growthRate;
		save *= growthRate/2;
		
		
		
		
		
		return save;
	}
	
}
