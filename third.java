class Number {
    private double value;

    Number(double value) {
        this.value = value;
    }

    boolean isZero() {
        if (value == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isPositive() {
        if (value > 0) {
            return true;
        }
        return false;
    }

    boolean isNegative() {
        if (value < 0) {
            return true;
        }
        return false;
    }

    boolean isOdd() {
        if (value % 2 == 1) {
            return true;
        }
        return false;
    }

    boolean isEven() {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        double temporaryValue = value;
        for (int divisor = 2; divisor * divisor <= temporaryValue; divisor++) {
            if (temporaryValue % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    int order(int number) {
        int digits = 0;
        while (number != 0) {
            digits++;
            number /= 10;
        }
        return digits;
    }

    boolean isAmstrong() {
        int numberOfDigits = order((int) value);
        int temporaryValue = (int) value, sum = 0;
        while (temporaryValue != 0) {
            double remainder = temporaryValue % 10;
            sum += Math.pow(remainder, numberOfDigits);
            temporaryValue = temporaryValue / 10;
        }

        if (sum == value) { // Armstrong condition check
            return true;
        }
        return false;
    }

    double getFactorial() {
        double factorial = 1;
        for (int number = 1; number <= value; number++) {
            factorial *= number;
        }
        return factorial;
    }

    double getSqrt() {
        return Math.sqrt(value);
    }

    double getSqr() {
        return value * value;
    }

    double sumDigits() {
        double sumOfDigits = 0;
        String[] numberStrings = ((Double) value).toString().split("\\.");

        for (String number : numberStrings) {
            for (int index = 0; index < number.length(); index++) {
                String num = number.substring(index, index + 1);
                sumOfDigits += Double.parseDouble(num);
            }
        }
        return sumOfDigits;

    }

    double getReverse() {
        Double number = value;
        String numberString = number.toString();
        String reversedNumberString = new StringBuffer(numberString).reverse().toString();
        Double reversedNumber = Double.parseDouble(reversedNumberString);
        return reversedNumber;
    }

    void listFactor() {
        System.out.print("The factors of " + value + " are: ");
        System.out.print("1 ");
        double temporaryValue = value;
        for (int divisor = 2; divisor <= temporaryValue; divisor++) {
            if (temporaryValue % divisor == 0) {
                System.out.print(divisor + " ");
            }
        }
        System.out.println();
    }

    void dispBinary() {
        System.out.println(Integer.toBinaryString((int) value));
    }
}

public class third {
    public static void main(String[] args) {
        Number number = new Number(153);

        System.out.println(number.isAmstrong());

    }
}
