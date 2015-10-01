<<<<<<< HEAD
=======
package main.java;

>>>>>>> df977eaadb2597ab51f9bb71ab69ba1689e03d97
/**
 * Created by Nicolas on 30/09/15.
 */
public class StandardItems extends Item {

    public StandardItems(String _str,int _sellIn, int _quality)
    {
        super(_str,_sellIn, _quality);
    }


    @Override
    public void UpdateQuality(int sellinn) {
        if (getQuality()>0)
        {
            this.setQuality(this.getQuality()-1);
            if (sellinn < 1) this.setQuality(this.getQuality()-1);
        }

    }
}

