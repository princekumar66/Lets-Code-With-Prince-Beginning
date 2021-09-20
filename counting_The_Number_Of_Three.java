package begineer_Level_Exercise_1;
//Write a Java program which reads an integer (7 digits or fewer) and count number
// of 3s in the given number.
    import java.util.Scanner;
public class counting_The_Number_Of_Three {
    public static void main (String args[]){
        System.out.println("Write your number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int copy_a = a;
        int c = 0;
        for(int i = 0; i>=0; i++){
            a = a/10;
            c = c + 1;
            if(a==0){
                break;
            }
        }
        int d =0;
        for(int i = 0; i<c; i++){
            int b = copy_a % 10;
            copy_a = copy_a/10;
            if(b==3){
                d = d+1;
            }
        }
        System.out.println("There are " + d + " no. of 3 in this integer");
    }
}
