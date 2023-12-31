public class SeriesSum {
    public static void main(String[] args) {
        int n = 5; 
        double sum = calculateSeriesSum(n);
        System.out.println("Sum of the series: " + sum);
    }

    public static double calculateSeriesSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(1.0 / i, i);
        }
        return sum;
    }
}