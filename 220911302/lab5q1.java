import java.util.Scanner;
class Box{
    double w,h,d;
    Box(double l, double b, double h){
        this.h = l;
        w = b;
        d = h;
    }
    double volume(){
        double vol = w*h*d;
       
       return vol;
    }
}
public class lab5q1 {
    public static void main(String[] args) {
        double l,b,h;
        Scanner sc = new Scanner(System.in);
        l = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();
        Box obj = new Box(l,b,h);
        System.out.println(obj.volume());
    }
}
