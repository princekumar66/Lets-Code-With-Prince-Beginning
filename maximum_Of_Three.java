package begineer_Level_Exercise_1;
// Write a java program that accepts three integers and find the maximum of three.
    import java.util.Scanner;
public class maximum_Of_Three {
    public static void main(String args[]){
        /*for(int i = 1; i<=3; i++){
            System.out.println("Input the " + i + " integer");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first integer");
        int a = sc.nextInt();
        System.out.println("Input the second integer");
        int b = sc.nextInt();
        System.out.println("Input the third integer");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a + " is greater of three");
        }
        else if(b>a && b>c){
            System.out.println(b + " is greater of three");
        }
        else{
            System.out.println(c + " is greater of three");
        }
    }
}
