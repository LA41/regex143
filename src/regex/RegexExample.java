package regex;


public class RegexExample {
    /*
    Predefiniowane klasy:
    \\d - jakakolwiek cyfra = [0-9]
    \\D - jakikolwiek znak, który nie jest cyfrą
    \\w - znak używany w słowach(word) = [a-zA-Z0-9_]
    \\W - jakikolwiek znak, który nie jest używany w słowach
            (zaprzeczenie tego powyżej)
    \\s - tzw białe znaki, czyli znak spacji, tabulacji itp.
            [ \t\n\r\f\x0B]
         znaki, które są niewidoczne podczas wydruku
 */
    public static void main(String[] args) {
        String yearPattern = "\\d{4}";
        RegexTester rt = new RegexTester(yearPattern);
        rt.validate("3333");
        rt.validate("1010101");
        rt.validate("0999");
    }
}
