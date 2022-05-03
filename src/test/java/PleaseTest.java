import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;

public class PleaseTest {
    @Test
    public void please() {
        System.out.println("please");
    }

    @Ignore
    @Test
    public void dead() {
        BigDecimal qwe = BigDecimal.valueOf(0);
        HashMap zxc = new HashMap();
        while (true) {
                if (qwe.compareTo(BigDecimal.valueOf(1000000000)) < 0) {
                zxc.put(qwe, qwe);
                System.out.println(qwe);
            } else {

                System.out.println("zcx");
                break;
            }
            qwe = qwe.add(BigDecimal.valueOf(1));
        }
    }
}
