
import java.util.*;

public class BAI03 {

    static void SumofStr(String str) {
        String[] token = str.split("\\s");;
        int sumint = 0;
        double sumdouble = 0;
        String s = "";
        for (int i = 0; i < token.length; i++) {
            if (token[i].matches("\\d+")) {
                sumint += Integer.parseInt(token[i]);
            } else if (token[i].matches("(-?\\d+\\.\\d++)?")) {
                sumdouble += Double.parseDouble(token[i]);
            } else {
                s += token[i];
                s += " ";
            }
        }
        System.out.println("- The sum of integer numbers: "+ sumint);
        System.out.println("- The sum of double numbers: "+ sumdouble);
        System.out.println("- The sum of string: "+ s);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SumofStr(str);

    }
}
