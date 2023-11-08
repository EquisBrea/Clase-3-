package Tareas;

import java.util.List;
import java.util.stream.Collectors;

public class aplanadorCollecion  {
private List<String> listaEntrada;
private int longitud;

public static String aplanarCollection (List<String>listaEntrada, int longitud){
    String listaSalida = listaEntrada.stream()
            .map(x -> x.toString())
            .filter(x -> x.length()> longitud)
            .collect(Collectors.joining( ", "));
    return listaSalida;
}

}
