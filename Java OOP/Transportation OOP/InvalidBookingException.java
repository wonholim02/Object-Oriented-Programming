public class InvalidBookingException extends Exception {
    /**
     * Constructor that takes message.
     * @param message the exception's message
     */
    public InvalidBookingException(String message) {
        super(message);
    }
    /**
     * Constructor that has no args but default messege.
     */
    public InvalidBookingException() {
        super("Invalid booking type");
    }
}