import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

//Creamos esta clase con el fin de poder buscar en el arreglo que creamos en la clase Factura, datos tipo factura y poder crear las lambdas con facilidad
public class ListParametersFilter {
    
    List<Predicate<Factura>> filters = new ArrayList<>();
    
    public void addFilter(Predicate<Factura> filter)
    {
        filters.add(filter);
    }
    
    public Predicate<Factura> getFilter()
    {
        return filters.stream().reduce(Predicate::and).orElse(p -> true);
    }
}