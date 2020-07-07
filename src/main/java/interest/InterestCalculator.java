package interest;

import java.util.Scanner;

import interest.CompoundInterest;
import interest.SimpleInterest;

public class InterestCalculator {

	static
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.format("Enter principal amount");
	    int pa=sc.nextInt();
	    System.out.format("Enter rate of interest");
	    int roi=sc.nextInt();
	    System.out.format("Enter time period");
	    int tp=sc.nextInt();
	    System.out.format("Select option 1.Simple Interest  2.Compound Interest");
	    int type=sc.nextInt();
	    switch (type)
	    {
	        case 1:
	            SimpleInterest simpleInterest=new SimpleInterest(pa,roi,tp);
	            simpleInterest.calcSimpleInterest();
	            break;
	        case 2:
	            CompoundInterest compoundInterest=new CompoundInterest(pa,roi,tp);
	            compoundInterest.calcCompoundInterest();
	            break;
	        default:
	                System.out.format("wrong choice");
	                System.out.close();
	    }
	    sc.close();
	}
	public static void main(String[] args)
	{

	}

}
