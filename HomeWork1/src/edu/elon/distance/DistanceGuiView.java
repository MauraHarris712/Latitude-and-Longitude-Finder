/**
 * DistanceGuiView.java 1.0 Feb 19, 2019
 *
 * Copyright (c) 2019 Jazz Harris. All Rights Reserved
 * Campus Box 12302. Elon University, Elon, NC 27144
 */
package edu.elon.distance;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 * Prompts user for inputs and displays results to user
 * 
 * @author Jazz Harris and Kayla Randall
 * @version 1.0
 *
 */
public class DistanceGuiView {

  /**
   * Prompts the user to enter the Latitude for a city
   * 
   * @param aLocationName
   * @return result
   */

  public String getLatitude(String aLocationName) {
    String title = "Input Latitude";
    String message = "Enter Latitude for " + aLocationName;
    String result = JOptionPane.showInputDialog(null, message, title,
        JOptionPane.INFORMATION_MESSAGE);
    return result;
  }

  /**
   * Prompts the user to enter a city name
   * 
   * @return aLocationName
   */
  public String getLocationName() {
    String title = "Input Location Name";
    String message = "Enter Location Name:";
    String aLocationName = JOptionPane.showInputDialog(null, message, title,
        JOptionPane.INFORMATION_MESSAGE);
    return aLocationName;

  }

  /**
   * Prompts the user to enter the Longitude for a city
   * 
   * @param aLocationName
   * @return result
   */
  public String getLongitude(String aLocationName) {
    String title = "Input Longitude";
    String message = "Enter Longitude for: " + aLocationName;
    String result = JOptionPane.showInputDialog(null, message, title,
        JOptionPane.INFORMATION_MESSAGE);
    return result;

  }

  /**
   * Prompts the user to enter a number of locations
   * 
   * @return result
   */
  public String getNumberofLocations() {
    String title = "Input Number Of Locations";
    String message = "Enter number of locations to be entered:";
    String result = JOptionPane.showInputDialog(null, message, title,
        JOptionPane.INFORMATION_MESSAGE);
    return result;
  }

  /**
   * Displays all user input and the two cities with the farthest distance between
   * each other
   * 
   * @param finalMessage
   * @param total
   * @param c1
   * @param c2
   * 
   */
  public void showLocationInfo(String finalMessage, double total, String c1, String c2) {
    String title = "Location Information";
    String message = "Farthest distance is " + total + " from " + c1 + " to " + c2;
    UIManager.put("OptionPane.messageFont",
        new FontUIResource(new Font("Monospaced", Font.PLAIN, 12)));
    JOptionPane.showMessageDialog(null, finalMessage + message, title, JOptionPane.PLAIN_MESSAGE);

  }

}
