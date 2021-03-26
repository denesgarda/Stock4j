package coin.Stock4j.data.statics;

import coin.Stock4j.data.Stock;
import coin.Stock4j.util.arrays.Modification;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
    private static String[] allTickers = {};
    public static String[] getAllTickers() throws IOException {
        URL url = new URL("https://github.com/DenDen747/Stock4j/blob/main/Stock4j/src/main/java/coin/Stock4j/data/statics/AllTickers.txt");
        URLConnection urlConnection = url.openConnection();
        InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        while(line != null) {
            if(line.contains("js-file-line\">")) {
                int start = line.indexOf("js-file-line\">") + 14;
                int stop = start;
                while (line.charAt(stop) != '<') {
                    stop++;
                }
                allTickers = Modification.appendElement(allTickers, line.substring(start, stop));
            }
            line = bufferedReader.readLine();
        }
        return allTickers;
    }
    public static int getAllTickersNumber() throws IOException {
        getAllTickers();
        return allTickers.length;
    }
    public static Stock[] getAllStocks() throws IOException {
        getAllTickers();
        Stock[] allStocks = new Stock[]{};
        for(String ticker : getAllTickers()) {
            allStocks = Modification.appendElement(allStocks, new Stock(ticker));
        }
        return allStocks;
    }
}
