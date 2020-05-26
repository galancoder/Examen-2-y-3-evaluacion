import java.util.Date;

public class CONTRATISTAS extends EMPLEADOS{
	
	private SOCIEDAD_ANONIMA sociedad_anonima;
	

	public SOCIEDAD_ANONIMA getSociedad_anonima() {
		return sociedad_anonima;
	}


	public void setSociedad_anonima(SOCIEDAD_ANONIMA sociedad_anonima) {
		this.sociedad_anonima = sociedad_anonima;
	}


	public CONTRATISTAS(String nombre, String apellidos, Date fecha_contratacion, int salario, int cuenta_bancaria,
			SOCIEDAD_ANONIMA sociedad_anonima) {
		super(nombre, apellidos, fecha_contratacion, salario, cuenta_bancaria);
		this.sociedad_anonima = sociedad_anonima;
	}


	@Override
	public String toString() {
		return "CONTRATISTAS [sociedad_anonima=" + sociedad_anonima + "]";
	}

	
	
	
	
	
	
}
