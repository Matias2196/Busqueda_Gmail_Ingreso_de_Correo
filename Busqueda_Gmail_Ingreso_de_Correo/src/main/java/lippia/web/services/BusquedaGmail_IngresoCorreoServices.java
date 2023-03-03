package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.BusquedaGmail_IngresoCorreoConstants;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class BusquedaGmail_IngresoCorreoServices extends ActionManager {

    public static void ini() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void busqueda(String text) {
        setInput(BusquedaGmail_IngresoCorreoConstants.BUSQUEDA,text + Keys.ENTER);
        click(BusquedaGmail_IngresoCorreoConstants.REDIR);
    }
    public static void resul() {
        Assert.assertTrue(WebActionManager.getElement(BusquedaGmail_IngresoCorreoConstants.RESULTADO).isDisplayed());
    }

    /////////////////////////////////////////////////////////////////////////////////////

    public static void redireccion() {
        click(BusquedaGmail_IngresoCorreoConstants.REDIRECCION);
    }
    public static void ingreso(String text){
        setInput(BusquedaGmail_IngresoCorreoConstants.INGRESO,text);
    }
    public static void resultados(){
        Assert.assertTrue(WebActionManager.getElement(BusquedaGmail_IngresoCorreoConstants.ACCESO).isDisplayed());
    }

}
