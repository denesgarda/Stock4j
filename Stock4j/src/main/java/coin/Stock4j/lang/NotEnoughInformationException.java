package coin.Stock4j.lang;

public class NotEnoughInformationException extends RuntimeException{
    public NotEnoughInformationException() {
        super("Not enough information was given to execute the task.");
    }
    public NotEnoughInformationException(String errorMessage) {
        super(errorMessage);
    }
}
