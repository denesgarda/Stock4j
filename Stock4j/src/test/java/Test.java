import coin.Stock4j.API.API;
import coin.Stock4j.API.event.MarketUpdateEvent;
import coin.Stock4j.data.Stock;
import coin.Stock4j.data.statics.Market;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yahoofinance.YahooFinance;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        API api = new API();
        api.await("onMarketUpdate", "Test");
    }
    public void onMarketUpdate(MarketUpdateEvent event) {
        System.out.println("yay");
    }
}
