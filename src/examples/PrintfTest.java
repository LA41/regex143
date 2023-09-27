package examples;

public class PrintfTest {
    /*
%c character
%d decimal (integer) number (base 10)
%e exponential floating-point number
%f floating-point number
%i integer (base 10)
%o octal number (base  😎%s String
%u unsigned decimal (integer) number
%x number in hexadecimal (base 16)
%t formats date/time
%% print a percent sign*/
    public static void main(String[] args) {
        int x = 100;
        float f = 2.331f;
        System.out.printf("result is %d\n", x);
        System.out.printf("float is %.2f\n", f);

        // całość ma zająć 5 znaków, chyba że jest więcej znaków przed przecinkiem

        System.out.printf("#%5.2f#\n", 2.28);
        System.out.printf("#%5.2f#\n", 2.28567890);
        System.out.printf("#%5.2f#\n", 2345345.123);

        System.out.printf("#%04.2f#\n", 2.1);
    }
}
