package proyecto3_maríaumaña;

public class Movil {

    //Se declaran los atributos de la clase Movil
    private int Id;
    private String Marca;
    private int AnhoCreacion;
    private String SO;

    //Se crea el contructor
    public Movil(int Id, String Marca, int AnhoCreacion, String SO) {
        this.Id = Id;
        this.Marca = Marca;
        this.AnhoCreacion = AnhoCreacion;
        this.SO = SO;
    }

    //CREACIÓN DE LOS METODOS SETTER´S Y GETTE'S
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAnhoCreacion() {
        return AnhoCreacion;
    }

    public void setAnhoCreacion(int AnhoCreacion) {
        this.AnhoCreacion = AnhoCreacion;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }
}
