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
public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void establecerEsquema(ComprobanteElectronico comprobante){
		strategy.escogerEsquema(comprobante);
	}
}
