public class Kuun {
    // function that add Mrs. if String have 'a' in text and else will be 'Mr'
    public static String title(String name) {
        String prefix = name.contains("a") ? "Mrs. " : "Mr. ";
        return prefix + name;
    }
}
