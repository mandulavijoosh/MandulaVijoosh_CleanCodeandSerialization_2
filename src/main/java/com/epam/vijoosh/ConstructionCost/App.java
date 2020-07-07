package com.epam.vijoosh.ConstructionCost;

import java.util.Scanner;
import com.epam.vijoosh.ConstructionCost.CostCalculator;

public class App 
{
	static
    {
		System.out.format("Select your choice\n");
		System.out.format("1.standard materials  2.Above standard materials  3.High standard materials  4.High standard and fully Automated home");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.format("Enter Area");
		double area=sc.nextInt();
		CostCalculator costCalculator=new CostCalculator(choice,area);
		costCalculator.CalCost();
		sc.close();
    }

    public static void main( String[] args ){
    }
}



