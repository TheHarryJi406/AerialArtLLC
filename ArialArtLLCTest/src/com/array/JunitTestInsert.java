package com.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestInsert {

	@Test
	public void test() throws Exception{
		
		ArrayStructures test = new ArrayStructures();
		
		int output = test.insertValue(555555);
		assertEquals(555555, output);
		
		
	}

}
