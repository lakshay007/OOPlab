import java.util.Scanner;
class Account{
    String name,type;
    int acc;
    int balance,deposit;
    Scanner in = new Scanner(System.in);
    Account(){
        System.out.println("enter deposit:");
        deposit=in.nextInt();
        balance=0;
        balance+=deposit;
    }
    void disp(){
        System.out.println("the balance is:"+balance);
    }
    void computeint(){
        System.out.println("enter amt for interest:");
        int p=in.nextInt();
        System.out.println("enter rate:");
        int r=in.nextInt();
        System.out.println("enter time:");
        int t=in.nextInt();
        int ans=(p*r*t)/100;
        balance+=ans;
    }



}
class Current extends Account{
   private int maintain;
   private int penalty;
    Current(){
        maintain=1000;
        penalty=900;
    }
    void penalty(){
        if(balance>=maintain){
            System.out.println("balance:"+balance);
              System.out.println("no penalty");
        }
        else{
            balance=balance-penalty;
            System.out.println(balance);
        }
    }
}
class Savings extends Account{
    private int interest;
    private int withdraw;
    Savings(int w){
   
        withdraw=w;
    }
    void computeint(){
        System.out.println("enter amt for interest:");
        int p=in.nextInt();
        System.out.println("enter rate:");
        int r=in.nextInt();
        System.out.println("enter time:");
        int t=in.nextInt();
        interest=(p*r*t)/100;
        balance+=interest;
    }
    void withdrawal(){
        System.out.println("amt is withdrawn");
        balance=balance-withdraw;
        System.out.println("curr balance:"+balance);
    }

}
public class lab6q1 {
    public static void main(String[] args) {
    Savings s1=new Savings(1000);
    s1.withdrawal();
    Current c1=new Current();
    c1.penalty();

    }
}