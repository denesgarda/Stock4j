package coin.Stock4j.data.history;

import coin.Stock4j.lang.InvalidStockException;
import yahoofinance.YahooFinance;

import java.util.Calendar;
import java.util.Date;

public class HistoricRange {
    private String ticker;
    private Calendar from;
    private Calendar to;
    private int index;
    public HistoricRange(String ticker, Calendar from, Calendar to) {
        this.ticker = ticker;
        this.from = from;
        this.to = to;
        this.index = 0;
    }
    public HistoricRange(String ticker, Calendar from, Calendar to, int index) {
        this.ticker = ticker;
        this.from = from;
        this.to = to;
        this.index = index;
    }
    public double getClose() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.from, this.to).get(this.index).getClose().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public double getOpen() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.from, this.to).get(this.index).getOpen().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public double getAdjClose() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.from, this.to).get(this.index).getAdjClose().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public double getHigh() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.from, this.to).get(this.index).getHigh().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public double getLow() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.from, this.to).get(this.index).getLow().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public double getVolume() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.from, this.to).get(this.index).getVolume().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
}
