package Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.ManagedBean;

@ManagedBean
@Data
@NoArgsConstructor
public class AvgClickTimeBean {
    private PointCounterBean pointCounterBean;
    private long interval_count = 0;
    private long interval_sum = 0;
    private long avgTime = 0;
    private long last_click_time = -1;

    public void calcAvgTime() {
        long current_click = System.currentTimeMillis();
        if (last_click_time != -1) {
            interval_sum += current_click - last_click_time;
            interval_count++;
            avgTime = interval_sum / interval_count;
            last_click_time = current_click;
        }
    }
}
