package examples;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("933020299203030");
        BigDecimal bd2 = new BigDecimal("10193949944040494949444");
        System.out.println(bd1.add(bd2));
    }
}
