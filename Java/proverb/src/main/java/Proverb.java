import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Proverb {

    List<String> words = new ArrayList<String>();



    Proverb(String[] words) {

        Collections.addAll(this.words, words);

    }

    String recite() {

        if (words.isEmpty()) return "";

        StringBuilder proverb = new StringBuilder();

        for (int i = 0; i < words.size() - 1; i++) {
            proverb.append("For want of a " + words.get(i) + " the " + words.get(i+1) + " was lost.\n");
        }

        proverb.append("And all for the want of a " + words.get(0) + ".");

        System.out.println(proverb.toString());

        return proverb.toString();

    }

}
