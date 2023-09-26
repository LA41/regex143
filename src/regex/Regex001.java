package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex001 {

        public static void main(String[] args) {
            RegexTester tester = new RegexTester("(\\+48)?5[0-9]{8}");
            tester.validate("515332123");
            tester.validate("+48512346789");
            tester.validate("515336293");
            tester.validate("712123");
            tester.validate("51123");
        }
}
