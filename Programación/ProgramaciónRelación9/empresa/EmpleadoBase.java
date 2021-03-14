package empresa;

public class EmpleadoBase extends Empleado{

	private static final double INCREMENTO_SUELDO_EMPLEADO_BASE = 0.025;
	private TipoPuesto puesto;
	
	//Eliminamos (int sueldo) del constructor para que no sea modificable, lo reemplazamos por el TipoPuesto puesto.getSueldoInicial
	public EmpleadoBase(String dni, String nombre, TipoPuesto puesto) throws EmpresaException {
		super(dni, nombre, puesto.getSueldoInicial());
		this.puesto = puesto;

	}

	public TipoPuesto getPuesto() {
		return puesto;
	}
	
	//No es necesario si no se puede cambiar de puesto
//	public void setPuesto(TipoPuesto puesto) {
//		this.puesto = puesto;
//	}

	@Override
	public void actualizarSueldo() throws EmpresaException { //Este error no va a darse en ningun caso
		
		int nuevoSueldo;
						//super.||get||this.
		nuevoSueldo = (int) (super.getSueldo() + (super.getSueldo() * INCREMENTO_SUELDO_EMPLEADO_BASE));
		
		//se puede tambien con try/catch
		super.setSueldo(nuevoSueldo);
	}

	@Override
	public String toString() {
		return super.toString() + "EmpleadoBase [puesto=" + puesto + "]";
	}

	
}
