import java.util.Date;
import java.util.Objects;

public abstract class EMPLEADOS implements COBROS_BANCARIOS, Comparable<EMPLEADOS> {

	private String nombre;
	private String apellidos; 
	private Date fecha_contratacion;
	private int salario;
	private int cuenta_bancaria;
	
	public EMPLEADOS(String nombre, String apellidos, Date fecha_contratacion, int salario, int cuenta_bancaria) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_contratacion = fecha_contratacion;
		this.salario = salario;
		this.cuenta_bancaria = cuenta_bancaria;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Date getFecha_contratacion() {
		return fecha_contratacion;
	}

	public int getSalario() {
		return salario;
	}

	public int getCuenta_bancaria() {
		return cuenta_bancaria;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public void setCuenta_bancaria(int cuenta_bancaria) {
		this.cuenta_bancaria = cuenta_bancaria;
	}

	@Override
	public String toString() {
		return "EMPLEADOS [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_contratacion=" + fecha_contratacion
				+ ", salario=" + salario + ", cuenta_bancaria=" + cuenta_bancaria + "]";
	}
	
	@Override
	public void pagos() {
		
		System.out.println("Se van a ingresar "+salario+"en la cuenta con numero:"+cuenta_bancaria );
		
	}
	

	public final int compareTo(EMPLEADOS p) 
	
	{ return apellidos.compareTo(p.apellidos);
	
	
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre,apellidos, fecha_contratacion,salario,cuenta_bancaria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EMPLEADOS other = (EMPLEADOS) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (cuenta_bancaria != other.cuenta_bancaria)
			return false;
		if (fecha_contratacion == null) {
			if (other.fecha_contratacion != null)
				return false;
		} else if (!fecha_contratacion.equals(other.fecha_contratacion))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (salario != other.salario)
			return false;
		return true;
	}
	
	
	
	}
	
	

