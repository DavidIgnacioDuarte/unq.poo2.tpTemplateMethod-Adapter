package unq.poo2.sueldos;

public class EmpleadoPasante extends Empleado {
	
	double valorHora;
	int horasTrabajadas;

	
	public EmpleadoPasante() {
		this.valorHora = 40;
		this.horasTrabajadas = 0;
	}

	
	@Override
	public double sueldoBruto() {
		return horasTrabajadas * valorHora;
	}
	
	public void setHorasTrabajadas(int horas) {
		this.horasTrabajadas = horas;
	}
}
