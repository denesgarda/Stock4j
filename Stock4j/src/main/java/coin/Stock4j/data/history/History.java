package coin.Stock4j.data.history;

import coin.Stock4j.lang.InvalidStockException;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.util.Calendar;

public class History {
    private String ticker;
    private Calendar calendar;
    private int index;
    public History() {

    }
    public History(String ticker, Calendar calendar) {
        this.ticker = ticker;
        this.calendar = calendar;
        this.index = 0;
    }
    public History(String ticker, Calendar calendar, int index) {
        this.ticker = ticker;
        this.calendar = calendar;
        this.index = index;
    }
    public String getTicker() {
        return this.ticker;
    }
    public Calendar getCalendar() {
        return this.calendar;
    }
    public History setTicker(String ticker) {
        this.ticker = ticker;
        return this;
    }
    public History setCalendar(Calendar calendar) {
        this.calendar = calendar;
        return this;
    }
    public double getClose() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.calendar).get(index).getClose().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public double getOpen() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.calendar).get(index).getOpen().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public double getAdjClose() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.calendar).get(index).getAdjClose().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public double getHigh() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.calendar).get(index).getHigh().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public double getLow() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.calendar).get(index).getLow().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public double getVolume() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getHistory(this.calendar).get(index).getLow().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
}
