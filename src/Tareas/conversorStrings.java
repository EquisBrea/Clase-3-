package Tareas;

import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class conversorStrings {

    public static List<String> convertirString(List<String> entra) {

        List<String> salid = entra.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
        return salid;
    }
}
