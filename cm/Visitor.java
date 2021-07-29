package cm;

import java.math.BigDecimal;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;

public class Visitor implements Charge {

    public BigDecimal Charge(BigDecimal total) {

        BigDecimal a = new BigDecimal(8);

        if (total.compareTo(a) <= 0) {
            return BigDecimal.ZERO;
        }else {
            return (total.subtract(a)).divide(new BigDecimal(2));

        }
    }
}
