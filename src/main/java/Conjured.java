
/**
 * Created by Nicolas on 30/09/15.
 */
public class Conjured extends Item implements IQualityUpdatable{

    public Conjured(String _str, int _sellIn, int _quality)
    {super(_str,_sellIn,_quality);}

    @Override
    public void UpdateQuality(int sellinn) {
        if (this.getQuality()>1) this.setQuality(this.getQuality()-2);
        else if  (this.getQuality()==1) this.setQuality(this.getQuality()-1);
    }
}



