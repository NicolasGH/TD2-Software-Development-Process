<<<<<<< HEAD
=======
package main.java;

>>>>>>> df977eaadb2597ab51f9bb71ab69ba1689e03d97
/**
 * Created by Nicolas on 30/09/15.
 */
public class BackstagePasses extends Item{

    public BackstagePasses(String _str,int _sellin, int _quality)
    {
        super(_str,_sellin,_quality);
    }

    @Override
    public void UpdateQuality(int sellinn) {
        if (sellinn==0)
        {
            setQuality(0);
            return;
        }
        else if (sellinn <=5 )
        {
            setQuality(getQuality()+3);
            return;
        }
        else if (sellinn <= 10)
        {
            setQuality(getQuality()+2);
            return;
        }
            setQuality(getQuality()+1);
    }


}
