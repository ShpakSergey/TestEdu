//Новогодний подарок. Определить иерархию конфет и прочих сладостей.
//        Создать несколько объектов-конфет.
//        Собрать детский подарок с определением его веса.
//        Провести сортировку конфет в подарке на основе одного из параметров.
//        Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.

import java.util.*;

public class GiftForNewYear {

    public static void main(String[] args) {
        ArrayList<Sweets> sweets = new ArrayList<>();

        CheapSweet mumu = new CheapSweet("Mumu", 12, 1, 23);
        CheapSweet funky = new CheapSweet("Funky", 12, 4, 13);
        ChokoCandyes brownbear = new ChokoCandyes("Brown Bear", 15, 1, 24);
        ChokoCandyes whitechoko = new ChokoCandyes("Broywny", 45, 13,16);
        Cookies marusya = new Cookies("Marusya", 45, 6, 17);
        Cookies moningstar = new Cookies("Moningstar", 145, 66, 47);
        sweets.add(mumu);sweets.add(funky);sweets.add(brownbear);sweets.add(whitechoko);sweets.add(marusya);sweets.add(moningstar);


        System.out.println("Enter the amount of every type of SWEETS you want to add to Giftbox");
        int[] orderOfSweets = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < sweets.size(); i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Amount of: " + sweets.get(i).getSweetsName() + "\n");
            try {
                orderOfSweets[i] = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value. Amount of added to Giftbox - " + sweets.get(i).getSweetsName() + "  - 0");
                orderOfSweets[i] = 0;
            }
        }

        GiftSet giftset = new GiftSet();
        System.out.println("Giftset consist from: \n");
        for (int i = 0; i < sweets.size(); i++) {
            for (int j = 0; j < orderOfSweets[i]; j++) {
                giftset.addSweet(sweets.get(i));
            }
        }
        System.out.println(giftset.toString());
/*---------------------------------------------------------------------------------------------------------------------------------*/
        System.out.println("Выберите вариант сортировки имеющихся конфет и прочих сладостей");
        System.out.println("\n 1.По наименованию");
        System.out.println("\n 2.По весу ");
        System.out.println("\n 3.По количеству сахара");
        System.out.println("\n 4.По типу ");

        Scanner in = new Scanner(System.in);
        try {
            int selectChoice = in.nextInt();
            if (selectChoice>0 && selectChoice<5) {
                switch (selectChoice) {
                    case 1:
                        giftset.sort(new Sweets.NameComparator());
                        break;
                    case 2:
                        giftset.sort(new Sweets.WeightComparator());
                        break;
                    case 3:
                        giftset.sort(new Sweets.SugarComparator());
                        break;
                    case 4:
                        giftset.sort(new Sweets.TypeComparator());
                        break;
                }
                System.out.println(giftset.toString());
            }
            else{
                System.out.println("Incorrect value. GiftSet sorted by DEFAULT (Name)");
                giftset.sort(new Sweets.NameComparator());
                System.out.println(giftset.toString());
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect value. GiftSet sorted by DEFAULT (Name)");
            giftset.sort(new Sweets.NameComparator());
            System.out.println(giftset.toString());
        }

        int minSugar = 9; int maxSugar = 19;
        System.out.println("\n Отобраны конфеты по содержанию сахара : min="+minSugar+ "; max="+maxSugar);
        for (Sweets i: giftset ) {
            giftset.filterSweetsByAmountSugar(i, minSugar,maxSugar);
        }
    }
}