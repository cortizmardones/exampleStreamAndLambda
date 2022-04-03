package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {

		try {

			Persona personaEsteban = new Persona("Esteban", "Bustos", 28);
			Persona personaCarlos = new Persona("Carlos", "Ortiz", 34);
			Persona personaFrancisco = new Persona("Francisco", "Salas", 48);
			Persona personaJaime = new Persona("Jaime", "Silva", 20);
			Persona personaAlma = new Persona("Alma", "Ortiz", 37);

			List<Persona> listaPersonas = new ArrayList<Persona>();
			listaPersonas.add(personaEsteban);
			listaPersonas.add(personaCarlos);
			listaPersonas.add(personaFrancisco);
			listaPersonas.add(personaJaime);
			listaPersonas.add(personaAlma);

			// Ejemplo de filtrado y devolución de datos.
			List<Persona> listaPersonaFiltradas1 = listaPersonas.stream()
					.filter(f -> f.getApellido().equalsIgnoreCase("Ortiz"))
					.map(m -> m)
					.collect(Collectors.toList());

			for (int i = 0; i < listaPersonaFiltradas1.size(); i++) {
				System.out.println(listaPersonaFiltradas1.get(i).getNombre().concat(" / ").concat(listaPersonaFiltradas1.get(i).getApellido()));
			}
			System.out.println("");

			// ######################### MAPAS ######################
			HashMap<String, String> mapaOriginal = new HashMap<String, String>();
			mapaOriginal.put("Nintendo", "Switch");
			mapaOriginal.put("Sony", "Play Station");
			mapaOriginal.put("Microsoft", "Xbox");

			// HashMap<String, String> mapaFiltrado =
			mapaOriginal.forEach((c, v) -> {
				System.out.println(c.concat("-").concat(v));
			});

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

//For Clásico
//for (int i = 0; i < listaPersonas.length; i++) {
//System.out.println("Nombre: " + listaPersonas[i].getNombre());
//System.out.println("Nombre: " + listaPersonas[i].getApellido());
//System.out.println("Nombre: " + listaPersonas[i].getEdad());
//}
//System.out.println("");


//Foreach
//for (Persona p : listaPersonas) {
//System.out.println("Nombre: " + p.getNombre());
//System.out.println("Nombre: " + p.getApellido());
//System.out.println("Edad: " + p.getEdad());
//}
//System.out.println("");


//Stream Foreach List/ArrayList
//List <Persona> listaPersonasList = Arrays.asList(listaPersonas);
//listaPersonasList.stream().forEach((i) -> {
//System.out.println("Nombre: " + i.getNombre());
//System.out.println("Nombre: " + i.getApellido());
//System.out.println("Edad: " + i.getEdad());
//});
//System.out.println("");


//Stream Foreach HashMap
//HashMap<String, String> mapa = new HashMap<String , String>();
//mapa.put("Sony","Play Station 5");
//mapa.put("Microsoft","Xbox One X");
//mapa.put("Nintendo","Nintendo Switch");
//mapa.forEach((k,v) -> {
//System.out.println("Clave: " + k + " / Valor: " + v);
//});
//System.out.println("");







//Ejemplo de filtrado e impresión.
//listaPersona.stream()
//.filter(f -> f.getApellido().equalsIgnoreCase("Ortiz"))
//.map(p -> p.getNombre().concat(" ").concat(p.getApellido()))
//.forEach(System.out::println);



////Recuperar la cantidad de coincidencias dependiendo del filtro.
//long numero = listaPersona.stream()
//.filter(f -> f.getApellido().equalsIgnoreCase("Ortiz"))
//.map(p -> p)
//.count();
//System.out.println(numero);



//LO MISMO PERO HECHO DE FORMA MAS PRO
//Ejemplo de filtrado y devolución de datos.
//List<Persona> listaPersonaFiltradas = listaPersona.stream()
//.filter(f -> f.getApellido().equalsIgnoreCase("Ortiz"))
//.map(p -> p)
//.collect(Collectors.toList());
//
//for(Persona p : listaPersonaFiltradas) {
//System.out.println(p.getNombre().concat(" ").concat(p.getApellido()));
//}
//
//
////1.Crear nuebva lista de personas vacia.
//List<Persona> listaPersonaApellidoOrtiz = new ArrayList<Persona>();
//
////2.Recorremos el primer array de personas
//for(int i = 0 ; i < listaArrayPersonas.length ; i++) {
//
//// 3.Preguntamos si en esta posicion el apellido es Ortiz , si es un si lo guardamos en una nueva lista
//if(listaArrayPersonas[i].getApellido().equalsIgnoreCase("Ortiz")) {
//listaPersonaApellidoOrtiz.add(listaArrayPersonas[i]);
//}
//
//}
//
////1.Recorremos la nueva lista.
//for(Persona p : listaPersonaApellidoOrtiz) {
//System.out.println(p.getNombre().concat(" ").concat(p.getApellido()));
//}
