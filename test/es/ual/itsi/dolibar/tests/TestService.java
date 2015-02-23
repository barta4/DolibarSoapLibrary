package es.ual.itsi.dolibar.tests;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.StringHolder;

import org.junit.Test;

import es.ual.itsi.dolibar.common.Authentication;
import es.ual.itsi.dolibar.holders.ResultHolder;
import es.ual.itsi.dolibar.holders.ThirdPartiesArray2Holder;
import es.ual.itsi.dolibar.terceros.Filterthirdparty;
import es.ual.itsi.dolibar.terceros.Thirdparty;
import es.ual.itsi.dolibar.terceros.WebServicesDolibarrThirdParty;
import es.ual.itsi.dolibar.terceros.WebServicesDolibarrThirdPartyLocator;
import es.ual.itsi.dolibar.terceros.WebServicesDolibarrThirdPartyPortType;

public class TestService {

	@Test
	public void test() {
		WebServicesDolibarrThirdPartyLocator locator = new WebServicesDolibarrThirdPartyLocator();
		try {
			WebServicesDolibarrThirdPartyPortType tparty=locator.getWebServicesDolibarrThirdPartyPort();
			Authentication autentication = new Authentication("48a8f4baefe4e216054d96eee812daf8", "", "pperez", "sb5cxywv", "");
			Filterthirdparty filtro = new Filterthirdparty();
			filtro.setClient("");
			filtro.setCategory("");
			filtro.setSupplier("");
			ResultHolder resultado = new ResultHolder();
			
			ThirdPartiesArray2Holder tpholder = new ThirdPartiesArray2Holder();
			tparty.getListOfThirdParties(autentication, filtro, resultado, tpholder);
			System.out.println("Numero de Clientes: "+tpholder.value.length);
			System.out.println("Creando Cliente: ");
			Thirdparty tercero = new Thirdparty();
			tercero.setId("");
			tercero.setRef_ext("");
			tercero.setFk_user_author(autentication.getLogin());
			tercero.setAddress("prueba 2");
			tercero.setDate_creation(Calendar.getInstance());
			tercero.setEmail("prueba@prueba.com");
			tercero.setRef("Prueba 2");
			tercero.setStatus("1");
			tercero.setClient("1");
			StringHolder id=new StringHolder();
			StringHolder ref= new StringHolder();
			tparty.createThirdParty(autentication, tercero, resultado, id, ref);
			if(id.value==null){
				fail(resultado.value.getResult_code()+" :"+resultado.value.getResult_label());
			}
			System.out.println("Nuevo tercero "+ id.value);
		} catch (ServiceException e) {
			fail("Error: "+e.getMessage());
			e.printStackTrace();
		} catch (RemoteException e) {
			fail("Error: "+e.getMessage());
			e.printStackTrace();
		}
	}

}
