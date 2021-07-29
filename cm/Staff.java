package cm;

import java.math.BigDecimal;

public class Staff implements Charge{

    public BigDecimal Charge(BigDecimal total){

        BigDecimal a = new BigDecimal(16);

        if(total.compareTo(a) <= 0){
            return total;
        }else{
            return a;
        }
    }
}
