package interest;

import interest.Interest;

public class CompoundInterest extends Interest{

	public CompoundInterest(int principalAmount,int rateOfInterest,int timePeriod) {
		super(principalAmount,rateOfInterest,timePeriod);
	}
	public void calcCompoundInterest()
    {
        double amount=principalAmount*Math.pow((1+rateOfInterest/100.0),timePeriod);
        System.out.format("%s","Compound Interest="+ amount);
    }
}