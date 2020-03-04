/**
 * DistanceModel.java 1.0 Feb 19, 2019
 *
 * Copyright (c) 2019 Jazz Harris. All Rights Reserved
 * Campus Box 12302. Elon University, Elon, NC 27144
 */
package edu.elon.distance;

/**
 * Stores and array of numbers and provides methods to add to the array and to
 * calculate its alternating sum.
 * 
 * @author Jazz Harris and Kayla Randall
 * @version 1.0
 *
 */
public class DistanceModel {
  public String closestCity1 = "";
  public String closestCity2 = "";
  /**
   * String holding the name of the first farthest city
   */
  public String farthestCity1 = "";
  /**
   * string holding the name of the second farthest city
   */
  public String farthestCity2 = "";

  /**
   * creates an array to hold location names
   */
  public String[] names;

  /**
   * creates an array to hold latitude values
   */
  public double[] valuesLatitude;

  /**
   * creates an array to hold longitude values
   */
  public double[] valuesLongitude;

  private int currentSize = 0;
  private double maxDistance = 0;
  private double minDistance = Integer.MAX_VALUE;

  /**
   * Allocates array to hold numbers
   */
  public DistanceModel() {

  }

  /**
   * Adds values to the names, valuesLatitude, and valuesLongitude arrays
   * 
   * @param name
   * @param lat
   * @param lon
   */
  public void add(String name, double lat, double lon) {
    names[currentSize] = name;
    valuesLatitude[currentSize] = lat;
    valuesLongitude[currentSize] = lon;
    currentSize++;
  }

  /**
   * Calculates distance between two farthest cities
   * 
   * @return d
   */
  public double calculateHaversineDistance() {
    for (int i = 0; i < names.length; i++) {
      for (int j = 0; j < names.length; j++) {
        double latDistance1 = valuesLatitude[i];
        double lonDistance1 = valuesLongitude[i];
        double latDistance2 = valuesLatitude[j];
        double lonDistance2 = valuesLongitude[j];
        double deltaLat = Math.toRadians(latDistance1 - latDistance2);
        double deltaLong = Math.toRadians(lonDistance1 - lonDistance2);
        double lat1R = Math.toRadians(latDistance1);
        double lat2R = Math.toRadians(latDistance2);
        double a = (Math.sin(deltaLat / 2.0) * Math.sin(deltaLat / 2.0))
            + (Math.sin(deltaLong / 2.0) * Math.sin(deltaLong / 2.0) * Math.cos(lat1R)
                * Math.cos(lat2R));
        double c = 2.0 * Math.atan2(Math.sqrt(a), Math.sqrt(1.0 - a));
        double d = 3959.0 * c;
        if (d > maxDistance) {
          maxDistance = d;
          farthestCity1 = names[i];
          farthestCity2 = names[j];
        }
      }
    }
    return maxDistance;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    DistanceModel other = (DistanceModel) obj;
    if (closestCity1 == null) {
      if (other.closestCity1 != null) {
        return false;
      }
    } else if (!closestCity1.equals(other.closestCity1)) {
      return false;
    }
    if (closestCity2 == null) {
      if (other.closestCity2 != null) {
        return false;
      }
    } else if (!closestCity2.equals(other.closestCity2)) {
      return false;
    }
    if (farthestCity1 == null) {
      if (other.farthestCity1 != null) {
        return false;
      }
    } else if (!farthestCity1.equals(other.farthestCity1)) {
      return false;
    }
    if (farthestCity2 == null) {
      if (other.farthestCity2 != null) {
        return false;
      }
    } else if (!farthestCity2.equals(other.farthestCity2)) {
      return false;
    }
    return true;
  }

  /**
   * Creates a formatted string of all user input to be used in JOptionPane
   * 
   * @return finalMessage
   */
  public String getDisplay() {
    String finalMessage = String.format("%-15s%-15s%-15s\n", "Location", "Latitude", "Longitude");
    for (int i = 0; i < names.length; i++) {
      finalMessage = finalMessage
          + String.format("%-15s%-15.4f%-15.4f\n", names[i], valuesLatitude[i], valuesLongitude[i]);
    }
    return finalMessage;
  }

  /**
   * @return
   */
  public double getMaximumDistance() {

    for (int i = 0; i < names.length; i++) {
      for (int j = 0; j < names.length; j++) {
        double latDistance1 = valuesLatitude[i];
        double lonDistance1 = valuesLongitude[i];
        double latDistance2 = valuesLatitude[j];
        double lonDistance2 = valuesLongitude[j];
        double deltaLat = Math.toRadians(latDistance1 - latDistance2);
        double deltaLong = Math.toRadians(lonDistance1 - lonDistance2);
        double lat1R = Math.toRadians(latDistance1);
        double lat2R = Math.toRadians(latDistance2);
        double a = (Math.sin(deltaLat / 2.0) * Math.sin(deltaLat / 2.0))
            + (Math.sin(deltaLong / 2.0) * Math.sin(deltaLong / 2.0) * Math.cos(lat1R)
                * Math.cos(lat2R));
        double c = 2.0 * Math.atan2(Math.sqrt(a), Math.sqrt(1.0 - a));
        double d = 3959.0 * c;
        if (d > maxDistance) {
          maxDistance = d;
          farthestCity1 = names[i];
          farthestCity2 = names[j];
        }
      }
    }
    return maxDistance;
  }

  /**
   * @return
   */
  public double getMinimumDistance() {

    for (int i = 0; i < names.length; i++) {
      for (int j = 0; j < names.length; j++) {
        double latDistance1 = valuesLatitude[i];
        double lonDistance1 = valuesLongitude[i];
        double latDistance2 = valuesLatitude[j];
        double lonDistance2 = valuesLongitude[j];
        double deltaLat = Math.toRadians(latDistance1 - latDistance2);
        double deltaLong = Math.toRadians(lonDistance1 - lonDistance2);
        double lat1R = Math.toRadians(latDistance1);
        double lat2R = Math.toRadians(latDistance2);
        double a = (Math.sin(deltaLat / 2.0) * Math.sin(deltaLat / 2.0))
            + (Math.sin(deltaLong / 2.0) * Math.sin(deltaLong / 2.0) * Math.cos(lat1R)
                * Math.cos(lat2R));
        double c = 2.0 * Math.atan2(Math.sqrt(a), Math.sqrt(1.0 - a));
        double d = 3959.0 * c;

        if (d < minDistance && d > 0) {
          minDistance = d;
          closestCity1 = names[i];
          closestCity2 = names[j];
        }
      }
    }
    return minDistance;
  }

  /**
   * @return
   */
  public int getNumberOfLocations() {
    int locations = names.length;
    return locations;
  }

  /**
   * Gets the size for the array
   * 
   * @param size
   * @return currentSize
   */
  public int getSize(String size) {
    int size2 = Integer.parseInt(size);
    valuesLatitude = new double[size2];
    currentSize = 0;
    names = new String[size2];
    valuesLongitude = new double[size2];
    return currentSize;
  }

  /**
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "DistanceModel [maxDistance=" + maxDistance + ", minDistance=" + minDistance
        + ", getNumberOfLocations()=" + getNumberOfLocations() + "]";
  }
}
