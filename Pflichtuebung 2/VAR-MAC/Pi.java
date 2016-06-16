import java.io.Serializable;
import java.math.BigDecimal;

public class Pi implements Serializable{

    /**
     * @param precision
     * @return Big Decimal Anzahl Zahlen innerhalb des Kreissegments als Big Decimal, damit die weitere Berechnung Problemlos erfolgt
     */
    public static BigDecimal computePi(int precision){
        BigDecimal counter = new BigDecimal("0");
        for(int i=0;i<precision;i++){
            double x = Math.random();
            double y = Math.random();
            if(Math.hypot(x,y)<=1.0D){
                counter.add(new BigDecimal("1"));
            }
        }
        return counter;
    }

}
