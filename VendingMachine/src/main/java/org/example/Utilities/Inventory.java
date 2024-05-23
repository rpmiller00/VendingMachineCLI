package org.example.Utilities;

import org.example.Products.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    private List<Product> stockList;

    public Inventory (){
        stockList = new ArrayList<>();
        setStockList();
    }

    public List<Product> getStockList() {
        return stockList;
    }
    public void setStockList() {
        try {
            File dataFile = new File("vendingmachine.csv");
            try (Scanner dataInput = new Scanner(dataFile)){
                while(dataInput.hasNextLine()){
                    String lineOfInput = dataInput.nextLine();
                    String [] data = lineOfInput.split(",");
                    if(data[3].equals("Cat")){
                        Cat newAnimal = new Cat(data[1], new BigDecimal(data[2]));
                        stockList.add(newAnimal);
                    }
                    else if(data[3].equals("Penguin")){
                        Penguin newAnimal = new Penguin(data[1], new BigDecimal(data[2]));
                        stockList.add(newAnimal);
                    }
                    else if(data[3].equals("Pony")){
                        Pony newAnimal = new Pony(data[1], new BigDecimal(data[2]));
                        stockList.add(newAnimal);
                    }
                    else if (data[3].equals("Duck")){
                        Duck newAnimal = new Duck(data[1], new BigDecimal(data[2]));
                        stockList.add(newAnimal);
                    }
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }


}
