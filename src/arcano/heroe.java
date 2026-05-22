package arcano;

public class heroe {
	private String nombre; // El sello de identidad
    private int nivel;     // La experiencia en combate
    private int poder;     // La fuerza bruta

    // Constructor para inicializar al héroe
    public heroe(String nombre, int nivel, int poder) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.poder = poder;
    }

    // Ritual: Método entrenar()
    public void entrenar() {
        this.poder += 10; // Aumenta la fuerza bruta en 10 puntos
        System.out.println(nombre + " ha completado el ritual de entrenamiento. ¡Su poder aumentó en 10 puntos!");
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPoder() {
        return poder;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

