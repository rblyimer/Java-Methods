import java.util.Scanner;
public class AverageMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get a cool average:");
        int num1 = scanner.nextInt();
        System.out.println("and another one:");
        int num2 = scanner.nextInt();
        System.out.println("last one, i promise:");
        int num3 = scanner.nextInt();
        System.out.println("your average is a whopping: " + average(num1,num2, num3));
        scanner.close();
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static double average(int a, int b, int c) {
        return (double)sum(a,b,c) / 3.0;
    }
}