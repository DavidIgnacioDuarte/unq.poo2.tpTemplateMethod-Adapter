package unq.poo2.llamadas;

public abstract class LlamadaTelefonica {

	private int tiempo;
	private int horaDelDia;
	
	public LlamadaTelefonica(int tiempo, int horaDelDia){
	this.tiempo=tiempo;
	this.horaDelDia=horaDelDia;
	}
	
	public int getTiempo(){
	return this.tiempo;
	}
	
	public int getHoraDelDia(){
	return this.horaDelDia;
	}
	
	//PASO A SOBREESCRIBIR
	public abstract boolean esHoraPico();
	
	//TEMPLATE METHOD (PLANTILLA)
	public float costoFinal(){
		if(this.esHoraPico()){
		return this.costoNeto()*1.2f*this.getTiempo();
		}else{
		return this.costoNeto()*this.getTiempo();
		}
		}
	
	//HOOK METHOD
		public float costoNeto(){
		return this.getTiempo()*1;
		}
	
}
