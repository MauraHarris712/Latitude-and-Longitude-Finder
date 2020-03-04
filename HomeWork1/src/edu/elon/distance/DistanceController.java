/**
 * DistanceController.java 1.0 Feb 19, 2019
 *
 * Copyright (c) 2019 Jazz Harris. All Rights Reserved
 * Campus Box 12302. Elon University, Elon, NC 27144
 */
package edu.elon.distance;

/**
 * Controls creation and interactions between View and Model objects.
 * 
 * @author Jazz Harris and Kayla Randall
 * @version 1.0
 *
 */
public class DistanceController {
  /**
   * initializes the Latitude to 0
   */
  public int aLatitude = 0;
  /**
   * initializes the Longitude to 0
   */
  public int aLongitude = 0;

  private DistanceGuiView gui;

  private DistanceModel model;

  /**
   * Creates instances of View and Model to allow methods to communicate
   */
  public DistanceController() {
    gui = new DistanceGuiView();
    model = new DistanceModel();
  }

  /**
   * Controls the prompting of user for values, asks model for total and
   * finalMessage and then asks view to display result.
   */
  public void go() {
    String result = gui.getNumberofLocations();
    model.getSize(result);
    int currentSize = 0;
    int value1 = Integer.parseInt(result);
    for (int i = 0; i < value1; i++) {
      String aLocationName = gui.getLocationName();
      String lat = gui.getLatitude(aLocationName);
      double lat2 = Double.parseDouble(lat);
      String lon = gui.getLongitude(aLocationName);
      double lon2 = Double.parseDouble(lon);
      model.add(aLocationName, lat2, lon2);
      ;
    }
    double total = model.calculateHaversineDistance();
    String City1 = model.farthestCity1;
    String City2 = model.farthestCity2;
    String finalMessage = model.getDisplay();
    gui.showLocationInfo(finalMessage, total, City1, City2);
  }
}
