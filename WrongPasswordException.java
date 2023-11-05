package org.home_work;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {
        super("Используются недопустимые для пароля символы.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}