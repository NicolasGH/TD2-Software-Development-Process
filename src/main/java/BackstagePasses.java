
public class BackstagePasses extends Item implements IQualityUpdatable{

    public BackstagePasses(String _str,int _sellin, int _quality)
    {
        super(_str,_sellin,_quality);
    }

    @Override
    public void UpdateQuality(int sellinn) {
        if (sellinn<0)
        {
            setQuality(0);
            return;
        }
        else if (sellinn <=5 )
        {
            if (getQuality()+3<=50)
            {
                setQuality(getQuality()+3);
                return;
            }
        }
        else if (sellinn <= 10)
        {
            if (getQuality()+2<=50) {
                setQuality(getQuality() + 2);
                return;
            }
        }
        if (getQuality()+1<=50)
        {
            setQuality(getQuality()+1);
        }
    }


}
