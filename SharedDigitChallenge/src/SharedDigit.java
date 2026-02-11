public class SharedDigit {
    // write code here
    public static boolean hasSharedDigit(int number1, int number2) {

        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {

            int lastDigitNumber1 = number1 % 10;
            int lastDigitNumber2 = number2 % 10;
            int firstDigitNumber1 = number1 / 10;
            int firstDigitNumber2 = number2 / 10;

            if ((lastDigitNumber1 == lastDigitNumber2) || (lastDigitNumber1 == firstDigitNumber2) || (firstDigitNumber1 == lastDigitNumber2) || (firstDigitNumber1 == firstDigitNumber2)) {
                return true;
            }
            return false;
        }

        return false;
    }
}