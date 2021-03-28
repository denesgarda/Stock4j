package coin.Stock4j.data.change;

import coin.Stock4j.data.Stock;
import coin.Stock4j.lang.InvalidStockException;
import yahoofinance.YahooFinance;

public class Change {
    private Stock stock;
    public Change(Stock stock) {
        this.stock = stock;
    }
    public ChangeAmount getChange() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.stock.getName());
            return new ChangeAmount(Double.parseDouble(String.valueOf(stock.getQuote().getChange())));
        }
        catch(Exception e) {
            throw new InvalidStockException(this.stock);
        }
    }
    public ChangeAmount getChangeFromAverage50() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.stock.getName());
            return new ChangeAmount(Double.parseDouble(String.valueOf(stock.getQuote().getChangeFromAvg50())));
        }
        catch(Exception e) {
            throw new InvalidStockException(this.stock);
        }
    }
    public ChangeAmount getChangeFromAverage200() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.stock.getName());
            return new ChangeAmount(Double.parseDouble(String.valueOf(stock.getQuote().getChangeFromAvg200())));
        }
        catch(Exception e) {
            throw new InvalidStockException(this.stock);
        }
    }
    public ChangeAmount getChangeFromYearHigh() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.stock.getName());
            return new ChangeAmount(Double.parseDouble(String.valueOf(stock.getQuote().getChangeFromYearHigh())));
        }
        catch(Exception e) {
            throw new InvalidStockException(this.stock);
        }
    }
    public ChangeAmount getChangeFromYearLow() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.stock.getName());
            return new ChangeAmount(Double.parseDouble(String.valueOf(stock.getQuote().getChangeFromYearLow())));
        }
        catch(Exception e) {
            throw new InvalidStockException(this.stock);
        }
    }
}
