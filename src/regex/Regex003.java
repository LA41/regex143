package regex;

public class Regex003 {
    public static void main(String[] args) {
        RegexTester firstNameTester = new RegexTester("[A-Z][a-z]+");
        firstNameTester.validate("Janusz");
        firstNameTester.validate("Bo");
        firstNameTester.validate("urszula");
        firstNameTester.validate("T");

        RegexTester surnameTester = new RegexTester("[a-zA-Z]['a-zA-Z\\-\\ ]+");
        surnameTester.validate("Bachleda-Curus");
        surnameTester.validate("de Silva");
        surnameTester.validate("De Silva");
        surnameTester.validate("bO-t");
        surnameTester.validate("d'Artagnan");

        surnameTester.validate("Kowalska-");
        surnameTester.validate("123123123");
        surnameTester.validate("12312-3123");
        surnameTester.validate("de 12312-3123");
        surnameTester.validate("!@$$:");
    }
}
