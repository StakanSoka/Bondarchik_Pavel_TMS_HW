package lesson11;

public class Authorization {

    public static final int MIN_LOGIN_LENGTH = 1;
    public static final int MAX_LOGIN_LENGTH = 19;
    public static final int MAX_PASSWORD_LENGTH = 19;

    private static void isCorrectLogin(String login) throws WrongLoginException {
        int loginLength = login.length();

        if (loginLength < MIN_LOGIN_LENGTH) {
            throw new WrongLoginException("Login length is shorter then " + MIN_LOGIN_LENGTH);
        }
        else if (loginLength > MAX_LOGIN_LENGTH) {
            throw new WrongLoginException("Login length is longer then " + MAX_LOGIN_LENGTH);
        } else if (loginLength != login.trim().length() || login.contains(" ")) {
            throw new WrongLoginException();
        }
    }

    private static void isCorrectPassword(String password) throws WrongPasswordException {
        int passwordLength = password.length();
        if (passwordLength > MAX_PASSWORD_LENGTH)
            throw new WrongPasswordException("Password length is longer then " + MAX_PASSWORD_LENGTH);

        for (int i = 0; i < 10; i++) { // checking consisting number from 0 to 9
            if (password.contains(String.valueOf(i))) return;
        }
        throw new WrongPasswordException("Password must have at least one number");
    }

    public static boolean registration(String login, String password, String confirmPassword) {
        try {
            isCorrectLogin(login);
            isCorrectPassword(password);
            if (!password.equals(confirmPassword))
                throw new WrongPasswordException("Password isn not equals with confirmed password");
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
        return true;
    }
}
