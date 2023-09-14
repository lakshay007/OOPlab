class Time{
    int s,m,h;
    Time(){
        s = m = h = 0;
    }
    Time(int a, int b, int c){
        h = a; m = b; s= c;
    }
    void display(){
        System.out.println("the time is :" + h + ":" + m + ":" + s);
    }
    void add(Time obj1 , Time obj2){
        s = obj1.s + obj2.s;
        m = obj1.m + obj2.m + s/60;
        h = obj1.h + obj2.h + m/60;
        s%=60;
        m%=60;
        System.out.println("the time is :" + h + ":" + m + ":" + s);

    }
}

public class lab5q3 {
    public static void main(String[] args) {
        Time obj = new Time();
    Time obj1 = new Time(4,35,45);
    Time obj2 = new Time(4,45,45);
    obj.add(obj1,obj2);

        
    }
    
}
