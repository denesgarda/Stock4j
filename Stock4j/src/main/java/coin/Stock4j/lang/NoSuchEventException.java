package coin.Stock4j.lang;

public class NoSuchEventException extends RuntimeException{
    public NoSuchEventException(String errorMessage) {
        super(errorMessage);
    }
}
