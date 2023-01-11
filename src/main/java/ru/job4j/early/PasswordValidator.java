package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {

    public static String validate(String password, String message) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (noSymbolsOrDigitsOrSpecs(password)) {
            throw new IllegalArgumentException(message);
        }
        if (passwordContainThisWords(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");

        }
        return password;
    }

    public static boolean isSpecialCase(int i) {
        if (!isUpperCase(i) && !isLowerCase(i) && !isDigit(i)) {
                return true;
        }
        return false;
    }

    public static boolean passwordContainThisWords(String password) {
        boolean rsl = false;
        String[] arrayOfWords = {"qwerty", "password", "admin", "user", "12345"};
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (password.toLowerCase().contains(arrayOfWords[i])) {
                rsl = true;
            }
        }
        return rsl;
    }

    public static boolean noSymbolsOrDigitsOrSpecs(String password) {
        final  String message;
        boolean noUpperCase = true;
        boolean noLowerCase = true;
        boolean noDigit = true;
        boolean noSpecialCase = true;
        for (int i = 0; i < password.length(); i++) {
            if (isUpperCase(password.codePointAt(i))) {
                noUpperCase = false;
                message = "Password should contain at least one uppercase letter";
            }
            if (isLowerCase(password.codePointAt(i))) {
                noLowerCase = false;
                message = "Password should contain at least one lowercase letter";
            }
            if (isDigit(password.codePointAt(i))) {
                noDigit = false;
                message = "Password should contain at least one figure";
            }
            if (isSpecialCase(password.codePointAt(i))) {
                noSpecialCase = false;
                message = "Password should contain at least one special symbol";
            }
        }

        boolean rsl = (noUpperCase || noLowerCase || noDigit || noSpecialCase);
        return rsl;
    }
}