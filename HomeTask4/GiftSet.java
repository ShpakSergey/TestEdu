import java.util.ArrayList;

public class GiftSet extends ArrayList<Sweets>{

    private double giftWeight;

    public void addSweet (Sweets sweet){
        this.add(sweet);
        giftWeight += sweet.getSweetsWeight();
    }

    public void filterSweetsByAmountSugar(Sweets sweet, int minSugar, int maxSugar){
        if(sweet.getSweetsAmountSugar() >= minSugar &&
                sweet.getSweetsAmountSugar()<= maxSugar) {
            System.out.println(sweet.toString());
        }
    }

    @Override
    public String toString() {
        return (super.toString()+"\n Gifset Weitht - "+giftWeight);
    }
}
