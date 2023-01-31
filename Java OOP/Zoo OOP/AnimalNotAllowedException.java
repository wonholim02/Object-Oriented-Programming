public class AnimalNotAllowedException extends Exception {
    /**
     * Constructor that takes message.
     * @param message the exception's message
     */
    public AnimalNotAllowedException(String message) {
        super(message);
    }
}