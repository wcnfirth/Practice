import java.util.ArrayList;

class SumOfMultiples {

    int sum;

    ArrayList<Integer> multiples = new ArrayList<Integer>();

    SumOfMultiples(int number, int[] set) {

        sum = 0;

        for (int multiple : set) {

            if (multiple > 0) {

                for (int i = 1; i <= Math.floorDiv(number, multiple); i++) {

                    if (!multiples.contains(multiple * i) && multiple * i < number) multiples.add(multiple * i);

                }

            }

        }

    }

    int getSum() {

        for (int multiple : multiples) sum += multiple;

        return sum;

    }

}
