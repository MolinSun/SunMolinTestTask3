package cm;

import java.math.BigDecimal;

public class Student implements Charge{

    public BigDecimal Charge(BigDecimal total){

        BigDecimal a = new BigDecimal(5.50);

        if(total.compareTo(a) <= 0){
            return total;
        }else{
            return ((total.subtract(a)).multiply(new BigDecimal(0.75))).add(a);
        }
    }
}
