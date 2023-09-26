package regex;

public class RegexReplaceSplit {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String replaced = text.replaceAll("\\w+", "***");
        System.out.println("original: " + text);
        System.out.println("replaced: " + replaced);
    }
}
