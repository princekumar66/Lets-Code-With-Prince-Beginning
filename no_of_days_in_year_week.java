package begineer_Level_Exercise_1;
// Write a java program to convert specified days into years, weeks and days.
    import java.util.Scanner;
public class no_of_days_in_year_week {
    public static void main (String args[]){
        System.out.println("Enter the days which you want to convert");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a/365;
        int c = a%365;
        int d = c/7;
        int e = c%7;
        System.out.println("Year:" + b + " Weeks:" + d + " Days:" + e);
    }
}
