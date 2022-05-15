package src.exception;

/**
 * Exception class for Invalid user
 */
public class InvalidUserException extends Exception{
    public InvalidUserException(String error) {
        super(error);
    }
}
