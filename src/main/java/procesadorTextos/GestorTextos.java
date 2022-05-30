package procesadorTextos;

import com.tony.model.Texto;

import java.util.List;

public class GestorTextos {

    List<Texto> textos = new AlmacenTextos().getConjuntoTextos();

    public static void main(String[] args) {
        //Coge elemento 3 -> mayusculas
        pasarPrimeraMayusculasElemento(3);
    }

    public void pasarAMayusculasElemento(int indx) {
        textos.get(indx).pasarAMayusculas();
    }

    public void pasarAMayusculasSubconjunto(int indx1, int indx2) {
        textos.get(indx1, indx2).pasarAMayusculas();
    }

    public void pasarAMinusculasElemento(int indx) {
        textos.get(indx).pasarAMinusculas();
    }

    public void pasarAMinusculasSubconjunto(int indx1, int indx2) {
        textos.get(indx1, indx2).pasarAMinusculas();
    }

    public void pasarPrimeraMayusculasElemento(int indx) {
        textos.get(indx).pasarPrimeraMayusculas();
    }

    public void pasarPrimeraMayusculasSubconjunto(int indx1, int indx2) {
        textos.get(indx1, indx2).pasarPrimeraMayusculas();
    }

    public void modoOracionElemento(int indx) {
        textos.get(indx).modoOracion();
    }

    public void modoOracionSubconjunto(int indx1, int indx2) {
        textos.get(indx1, indx2).modoOracion();
    }

}
