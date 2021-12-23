package Util;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "navigationController", eager = true)
@SessionScoped
public class NavigationController implements Serializable {
    public String processApp() {
        System.out.println("zaebalo");
        return "success";
    }
    public String processMain() {
        return "success";
    }
}