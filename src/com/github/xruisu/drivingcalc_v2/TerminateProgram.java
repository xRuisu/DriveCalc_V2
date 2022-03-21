package com.github.xruisu.drivingcalc_v2;

public class TerminateProgram {
  public static void main(String[] args) {
    while (!References.isTerminated) {
      killProgram();
      if (References.isTerminated)
        break; 
    } 
  }
  
  public static void kill(String[] args) {
    while (!References.isTerminated) {
      if (References.isTrue) {
        System.out.println("Please type 'Quit' to terminate the program!");
        References.isTrue = false;
        References.token = References.scanner.nextLine();
      } 
      if (!References.isTerminated) {
        References.token = References.scanner.nextLine().toUpperCase();
        if (References.token.equals(References.QUIT)) {
          System.out.println("Please type QUIT again to confirm!");
          main(args);
          break;
        } 
        if (!References.token.equals(References.QUIT));
      } 
    } 
  }
  
  public static void killProgram() {
    boolean isWaiting = true;
    byte waitTime = 10;
    while (!References.isTerminated) {
      References.token = References.scanner.nextLine().toUpperCase();
      if (References.token.equals(References.QUIT) && isWaiting) {
        System.out.println("Terminating... ");
        isWaiting = false;
        waitTime = (byte)(waitTime - 5);
      } 
      if (!isWaiting && waitTime <= 5) {
        References.isTerminated = true;
        System.out.println("Program Terminated!");
        break;
      } 
      if (!References.token.equals(References.QUIT));
    } 
  }
}
