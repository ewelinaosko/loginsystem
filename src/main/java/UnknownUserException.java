public class UnknownUserException extends LoginException {
    public UnknownUserException(String message) {
        super(message + "\nUser is unknown\n");
    }
}
