public abstract class Item implements Cloneable {

    private String name;
    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        super();
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void DailyUpdate() {
        if (this instanceof IQualityUpdatable)
        {
            this.UpdateQuality(this.sellIn);
        }
        this.sellIn--;
    }

    public String ToString() {
        return "Name : " + this.name + ", sellin : " + this.sellIn + ", quality : " + this.quality;
    }

    public abstract void UpdateQuality(int sellinn);


    @Override
    protected Item clone()
    {
        Item clone = null;
        try {
            clone = (Item) super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return clone;

    }
}