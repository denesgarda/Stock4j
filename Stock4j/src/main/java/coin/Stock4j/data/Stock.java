package coin.Stock4j.data;

import coin.Stock4j.data.change.Change;
import coin.Stock4j.data.history.History;
import coin.Stock4j.data.statics.ExchangeType;
import coin.Stock4j.lang.InvalidStockException;
import coin.Stock4j.lang.ExchangeNotFoundException;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.util.Calendar;

public class Stock {
    protected String ticker;
    public Stock(String ticker) {
        this.ticker = ticker;
    }
    public String getTicker() {
        return ticker;
    }
    public Stock setTicker(String ticker) {
        this.ticker = ticker;
        return this;
    }
    public double getPrice() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return Double.parseDouble(String.valueOf(stock.getQuote().getPrice()));
        }
        catch(Exception e) {
            //throw new InvalidStockException(this);
            return -1;
        }
    }
    public long getVolume() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getQuote().getVolume();
        }
        catch(Exception e) {
            throw new InvalidStockException(this);
        }
    }
    public double getAsk() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return Double.parseDouble(String.valueOf(stock.getQuote().getAsk()));
        }
        catch(Exception e) {
            throw new InvalidStockException(this);
        }
    }
    public double getBid() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return Double.parseDouble(String.valueOf(stock.getQuote().getBid()));
        }
        catch(Exception e) {
            throw new InvalidStockException(this);
        }
    }
    @Deprecated(since = "1.0")
    public String getExchange() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getStockExchange();
        }
        catch(Exception e) {
            throw new InvalidStockException(this);
        }
    }
    public ExchangeType getExchangeType() {
        String found = "NOT_FOUND";
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            found = stock.getStockExchange();
            String preExchange = stock.getStockExchange();
            if(preExchange.equalsIgnoreCase("NasdaqGS")) {
                return ExchangeType.NASDAQ;
            }
            else if(preExchange.equalsIgnoreCase("Other OTC")) {
                return ExchangeType.OTC;
            }
            else if(preExchange.equalsIgnoreCase("NYSE")) {
                return ExchangeType.NYSE;
            }
            else {
                throw new ExchangeNotFoundException(found);
            }
        }
        catch(Exception e) {
            throw new ExchangeNotFoundException(found);
        }
    }
    public String getName() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getName();
        } catch (IOException e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public Change getChange() {
        try {
            Stock stock = new Stock(this.ticker);
            return new Change(stock);
        } catch (Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public void test() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            System.out.println(stock.getQuote().getAvgVolume());
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public long getAverageVolume() {
        try {
            yahoofinance.Stock stock = YahooFinance.get(this.ticker);
            return stock.getQuote().getAvgVolume();
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public Dividend getDividend() {
        try {
            return new Dividend(this.ticker);
        }
        catch(Exception e) {
            throw new InvalidStockException(this.ticker);
        }
    }
    public History getHistory(Calendar calendar) {
        return new History(this.ticker, calendar);
    }
    public History getHistory(Calendar calendar, int index) {
        return new History(this.ticker, calendar, index);
    }
}
