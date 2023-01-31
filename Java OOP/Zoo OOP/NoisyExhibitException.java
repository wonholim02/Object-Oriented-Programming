public class NoisyExhibitException extends RuntimeException {
    /**
     * Constructor that has no args but default messege.
     */
    public NoisyExhibitException() {
        super("The animals are too noisy");
    }
}