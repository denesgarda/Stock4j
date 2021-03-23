package coin.Stock4j.lang;

import coin.Stock4j.data.Stock;

public class InvalidStockException extends RuntimeException{
    public InvalidStockException(String errorMessage) {
        super(errorMessage);
    }
    public InvalidStockException(Stock stock) {
        super("Error with stock " + stock.getTicker());
    }
}
