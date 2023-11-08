import Tareas.aplanadorCollecion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
 /*       // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        List<Persona> personas = new ArrayList<>();
        personas.add (new Persona ("Jose"));
        personas.add (new Persona ("Maria"));
        personas.add (new Persona ("Carlos"));

        System.out.println(personas);
        List<String> personasString = personas.stream()
                .map((persona) -> persona.getNombre()).toList();
       // También podríamos a partir de n listado de nombres generar un listado de objetos Persona:
        List<Persona> otroListadoDepersonag = personasString.stream ().map(persona -> new Persona( persona)).toList();

        System.out.println(personasString);

        List<String> textos =new ArrayList<>();
        textos.add("Primero");
        textos.add("Segundo" );
        textos.add("Tercero");
        String textoResultante = textos.stream ().collect(Collectors.joining());
        System.out.println(textoResultante);
    }
 */

        //EJERCICIO 1:
        Scanner scn = new Scanner(System.in);
        String textoConsola = scn.nextLine();
        List<String> listadoIngresado;
        listadoIngresado = List.of(textoConsola.split(" "));
        List<String> listadoMayúscula;
        listadoIngresado.stream()
                .forEach(x -> System.out.println(x));

        // Acá en el cuerpo principal
    /*    listadoMayúscula = listadoIngresado.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
    */

        //Acá llamo a la clase conversorStrings
        listadoMayúscula = Tareas.conversorStrings.convertirString(listadoIngresado);
        System.out.println(listadoMayúscula);
        //ACÁ LLAMO AL MÉTODO PARA APLANAR, ASIGNADO ARBITRARIAMENTE LA LONGITUD DE LA LISTA COMO
        //EL INT FILTRO QUE VA A DETERMINAR CUÁNTOS CARACTERES MÍNIMOS DEBE TENER LA PALABRA:
        //SI SE INGRESAN 7 STRINGS SEPARADOS POR COMAS, EL MÉTODO SÓLO DEVOLVERÁ UN LISTADO CON PALABRAS
        //DE MÁS DE 7 CARACTERES.
        String listPlana = aplanadorCollecion.aplanarCollection(listadoMayúscula, listadoIngresado.size());
        System.out.println(listPlana);
    }

}