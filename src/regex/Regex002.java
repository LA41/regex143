package regex;

public class Regex002 {
    public static void main(String[] args) {
        RegexTester rt = new RegexTester("[A-Z][a-z]+");
        rt.validate("Java");//true
        rt.validate("Ja");//true
        rt.validate("java");//false
        rt.validate("javA");//false
        rt.validate("JAVa");//false
        rt.validate("J");//false
        rt.validate("aJ");//false
    }
}
