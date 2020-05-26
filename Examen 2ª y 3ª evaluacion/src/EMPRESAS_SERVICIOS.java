import java.util.Objects;

public class EMPRESAS_SERVICIOS implements COBROS_BANCARIOS {

	private String nombre_servicio;
	
	private String tipo_servicio;
	
	private int importe_mensual_servicio;
	
	private int numero_cuenta_bancaria;

	public EMPRESAS_SERVICIOS(String nombre_servicio, String tipo_servicio, int importe_mensual_servicio,
			int numero_cuenta_bancaria) {
		super();
		this.nombre_servicio = nombre_servicio;
		this.tipo_servicio = tipo_servicio;
		this.importe_mensual_servicio = importe_mensual_servicio;
		this.numero_cuenta_bancaria = numero_cuenta_bancaria;
	}

	public String getNombre_servicio() {
		return nombre_servicio;
	}

	public String getTipo_servicio() {
		return tipo_servicio;
	}

	public int getImporte_mensual_servicio() {
		return importe_mensual_servicio;
	}

	public int getNumero_cuenta_bancaria() {
		return numero_cuenta_bancaria;
	}

	public void setImporte_mensual_servicio(int importe_mensual_servicio) {
		this.importe_mensual_servicio = importe_mensual_servicio;
	}

	public void setNumero_cuenta_bancaria(int numero_cuenta_bancaria) {
		this.numero_cuenta_bancaria = numero_cuenta_bancaria;
	}

	@Override
	public String toString() {
		return "EMPRESAS_SERVICIOS [nombre_servicio=" + nombre_servicio + ", tipo_servicio=" + tipo_servicio
				+ ", importe_mensual_servicio=" + importe_mensual_servicio + ", numero_cuenta_bancaria="
				+ numero_cuenta_bancaria + "]";
	}
	
	
	@Override
	public void pagos() {
		
		System.out.println("Se van a ingresar "+importe_mensual_servicio+"en la cuenta con numero:"+numero_cuenta_bancaria );
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre_servicio, tipo_servicio,importe_mensual_servicio,numero_cuenta_bancaria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EMPRESAS_SERVICIOS other = (EMPRESAS_SERVICIOS) obj;
		if (importe_mensual_servicio != other.importe_mensual_servicio)
			return false;
		if (nombre_servicio == null) {
			if (other.nombre_servicio != null)
				return false;
		} else if (!nombre_servicio.equals(other.nombre_servicio))
			return false;
		if (numero_cuenta_bancaria != other.numero_cuenta_bancaria)
			return false;
		if (tipo_servicio == null) {
			if (other.tipo_servicio != null)
				return false;
		} else if (!tipo_servicio.equals(other.tipo_servicio))
			return false;
		return true;
	}
	
	
}
