package coin.Stock4j.data.statics;

import coin.Stock4j.lang.ExchangeNotFoundException;

public class ExchangeType {
    public static ExchangeType NASDAQ;
    public static ExchangeType OTC;
    public static ExchangeType NYSE;
    public static String getExchangeTypeAsString(ExchangeType exchangeType) {
        if(exchangeType.equals(ExchangeType.NASDAQ)) {
            return "Nasdaq";
        }
        else if(exchangeType.equals(ExchangeType.OTC)) {
            return "OTC";
        }
        else if(exchangeType.equals(ExchangeType.NYSE)) {
            return "NYSE";
        }
        else {
            throw new ExchangeNotFoundException("NOT_FOUND");
        }
    }
}
