package cleancode_task;
import simpleandcompoundinterest.*;
import java.io.*;
public class clientapplication {
	public static void main(String args[]) 
	{
		SIandCI si=new SIandCI();
		si.readsiandciparameters();
		si.simpleinterest();
		si.compoundinterest();
	}

}
