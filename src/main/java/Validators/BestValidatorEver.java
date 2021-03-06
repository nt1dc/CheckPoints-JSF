package Validators;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@FacesValidator("BestValid")
public class BestValidatorEver implements Validator<Double> {
    private static final List<Double> rValues = Arrays.asList(2.0, 2.25, 2.5, 2.75, 3.0, 3.25, 3.25, 3.5, 3.75, 4.0, 4.25, 4.5, 4.75, 5.0);

    public static boolean checkDataIsValid(double x, double y, double r) {
        return rValues.contains(r) && (-4 <= x && x <= 4) && (-5 <= y && y <= 5);
    }

    @Override
    public void validate(FacesContext context, UIComponent component, Double value) throws ValidatorException {
        if (!rValues.contains(value)) {
            FacesMessage msg = new FacesMessage("zxc) ");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}
