package com.github.xruisu.drivingcalc_v2;

public class Main {
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the values on your log. When complete, type \"print\". Your results will be printed.");
		System.out.println("Please use whole numbers! Acceptable Values: 12, 15, 30, 60");
		
		while (References.isCalculating) 
		{
			CalcTime.main(args);
			TerminateProgram.kill(args);
		} 
	}
}
