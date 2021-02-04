package cruz.alejandro;

public class Orden {

	private Integer orden;
	
	public Orden(Integer orden) {
		this.orden=orden;
	}
	
	public String getOrden() {
		if(orden==1) {
			return "asc";
		}else {
			return "desc";
		}
	}
	
	
	
	
}