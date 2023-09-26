package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTester {
    private final Pattern p;
    public RegexTester(String patternAsString){
        this.p = Pattern.compile(patternAsString);
    }
    public void validate(String text){
        Matcher m = p.matcher(text);
        if (m.matches())
            System.out.println("Prawda dla tekstu: " + text);
        else
            System.out.println("Fałsz dla tekstu: " + text);
    }
}
