package Model;

import DB.DataBaseManager;
import Validators.BestValidatorEver;
import lombok.Data;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Deque;


@Data
public class ResultsBean implements Serializable {
    private Deque<Result> results;
    private double x = 0;
    private double y = 0;
    private double lastR = 2;
    private double r = 2;
    private String color = "black";
    private Deque<Result> resultDeque;


    public double getLastR() {
        return lastR;
    }

    public void setLastR(double lastR) {
        this.lastR = lastR;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        lastR = r;
        System.out.println("last r" + "= " + lastR);
        this.r = r;
    }

    public ResultsBean() {
        resultDeque = new ArrayDeque<>();
        resultDeque = DataBaseManager.loadData();
    }

//
//    public void reload(){
//        resultDeque = new ArrayDeque<>();
//        resultDeque=DataBaseManager.loadData();
//    }

    public void add() {
        try {
//            reload();
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        x = Double.parseDouble(request.getParameter("formID:x"));
        y = Double.parseDouble(request.getParameter("formID:y"));
        r = Double.parseDouble(request.getParameter("formID:r"));
        if (BestValidatorEver.checkDataIsValid(x, y, r)) {
            setLastR(r);
            System.out.println(x + " " + y + " " + r);
            Result result = new Result(x, y, r, System.nanoTime());
            DataBaseManager.save(result);
            resultDeque.addFirst(result);
            System.out.println(resultDeque.size());
        } else{
            System.out.println("bad req");
//            FacesMessage msg = new FacesMessage("Bad req");
//            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
//            throw new ValidatorException(msg);
        }}catch (Exception e){
            System.out.println("sth go wrong");
        }

    }

    public void clear() {
        DataBaseManager.clearData();
        x = 0.;
        y = 0.;
        r = 2.;
        resultDeque = new ArrayDeque<>();
    }
}