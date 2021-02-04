package cruz.alejandro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCabina {

	@Test
	public void queVerificaQueCuenteCorrectamenteLaCantidadDeVehiculosQuePaSanPorUnacabina() {
		Tag t1 = new Tag(2);
		Tag t2 = new Tag(3);
		Cabina c1 = new Cabina(1);
		Vehiculo v1 = new Coche("1");
		Vehiculo v2 = new AutoBus("2", t1);
		Vehiculo v3 = new AutoBus("3", t2);
		Vehiculo v4 = new Moto("4");
		Vehiculo v5 = new Moto("5");
		c1.pagar(v1);
		c1.pagar(v2);
		c1.pagar(v3);
		c1.pagar(v4);
		c1.pagar(v5);
		assertEquals((Integer) 5, c1.getCantidadDeAutosQuePasaron());

	}

	@Test
	public void queVerificaQueSeRecaudeCorrectaMenteElPagoDeUnVehiculo() {
		Tag t1 = new Tag(2);
		Tag t2 = new Tag(3);
		Cabina c1 = new Cabina(1);
		Vehiculo v1 = new Coche("1");
		Vehiculo v2 = new AutoBus("2", t1);
		Vehiculo v3 = new AutoBus("3", t2);
		Vehiculo v4 = new Moto("4");
		Vehiculo v5 = new Moto("5");
		c1.pagar(v1);
		c1.pagar(v2);
		c1.pagar(v3);
		c1.pagar(v4);
		c1.pagar(v5);
		assertEquals((Double) 600.0, c1.getRecaudacion());

	}

}