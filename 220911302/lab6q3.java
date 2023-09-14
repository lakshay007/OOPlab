class Bank {
    double getRateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 8.0;
    }
}

class ICICI extends Bank {
    double getRateOfInterest() {
        return 7.0;
    }
}

class AXIS extends Bank {
    double getRateOfInterest() {
        return 9.0;
    }
}
public class lab6q3 {
    public static void main(String[] args) {
        Bank sbiBank = new SBI();
        Bank iciciBank = new ICICI();
        Bank axisBank = new AXIS();
        System.out.println("SBI Bank Interest Rate: " + sbiBank.getRateOfInterest() + "%");
        System.out.println("ICICI Bank Interest Rate: " + iciciBank.getRateOfInterest() + "%");
        System.out.println("AXIS Bank Interest Rate: " + axisBank.getRateOfInterest() + "%");
    }
}
