package Model;

import Util.Utils;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "\"Results\"")
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


    public Result() {
    }

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


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public long getResultTime() {
        return resultTime;
    }

    public void setResultTime(long resultTime) {
        this.resultTime = resultTime;
    }

    public boolean isResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(boolean resultStatus) {
        this.resultStatus = resultStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Double.compare(result.x, x) == 0 && Double.compare(result.y, y) == 0 && Double.compare(result.r, r) == 0 && currentTime == result.currentTime && resultTime == result.resultTime && resultStatus == result.resultStatus && Objects.equals(id, result.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, x, y, r, currentTime, resultTime, resultStatus);
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", currentTime=" + currentTime +
                ", resultTime=" + resultTime +
                ", resultStatus=" + resultStatus +
                '}';
    }


    public String getColor(double lastR) {
        if (Utils.atArea(x,y,lastR)) {
            return "green";
        } else return "red";
    }
}