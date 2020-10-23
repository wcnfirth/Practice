import java.util.Arrays;

class Yacht {

    int score;

    /**
     * Yacht constructor
     */
    Yacht(int[] dice, YachtCategory yachtCategory) {

        score = 0;

        switch (yachtCategory) {
            case ONES : scoreOnes(dice);
                        break;
            case TWOS : scoreTwos(dice);
                        break;
            case THREES : scoreThrees(dice);
                        break;
            case FOURS : scoreFours(dice);
                        break;
            case FIVES : scoreFives(dice);
                        break;
            case SIXES : scoreSixes(dice);
                        break;
            case FULL_HOUSE : scoreFullHouse(dice);
                        break;
            case FOUR_OF_A_KIND : scoreFourOfAKind(dice);
                        break;
            case LITTLE_STRAIGHT : scoreLittleStraight(dice);
                        break;
            case BIG_STRAIGHT : scoreBigStraight(dice);
                        break;
            case CHOICE : scoreChoice(dice);
                        break;
            case YACHT : scoreYacht(dice);
                        break;
        }

    }

    /**
     * Helper functions for calculating scores for each Yacht category
     */

    void scoreOnes(int[] dice) {
        for (int x : dice) {
            if (x == 1) score++;
        }
    }

    void scoreTwos(int[] dice) {
        for (int x : dice) {
            if (x == 2) score += 2;
        }
    }

    void scoreThrees(int[] dice) {
        for (int x : dice) {
            if (x == 3) score += 3;
        }
    }

    void scoreFours(int[] dice) {
        for (int x : dice) {
            if (x == 4) score += 4;
        }
    }

    void scoreFives(int[] dice) {
        for (int x : dice) {
            if (x == 5) score += 5;
        }
    }

    void scoreSixes(int[] dice) {
        for (int x : dice) {
            if (x == 6) score += 6;
        }
    }

    void scoreFullHouse(int[] dice) {

        Arrays.sort(dice);

        if (dice[0] != dice[1] || dice[3] != dice[4]) {
            score = 0;
            return;
        } else if (dice[2] != dice[1] && dice[2] != dice[3]) {
            score = 0;
            return;
        } else if (dice[0] == dice[4]) {
            score = 0;
            return;
        }

        for (int x : dice) score += x;

    }

    void scoreFourOfAKind(int[] dice) {

        Arrays.sort(dice);

        if (dice[0] == dice[1] && dice[0] == dice[2] && dice[0] == dice[3]) {
            score = dice[0] * 4;
            return;
        }
        else if (dice[1] == dice[2] && dice[1] == dice[3] && dice[1] == dice[4]) {
            score = dice[1] * 4;
            return;
        }

        score = 0;

    }

    void scoreLittleStraight(int[] dice) {

        Arrays.sort(dice);

        for (int i = 0; i < 5; i++) {
            if (i + 1 != dice[i]) {
                score = 0;
                return;
            }
        }

        score = 30;

    }

    void scoreBigStraight(int[] dice) {

        Arrays.sort(dice);

        for (int i = 0; i < 5; i++) {
            if (i + 2 != dice[i]) {
                score = 0;
                return;
            }
        }

        score = 30;

    }

    void scoreChoice(int[] dice) {
        for (int x : dice) score += x;
    }

    void scoreYacht(int[] dice) {

        int tempVal = dice[0];

        for (int x : dice) {
            if (tempVal != x) {
                score = 0;
                return;
            }
            tempVal = x;
        }

        score = 50;

    }

    /**
     * Getter that returns the score of the roll
     */
    int score() {

        return score;

    }

}
