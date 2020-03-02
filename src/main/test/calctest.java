package main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.calculater;

public class calctest {

	calculater x =new calculater();

	@Test
	public void Both_Positive() throws Exception {
	

		double add=x.add(21.1, 2);
		assertTrue("two input are positive and the result must be positive", add>0);


	}

	@Test
	public void Both_Negative() throws Exception{
		double add=x.add(-1, -1);
		assertTrue("both input are negative ->output should be negative", add<0);

	}
	@Test
	public void Both_Zero() throws Exception{


		double add=x.add(0, 0);
		assertTrue("both zeros and output shoudl be zero",0.0==add);


	}
}
