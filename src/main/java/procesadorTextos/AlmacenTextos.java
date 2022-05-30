package procesadorTextos;

import com.tony.model.Texto;

import java.util.ArrayList;
import java.util.List;

public class AlmacenTextos {

    private List<Texto> conjuntoTextos = new ArrayList();

    public AlmacenTextos() {
        conjuntoTextos.add(new Texto("Hola mundo"));
        conjuntoTextos.add(new Texto("Me estoy volviendo loco"));
        conjuntoTextos.add(new Texto("Aserejé a dejé"));
        conjuntoTextos.add(new Texto("dejeveré to jeveré "));
        conjuntoTextos.add(new Texto("se yu noui"));
    }


    public List<Texto> getConjuntoTextos() {
        return conjuntoTextos;
    }

    public void setConjuntoTextos(List<Texto> conjuntoTextos) {
        this.conjuntoTextos = conjuntoTextos;
    }
}


