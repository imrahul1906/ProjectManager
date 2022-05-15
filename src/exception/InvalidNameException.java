package src.exception;

/**
 * A class to handle invalid Name error
 */
public class InvalidNameException extends Exception {
    public InvalidNameException(String error) {
        super(error);
    }
}
