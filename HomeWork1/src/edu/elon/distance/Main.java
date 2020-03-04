/**
 * Main.java 1.0 Feb 19, 2019
 *
 * Copyright (c) 2019 Jazz Harris. All Rights Reserved
 * Campus Box 12302. Elon University, Elon, NC 27144
 */
package edu.elon.distance;

/**
 * Utility class to provide main method to start application.
 * 
 * @author Jazz Harris and Kayla Randall
 * @version 1.0
 *
 */
public class Main {
  /**
   * Driver method for JVM to call to start application.
   * 
   * @param args string array of command line arguments not used by this
   *             application.
   */
  public static void main(String[] args) {
    DistanceController controller = new DistanceController();
    controller.go();
    System.exit(0);
  }
}
