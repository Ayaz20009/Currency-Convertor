/**
 * Created by AyazShah on 4/21/16.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Please 1 to conver from $US to Ruppees");
        Scanner read = new Scanner(System.in);
        int user = read.nextInt();
        if (user == 1){
            System.out.println("Please enter the AMOUNT you want to convert");
            Scanner read1 = new Scanner(System.in);
            int amount1 = read1.nextInt();
            Converter myObject = new Converter();
            System.out.println(myObject.test(amount1));



        }
    }
}
