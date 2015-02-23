package es.ual.itsi.dolibar.tests;

import static org.junit.Assert.fail;

import javax.xml.rpc.holders.StringHolder;

import org.junit.Test;

import es.ual.itsi.dolibar.common.Authentication;
import es.ual.itsi.productos.Filterproduct;
import es.ual.itsi.productos.Product;
import es.ual.itsi.productos.WebServicesDolibarrProductOrServiceLocator;
import es.ual.itsi.productos.WebServicesDolibarrProductOrServicePortType;
import es.ual.itsi.productos.holders.ProductsArray2Holder;
import es.ual.itsi.productos.holders.ResultHolder;

public class TestProductos {
	@Test
	public void testListPRoductos(){
		WebServicesDolibarrProductOrServiceLocator locator = new WebServicesDolibarrProductOrServiceLocator();
		try {
			Authentication autentication = new Authentication("48a8f4baefe4e216054d96eee812daf8", "", "pperez", "sb5cxywv", "");
			Filterproduct filter = new Filterproduct("", "", "");
			WebServicesDolibarrProductOrServicePortType porttype = locator.getWebServicesDolibarrProductOrServicePort();
			ResultHolder resholder = new ResultHolder();
			ProductsArray2Holder parray2holder = new ProductsArray2Holder();
			porttype.getListOfProductsOrServices(autentication, filter, resholder, parray2holder);
			System.out.println("Numero de Productos: "+parray2holder.value.length);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			
		}
	}
	@Test
	public void testCreateProductos(){
		
			WebServicesDolibarrProductOrServiceLocator locator = new WebServicesDolibarrProductOrServiceLocator();
			try {
				Authentication autentication = new Authentication("48a8f4baefe4e216054d96eee812daf8", "", "pperez", "sb5cxywv", "");
				Filterproduct filter = new Filterproduct("", "", "");
				WebServicesDolibarrProductOrServicePortType porttype = locator.getWebServicesDolibarrProductOrServicePort();
				ResultHolder resholder = new ResultHolder();
				Product product = new Product();
				product.setRef("prueba");
				product.setPrice("1.20");
				product.setLabel("prueba");
				
				StringHolder id=new StringHolder();
				porttype.createProductOrService(autentication, product, resholder, id);
				System.out.println(id.value);
			}catch(Exception e){
				e.printStackTrace();
				fail(e.getMessage());
			}
	}
}
