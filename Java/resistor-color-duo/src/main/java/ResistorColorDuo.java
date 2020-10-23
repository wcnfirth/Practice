import java.util.ArrayList;
import java.util.Arrays;

class ResistorColorDuo {

    ArrayList<String> ResistorColors = new ArrayList<String>(Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"));

    int value(String[] colors) {

        String firstResistor =  String.valueOf(ResistorColors.indexOf(colors[0]));

        String secondResistor = String.valueOf(ResistorColors.indexOf(colors[1]));

        return Integer.valueOf(firstResistor + secondResistor);

    }
}
