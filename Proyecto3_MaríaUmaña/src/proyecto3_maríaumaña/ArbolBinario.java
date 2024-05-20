package proyecto3_maríaumaña;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ArbolBinario {

    Nodos raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    //METODOS DE VERIFICACION DE ID EXISTENTE   
    public boolean revisarSiExisteID(int id) {
        return revisarSiExisteIDRecursivo(raiz, id);
    }

    private boolean revisarSiExisteIDRecursivo(Nodos nodo, int id) {

        //Si el nodo es nulo significa que se llego al final del arbol sin coincidencias
        if (nodo == null) {
            return false;
        }

        //Si el nodo actual es igual al id ingresado por el usuario se returna true
        if (nodo.movil.getId() == id) {
            return true;
        }

        //Se hace un llamado recursivo para revisar los subarboles
        return revisarSiExisteIDRecursivo(nodo.izq, id) || revisarSiExisteIDRecursivo(nodo.derecho, id);
    }

    //METODO PARA INGRESAR UN NUEVO NODO AL ARBOL BINARIO
    public void ingresarAlArbolBinario(Movil movil) {
        //Se cre aun nuevo nodo que representa el nodo nuevo que se inserta
        Nodos nuevo = new Nodos(movil);

        //Si la raiz es nulla entonces se establece que nuevo es la raiz
        if (raiz == null) {
            raiz = nuevo;
            return;
        }

        Nodos actual = raiz;//Sirve para seguir recorriendo el arbol binario
        Nodos padre = null; //Almacena el nodo padre

        //Se busca el lugar correcto del nodo nuevo
        while (actual != null) {
            padre = actual; //Se actualiza el nodo padre

            //Si el nuevo nodo es menor que el nodo actual se mueve al subarbol izquuierdo
            if (movil.getId() < actual.movil.getId()) {
                actual = actual.izq;
            } else { //Si el nuevo nodo es mayor que el nodo actual se mueve al subarbol derecho
                actual = actual.derecho;
            }
        }

        //Dependiendo de el nodo nuevo es menor o mayor que el nodo padre se establece como el nodo padre el hijo izquierdo o derecho
        if (movil.getId() < padre.movil.getId()) {
            padre.izq = nuevo;
        } else {
            padre.derecho = nuevo;
        }
    }

    //METODO PARA MOSTRAR LOS DATOS EN LA TABLA BUSCAR SI COINCIDE EL ID
    public void MostrarTablaBuscar(DefaultTableModel tablaBuscar, int id) {
        //Se limpia la tabla
        tablaBuscar.setRowCount(0);

        //Se empieza la busqueda en la raiz
        Nodos actual = raiz;

        while (actual != null) {

            //Si el nodo actual es igual al id recibido como parametro entonces se agrega la informacion a la tabla
            if (actual.movil.getId() == id) {
                Movil movil = actual.movil;
                Object[] fila = {movil.getId(), movil.getMarca(), movil.getAnhoCreacion(), movil.getSO()};

                tablaBuscar.addRow(fila);
                break;
                //Si el id recibido es menor que el nodo actual se mueve al subarbol izquierdo    
            } else if (id < actual.movil.getId()) {
                actual = actual.izq;
            } else {  //Si el id recibido es mayor que el nodo actual se mueve al subarbol derecho
                actual = actual.derecho;
            }
        }
    }

    //METODO PARA MOSTRAR LOS DATOS EN LA TABLA ELIMINAR SI COINCIDE EL ID
    public void MostrarTablaEliminar(DefaultTableModel tablaEliminar, int id) {
        tablaEliminar.setRowCount(0);

        //Se empieza la busqueda en la raiz
        Nodos actual = raiz;

        while (actual != null) {
            //Si el nodo actual es igual al id recibido como parametro entonces se agrega la informacion a la tabla
            if (actual.movil.getId() == id) {
                Movil movil = actual.movil;
                Object[] fila = {movil.getId(), movil.getMarca(), movil.getAnhoCreacion(), movil.getSO()};

                tablaEliminar.addRow(fila);
                break;
            } else if (id < actual.movil.getId()) { //Si el id recibido es menor que el nodo actual se mueve al subarbol izquierdo    
                actual = actual.izq;
            } else {//Si el id recibido es mayor que el nodo actual se mueve al subarbol derecho
                actual = actual.derecho;
            }
        }
    }

    //METODOS PARA ELIMINAR UN NODO DEL ARBOL BINARIO
    public void eliminarNodo(int id) {
        raiz = eliminarNodoRecursivo(raiz, id);
    }

    private Nodos eliminarNodoRecursivo(Nodos nodo, int id) {

        //Si nodo es nulo entonces el arbol esta vacio o se llego a un nodo hoja
        if (nodo == null) {
            return null;
        }

        if (id < nodo.movil.getId()) { //Si el id es menor que el id actual se busca en el subarbol izquierdo
            nodo.izq = eliminarNodoRecursivo(nodo.izq, id);

        } else if (id > nodo.movil.getId()) {//Si el id es mayor que el id actual se busca en el subarbol derecho
            nodo.derecho = eliminarNodoRecursivo(nodo.derecho, id);
        } else {
            //Se encontro el nodo a eliminar

            //Si el nodo no tiene hijos solo se elimina
            if (nodo.izq == null && nodo.derecho == null) {
                return null;
            } else if (nodo.izq == null) { //Si solo tiene nodo hijo derecho se devuelve el nodo derecho para que se convierta en el hijo del nodo padre que se queire eliminar
                return nodo.derecho;
            } else if (nodo.derecho == null) {//Si solo tiene nodo hijo izquierdo se devuelve el nodo izquierdo para que se convierta en el hijo del nodo padre que se queire eliminar
                return nodo.izq;
            } else {
                //Tiene dos nodos hijos por lo que no se puede eliminar 
                JOptionPane.showMessageDialog(null, "No se puede eliminar el nodo porque tiene dos hijos.");
                return nodo;
            }
        }

        return nodo;

    }

    //METODOS PARA MOSTRAR UN LISTADOS DE LOS NODOS DEL ARBOL BINARIO
    public void mostrarTablaListado(DefaultTableModel tablaListado) {
        mostrarTablaListadoRecursivo(raiz, tablaListado);
    }

    //Metodo para mostrar el arbol binario
    public void mostrarTablaListadoRecursivo(Nodos nodo, DefaultTableModel tablaListado) {

        //Si nodo es diferente a null, por lo que mientra no se llegue a un nodo hoja o el arbol este vacio
        if (nodo != null) {

            //Se muestran los nodos del subarbol izquierdo con el llamado recursivo 
            mostrarTablaListadoRecursivo(nodo.izq, tablaListado);

            //Se agrega el nodo actual en la tabla con todos sus datos
            Movil movil = nodo.movil;
            Object[] fila = {movil.getId(), movil.getMarca(), movil.getAnhoCreacion(), movil.getSO()};
            tablaListado.addRow(fila);

            //Se muestran los nodos del subarbol derecho con el llamado recursivo 
            mostrarTablaListadoRecursivo(nodo.derecho, tablaListado);
        }
    }

    //METODOS PARA MOSTRAR LOS NODOS HOJAS DEL ARBOL BINARIO
    public void mostrarTablaNodosHojas(DefaultTableModel tablaNodos) {
        mostrarTablaNodosRecrusivo(raiz, tablaNodos);
    }

    public void mostrarTablaNodosRecrusivo(Nodos nodo, DefaultTableModel tablaNodos) {
        if (nodo != null) {

            //Se verifica que el nodo actual no tenga hijos y se agrega a la tabla 
            if (nodo.izq == null && nodo.derecho == null) {
                Movil movil = nodo.movil;
                Object[] fila = {movil.getId(), movil.getMarca(), movil.getAnhoCreacion(), movil.getSO()};
                tablaNodos.addRow(fila);
            }

            //Para revisar todos los nodos se llama recursivamente los subarboles
            mostrarTablaNodosRecrusivo(nodo.izq, tablaNodos);
            mostrarTablaNodosRecrusivo(nodo.derecho, tablaNodos);
        }
    }

    //METODOS PARA CALCULAR LA ALTURA DEL ARBOL BINARIO
    public int mostrarAlturaArbol() {
        return mostrarAlturaArbolRecursivo(raiz);
    }

    public int mostrarAlturaArbolRecursivo(Nodos nodo) {
        //si nodo es igual null el arbol esta vacio
        if (nodo == null) {
            return -1;
        } else {
            //Se calcula la altura llamando recursivamente ambos subarboles
            int altIzq = mostrarAlturaArbolRecursivo(nodo.izq);
            int altDerecho = mostrarAlturaArbolRecursivo(nodo.derecho);

            //Se calcula el maximo entre la altura de ambos subarboles mas 1
            return Math.max(altIzq, altDerecho) + 1;
        }
    }

    //METODOS PARA HACER EL RECORRIDO PREORDEN
    public void mostrarPreOrden(StringBuilder ids) {
        mostrarPreOrdenRecursivo(raiz, ids);
    }

    public void mostrarPreOrdenRecursivo(Nodos nodo, StringBuilder ids) {
        if (nodo != null) {

            //Se agrega el el id del nodo actual
            ids.append(nodo.movil.getId()).append("  -  ");

            //Se hace una llamada recursiva al subarbol izquierdo para ver todos los nodos
            mostrarPreOrdenRecursivo(nodo.izq, ids);

            //Se hace una llamada recursiva al subarbol derecho para ver todos los nodos
            mostrarPreOrdenRecursivo(nodo.derecho, ids);

        }

    }

    //METODOS PARA HACER EL RECORRIDO INORDEN
    public void mostrarInOrden(StringBuilder ids) {
        mostrarInOrdenRecursivo(raiz, ids);
    }

    public void mostrarInOrdenRecursivo(Nodos nodo, StringBuilder ids) {
        if (nodo != null) {

            //Se hace una llamada recursiva al subarbol izquierdo para ver todos los nodos
            mostrarPreOrdenRecursivo(nodo.izq, ids);

            //Se agrega el el id del nodo actual
            ids.append(nodo.movil.getId()).append("  -  ");

            //Se hace una llamada recursiva al subarbol derecho para ver todos los nodos
            mostrarPreOrdenRecursivo(nodo.derecho, ids);
        }

    }

    //METODOS PARA HACER EL RECORRIDO POSTORDEN
    public void mostrarPostOrden(StringBuilder ids) {
        mostrarPostOrdenRecursivo(raiz, ids);
    }

    public void mostrarPostOrdenRecursivo(Nodos nodo, StringBuilder ids) {
        if (nodo != null) {

            //Se hace una llamada recursiva al subarbol izquierdo para ver todos los nodos
            mostrarPreOrdenRecursivo(nodo.izq, ids);

            //Se hace una llamada recursiva al subarbol derecho para ver todos los nodos
            mostrarPreOrdenRecursivo(nodo.derecho, ids);

            //Se agrega el el id del nodo actual
            ids.append(nodo.movil.getId()).append("  -  ");
        }

    }
}
