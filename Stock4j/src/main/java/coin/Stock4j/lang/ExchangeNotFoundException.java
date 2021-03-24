package coin.Stock4j.lang;

public class ExchangeNotFoundException extends RuntimeException{
    public ExchangeNotFoundException(String stockExchange) {
        super("The stock exchange " + stockExchange + " can not be found. Please report this on github");
    }
}
