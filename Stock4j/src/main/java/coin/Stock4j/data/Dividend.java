package coin.Stock4j.data;

import coin.Stock4j.lang.InvalidStockException;
import yahoofinance.YahooFinance;

import java.util.Calendar;

public class Dividend {
    private String ticker;
    public Dividend(String ticker) {
        this.ticker = ticker;
    }
    public String getTicker() {
        return this.ticker;
    }
    public Stock getStock() {
        return new Stock(this.ticker);
    }
    public Dividend setTicker(String ticker) {
        this.ticker = ticker;
        return this;
    }
    public double getAnnualYield() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getDividend().getAnnualYield().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public Calendar getExDate() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getDividend().getExDate();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public Calendar getPayDate() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getDividend().getPayDate();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
}
