import java.util.Scanner;
public class Rectanglearea {
    public static void main(String[] args) {
        System.out.println("enter the length and breadth of rectangle");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area = l*b;
        int circ = 2*(l+b);
        System.out.println("area = " + area + " circumference = " + circ);

    }
}
