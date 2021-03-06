package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (currency)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field71LTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 3!a15d
		setup(FieldComponentsFormat.FORMAT063.getFormat());
	}

	@Test
	public void testParse1() {
		String currency = "USD";
		String amount = "123456789";
		String validateData = "USD123456789";
		Field71L f = new Field71L(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
