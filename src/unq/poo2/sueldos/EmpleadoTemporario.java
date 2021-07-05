package unq.poo2.sueldos;

public class EmpleadoTemporario extends Empleado {

	double sueldoBase;
	double valorHora;
	int horasTrabajadas;
	double montoFamilia;
	boolean estaCasado;
	boolean tieneHijos;

	
	public EmpleadoTemporario(int hijos, boolean estaCasado, boolean tieneHijos) {
		this.sueldoBase = 1000;
		this.valorHora = 5;
		this.horasTrabajadas = 0;
		this.montoFamilia = 100;
		this.estaCasado = estaCasado;
		this.tieneHijos = tieneHijos;
	}

	
	@Override
	public double sueldoBruto() {
		return this.sueldoBase + (horasTrabajadas * valorHora) + this.montoFamilia();
	}
	
	public void setHorasTrabajadas(int horas) {
		this.horasTrabajadas = horas;
	}
	
	private double montoFamilia() {
		if (estaCasado || tieneHijos) {
			return montoFamilia;
		} 
		return 0;
	}
	
}
