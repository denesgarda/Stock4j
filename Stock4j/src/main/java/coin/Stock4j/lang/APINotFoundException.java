package coin.Stock4j.lang;

public class APINotFoundException extends RuntimeException{
    public APINotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
