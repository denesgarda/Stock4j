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
        URL url = new URL("https://docs.google.com/document/d/1lYx47_k8d037g02MF5zH0XYmPwawX69_IKG_ql8TB5Q/edit?usp=sharing");
        URLConnection urlConnection = url.openConnection();
        InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        while(line != null) {
            /*if(line.contains("<span class=\"c1\">")) {
                int index = 0;
                while(index != 9565) {
                    int start = line.indexOf("<span class=\"c1\">", index);
                    int stop = start;
                    while (line.charAt(stop) != '<') {
                        stop++;
                    }
                    allTickers = Modification.appendElement(allTickers, line.substring(start, stop));
                    index++;
                }
            }*/
            System.out.println(line);
            line = bufferedReader.readLine();
        }
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
        return 0;
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
        /*Stock[] stocks = new Stock[]{};
        for(int i = 0; i < allTickers.length; i++) {
            stocks = Modification.appendElement(stocks, new Stock(allTickers[i]));
        }*/
        return null;
    }
}
