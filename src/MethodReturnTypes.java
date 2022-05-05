import java.util.Scanner;
public class MethodReturnTypes {
public static String input;
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name?");
    input = scanner.nextLine();
    System.out.println("Your name is: " + return1());
    System.out.println("It has " + return2() + " letters");
    System.out.println("your name may or maynot be " + return3() + " hmm...");
    scanner.close();
}
    public static String return1() {
        String data = input;
        return data;}
    public static int return2() {
        int data = input.length();
        return data;}
    public static boolean return3() {
        boolean data;
        int bool = input.length();
        if (bool == 0) {
            data = false;
        } else {
            data = true;
        }
        return data;
    }
}