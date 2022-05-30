import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//test class
public class CalculatorD1Test {
int a,b; 
CalculatorD1 cal;


	@Before
	public void setUp() throws Exception {
		a = 4321;
		b = 1234;
		cal = new CalculatorD1();
		
	}
	
	@Test
	public void testadd() {

		CalculatorD1 cal = new CalculatorD1();
		
		//Act 
		int actual = cal.add(a,b);
		int expected = 5555;
		
		//Assertion
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testsub() {
		//Arrange

		CalculatorD1 cal = new CalculatorD1();
		
		//Act 
		int actual = cal.sub(a,b);
		int expected = 3087;
		
		//Assertion
		assertEquals(expected, actual);
	}
	
	@Test
	public void testsmul() {
		//Arrange
		CalculatorD1 cal = new CalculatorD1();
		
		//Act 
		int actual = cal.mul(a,b);
		int expected = 5332114;
		
		//Assertion
		assertEquals(expected, actual);
	}
	
	@Test
	public void testdiv() {
		//Arrange
		CalculatorD1 cal = new CalculatorD1();
		
		//Act 
		int actual = cal.div(a,b);
		int expected = 3;
		
		//Assertion
		assertEquals(expected, actual);
	}
	
		
	@After
	public void tearDown() throws Exception {
	}
	}    






















