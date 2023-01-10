package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (isNoUpperCase(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (isNoLowerCase(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (isNoDigit(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (isNoSpecialSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (password.toLowerCase().equals("qwerty") || password.toLowerCase().equals("password")
                || password.toLowerCase().equals("admin") || password.toLowerCase().equals("user")
                || password.equals("12345")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");

        }
        return password;
    }

    public static boolean isNoUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (isUpperCase(password.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNoLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (isLowerCase(password.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNoDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (isDigit(password.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNoSpecialSymbol(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!isUpperCase(password.codePointAt(i)) && !isLowerCase(password.codePointAt(i)) && !isDigit(password.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }
}