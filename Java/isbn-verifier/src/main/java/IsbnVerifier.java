class IsbnVerifier {

    private static int isbnLength = 10;     // Specified ISBN length. Generally set to 10.

    /**
     * Check if given ISBN is valid
     */
    boolean isValid(String stringToVerify) {

        int calcSum = 0;    // Sum of ISBN validation formula

        // Remove dashes, convert String to array of individual String letters/numbers
        String stringToVerifyWithoutDashes = stringToVerify.replaceAll("-", "");
        String[] isbnDigits = stringToVerifyWithoutDashes.split("");

        if (isbnDigits.length != isbnLength) return false;

        // Complete formula for first 9 (or whatever length is minus 1) digits
        for (int i = 0; i < isbnLength - 1; i++) {
            try {
                calcSum += Integer.parseInt(isbnDigits[i]) * (isbnLength - i);
            } catch (Exception e) {
                return false;
            }
        }

        // Check if final digit is an 'X' or 'x' - if so, add 10 to calcSum. If not try to convert value to Int
        if (isbnDigits[isbnLength - 1].equals("X") || isbnDigits[isbnLength - 1].equals("x")) {
            calcSum += 10;
        } else {
            try {
                calcSum += Integer.parseInt(isbnDigits[isbnLength - 1]);
            } catch (Exception e) {
                return false;
            }
        }

        // If formula returns 0 then ISBN is valid
        if (calcSum % 11 == 0) return true;

        return false;

    }
}
