import coin.Stock4j.data.Stock;
import coin.Stock4j.data.statics.Market;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yahoofinance.YahooFinance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        for(int i = 0; i < Market.getAllTickersNumber(); i++) {
            if(Market.getAllStocks()[i].getPrice() == -1) {
                /*File currentDirectory = new File(new File("").getAbsolutePath());
                String allTickersDirectory = currentDirectory + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "coin" + File.separator + "Stock4j" + File.separator + "data" + File.separator + "statics" + File.separator + "AllTickers.txt";
                String tempDirectory = currentDirectory + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "coin" + File.separator + "Stock4j" + File.separator + "data" + File.separator + "statics" + File.separator + "temp.txt";
                File file = new File(allTickersDirectory);
                Scanner scanner = new Scanner(file);
                int lineNum = 0;
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(tempDirectory)));
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    lineNum++;
                    if(!line.equalsIgnoreCase("E")) {
                        bufferedWriter.write(Market.getAllStocks()[i].getTicker());
                    }
                }*/
                String toRemove = Market.getAllStocks()[i].getTicker();
                File currentDirectory = new File(new File("").getAbsolutePath());
                String tempDirectory = currentDirectory + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "coin" + File.separator + "Stock4j" + File.separator + "data" + File.separator + "statics" + File.separator + "temp2.txt";
                FileOutputStream fileOutputStream = new FileOutputStream(new File(tempDirectory));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
                if(!Market.getAllStocks()[i].getTicker().equalsIgnoreCase(toRemove)) {
                    bufferedWriter.write(Market.getAllStocks()[i].getTicker());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
        }
    }
}
