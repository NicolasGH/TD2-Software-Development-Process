package main.java;

/**
 * Created by Nicolas on 30/09/15.
 */
public class DexterityVest extends Item {

    public DexterityVest(int _sellIn, int _quality)
    {
        super("Dextery Vest",_sellIn, _quality);
    }


    @Override
    public void UpdateQuality(int sellinn) {
        public void UpdateQuality(int sellinn) {
            this.setQuality(this.getQuality()-1);
        }
    }
}
