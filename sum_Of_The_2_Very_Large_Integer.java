/*Write a Java program to fine the sum of 2 very large integers.
Take input as string and out the sum as string.*/
package begineer_Level_Exercise_1;

    import java.util.Scanner;
public class sum_Of_The_2_Very_Large_Integer {
    public static void main(String args[]) {
        System.out.println("Enter your big number");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Enter your second big number");
        String b = sc.nextLine();
        int carry = 0;
        String sum = "";
        if(b.length()>a.length()){
            int c = b.length()-a.length();
            for(int l = 0; l<c; l++){
                a = 0 + a;
            }
        }
        if(a.length()>b.length()) {
            int d = a.length()-b.length();
            for(int m = 0; m<d; m++){
                b = 0 + b;
            }
        }
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (true) {
            int i1 = a.charAt(i)- 48;
            int i2 = b.charAt(j)- 48;
            int i3 = i1 + i2 + carry;
            if (i3 > 9) {
                carry = 1;
                i3 = i3%10;
            } else {
                carry = 0;
            }
            sum = sum + i3;
            i--;
            j--;
            if(i==-1 && j==-1){
                break;
            }
        }
        String sum2 = "";
        if(carry==0){
            sum2 = sum;
        }
        else {
            sum2 = sum + carry;
        }
        String finalsum = "";
        for(int k = sum2.length()-1; k >=0; k--){
            finalsum = finalsum + sum2.charAt(k);
        }
        System.out.println(finalsum);
    }
}

