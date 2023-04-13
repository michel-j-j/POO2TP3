package ar.unrn.eje4;

import java.util.Optional;

import org.jdbi.v3.core.Jdbi;

public class Main {

	public static void main(String[] args) {

		Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

		new SetUpDatabase(jdbi).setUp();

		var repo = new PersonaRepository(jdbi);
		var personas = repo.buscarPorNombre("Vla");

		personas.ifPresent(p -> {
			for (Persona persona : p) {
				System.out.println(persona.nombre() + " " + persona.apellido());
			}
		});

		Optional<Persona> persona = repo.buscarId(1L);
		persona.ifPresent(p -> {
			System.out.println(p.nombre() + " " + p.apellido());
		});

	}
}
