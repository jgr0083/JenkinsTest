package com.thing.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTests {

	//Only thing to have changed
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@BeforeMethod
	public void before() {
		System.out.println("Before Method");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test4() {
		System.out.println("Test 3");
	}
	
}
