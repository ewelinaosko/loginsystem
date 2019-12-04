public class InvalidPasswordException extends LoginException {
    public InvalidPasswordException(String message) {
        super(message + "\nPassword is invalid\n");
    }
}
