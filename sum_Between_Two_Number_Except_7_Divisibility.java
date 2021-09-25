package begineer_Level_Exercise_1;
//Write a Java program to calculate the sum of all the numbers (inclusive)
//not divisible by 7.
    import java.util.Scanner;
public class sum_Between_Two_Number_Except_7_Divisibility {
    public static void main (String args[]){
        System.out.println("Enter your smaller no.");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("Enter your bigger no.");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        float n = (b-a)+1;
        float c = (n/2);
        float total_sum = c*((2*a)+(n-1));
        int d =0;
        for(int i = a; i<=b; i++){
            if(i%7==0){
                d = d+i;
            }
        }
        System.out.println(total_sum-d);
    }
}
