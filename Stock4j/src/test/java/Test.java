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
    public static void main(String[] args) throws IOException {
        File currentDirectory = new File(new File("").getAbsolutePath());
        String tempDirectory = currentDirectory + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "coin" + File.separator + "Stock4j" + File.separator + "data" + File.separator + "statics" + File.separator + "temp2.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(new File(tempDirectory));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        for(int i = 0; i < Market.getAllTickers().length; i++) {
            System.out.println(new Stock(Market.getAllTickers()[i]).getPrice());
            if(new Stock(Market.getAllTickers()[i]).getPrice() != -1.0) {
                bufferedWriter.write(Market.getAllTickers()[i]);
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
    }
}
