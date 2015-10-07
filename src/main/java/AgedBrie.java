
/**
 * Created by Nicolas on 30/09/15.
 */
public class AgedBrie extends Item implements IQualityUpdatable{

    public AgedBrie(int _sellIn, int _quality)
    {
        super("Aged Brie",_sellIn, _quality);
    }

    @Override
    public void UpdateQuality(int sellinn) {
        this.setQuality(this.getQuality()+1);
        if (sellinn < 1) this.setQuality(this.getQuality()+1);
    }

}
