package com.snailark.usingjunit.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class EmailTestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(EmailValidatorTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
			System.out.println(failure.getException());
		}
		System.out.println(result.wasSuccessful());

	}

}
