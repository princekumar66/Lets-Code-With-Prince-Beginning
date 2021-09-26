package begineer_Level_Exercise_1;
// Write a java program to calculate the distance between the two points.
    import java.util.Scanner;
public class the_distance_between_two_point {
    public static void main(String args[]){
        System.out.println("Enter the x-axis first co-ordinate x1:");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.println("Enter the y-axis first co-ordinate y1:");
        int y1 = sc.nextInt();
        System.out.println("Enter the x-axis second co-ordinate x2:");
        int x2 = sc.nextInt();
        System.out.println("Enter the y-axis second co-ordinate y2:");
        int y2 = sc.nextInt();
        int a = (x1 - x2)*(x1 - x2);
        int b = (y1 - y2)*(y1 - y2);
        double c = Math.sqrt(a+b);
        System.out.println("The distance between two point is " + c);
    }
}
