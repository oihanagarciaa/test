package exam;

import static org.junit.Assert.*;
import java.util.Map;

import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.expect;

import exam.Calculator;

public class TestCache extends EasyMockSupport {
	//Choose the best option for this exercise
	//mock(), createNiceMock(), createStrictMock(), createMock(), partialMockBuilder().addMockedMethods() 
	
	Calculator calc;
	
	@Before
	public void setUp() {
		calc = partialMockBuilder(Calculator.class).addMockedMethods("add", "multiply").createMock();
	}
	
	@Test
	public void testCalculator() {
		expect(calc.add(1, 2)).andReturn(3);
		expect(calc.multiply(1, 2)).andReturn(2);
		replayAll();
		assertEquals(calc.add(1, 2), 3);
		assertEquals(calc.multiply(1, 2), 2);
		verifyAll();
	}
	
}
