package unq.poo2.banco;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {

	private String titular;
	private int saldo;
	private List<String> movimientos;

	
	
	public CuentaBancaria(String titular){
		this.titular=titular;
		this.saldo=0;
		this.movimientos=new ArrayList<String>();
	}

	public String getTitular(){
		return this.titular;
	}

	public int getSaldo(){																	
		return this.saldo;
	}
	
	protected void setSaldo(int monto){
		this.saldo=monto;
	}
	
	private void agregarMovimientos(String movimiento){
		this.movimientos.add(movimiento);
	}
	
	//TEMPLATE METHOD
	final public void extraer(int monto){
		if( this.cuantoPuedoExtraer() >= monto ){
			this.setSaldo(this.getSaldo()-monto);
			this.agregarMovimientos("Extraccion de " + monto);
		}
	}

	//PASO A SOBREESCRIBIR OBLIGATORIAMENTE
	public abstract int cuantoPuedoExtraer();


}
