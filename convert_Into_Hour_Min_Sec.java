package begineer_Level_Exercise_1;
// Write a Java program to convert a given integer (in seconds) to hours, minutes and seconds.
    import java.util.Scanner;
public class convert_Into_Hour_Min_Sec {
    public static void main(String args[]){
            System.out.println("Enter your time");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = a/3600;
            int c = a-(3600*b);
            int d = c/60;
            int e = c%60;
            System.out.println("Hour: " + b + " Min: " + d + " Sec: " + e);
    }
}
