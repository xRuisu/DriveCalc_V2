package com.github.xruisu.drivingcalc_v2;

import java.util.Date;
import java.util.Scanner;

public class References {
	public static Scanner scanner = new Scanner(System.in);

	public static Date getDate = new Date();

	public static boolean isTerminated = false;

	public static String getResponse;

	public static String QUIT = "quit".toUpperCase();

	public static String PRINT = "print".toUpperCase();

	public static boolean isCalculating = true;

	public static boolean isTrue = true;

	public static boolean hasNextInt;

	public static int getHours;

	public static int getMinutes;

	public static int getSplit;

	public static int Time;

	public static String token;

	public static String userInput = scanner.nextLine();
}
