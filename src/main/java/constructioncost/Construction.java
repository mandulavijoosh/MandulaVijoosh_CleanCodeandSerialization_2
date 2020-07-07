package constructioncost;

import java.util.Scanner;

public class Construction {
	public void costofconstruct(int choice)
	{
		System.out.println("Enter area of plot");
		Scanner sc=new Scanner(System.in);
		long area=sc.nextInt();
		long cost=0;
		switch(choice)
		{
		case 1:cost=area*1200;
		break;
		case 2:cost=area*1500;
		break;
		case 3:cost=area*1800;
		break;
		case 4:cost=area*2500;
		break;
		default:System.out.println("invalid option");
		}
		System.out.println("ConstructionCost : "+cost+"INR");
		sc.close();
	}
	

}
