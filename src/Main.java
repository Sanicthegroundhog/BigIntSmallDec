import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        BigInteger number = new BigInteger("37878427844534321423");
        BigInteger number2 = new BigInteger("598498438756783562195780778536795721656757567853");
        BigInteger gcd = number.gcd(number2);
        System.out.println(number);
        System.out.println(number2);
        System.out.println(gcd);

        BigDecimal number3 = new BigDecimal("31132.89494258945890438954545454");
        BigDecimal number4 = new BigDecimal("14136734.785478927847278257825787824784578489");
        BigDecimal number3Squared = number3.pow(2);
        BigDecimal number4Squared = number3.pow(2);

    }
}
