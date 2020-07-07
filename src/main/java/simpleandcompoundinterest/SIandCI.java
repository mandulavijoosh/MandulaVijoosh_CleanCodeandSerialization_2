package simpleandcompoundinterest;
import java.util.Scanner;

public class SIandCI{
	int principleamount,timeperiod,rateofinterest;
public void readsiandciparameters()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter principleamount");
	principleamount=sc.nextInt();
	System.out.println("Enter timeperiod");
	timeperiod=sc.nextInt();
	System.out.println("enter rate of interest");
	rateofinterest=sc.nextInt();
	sc.close();
}
public void simpleinterest()
{
	float si=(principleamount*timeperiod*rateofinterest);
	si=si/100;
	System.out.println("simple interest : "+si);
}
public void compoundinterest( )
{ 
 float ci=principleamount*(float)Math.pow((1+rateofinterest*0.01),timeperiod)-principleamount;
 
 System.out.println("compound interest : "+ci);
}

}