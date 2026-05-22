package arcano;

public class arcano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class Heroe {
		
	    
		  
	    private String nombre; // El sello de identidad
	    private int nivel;     // La experiencia en combate
	    private int poder;     // La fuerza bruta

	    // Constructor para inicializar al héroe
	    public Heroe(String nombre, int nivel, int poder) {
	        this.nombre = nombre;
	        this.nivel = nivel;
	        this.poder = poder;
	    }

	    // Ritual: Método entrenar()
	    public void entrenar() {
	        this.poder += 10; // Aumenta la fuerza bruta en 10 puntos
	        System.out.println(nombre + " ha completado el ritual de entrenamiento. ¡Su poder aumentó en 10 puntos!");
	    }

	    // Métodos Getters y Setters (Opcionales, por si necesitas ver o modificar los datos desde fuera)
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

}
