package unq.poo2.sueldos;

public class EmpleadoPlanta extends Empleado {

	double sueldoBase;
	int hijos;
	double montoHijo;
	
	
	public EmpleadoPlanta(int cantHijos) {
		this.hijos = cantHijos;
		this.montoHijo = 150;
		this.sueldoBase = 3000;
	}
	
	
	@Override
	public double sueldoBruto(){
		return this.sueldoBase + (hijos * montoHijo);
		
	}
	
}
