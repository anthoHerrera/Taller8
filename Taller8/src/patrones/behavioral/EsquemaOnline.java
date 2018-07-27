/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.behavioral;

import sinPatron.ComprobanteElectronico;

/**
 *
 * @author gabpa
 */
public class EsquemaOnline implements Strategy {

	@Override
	public void escogerEsquema(ComprobanteElectronico comprobante) {
		comprobante.setNumeroAutorizacion("123125"); //NUMERO DE AUTORIZACION POR EL SRI
	}
	
}
