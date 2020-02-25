import java.util.Scanner;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println( "Enter your name" );
        String userName=in.next();
        System.out.println( "Hello!"+" "+userName.trim() );
        if ((args.length>0)==true) {
            for (int i = args.length-1; i>=0; i--) {
                System.out.print( args[i] );
            }
        }
        int amountrOfRandomNumbers = 10;
        System.out.println("¬ывод на печать с переходом на новую строку"+ " "+amountrOfRandomNumbers+" случайных чисел");
        for (int i=1; i<=10; i++) {
            System.out.println(Math.random());
        }
        System.out.println("¬ывод на печать без перехода на новую строку"+ " "+amountrOfRandomNumbers+" случайных чисел");
        for (int i=1; i<=10; i++) {
            System.out.print(Math.random());
            System.out.print(" ");
        }
        int[] comandLineArgumentsLikeNumbers = {10, 30, 1, 3,15};
        int multiplyResult = 1;
        int summOfArguments = 0;
        System.out.print("\n Command line arguments backordered: - ");
        for (int i= comandLineArgumentsLikeNumbers.length-1; i>=0; i--){
            multiplyResult = multiplyResult*comandLineArgumentsLikeNumbers[i];
            summOfArguments = summOfArguments+comandLineArgumentsLikeNumbers[i];
            System.out.print(comandLineArgumentsLikeNumbers[i]+",");
        }

        System.out.println("\n Multiply result of arguments is: - "+multiplyResult);
        System.out.println("Summ result of arguments is: - "+summOfArguments);

        String[] monthName = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("ƒл€ вывода названи€ мес€ца, соотвествующего заданному числу введите число от 1 до 12");
        Scanner inMonthnumber = new Scanner(System.in);
        try {
            int monthNumber = inMonthnumber.nextInt();
            if (monthNumber<=12||monthNumber>=1){
                System.out.println(monthName[monthNumber-1]);
            }
        }
        catch (Throwable t) {
            System.out.println("Need to enter range from 1 till 12");
        }


	}
    
}