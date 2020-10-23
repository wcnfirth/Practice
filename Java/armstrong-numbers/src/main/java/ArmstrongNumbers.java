import java.util.ArrayList;
import java.lang.Math;

class ArmstrongNumbers {

    ArrayList<Integer> digits;

    void populateDigits(int num) {

        digits = new ArrayList<Integer>();

        while (num > 0) {
            digits.add(0, num % 10);
            num /= 10;
        }

    }

    boolean isArmstrongNumber(int numberToCheck) {

        populateDigits(numberToCheck);

        int sum = 0;
        int exponent = digits.size();

        for (int i = 0; i < digits.size(); i++)
            sum += (int) Math.pow(digits.get(i), exponent);

        if (numberToCheck == sum) return true;

        return false;

    }

}
