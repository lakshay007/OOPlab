public class Num {
    private double value;

    public Num(double value) {
        this.value = value;
    }

    public boolean isZero() {
        return value == 0;
    }

    public boolean isPositive() {
        return value > 0;
    }

    public boolean isNegative() {
        return value < 0;
    }

    public boolean isOdd() {
        return (int) value % 2 != 0;
    }

    public boolean isEven() {
        return (int) value % 2 == 0;
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        if (value <= 3) {
            return true;
        }
        if (value % 2 == 0 || value % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= value; i += 6) {
            if (value % i == 0 || value % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isArmstrong() {
        int num = (int) value;
        int temp = num;
        int sum = 0;
        int digits = (int) Math.log10(num) + 1;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == num;
    }
}
public class lab5q5 {
    public static void main(String[] args) {
        Num num = new Num(7);

        System.out.println("Is Zero: " + num.isZero());
        System.out.println("Is Positive: " + num.isPositive());
        System.out.println("Is Negative: " + num.isNegative());
        System.out.println("Is Odd: " + num.isOdd());
        System.out.println("Is Even: " + num.isEven());
        System.out.println("Is Prime: " + num.isPrime());
        System.out.println("Is Armstrong: " + num.isArmstrong());
    }
}
