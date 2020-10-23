import static java.lang.Math.sqrt;

class Darts {

    double x, y;
    double throwRadius;

    int outerRadius = 10;
    int middleRadius = 5;
    int innerRadius = 1;

    int missPoints = 0;
    int outerPoints = 1;
    int middlePoints = 5;
    int innerPoints = 10;

    Darts(double x, double y) {

        this.x = x;
        this.y = y;
        this.throwRadius = sqrt((x * x) + (y * y));

    }

    int score() {

        if (throwRadius <= innerRadius) return innerPoints;
        else if (throwRadius <= middleRadius) return middlePoints;
        else if (throwRadius <= outerRadius) return outerPoints;
        return missPoints;

    }

}
