package org.example;

import org.example.Products.Product;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static VendingMachine vm = new VendingMachine();
    public static void main(String[] args) {
        switch(processMainMenu()){
            case 1:
                System.out.println(vm.getInv().getStockList().get(0));
            case 2:
                //Bring up Purchase Menu
            case 3:
                break;
        }
    }

    static public int processMainMenu(){
        boolean badInput = true;
        Integer inputConverted = 0;
        while(badInput) {
            System.out.println("Main Menu");
            System.out.println("(1) Display Vending Machine Items");
            System.out.println("(2) Purchase");
            System.out.println("(3) Exit");
            System.out.print("Please select an option: ");
            String initialInput = input.nextLine();
            try {
                inputConverted = Integer.parseInt(input.nextLine());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                continue;
            }
            if(inputConverted==1||inputConverted==2||inputConverted==3){
                badInput = false;
            }
            else{
                System.out.println("Invalid Selection try again");
            }
        }
        return inputConverted;
    }
}