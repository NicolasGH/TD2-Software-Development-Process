public abstract class Item {

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

    public void DailyUpdate(){
        if (this.quality>=0 && this.quality<=50) UpdateQuality(this.sellIn);
        this.sellIn--;
    }

    public String ToString(){
        return "Name : " + this.name + ", sellin : "+ this.sellIn +", quality : " + this.quality;
    }

    public abstract void UpdateQuality(int sellinn);
}