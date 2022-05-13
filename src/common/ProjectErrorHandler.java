package src.common;

/**
 * A class to handle errors.
 */
public class ProjectErrorHandler {

    /**
     * class to handle invalid user error
     */
    public static class InvalidUserException extends Exception {
        InvalidUserException(String error) {
            super(error);
        }
    }

    /**
     * A class to handle access related error.
     */
    public static class InvalidAccessException extends Exception {
        public InvalidAccessException(String error) {
            super(error);
        }
    }

    /**
     * A class to handle invalid Name error
     */
    public static class InvalidNameException extends Exception {
        public InvalidNameException(String error) {
            super(error);
        }
    }
}
