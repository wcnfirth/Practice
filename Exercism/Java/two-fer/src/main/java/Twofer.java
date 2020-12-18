public class Twofer {
    public String twofer(String name) {

        if (name == null) name = "you";

        String result = String.format("One for %s, one for me.", name);

        System.out.println(result);

        return (result);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
