package cruz.alejandro;

public class Moto extends Vehiculo {

	public Moto(String patente) {
		super(patente);
		
	}

	@Override
	public String getTipo() {
		return "Moto";
	}
}
