package com.epam.vijoosh.ConstructionCost;

public class CostCalculator {

	private int type;
    private double area;
    private double cost;
    public  CostCalculator(int type,double area) {
        this.type=type;
        this.area=area;
    }
    
    public void CalCost()
    {
    	switch(this.type)
    	{
    	case 1:this.cost=this.area*1200;
    	break;
    	case 2:this.cost=this.area*1500;
    	break;
    	case 3:this.cost=this.area*1800;
    	break;
    	case 4:this.cost=this.area*2500;
    	break;
    	default:System.out.println("invalid option");
    	}
        System.out.format("Total Price="+ this.cost);

    }

}


