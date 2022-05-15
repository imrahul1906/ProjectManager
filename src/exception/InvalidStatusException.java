package src.exception;

/**
 * A class to handle Invalid Task status exception.
 */
public class InvalidStatusException extends Exception{
    public InvalidStatusException(String error) {
        super(error);
    }
}
