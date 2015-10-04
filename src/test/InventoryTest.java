import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 01/10/15.
 */
public class InventoryTest {





    Inventory inventory;
    Item [] itemsPreviousDay ;
    Item [] itemsNextDay ;


    static Item[] CloneObjectArray(Item[] itemsPreviousDay)
    {
        Item[] itemsNextDay = new Item[itemsPreviousDay.length];
        for (int i = 0;i<itemsPreviousDay.length;i++)
        {
            itemsNextDay[i]= itemsPreviousDay[i].clone();
        }
        return  itemsNextDay;
    }



    @Before
    public void setUp() throws Exception {
        itemsPreviousDay = new Item[]{new StandardItems("+5 Dexterity Vest",10,20) ,
                new StandardItems("Elixir of the Mongoose", 5, 7),
                new AgedBrie(2, 0),
                new SulfurasItems("Sulfuras, Hand of Ragnaros"),
                new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Conjured("Conjured Mana Cake", 3, 6)};
        itemsNextDay = new Item[itemsPreviousDay.length];
    }

    @Test
    public void testUpdateInventory() throws Exception {
        //DAY 1


        for (int jour = 0 ; jour<30 ; jour++)
        {
            itemsNextDay = CloneObjectArray(itemsPreviousDay);
            inventory = new Inventory(itemsNextDay);
            inventory.UpdateInventory();


            for (int i = 0 ; i<itemsPreviousDay.length ; i++)
            {
                assertTrue(itemsPreviousDay[i].getSellIn() - 1 == inventory.getItems()[i].getSellIn());
            }
            for (int i = 0 ; i<itemsPreviousDay.length ; i++)
            {
                if (itemsPreviousDay[i].getClass().equals((new AgedBrie(1,1)).getClass()) && itemsPreviousDay[i].getSellIn()>1)
                {
                    assertTrue(itemsPreviousDay[i].getQuality() + 1 == inventory.getItems()[i].getQuality());
                }
                else if (itemsPreviousDay[i].getClass().equals((new AgedBrie(1,1)).getClass()) && itemsPreviousDay[i].getSellIn()<0)
                {
                    assertTrue(itemsPreviousDay[i].getQuality() + 2 == inventory.getItems()[i].getQuality());
                }


                else if (itemsPreviousDay[i].getClass().equals((new BackstagePasses(" ",1,1)).getClass()) && itemsPreviousDay[i].getSellIn()<0 && itemsPreviousDay[i].getQuality()+3<=50)
                {
                    assertTrue(0 == inventory.getItems()[i].getQuality());
                    break;
                }
                else if (itemsPreviousDay[i].getClass().equals((new BackstagePasses(" ",1,1)).getClass()) && itemsPreviousDay[i].getSellIn()<=5 && itemsPreviousDay[i].getQuality()+3<=50)
                {
                    assertTrue(itemsPreviousDay[i].getQuality() + 3 == inventory.getItems()[i].getQuality());
                    break;
                }
                else if (itemsPreviousDay[i].getClass().equals((new BackstagePasses(" ",1,1)).getClass()) && itemsPreviousDay[i].getSellIn()<=10 && itemsPreviousDay[i].getQuality()+3<=50)
                {
                    //System.out.println(itemsPreviousDay[i].getQuality() +  +" "+ inventory.getItems()[i].getQuality()+ " "+ jour) ;
                    assertTrue(itemsPreviousDay[i].getQuality() + 2 == inventory.getItems()[i].getQuality());
                    break;
                }
                else if (itemsPreviousDay[i].getClass().equals((new BackstagePasses(" ",1,1)).getClass()) && itemsPreviousDay[i].getSellIn()>10 && itemsPreviousDay[i].getQuality()+3<=50)
                {
                    //System.out.println(itemsPreviousDay[i].getQuality() +  +" "+ inventory.getItems()[i].getQuality()+ " "+ jour) ;
                    assertTrue(itemsPreviousDay[i].getQuality() + 1 == inventory.getItems()[i].getQuality());
                    break;
                }


                else if (itemsPreviousDay[i].getClass().equals((new Conjured(" ",1,1)).getClass())&& itemsPreviousDay[i].getSellIn()>2 )
                {
                    assertTrue(itemsPreviousDay[i].getQuality() - 2 == inventory.getItems()[i].getQuality());
                }


            }
            itemsPreviousDay=CloneObjectArray(inventory.getItems());

        }






    }
}