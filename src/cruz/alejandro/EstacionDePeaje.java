package cruz.alejandro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EstacionDePeaje {

	private List<Cabina> cabinas;

	/*
	 * Al momento de la creacion de la estacion de peajes se deben crear todas las cabianas
	 * donde en la posicion 0 hay una cabina de Telepase y el resto de las cabinas son comunes 
	 */
	public EstacionDePeaje(Integer cantidadDeCabinas) {
		
		cabinas= new ArrayList<Cabina>();		

	}

	//Metodo que agrega todas las cabinas (No Obligatorio)
	private void agregarCabinas(Cabina cabina) {
			if(!cabinas.contains(cabina)) {
				cabinas.add(cabina);
			}
		};

	/*
	 * obtiene todas un listado de cabinas ordenas por importe recaudado en forma descendete
	 */
	public Set<Cabina> otenerCabinasOrdenadaImporteDescendente(Orden orden) {
		TreeSet<Cabina>ordenar = new TreeSet<Cabina>();
		ordenar.addAll(cabinas);
		if(orden.getOrden().equals("asc")) {
			return ordenar;
		}else {
			return ordenar.descendingSet();
		}
	}
	
}
