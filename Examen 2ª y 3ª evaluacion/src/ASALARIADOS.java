import java.util.Date;

public class ASALARIADOS extends EMPLEADOS {

	private DEPARTAMENTO departamento;
	
	

	public ASALARIADOS(String nombre, String apellidos, Date fecha_contratacion, int salario, int cuenta_bancaria,
			DEPARTAMENTO departamento) {
		super(nombre, apellidos, fecha_contratacion, salario, cuenta_bancaria);
		this.departamento = departamento;
	}



	public DEPARTAMENTO getDepartamento() {
		return departamento;
	}



	public void setDepartamento(DEPARTAMENTO departamento) {
		this.departamento = departamento;
	}



	@Override
	public String toString() {
		return "ASALARIADOS [departamento=" + departamento + "]";
	}
	
	
	
	
	
}
