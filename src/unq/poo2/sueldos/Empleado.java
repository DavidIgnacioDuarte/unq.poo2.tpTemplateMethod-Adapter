package unq.poo2.sueldos;

public abstract class Empleado {

	
	//M�TODO PLANTILLA
	final public double sueldo() {
		return this.sueldoBruto() - ( this.sueldoBruto() * 0.13 );
	}
	
	//PASO A SOBREESCRIBIR POR SUBCLASES
	public abstract double sueldoBruto();
	
}
