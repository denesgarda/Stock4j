package coin.Stock4j.data.statics;

import coin.Stock4j.data.Stock;
import coin.Stock4j.util.arrays.Modification;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Market {
    public static String[] getAllTickers() throws FileNotFoundException {
        String[] allTickers = {};
        File currentDirectory = new File(new File("").getAbsolutePath());
        String allTickersDirectory = currentDirectory + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "coin" + File.separator + "Stock4j" + File.separator + "data" + File.separator + "statics" + File.separator + "AllTickers.txt";
        Scanner scanner = new Scanner(new File(allTickersDirectory));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(!(line.contains("^"))) {
                allTickers = (String[]) Modification.appendElement(allTickers, new Stock(line));
            }
        }
        return allTickers;
    }
}
