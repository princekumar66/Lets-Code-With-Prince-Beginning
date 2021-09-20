package begineer_Level_Exercise_1;
//Write a Java program to fine the sum of 2 very large integers.
//Take input as string and out the sum as string.
    import java.util.Scanner;
public class sum_Of_The_2_Very_Large_Integer {
    public static void main(String args[]){
        System.out.println("Enter your big number");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Enter your second big number");
        String b = sc.nextLine();
        for(int i = a.length(); i>0; i--){
            int c = Integer.parseInt(a.charAt(i-1));
            for(int j = b.length(); j>0; j--){
                int d = Integer.parseInt(j);
            }
        }
        int c = Integer.parseInt(a);
        //int d = Integer.parseInt(b);
        System.out.println(c);
    }
}

