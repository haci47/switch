import java.util.Scanner;

public class switch002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("please enter your age");
        int age = scan.nextInt();

        switch (age)
        {
            case ( 18):
                System.out.println("You are under 18.");
                break;
            case (16):
                System.out.println("You are eligible for vote.");
                break;
            case (70):
                System.out.println("You are senior citizen.");
                break;
            default:
                System.out.println("Please give the valid age.");
                break;
        }
    }
}
