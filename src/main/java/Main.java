<<<<<<< HEAD
=======
package main.java;

>>>>>>> df977eaadb2597ab51f9bb71ab69ba1689e03d97
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