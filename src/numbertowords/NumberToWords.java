package numbertowords;

public class NumberToWords {

    public static void main(String[] args) {
        getDigitCount(0);
        getDigitCount(123);
        getDigitCount(-12);
        getDigitCount(5200);
        getDigitCount(-222);

        reverse(-121);
        reverse(1212);
        reverse(1234);
        reverse(100);
        reverse(-2);

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        
        numberToWordsRecursively(250);
        numberToWordsRecursively(-100);    
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int reverse = reverse(number);
        int digitCount = getDigitCount(number);
        int reverseDigitCount = getDigitCount(reverse);
        int lastDigit;
        do {
            lastDigit = reverse % 10;
            switch (lastDigit) {
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                case 0:
                    System.out.print("Zero ");
                    break;
            }
            reverse = reverse / 10;
        } while (reverse != 0);
        for (int i = 0; i < digitCount - reverseDigitCount; i++) {
            System.out.print("Ζero ");
        }

    }

    public static int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -1 * number;
        }
        int digitCount = getDigitCount(number);
        int lastDigit;
        int reverse = 0;
        int counter = 1;
        do {
            lastDigit = number % 10;
            reverse += (int) (lastDigit * Math.pow(10, digitCount - counter));
            number = number / 10;
            counter++;
        } while (number != 0);
        if (isNegative) {
            return -1 * reverse;
        } else {
            return reverse;
        }
    }

    public static int getDigitCount(int number) {
        int counter = 0;
        if (number < 0) {
            return -1;
        }
        do {
            counter++;
            number = number / 10;
        } while (number != 0);
        return counter;
    }
// same with recursion and a shorter solution
    public static void numberToWordsRecursively(int n) {
        if (n < 0) {
            System.out.println("Invalid");
            return;
        }
        if (n == 0) {
            return;
        }
        int lastDigit;
        lastDigit = n % 10;
        switch (lastDigit) {
            case 1:
                numberToWordsRecursively(n / 10);
                System.out.print("one ");
                break;
            case 2:
                numberToWordsRecursively(n / 10);
                System.out.print("two ");
                break;
            case 3:
                numberToWordsRecursively(n / 10);
                System.out.print("three ");
                break;
            case 4:
                numberToWordsRecursively(n / 10);
                System.out.print("four ");
                break;
            case 5:
                numberToWordsRecursively(n / 10);
                System.out.print("five ");
                break;
            case 6:
                numberToWordsRecursively(n / 10);
                System.out.print("six ");
                break;
            case 7:
                numberToWordsRecursively(n / 10);
                System.out.print("seven ");
                break;
            case 8:
                numberToWordsRecursively(n / 10);
                System.out.print("eight ");
                break;
            case 9:
                numberToWordsRecursively(n / 10);
                System.out.print("nine ");
                break;
            case 0:
                numberToWordsRecursively(n / 10);
                System.out.print("zero ");
                break;
        }
    }
}
