package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex001 {
        private static final Pattern PATTERN = Pattern.compile("(\\+48)?5[0-9]{8}");

        public static void main(String[] args) {
            validate("515332123");
            validate("+48512346789");
            validate("515336293");
            validate("712123");
            validate("51123");
        }
        public static void validate(String text){
            Matcher matcher = PATTERN.matcher(text);
            if(matcher.matches()){
                System.out.println("Prawda dla tekstu: " + text);
            } else {
                System.out.println("Fałsz dla tekstu: " + text);
            }
        }
}
