/**
 * DistanceModelTest.java 1.0 Mar 3, 2019
 *
 * Copyright (c) 2019 Jazz Harris. All Rights Reserved
 * Campus Box 12302. Elon University, Elon, NC 27144
 */
package edu.elon.distance;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Start each class or interface with summary description line
 * 
 * @author mjspence101
 * @version 1.0
 *
 */
class DistanceModelTest {

  /**
   * Test method for
   * {@link edu.elon.distance.DistanceModel#equals(java.lang.Object)}.
   */
  @Test
  public void testEqualsObject() {
    DistanceModel model = new DistanceModel();
    model.getSize("2");
    model.add("Elon", 39.954, -75.188);
    model.add("Charleston", 36.1072, -79.5013);

  }

  /**
   * Test method for {@link edu.elon.distance.DistanceModel#getMaximumDistance()}.
   */
  @Test
  public void testGetMaximumDistance() {
    DistanceModel model = new DistanceModel();
    model.getSize("4");
    model.add("Elon", 36.1072, -79.5013);
    model.add("Drexel", 39.954, -75.188);
    model.add("Hofstra", 40.7146, -73.6005);
    model.add("James Madison", 38.4384, -78.8378);
    double expected = 450.79562618;
    double actual = model.getMaximumDistance();
    assertEquals(expected, actual, 1);
  }

  /**
   * Test method for {@link edu.elon.distance.DistanceModel#getMinimumDistance()}.
   */
  @Test
  public void testGetMinimumDistance() {
    DistanceModel model = new DistanceModel();
    model.getSize("4");
    model.add("Elon", 36.1072, -79.5013);
    model.add("Drexel", 39.954, -75.188);
    model.add("Hofstra", 40.7146, -73.6005);
    model.add("James Madison", 38.4384, -78.8378);
    double expected = 98.75875210305007;
    double actual = model.getMinimumDistance();
    assertEquals(expected, actual, 2);
  }

  /**
   * Test method for
   * {@link edu.elon.distance.DistanceModel#getNumberOfLocations()}.
   */
  @Test
  public void testGetNumberOfLocations() {
    DistanceModel model = new DistanceModel();
    model.getSize("4");
    model.add("Elon", 36.1072, -79.5013);
    model.add("Drexel", 39.954, -75.188);
    model.add("Hofstra", 40.7146, -73.6005);
    model.add("James Madison", 38.4384, -78.8378);
    int expected = 4;
    int actual = model.getNumberOfLocations();
    assertSame(expected, actual);
  }

  /**
   * Test method for {@link edu.elon.distance.DistanceModel#toString()}.
   */
  @Test
  public void testToString() {
    DistanceModel model = new DistanceModel();
    model.getSize("4");
    model.add("Elon", 36.1072, -79.5013);
    model.add("Drexel", 39.954, -75.188);
    model.add("Hofstra", 40.7146, -73.6005);
    model.add("James Madison", 38.4384, -78.8378);
    model.getMaximumDistance();
    model.getMinimumDistance();
    model.getNumberOfLocations();
    String expected = "DistanceModel [maxDistance=450.8127318776383, "
        + "minDistance=98.75875210305007, getNumberOfLocations()=4]";
    String actual = model.toString();
    assertEquals(expected, actual);
  }

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  void setUp() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  void tearDown() throws Exception {
  }

}
