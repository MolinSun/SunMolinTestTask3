package cm;

import java.math.BigDecimal;

public class Management implements Charge{

    public BigDecimal Charge(BigDecimal total){

        if (total.compareTo(new BigDecimal(3)) <= 0){
            return new BigDecimal(3);
        }else {
            return total;
        }
    }
}
