# Stock4j
A java stock API built with Yahoo Finance API

## Getting started
1. Download the latest release from [here](Builds/1.2.1/Stock4j_1.2.1.jar)
2. Add it to your java project as a dependency

## Usage
### Creating a stock
To create a stock, you have to provide a name. For example, I'll be using AAPL for demonstration.
```java
Stock stock = new Stock("AAPL");
```
### Accessing stock details
There are many things you can access. However a lot are missing. If you see anything that is not in the API yet, please create an issue.
```java
Stock stock = new Stock("AAPL");
stock.getPrice(); //returns the price
stock.getVolume(); //returns the volume
```

### Accessing the market
For example, if you want to access all of the stocks on Yahoo Finance to maybe create a scanner, do the following.
```java
Market.getAllTickers(); //returns a string array with the names of all stocks
Market.getAllTickersNumber(); //returns the number of all stocks
Market.getAllStocks(); //returns a stock array with all stocks
```

### Creating a running API
To create a running API, you have to do the following.
```java
public class Main {
  public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
    API api = new API();
    api.await("onMarketUpdate", "Main"); //The name of the method you're registering, and the name of the current class
  }
  public void onMarketUpdate(MarketUpdateEvent event) {
    //Do something every time the market updates
  }
}
```
### Creating a scanner
You can use everything together, to, for example, create a simple scanner.
```java
import coin.Stock4j.API.API;
import coin.Stock4j.API.event.MarketUpdateEvent;
import coin.Stock4j.data.Stock;
import coin.Stock4j.data.statics.Market;
import coin.Stock4j.util.arrays.Modification;

import java.io.IOException;

public class Main {
    Stock[] qualified  = new Stock[]{}; //These are the stocks that meet the requirements of the scanner
    
    public static void main(String[] args) throws IOException, NoSuchMethodException, ClassNotFoundException {
        API api = new API();
        api.await("scanner", "Main");
    }
    
    public void scanner(MarketUpdateEvent event) throws IOException {
        for(Stock stock : Market.getAllStocks()) {
            if(stock.getPrice() < 15 && stock.getPrice() > 5) {
                qualified = Modification.appendElement(qualified, stock); //Modification.appendElement() adds the element given in the second parameter to the array in the first parameter and returns the new array
            }
        }
    }
}
```
For now, using a scanner is fairly slow, but we are planning to speed it up. We are also planning to add more types of event, rather than just one that updates every minute.

### Events
There are 4 types of events. There is MarketUpdateEvent(), which is the default. It fires every minute.
```java
public void onMarketUpdate(MarketUpdateEvent event) {
  //Do something every minute
}
```
There is MarketUpdatePerSecondEvent(), which fires every second.
```java
public void onMarketUpdate(MarketUpdatePerSecondEvent event) {
  //Do something every second
}
```
There is MarketUpdatePerTenMinutesEvent(), which fires every 10 minutes.
```java
public void onMarketUpdate(MarketUpdatePerTenMinutesEvent event) {
  //Do something every 10 minutes
}
```
There is MarketUpdatePerHourEvent(), which fires every hour.
```java
public void onMarketUpdate(MarketUpdatePerHourEvent event) {
  //Do something every hour
}
```
