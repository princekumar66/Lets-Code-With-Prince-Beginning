package begineer_Level_Exercise_1;
// Write a Java program to extract words of 3 to 6 characters length from a given sentence
//not more than 1024 characters.
    import java.util.Scanner;
public class extract_Words_Of_3_to_6_Character {
    public static void main(String args[]) {
        System.out.println("Write your String here");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            b = b + a.charAt(i);
            if (a.charAt(i) == ' ')
            for(int j = 0; j< b.length(); j++) {
                if (j>3 && j<7) {
                    System.out.println(b);
                } else {
                    b = "";
                }
            }
        }
    }
}


