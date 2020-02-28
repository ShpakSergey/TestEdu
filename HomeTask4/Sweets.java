import java.util.Comparator;


public class Sweets  {
    private String sweetsName;
    private int sweetsWeight;
    private int sweetsAmount;
    private int sweetsAmountSugar;
    private SweetsType sweetsType;

    public Sweets(String sweetsName, int sweetsWeight, int sweetsAmount, int sweetsAmountSugar, SweetsType sweetsType) {
        this.sweetsName = sweetsName;
        this.sweetsWeight = sweetsWeight;
        this.sweetsAmount = sweetsAmount;
        this.sweetsAmountSugar = sweetsAmountSugar;
        this.sweetsType = sweetsType;
    }

    public static class NameComparator implements Comparator<Sweets>{
        @Override
        public int compare(Sweets o1, Sweets o2) {
            return o1.getSweetsName().compareTo(o2.getSweetsName());
        }
    }

    public static class WeightComparator implements Comparator<Sweets>{
        @Override
        public int compare(Sweets o1, Sweets o2) {
            return o1.getSweetsWeight().compareTo(o2.getSweetsWeight());
        }
    }

    public static class TypeComparator implements Comparator<Sweets>{
        @Override
        public int compare(Sweets o1, Sweets o2) {
            return o1.getSweetsType().compareTo(o2.getSweetsType());
        }
    }

    public static class SugarComparator implements Comparator<Sweets>{
        @Override
        public int compare(Sweets o1, Sweets o2) {
            return o1.getSweetsAmountSugar().compareTo(o2.getSweetsAmountSugar());
        }
    }

    public Integer getSweetsAmountSugar() {
        return sweetsAmountSugar;
    }

    public SweetsType getSweetsType() {
        return sweetsType;
    }

    public String getSweetsName() {
        return sweetsName;
    }

    public Integer getSweetsWeight() {
        return sweetsWeight;
    }

    @Override
    public String toString() {
        return "\nSweets{" +
                "sweetsName='" + sweetsName + '\'' +
                ", sweetsWeight=" + sweetsWeight +
                ", sweetsCallories=" + sweetsAmount +
                ", sweetsAmountSugar=" + sweetsAmountSugar +
                ", sweetsType='" + sweetsType + '\'' +
                '}';
    }
}
