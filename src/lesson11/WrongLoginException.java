package lesson11;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
        super("Login format exception");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
