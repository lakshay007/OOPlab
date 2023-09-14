  class Number {
    private double value;

     Number(double value) {
        this.value = value;
    }
     boolean isZero() {
        return value == 0;
    }
     boolean isPositive() {
        return value > 0;
    }
     boolean isNegative() {
        return value < 0;
    }
     boolean isOdd() {
        return value % 2 != 0;
    }
     boolean isEven() {
        return value % 2 == 0;
    }
     boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
     boolean isArmstrong() {
        int num = (int) value;
        int originalNum = num;
        int sum = 0;
        int numDigits = (int) Math.log10(num) + 1;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Number num1 = new Number(0);
        Number num2 = new Number(23);
        Number num3 = new Number(-90);
        Number num4 = new Number(59);
        Number num5 = new Number(191);
        Number num6 = new Number(125);

        System.out.println("Number 1 is Zero: " + num1.isZero());
        System.out.println("Number 2 is Positive: " + num2.isPositive());
        System.out.println("Number 3 is Negative: " + num3.isNegative());
        System.out.println("Number 4 is Odd: " + num4.isOdd());
        System.out.println("Number 5 is Even: " + num5.isEven());
        System.out.println("Number 6 is Prime: " + num6.isPrime());
        System.out.println("Number 5 is Armstrong: " + num5.isArmstrong());
    }
}