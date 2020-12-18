import java.util.Arrays;

class RnaTranscription {

    String transcribe(String dnaStrand) {

        String[] dnaNucleotides = dnaStrand.split("");
        String rnaStrand = "";

        for (String nucleotide: dnaNucleotides) {

            switch (nucleotide) {
                case "G" : rnaStrand += "C";
                           break;
                case "C" : rnaStrand += "G";
                           break;
                case "T" : rnaStrand += "A";
                           break;
                case "A" : rnaStrand += "U";
                           break;
            }

        }

        return rnaStrand;

    }

}
