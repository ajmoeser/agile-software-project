package com.scrdl;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;


public class CourseTest {

  public Course makeTestCourse() {
    Course course = new Course("testName", "testCode", "testSchool", "testTaughtBy", 10);
    return course;
  }

  @Test
  public void constructorWorks() {
    Course course = new Course();
    assertNotNull("Null response", course);

  }

  @Test
  public void constructorWithArgs() {
    Course course = new Course("","","","",0);
    assertNotNull("Null response", course);
  }

  @Test
  public void testGetName() {
    Course course = makeTestCourse();
    assertEquals("testName", course.getName());
  }

  @Test
  public void testGetCode() {
    Course course = makeTestCourse();
    assertEquals("testCode", course.getCode());
  }

  @Test
  public void testGetSchool() {
    Course course = makeTestCourse();
    assertEquals("testSchool", course.getSchool());
  }

  @Test
  public void testGetTaughtBy() {
    Course course = makeTestCourse();
    assertEquals("testTaughtBy", course.getTaughtBy());
  }

  @Test
  public void testGetWorkload() {
    Course course = makeTestCourse();
    assertEquals(10, course.getWorkload());
  }


  @Test
  public void testSetName() {
    Course course = makeTestCourse();
    course.setName("newName");
    assertEquals("newName", course.getName());
  }

  @Test
  public void testSetCode() {
    Course course = makeTestCourse();
    course.setCode("newCode");
    assertEquals("newCode", course.getCode());
  }

  @Test
  public void testSetSchool() {
    Course course = makeTestCourse();
    course.setSchool("newSchool");
    assertEquals("newSchool", course.getSchool());
  }

  @Test
  public void testSetTaughtBy() {
    Course course = makeTestCourse();
    course.setTaughtBy("newTaughtBy");
    assertEquals("newTaughtBy", course.getTaughtBy());
  }

  @Test
  public void testSetWorkload() {
    Course course = makeTestCourse();
    course.setWorkload(5);
    assertEquals(5, course.getWorkload());
  }


}