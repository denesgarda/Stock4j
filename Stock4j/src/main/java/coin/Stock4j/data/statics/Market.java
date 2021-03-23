package coin.Stock4j.data.statics;

import coin.Stock4j.data.Stock;
import coin.Stock4j.util.arrays.Modification;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
    public static String[] getAllTickers() throws FileNotFoundException {
        List<String> allTickers = new ArrayList<>();
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
        return array;
    }
    public static int getAllTickersNumber() throws FileNotFoundException {
        List<String> allTickers = new ArrayList<>();
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
        return array.length;
    }
    public static Stock[] getAllStocks() throws FileNotFoundException {
        List<Stock> allTickers = new ArrayList<>();
        File currentDirectory = new File(new File("").getAbsolutePath());
        String allTickersDirectory = currentDirectory + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "coin" + File.separator + "Stock4j" + File.separator + "data" + File.separator + "statics" + File.separator + "AllTickers.txt";
        Scanner scanner = new Scanner(new File(allTickersDirectory));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            allTickers.add(new Stock(line));
        }
        Stock[] array = new Stock[allTickers.size()];
        for(int i = 0; i < allTickers.size(); i++) array[i] = allTickers.get(i);
        return array;
    }
}
