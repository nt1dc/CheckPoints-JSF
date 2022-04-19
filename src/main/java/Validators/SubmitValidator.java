package Validators;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.HttpServletRequest;


@ManagedBean
@FacesValidator("SubValidator")
public class SubmitValidator implements Validator {
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        double x = Double.parseDouble(request.getParameter("formID:x"));
        double y = Double.parseDouble(request.getParameter("formID:y"));
        double r = Double.parseDouble(request.getParameter("formID:r"));
        if (!BestValidatorEver.checkDataIsValid(x, y, r)) {
            FacesMessage msg = new FacesMessage("Bad req");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}
