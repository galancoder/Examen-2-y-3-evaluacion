import java.util.Set;
import java.util.TreeSet;

public class SOCIEDAD_ANONIMA {

	private String nombre_sociedad;
	
	private Set<EMPRESAS_SERVICIOS> trabajos_especializados = new TreeSet<>();

	public SOCIEDAD_ANONIMA(String nombre_sociedad, Set<EMPRESAS_SERVICIOS> trabajos_especializados) {
		super();
		this.nombre_sociedad = nombre_sociedad;
		this.trabajos_especializados = trabajos_especializados;
	}

	public String getNombre_sociedad() {
		return nombre_sociedad;
	}

	public Set<EMPRESAS_SERVICIOS> getTrabajos_especializados() {
		return trabajos_especializados;
	}

	public void setTrabajos_especializados(Set<EMPRESAS_SERVICIOS> trabajos_especializados) {
		this.trabajos_especializados = trabajos_especializados;
	}

	@Override
	public String toString() {
		return "SOCIEDAD_ANONIMA [nombre_sociedad=" + nombre_sociedad + ", trabajos_especializados="
				+ trabajos_especializados + "]";
	}
	
	
	
}
