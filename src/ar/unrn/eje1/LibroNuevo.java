package ar.unrn.eje1;

public class LibroNuevo extends Libro {

	public LibroNuevo(String nombre, Integer codigoPrecio) {
		super(nombre, codigoPrecio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMonto(Integer diasAlquilados, Double monto) {
		return monto += diasAlquilados * 3;
	}

	@Override
	public Integer sumarPuntos(Integer diasAlquilados, Integer puntosAlquilerFrecuente) {
		if (diasAlquilados > 1)
			return 2 * PUNTO + puntosAlquilerFrecuente;

		return PUNTO + puntosAlquilerFrecuente;
	}
}
