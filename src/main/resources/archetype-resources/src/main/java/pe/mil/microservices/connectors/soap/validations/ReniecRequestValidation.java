package pe.mil.microservices.connectors.soap.validations;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import pe.mil.microservices.components.validations.ISoapValidationRequest;
import pe.mil.microservices.components.wsdl.SoapValidationResult;
import pe.mil.microservices.connectors.wsdl.reniec.Consultar;
import pe.mil.microservices.utils.components.enums.ValidateResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Log4j2
@Component
public class ReniecRequestValidation implements ISoapValidationRequest<Consultar> {

    @Override
    public SoapValidationResult validateRequest(Consultar request) {

        final SoapValidationResult validationResult = SoapValidationResult
            .builder().validateResult(ValidateResult.SUCCESSFULLY_VALID).build();

        final List<String> errors = new ArrayList<>();

        if (Objects.isNull(request)) {
            log.error("error the soapRequest is null");
            errors.add("error the soapRequest is null");
        }

        if (Objects.isNull(request.getArg0())) {
            log.error("error the soapRequest body is null");
            errors.add("error the soapRequest body is null");
        }

        if (request.getArg0().getNuDniConsulta() == null || request.getArg0().getNuDniConsulta().isEmpty()) {
            log.error("error the soapRequest NuDniConsulta is null or empty");
            errors.add("error the soapRequest NuDniConsulta is null or empty");
        }

        if (!errors.isEmpty()) {
            log.info("errors is not empty, found  {} errors, ", errors.size());
            validationResult.setValidateResult(ValidateResult.NOT_VALID);
            validationResult.setErrors(errors);
        }

        return validationResult;
    }
}
