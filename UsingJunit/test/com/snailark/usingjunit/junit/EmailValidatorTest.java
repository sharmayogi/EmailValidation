package com.snailark.usingjunit.junit;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class EmailValidatorTest {
	EmailValidator validator = new EmailValidator();

	@Test
	public void testValidateEmailExactlyThreeCharactersAfterDot() {
		boolean result = validator.vaidateEmail("sharma88yogi@gmail.com");
		assertTrue("Test 1", result);
	}
	@Test
	public void testValidateEmailExactlyTwoCharactersAfterDot() {
		
		boolean result = validator.vaidateEmail("sharma88yogi@sa.om");
		assertTrue("Test 2", result);
	}
	@Test
		public void testValidateEmailTwoDots() {
			
			boolean result = validator.vaidateEmail("sharma88yogi@sa..om");
			assertFalse("Test 3", result);
		}
	@Test
		
		public void testValidateEmailTwoAtTheRateSign() {
			
			boolean result = validator.vaidateEmail("sharma88yogi@@sa.com");
			assertFalse("Test 4", result);
		}
	@Test
		public void testValidateEmailAtTheRateAndDotAreTogether() {
			
			boolean result = validator.vaidateEmail("sharma88yogi@.com");
			assertFalse("Test 5", result);
		}
	@Test
		public void testValidateEmailStartWithAtTheRate() {
			
			boolean result = validator.vaidateEmail("@sa.com");
			assertFalse("Test 6", result);
		}
	@Test
		public void testValidateEmailMoreThanThreeCharacters() {
			
			boolean result = validator.vaidateEmail("sharma88yogi@sa.gcom");
			assertFalse("Test 7", result);
		}
	@Test
		public void testValidateEmailDotBeforAtTheRate() {
			
			boolean result = validator.vaidateEmail("sharma88yogi.sa@vcom");
			assertFalse("Test 8", result);
		}
	@Test
		public void testValidateEmailStartWithDigit() {
			
			boolean result = validator.vaidateEmail("93sharma@yahoo.com");
			assertTrue("Test 9", result);
		}
	@Test
		public void testValidateEmailWithoutDot() {
			
			boolean result = validator.vaidateEmail("93sha@gmailcom");
			assertFalse("Test 10", result);
		}
	@Test
		public void testValidateEmailBlank() {
			
			boolean result = validator.vaidateEmail("");
			assertFalse("Test 11", result);
		}
	@Test
		public void testValidateEmailWithoutAtTheRate() {
			
			boolean result = validator.vaidateEmail("sharma88yogigmail.com");
			assertFalse("Test 11", result);
		}
	@Test
	public void testValidateEmailStartingWithUnderScore() {
		
		boolean result = validator.vaidateEmail("_sharma88yogigmail.com");
		assertFalse("Test 11", result);
	}
	@Test
	public void testValidateEmailContainsLessThanTwoCharacters() {
		
		boolean result = validator.vaidateEmail("sharma88yogi@gmail.c");
		assertFalse("Test 11", result);
	}
	@Test
	public void testValidateEmailWhichIsValid() {
		
		boolean result = validator.vaidateEmail("sharma88yogi@gmail.com");
		assertTrue("Test 11", result);
	}
}
