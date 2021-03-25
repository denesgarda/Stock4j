package coin.Stock4j.data.statics;

import coin.Stock4j.data.Stock;
import coin.Stock4j.util.arrays.Modification;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
    public static String[] getAllTickers() throws IOException {
        /*List<String> allTickers = new ArrayList<>();
        File currentDirectory = new File(new File("").getAbsolutePath());
        String allTickersDirectory = currentDirectory + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "coin" + File.separator + "Stock4j" + File.separator + "data" + File.separator + "statics" + File.separator + "AllTickers.txt";
        Scanner scanner = new Scanner(new File(allTickersDirectory));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(!(line.contains("^"))) {
                allTickers.add(line);
            }
        }
        String[] array = new String[allTickers.size()];
        for(int i = 0; i < allTickers.size(); i++) array[i] = allTickers.get(i);
        return array;*/
        URL url = new URL("https://docs.google.com/document/d/e/2PACX-1vSbFfJIM9ZDLvjixf3y6jxOr9ljUs3tbQPcjz5BeSjLWO-mXioz-FfKP78worGw746HDxHIeK4Gl659/pub");
        URLConnection urlConnection = url.openConnection();
        InputStreamReader inputStreamReader
        return allTickers;
    }
    public static int getAllTickersNumber() throws FileNotFoundException {
        /*List<String> allTickers = new ArrayList<>();
        File currentDirectory = new File(new File("").getAbsolutePath());
        String allTickersDirectory = currentDirectory + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "coin" + File.separator + "Stock4j" + File.separator + "data" + File.separator + "statics" + File.separator + "AllTickers.txt";
        Scanner scanner = new Scanner(new File(allTickersDirectory));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(!(line.contains("^"))) {
                allTickers.add(line);
            }
        }
        String[] array = new String[allTickers.size()];
        for(int i = 0; i < allTickers.size(); i++) array[i] = allTickers.get(i);
        return array.length;*/
        return allTickers.length;
    }
    public static Stock[] getAllStocks() throws FileNotFoundException {
        /*List<Stock> allTickers = new ArrayList<>();
        File currentDirectory = new File(new File("").getAbsolutePath());
        String allTickersDirectory = currentDirectory + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "coin" + File.separator + "Stock4j" + File.separator + "data" + File.separator + "statics" + File.separator + "AllTickers.txt";
        Scanner scanner = new Scanner(new File(allTickersDirectory));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            allTickers.add(new Stock(line));
        }
        Stock[] array = new Stock[allTickers.size()];
        for(int i = 0; i < allTickers.size(); i++) array[i] = allTickers.get(i);
        return array;*/
        Stock[] stocks = new Stock[]{};
        for(int i = 0; i < allTickers.length; i++) {
            stocks = Modification.appendElement(stocks, new Stock(allTickers[i]));
        }
        return stocks;
    }
}
