class CollatzCalculator {

    int countSteps(int n, int steps) {

        if (n == 1) return steps;

        if (n % 2 == 0) return countSteps(n / 2, steps + 1);
        else return countSteps(n * 3 + 1, steps + 1);

    }

    int computeStepCount(int start) {

        if (start <= 0 ) throw new IllegalArgumentException("Only natural numbers are allowed");

        return countSteps(start, 0);

    }

}
