package exam;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import exam.toDecimal;

@RunWith (value = Parameterized.class)
public class testToDecimal {

	String hex;
	int value;
	
	    @Parameters
	    public static Collection<Object[]> values() {
	        return Arrays.asList(new Object[][]{
	                        {"1", 1},
	                        {"A", 10},
	                        {"F", 15},
	                        {"10", 16},
	                        {"14", 20},
	                        {"1A", 26}
	                }
	        );
	    }
	    
	 public testToDecimal(String hex, int value) {
		 this.hex = hex;
		 this.value = value;
	 }
	    
	 @Test
	 public void test_hex_to_dec () {
		 toDecimal exam = new toDecimal();
		 int ans = exam.hex_to_decimal(hex);
		 assertEquals(ans, value);
	 }

}
