package coin.Stock4j.data.history;

import coin.Stock4j.lang.InvalidStockException;
import yahoofinance.YahooFinance;

import java.util.Calendar;

public class DividendHistoricRange {
    private String ticker;
    private Calendar from;
    private Calendar to;
    private int index;
    public DividendHistoricRange(String ticker, Calendar from, Calendar to) {
        this.ticker = ticker;
        this.from = from;
        this.to = to;
        this.index = 0;
    }
    public DividendHistoricRange(String ticker, Calendar from, Calendar to, int index) {
        this.ticker = ticker;
        this.from = from;
        this.to = to;
        this.index = index;
    }
    public double getAdjDividend() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getDividendHistory(this.from, this.to).get(index).getAdjDividend().doubleValue();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
}
