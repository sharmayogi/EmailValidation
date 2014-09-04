/*
 * EMAIL VALIDATION ASSUMPTIONS WHICH I CONSIDERED ARE AS FOLLOWS :-
 * The email strings which is valid is as follows :- Alphanumeric characters @ domain name(consists exactly two or three characters after .(dot)).
 * Only one @ is allowed.
 * Only one .(dot) is allowed.
 * @ appears before .(dot).
 * Did not starts with characters other than alphanumeric.
 * Cannot be empty.
 * Cannot be null.
 * At least one character between @ and .(dot).
 * Domain name assumed only alphabets with a single .(dot).
 * 
 */

package com.snailark.usingjunit.junit;

public class EmailValidator {
	public boolean vaidateEmail(String email) {
		System.out.println("Email Validator");
		if (email == null) {
			// System.out.println("Email cannot be null");
			return false;
		}

		int count = 0;
		int count2 = 0;
		char[] charArray = email.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (!((charArray[i] >= 'a' && charArray[i] <= 'z')
					|| (charArray[i] >= 'A' && (int) charArray[i] <= 'Z')
					|| (charArray[i] > 47 && (int) charArray[i] < 58)
					|| (charArray[i] == '@') || (charArray[i] == '.'))) {
				// System.out.println("Email is invalid ");
				return false;
			}

			if (charArray[i] == '@') {
				count++;
				if (i - 1 == -1) {
					// System.out.println("Email is invalid ");
					return false;
				}
				if (count > 1) {
					// System.out.println("Email is invalid");
					return false;
				}
			}

			if (charArray[i] == '.') {
				count2++;
				if (count2 > 1) {
					// System.out.println("Email is invalid ");
					return false;
				}
				String str1 = email.substring(i + 1, email.length());
				if (email.charAt(i - 1) == '@') {

					// System.out.println("Email is invalid ");
					return false;
				}
				if (!(str1.length() == 2 || str1.length() == 3)) {
					// System.out.println("Email is invalid ");
					return false;
				}
			}

		}

		if (count == 0) {
			// System.out.println("Email is invalid");
			return false;
		}
		if (email.indexOf('@') > email.indexOf('.')) {
			// System.out.println("Email is invalid");
			return false;
		}
		return true;
	}

}
