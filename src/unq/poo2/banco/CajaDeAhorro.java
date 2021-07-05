package unq.poo2.banco;

public class CajaDeAhorro extends CuentaBancaria {
	
	 private int limite;
	 
	 
	 public CajaDeAhorro(String titular, int limite){
	 super(titular);
	 this.limite=limite;
	 }
	 
	 public int getLimite(){
	 return this.limite;
	 }
	 
	 @Override
	 public int cuantoPuedoExtraer() {
		 return Math.max(this.getLimite(), this.getSaldo());
	 }
	 
}

