package interest;

import interest.Interest;

public class SimpleInterest extends Interest{

	public SimpleInterest(int principalAmount,int rateOfInterest,int timePeriod) {
		super(principalAmount,rateOfInterest,timePeriod);
	}
	public void calcSimpleInterest()
    {
        double amount=(principalAmount*rateOfInterest*timePeriod)/100;
        System.out.format("Simple Interest ="+ amount);
    }
}