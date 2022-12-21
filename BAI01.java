
import java.util.*;

public class BAI01 {
    static String daonguoc(int number)
    {
        String temp ="";
        while(number>0)
        {
            int x =number%10;
            temp=temp.concat(String.valueOf(x));
            number/=10;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String temp =Integer.toBinaryString(number);
        System.out.println(" Day nhi phan cua " + number + " la :" +temp );
        String result = daonguoc(number);
        for (int i =result.length()-1; i >=0; i--) {
            switch (result.charAt(i)) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
            }
        }
    }
}
