# Stock4j
A java stock API built with Yahoo Finance API

## Getting started
1. Download the latest release from [here](Builds/1.0/Stock4j_1.0.jar)
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

## Accessing the market
!!! This will come in a future update !!!
For example, if you want to access all of the stocks on Yahoo Finance to maybe create a scanner, do the following.
```java
Market.getAllTickers(); //returns a string array with the names of all stocks
Market.getAllTickersNumber(); //returns the number of all stocks
Market.getAllStocks(); //returns a stock array with all stocks
```

## Creating a running API
To create a running API, you have to do the following.
```java
public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
  API api = new API();
  api.await("onMarketUpdate", "Test"); //The name of the method you're registering, and the name of the current class
}
public void onMarketUpdate(MarketUpdateEvent event) {
  System.out.println("yay");
}
```
