
import java.util.*;

public class BAI04 {

    static int cau1(String str) {
        String[] brr = str.split("\\s+");
        int size = brr.length;
        System.out.println("- Output");
        System.out.println(size);
        StringBuilder temp = new StringBuilder(str);
        temp.reverse();
        System.out.println(temp);
        return size;
    }

    static void cau3() {
        System.out.println("* Two strings");
        Scanner sc = new Scanner(System.in);
        System.out.println("+ String 1");
        String str1 = sc.nextLine();
        System.out.println("+ String 2");
        String str2 = sc.nextLine();
        if (str1.indexOf(str2) == -1) {
            System.out.println("- Substring not found in the string");
        } else {
            System.out.println("- Substring found at position " + str1.indexOf(str2) + " in the string");
        }
    }

    static void cau2(String str) {
        String[] brr = str.split("\\s+");
        System.out.println("- The third character " + brr[2]);
    }

    static void cau4(String str) {
        String[] brr = str.split("\\s+");
        int tnumber = 0;
        int tna = 0;
        int tpa = 0;
        int tc = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                tnumber++;
            } else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                tna++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) < 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                tpa++;
            }
        }
        System.out.println("- The numeral characters :" + tnumber);
        System.out.println("- The vowel characters " + tna);
        System.out.println("- The consonant characters " + tpa);
        System.out.println("- The special characters " + (str.length() - tna - tpa - tnumber - brr.length + 1));
    }

    static void cau5(String str) {
        String[] brr = str.split("\\s+");
        int count = 0;
        for (int i = 0; i < brr.length; i++) {
            int size = brr[i].length();
            int dem = 0;
            for (int j = 0; j < brr[i].length(); j++) {
                if (brr[i].charAt(j) >= 'a' && brr[i].charAt(j) <= 'z' || brr[i].charAt(j) >= 'A' && brr[i].charAt(j) <= 'Z') {
                    dem++;
                }
                if (dem == size) {
                    count++;
                }
            }
        }
        System.out.println("- " + count + " words in the input string");
    }

    static void cau6(String str) {
        System.out.print("- The lower-case letters of input string : ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }

    static void cau7(String str) {
        System.out.print("\n- The upper-case letters of input string : ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }

    static String cau8(String str) {
        String[] brr = str.split("\\s+");
        String result = "";
        boolean check;
        for (int i = 0; i < brr.length; i++) {
            if (i > 0 && i < brr.length) {
                result += " ";
            }
            for (int j = 0; j < brr[i].length(); j++) {
                check = false;
                for (int jj = j + 1; jj < brr[i].length(); jj++) {
                    if (brr[i].charAt(j) == brr[i].charAt(jj)) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    result += brr[i].charAt(j);
                }
            }
        }
        return result;
    }

    static void cau9() {
        System.out.print("\n* Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] brr = str.split("\\s+");
        System.out.print("- A string then all remove unnecessary blanks :_");
        for (int i = 0; i < brr.length; i++) {
            if (i == brr.length - 1) {
                System.out.print(brr[i] + "_");
            } else {
                System.out.print(brr[i] + " ");
            }
        }
    }

    static void cau11() {
        System.out.print("\n* Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("* Enter a number :");
        int n = sc.nextInt();
        System.out.print("- " + n + " letters from the right side of that string :" + str.substring(n));
    }

    static void cau10() {
        System.out.println("*Enter string to count occurrences :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = cau8(str);
        for (int i = 0; i < temp.length(); i++) {
            int count = 0;
            if (temp.charAt(i) != ' ') {
                for (int j = 0; j < str.length(); j++) {
                    if (temp.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(temp.charAt(i) + " appear " + count + " times");
            }
        }
    }

    static void cau12() {
        System.out.print("\n* Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        String[] brr = str.split("\\s+");
        for (int i = 0; i < brr.length; i++) {
            String temp1 = brr[i].substring(0, 1);
            String temp2 = brr[i].substring(1, brr[i].length());
            temp1 = temp1.toUpperCase();
            result = result + temp1 + temp2 + " ";
        }
        System.out.println(result);
    }

    static void cau13() {
        System.out.println("* English Name like string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] token = str.split("\\s+");
        System.out.print(token[token.length - 1] + " ");
        System.out.print(token[0] + " ");
        for (int i = 1; i < token.length - 1; i++) {
            System.out.print(token[i] + " ");
        }
    }

    static void cau14() {
        System.out.println("\n* Reverse an input by each word");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] token = str.split("\\s+");
        for (int i = token.length - 1; i >= 0; i--) {
            System.out.print(token[i] + " ");
        }

    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("* Enter a string");
//        String str = sc.nextLine();
//        int kt = cau1(str);
//        if (kt > 3) {
//            cau2(str);
//        } else {
//            System.out.println("N/A");
//        }
//        cau3();  // check có xâu con k?
//        cau4(str); //có bao nhiêu kí tự số, nguyên âm, phụ âm, kí tự đặc biệt
//        cau5(str);  // đếm số từ trong input
//        cau6(str); // in ra chữ thường trong input
//        cau7(str); // in chữ hoa trong input
//        System.out.print("\n- Replace letters that are identical and uninterrupted by one : " + cau8(str)); // thay thế các chữ cái giống nhau trong từ thành 1
//        cau9();  // loại bỏ khoảng trống trong chuỗi
//        cau10();  // đến số lần xuất hiện của chữ cái
//        cau11();  // xuất n chữ bên phải của chuỗi
//        cau12(); // chuyển đổi chữ hoa tiêu đề
        cau13(); // chuyen ten giong tieng anh
//        cau14(); // dao nguoc dau vao theo từ

    }

}
