import java.util.Scanner;
class information{
    Scanner sc = new Scanner(System.in);
    int regno,age;
    String name;

}

class ug extends information{
    int fee = 10000;
    int sem;
    void getdata(){
        System.out.println("enter your name");
        name = sc.nextLine();
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println("enter registration number");
        regno = sc.nextInt();
        System.out.println("semester number");
        sem = sc.nextInt();
    }
    void printdata(){
        System.out.println("Course: ug");
        System.out.println("name : "+ name);
        System.out.println("age : "+ age);
        System.out.println("regno : "+ regno);
        System.out.println("fees : "+ fee);
        System.out.println("Semester : "+ sem);
    }
}
class pg extends information{
    int fee = 12000;
    int sem;
    void getdata(){
        System.out.println("enter your name");
        name = sc.nextLine();
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println("enter registration number");
        regno = sc.nextInt();
        System.out.println("semester number");
        sem = sc.nextInt();
    }
    void printdata(){
        System.out.println("Course: pg");
        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
        System.out.println("regno: "+ regno);
        System.out.println("fees: "+ fee);
        System.out.println("Semester: "+ sem);
    }
}

public class lab6q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String course;
        System.out.println("enter the course(ug/pg)");
        course = sc.nextLine();
        ug obj1 = new ug();
        pg obj2 = new pg();
        if(course.equals("ug")){
            obj1.getdata();
            obj1.printdata();

        }
        else{
            obj2.getdata();
            obj2.printdata();
        }


    }

    
}
