package lesson11;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
        super("Wrong password format");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
