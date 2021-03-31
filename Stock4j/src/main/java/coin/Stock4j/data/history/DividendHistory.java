package coin.Stock4j.data.history;

import coin.Stock4j.lang.InvalidStockException;
import yahoofinance.YahooFinance;

import java.util.Calendar;

public class DividendHistory {
    private String ticker;
    private Calendar calendar;
    private int index;
    public DividendHistory() {

    }
    public DividendHistory(String ticker, Calendar calendar) {
        this.ticker = ticker;
        this.calendar = calendar;
        this.index = 0;
    }
    public DividendHistory(String ticker, Calendar calendar, int index) {
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
    public DividendHistory setTicker(String ticker) {
        this.ticker = ticker;
        return this;
    }
    public DividendHistory setCalendar(Calendar calendar) {
        this.calendar = calendar;
        return this;
    }
    public double getAdjDividend() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getDividendHistory(this.calendar).get(index).getAdjDividend().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
}
