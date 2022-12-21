import java.util.*;
public class BAI02 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] trr = str.split("\\s");
        double [] arr = new double[trr.length];
        int index =0;
        int check=0;
        try{
        for( String T : trr)
        {
            arr[index]= Double.parseDouble(T);
            index++;
            check=1;
            
        }}catch(Exception e)
        {
            System.out.println(" Invalid String \n N/A");
            check =0;
        }
        if(check==1)
        {
            System.out.println("Valid String");
            double sum =0;
            for(int i=0;i<arr.length;i++)
            {
                sum += Math.pow(arr[i],2);
            }
            System.out.println("Square sum "+ sum);
        }     
    }
}
