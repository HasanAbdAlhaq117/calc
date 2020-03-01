package main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.calculater;

public class calctest {

	calculater x =new calculater();

	@Test
	public void Both_Positive() {
	

		double add=x.add(21.1, 2);
		assertTrue("two input are positive and the result must be positive", add>0);


	}

	@Test
	public void Both_Negative() {
		double add=x.add(-1, -1);
		assertTrue("both input are negative ->output should be negative", add<0);

	}
	@Test
	public void Both_Zero() {


		double add=x.add(0, 0);
		assertTrue("both zeros and output shoudl be zero",0.0==add);


	}
}
