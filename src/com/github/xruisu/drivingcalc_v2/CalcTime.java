package com.github.xruisu.drivingcalc_v2;

public class CalcTime {
	public static void main(String[] args) {
		while (References.isCalculating) {
			if (References.isTrue) {
				System.out.println("Continue adding more values...");
				References.isTrue = false;
			} 
			calc();
			References.userInput = References.scanner.nextLine();
			if (!References.hasNextInt && References.userInput.equals("print")) {
				System.out.println("Report finished: " + References.getDate);
				System.out.println("Total Accumulated: " + References.Time + " Minutes! |" + " Time: " + 
						References.getHours + " Hours " + "& " + References.getMinutes + " Minutes | " + 
						"Simplified: " + (References.Time / 60) + " Hours");
				System.out.println("Log Completed! Please type: \"quit\".\" to exit the program!");
				References.isCalculating = false;
			} 
		} 
	}

	private static void calc() {
		if (References.isCalculating && (
				References.hasNextInt = true)) {
			int recievedInt = Integer.parseInt(References.userInput);
			int getValue = recievedInt;
			References.Time += getValue;
			if (References.Time > 60) {
				int getSplit = References.Time / 60;
				References.getHours = getSplit;
			} 
			if (getValue < 60) {
				References.getMinutes = getValue;
			} else if (References.getMinutes == References.getHours) {
				References.getMinutes = 0;
				References.getHours = getValue;
			} 
			References.hasNextInt = false;
		} 
		if (!References.hasNextInt) {
			References.hasNextInt = false;
		} else if (References.hasNextInt) {
			References.hasNextInt = true;
		} 
	}
}
