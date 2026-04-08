package com.bnmit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
   App bs;

   @Before
	public void setup() {
		bs = new App();
	}
	
	@Test
	public void test_1() {
		bs.deposite(100);
		assertEquals(50,bs.withdraw(50));
	}

}
