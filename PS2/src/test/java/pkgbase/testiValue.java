package pkgbase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import base.MyInteger;

public class testiValue {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testiValue() {
		MyInteger myint1 = new MyInteger(1);
		boolean dexpectedodd = true;
		boolean dexpectedeven = false;
		boolean dexpectedprime = true;
		assertEquals(myint1.isOdd(), dexpectedodd);
		assertEquals(myint1.isEven(),dexpectedeven);
		assertEquals(myint1.isPrime(),dexpectedprime);
		
		boolean expectedequals = true ;
		assertEquals(myint1.equals(6),expectedequals);
	}
	

;
}
