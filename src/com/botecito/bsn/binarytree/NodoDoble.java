
package com.botecito.bsn.binarytree;

/**
 *
 * @author cadav
 */
public class NodoDoble {
    
    private Palabra dato;
    private NodoDoble ligaIzq;
    private NodoDoble ligaDer;

    public NodoDoble(Palabra dato) {
        this.dato = dato;
        ligaIzq = ligaDer = null;
    }

    public Palabra getDato() {
        return dato;
    }

    public NodoDoble getLigaIzq() {
        return ligaIzq;
    }

    public void setLigaIzq(NodoDoble ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    public NodoDoble getLigaDer() {
        return ligaDer;
    }

    public void setLigaDer(NodoDoble ligaDer) {
        this.ligaDer = ligaDer;
    }
    
    
}
  