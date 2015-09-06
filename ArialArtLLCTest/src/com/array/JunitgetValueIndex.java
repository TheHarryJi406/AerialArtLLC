package com.array;


import static org.junit.Assert.*;

import org.junit.Test;

public class JunitgetValueIndex {

	@Test
	public void test() throws Exception {
		
		ArrayStructures test1 = new ArrayStructures();
		
		int output = test1.getValueIndex(3);
		assertEquals(40,output);
		
	}

}
