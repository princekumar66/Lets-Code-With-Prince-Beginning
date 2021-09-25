package begineer_Level_Exercise_1;
//Write a Java program to read a password until it is correct. For wrong password print
//"Incorrect Password" and for correct password print "Correct password" and quit the program.
    import java.util.Scanner;
public class check_Your_Password {
    public static void main (String args[]){
        int Correct_Password = 1234;
        for(int i = 0; i>=0; i++){
            System.out.println("Enter your Password");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a==Correct_Password){
                System.out.println("You have Enter Correct Password");
                break;
            }
            else{
                System.out.println("Invalid Password kindly re-enter your Password");
            }
        }
    }
}
