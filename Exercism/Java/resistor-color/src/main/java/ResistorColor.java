import java.util.Arrays;

class ResistorColor {

    String[] ResistorColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};


    int colorCode(String color) {

        for (int i = 0; i < ResistorColors.length; i++) {

            if (color.equals(ResistorColors[i])) return i;

        }

        return -1;

    }

    String[] colors() {

        return ResistorColors;

    }
}
