public class Main {

    public static void main(String[] args){
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//
//        for(int i=7; i >= 1; i--){
//            double amount = 10000.00;
//            double rate = 1.00 + i;
//            System.out.println(amount + " at " + rate + " = " + String.format("%.2f",calculateInterest(amount, rate)));
//        }
//        countPrimeNumbersInclusiveBetweenNumbers(1, 1200);
//        countPrimeNumbersInclusiveBetweenNumbers(2000, 3000);

//        System.out.println(sumOfThreeAndFive(1, 1000));

//        System.out.println(NumberPalindrome.isPalindrome(332233));
//        System.out.println(sumOfDigits(112345640));
//        NumberToWords.printWords(506607984);
          DiagonalStar.printSquareStar(18);

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

    public static int sumOfThreeAndFive(int x, int y){
        int sumOfAllNumbers = 0;
        int numberOfResults = 0;

        for (int i = x; i < y; i++){
            if (isDivisibleByThreeAndFive(i)){
                sumOfAllNumbers += i;
                numberOfResults++;
                System.out.println("Number " + i + " can be divided by three and  five");
                if (numberOfResults == 5){
                    break;
                }
            }
        }
        return sumOfAllNumbers;
    }

    public static boolean isDivisibleByThreeAndFive(int a){
        return a % 5 == 0 && a % 3 == 0;
    }

    public static boolean isEven(int x){return x % 2 == 0; }

    public class NumberToWords {
        // write your code here

        public static void printWords(int number){
            if (number < 0){System.out.println("Invalid Value");}
            int reverseNumber = reverse(number);
            int digitCount = getDigitCount(number);
            int currentDigit = reverseNumber % 10;
            String finalNumbers = "";

            for(int i = 0; i < digitCount; i++){
                String intWord = switchIntToVerboseString(currentDigit);
                finalNumbers += intWord;
                reverseNumber /= 10;
                currentDigit = reverseNumber %10;
            }

            System.out.println(finalNumbers.trim());
        }

        public static String switchIntToVerboseString(int x){
            String result = "";

            switch(x) {
                case 1:
                    result = "One ";
                    break;
                case 2:
                    result = "Two ";
                    break;
                case 3:
                    result = "Three ";
                    break;
                case 4:
                    result = "Four ";
                    break;
                case 5:
                    result = "Five ";
                    break;
                case 6:
                    result = "Six ";
                    break;
                case 7:
                    result = "Seven ";
                    break;
                case 8:
                    result = "Eight ";
                    break;
                case 9:
                    result = "Nine ";
                    break;
                default:
                    result = "Zero ";
                    break;
            }

            return result;
        }

        public static int reverse(int x){
            boolean negative = (x * -1) > 0 ? true : false;
            int value = negative ? (x * -1) : x;
            int result = 0;

            while (value > 0){
                result += value % 10;
                value /= 10;
                if (value > 0){
                    result *= 10;
                }
            }

            result = negative ? result * -1 : result;
            return result;
        }

        public static int getDigitCount(int x){
            if (x < 0){return -1;}
            int baseTenPower = 0;

            do {
                baseTenPower++;
                x /= 10;
            } while (x > 0);

            return baseTenPower;
        }
    }


    public class NumberPalindrome {

        public static boolean isPalindromeHacky(int x){
            String toReverse = Integer.toString(x).replaceAll("-", "");
            StringBuilder sb = new StringBuilder(toReverse);
            String reversed = sb.reverse().toString();
            int reversedInt = Integer.parseInt(reversed);
            return x == reversedInt || x == (reversedInt * -1);
        }

        public static boolean isPalindrome(int x){
            int originalNumber = x;
            int palindromeNumber = 0;

            if (x < 0) {x *= -1;}

            while (x > 0){
                int digit = x % 10;
                palindromeNumber += digit;

                if (x >= 10){
                    palindromeNumber *= 10;
                }
                x /= 10;
            }
            return (palindromeNumber == originalNumber) || (palindromeNumber * -1) == originalNumber;
        }


        public static int sumFirstAndLastDigit(int number){
            if (number < 0){ return -1;}

            int firstDigit = number % 10;
            int lastDigit = 0;
            int remainingDigits = number;

            while (remainingDigits > 0){
                int currentDigit = remainingDigits % 10;
                remainingDigits /= 10;
                if (remainingDigits == 0 ){
                    lastDigit = currentDigit;
                }
            }

            return firstDigit + lastDigit;

        }

        public static int getEvenDigitSum(int number){
            if (number < 0){return -1;}

            int result = 0;
            int digit = number % 10;

            while (number > 0){
                if (digit % 2 ==0){
                    result += digit;
                }
                number /= 10;
                digit = number % 10;
            }

            return result;

        }

        public static int getGreatestCommonDivisor(int x, int y){
            if (x < 10 || y < 10){return -1;}

            int lowestNumber = x < y ? x : y;
            int highestDenom = 0;

            for (int i= 1; i <= lowestNumber; i++){
                if ((x % i == 0) && (y % i ==0)){
                    highestDenom = i;
                }
            }
            return highestDenom;
        }

    }

    public static int sumOfDigits(int number){
        if (number < 10){
            return -1;
        }

        int sumOfDigits = 0;

        while (number > 0){
            sumOfDigits += number % 10;
            number /= 10;
        }

        return sumOfDigits;
    }

    public class DiagonalStar {
        // write your code here
        public static void printSquareStar(int number){
            if (number < 5){
                System.out.println("Invalid Value");
                return;
            }

            for (int row = 1; row <= number; row++){
                for (int column = 1; column <= number; column++){
                    if (isStar(row, column, number)){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    if (column == number){
                        System.out.println("");
                    }
                }

            }
        }

        public static boolean isStar(int row, int column,int total){
            return (row == 1 || row == total || column == 1 || column == total || row == column || (column == total - row + 1));
        }
    }


    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }

}
