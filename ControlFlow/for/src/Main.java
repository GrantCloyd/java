public class Main {

    public static void main(String[] args){
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//
//        for(int i=7; i >= 1; i--){
//            double amount = 10000.00;
//            double rate = 1.00 + i;
//            System.out.println(amount + " at " + rate + " = " + String.format("%.2f",calculateInterest(amount, rate)));
//        }
        countPrimeNumbersInclusiveBetweenNumbers(1, 1200);
        countPrimeNumbersInclusiveBetweenNumbers(2000, 3000);
    }

    public static void countPrimeNumbersInclusiveBetweenNumbers(int firstNumber, int secondNumber){
        int result = 0;

        for(int i = firstNumber; i <= secondNumber; i++){
            if (isPrime(i)){
                result += 1;
            }
        }

        System.out.println("Number of primes = " + result);
    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for(int i=2; i <= n/2; i++){
            if (n % i ==0){
                return false;
            }
        }

        return true;

    }


    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }

}
