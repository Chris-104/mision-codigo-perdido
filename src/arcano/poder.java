package arcano;

public class poder {

    String nombre;
    int danio;

    public poder(String nombre, int danio) {
        this.nombre = nombre;
        this.danio = danio;
    }

    public String activar() {
        return "¡El cielo se quiebra al liberar " 
                + nombre 
                + " causando " 
                + danio 
                + " de daño!";
    }
}