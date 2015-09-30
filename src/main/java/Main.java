package main.java;

public class Main {
    public static void main(String[] args) {

        Inventory i = new Inventory();
        for (int j = 0; j<50;j++)
        {
            System.out.println("Day#"+j);
            System.out.println(i.PrintInventory());
            i.UpdateInventory();
            System.out.println();
        }


    }
}