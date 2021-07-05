package unq.poo2.banco;

public class CuentaCorriente extends CuentaBancaria {
	
	 private int limiteRojo;
	 
	 public CuentaCorriente(String titular, int limiteRojo){
	 super(titular);
	 this.limiteRojo=limiteRojo;
	 }
	 
	 public int getLimiteRojo(){
	 return this.limiteRojo;
	 }
	 
	 @Override
	 public int cuantoPuedoExtraer() {
		 return this.getSaldo() + this.getLimiteRojo();
	 }
	 
}
