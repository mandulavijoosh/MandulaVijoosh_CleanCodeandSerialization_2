package cleancode_task;
import constructioncost.*;
import java.util.*;
public class ClientApp {
	public static void main(String args[]) 
	{
		System.out.println("Select your choice");
		System.out.println("1.standard materials  2.Above standard materials  3.High standard materials  4.High standard and fully Automated home");
		Scanner sc=new Scanner(System.in);
				int choice=sc.nextInt();
				Construction con=new Construction();
				con.costofconstruct(choice);
				sc.close();
	}
}
