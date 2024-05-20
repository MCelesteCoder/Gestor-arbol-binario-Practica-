package proyecto3_maríaumaña;

//Esta clase tiene como proposito dar la estructura de arbol binario
public class Nodos {

    //Se crean los atributos de la clase los cuales representan las partes principales del nodo
    Movil movil;
    Nodos izq;
    Nodos derecho;

    //Se crea el constructor de Nodos
    public Nodos(Movil movil) {
        this.movil = movil;
        this.izq = null;
        this.derecho = null;

    }
}
