package Model;

import Util.Utils;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "\"Results\"")
@Data
@NoArgsConstructor
public class Result implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    public double x;
    public double y;
    public double r;
    @Column(name = "\"currentTime\"")
    public long currentTime;
    @Column(name = "\"resultTime\"")
    public long resultTime;
    @Column(name = "\"resultStatus\"")
    public boolean resultStatus;
    @Transient
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    public Result(double x, double y, double r, long date) {
        this.x = x;
        this.y = y;
        this.r = r;
        resultStatus = Utils.atArea(x, y, r);
        currentTime = new Date().getTime();
        resultTime = System.nanoTime() - date;
    }


    public String getSimpleCurrentTime() {
        return simpleDateFormat.format(currentTime);
    }


    public String getColor(double lastR) {
        if (Utils.atArea(x, y, lastR)) {
            return "green";
        } else return "red";
    }
}