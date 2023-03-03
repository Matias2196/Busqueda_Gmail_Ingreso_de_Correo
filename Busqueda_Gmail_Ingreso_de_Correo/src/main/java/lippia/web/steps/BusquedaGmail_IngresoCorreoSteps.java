package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.BusquedaGmail_IngresoCorreoServices;

public class BusquedaGmail_IngresoCorreoSteps extends PageSteps {

    @Given("Como usuario estoy en el inicio de google")
    public void ini() {
        BusquedaGmail_IngresoCorreoServices.ini();
    }
    @When("^Como usuaro escribo (.*) en el buscador$")
    public void busqueda(String gmail) {
        BusquedaGmail_IngresoCorreoServices.busqueda(gmail);
    }
    @Then("Como usuario ingeso a la web de gmail")
    public void resul() {
        BusquedaGmail_IngresoCorreoServices.resul();
    }

    ////////////////////////////////////////////////////////////////////////////

    @Given("^Como usuario estoy en la mainpage de (.*)$")
    public void mainpage(String gmail) {
        BusquedaGmail_IngresoCorreoServices.ini();
        BusquedaGmail_IngresoCorreoServices.busqueda(gmail);
    }
    @When("Como usuario me redirecciono a la seccion de inicio de session")
    public void redireccion() {
        BusquedaGmail_IngresoCorreoServices.redireccion();
    }
    @And("^Como usuario ingreso mi (.*)$")
    public void ingreso(String correo){
        BusquedaGmail_IngresoCorreoServices.ingreso(correo);
    }
    @Then("Como usuario espero al boton siguiente")
    public void resultados() {
        BusquedaGmail_IngresoCorreoServices.resultados();
    }

}
