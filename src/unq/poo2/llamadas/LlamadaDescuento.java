package unq.poo2.llamadas;

public class LlamadaDescuento extends LlamadaTelefonica {

	public LlamadaDescuento(int tiempo, int horaDelDia) {
		super(tiempo, horaDelDia);
		}
	
	//PASO SOBREESCRITO
		@Override
		public boolean esHoraPico() {
		return false;
		}
		
		@Override
		public float costoNeto(){
		return this.getTiempo()*0.95f;
		}
	
}
