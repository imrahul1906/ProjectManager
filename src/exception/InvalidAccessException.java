package src.exception;

/**
 * A class to handle access related error.
 */
public class InvalidAccessException extends Exception{
    public InvalidAccessException(String error) {
        super(error);
    }
}
