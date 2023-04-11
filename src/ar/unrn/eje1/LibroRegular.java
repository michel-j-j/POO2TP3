package ar.unrn.eje1;

public class LibroRegular extends Libro {

	public LibroRegular(String nombre, Integer codigoPrecio) {
		super(nombre, codigoPrecio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMonto(Integer diasAlquilados, Double monto) {
		monto += 2;
		if (diasAlquilados > 2)
			monto += (diasAlquilados - 2) * 1.5;
		return monto;
	}

}
