package ar.unrn.eje3;

public class Desayuno extends Comida {

	public Desayuno(Integer monto, String nombre) {
		super(monto, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String marcarGasto() {
		if (this.ObternerMonto() > 1000)
			return "X";
		return "";
	}

}
