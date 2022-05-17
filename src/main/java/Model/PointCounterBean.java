package Model;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
@Data
public class PointCounterBean {
    Logger logger = LoggerFactory.getLogger(PointCounterBean.class);
    private int counter;

    public void incrementCounter() {
        counter++;
        if (counter % 10 == 0) {
            logger.debug("div 10 alert");
        }
    }
}
