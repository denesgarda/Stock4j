package coin.Stock4j.lang;

public class StockExchangeNotFoundException extends RuntimeException{
    public StockExchangeNotFoundException(String stockExchange) {
        super("The stock exchange " + stockExchange + " can not be found. Please report this on github");
    }
}
