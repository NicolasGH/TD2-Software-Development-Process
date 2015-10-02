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
    Item [] itemsDay0 ;
    Item [] itemsDay1;




    @Before
    public void setUp() throws Exception {
        itemsDay0 = new Item[]{new StandardItems("+5 Dexterity Vest",10,20) ,
                new StandardItems("Elixir of the Mongoose", 5, 7),
                new AgedBrie(2, 0),
                new SulfurasItems("Sulfuras, Hand of Ragnaros"),
                new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Conjured("Conjured Mana Cake", 3, 6)};
        itemsDay1 = new Item[itemsDay0.length];
        for (int i = 0;i<itemsDay0.length;i++)
        {
            itemsDay1[i]=itemsDay0[i];
        }
        inventory = new Inventory(itemsDay0);
    }

    @Test
    public void testUpdateInventory() throws Exception {
        //DAY 1
        System.out.println(itemsDay1[0].ToString());
        inventory.UpdateInventory();
        System.out.println(itemsDay1[0].ToString());


//        for (int i = 0 ; i<itemsDay0.length ; i++)
//        {
//            assertTrue(itemsDay0[i].getSellIn() == inventory.getItems()[i].getSellIn());
//        }

    }
}