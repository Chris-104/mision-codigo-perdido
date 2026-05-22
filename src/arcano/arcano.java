package arcano;

public class arcano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Invoca al héroe directamente (ya no necesitas "arcano")
        heroe guerrero = new heroe("Aurelion", 5, 120);

        // 2. Otorga a la realidad un arma devastadora invocando la clase poder
        poder arma = new poder("Rayo de Destrucción", 420);

        // 3. Invoca el método entrenar() del héroe para prepararlo para la guerra
        guerrero.entrenar();

        // 4. Desata la furia llamando al método activar() del poder
        String devastacion = arma.activar();
        System.out.println(devastacion);

        // 5. Imprime en las runas de la consola los stats finales del héroe
        System.out.println("\n--- Stats finales del héroe ---");
        System.out.println("Nombre: " + guerrero.getNombre());
        System.out.println("Nivel: " + guerrero.getNivel());
        System.out.println("Poder: " + guerrero.getPoder());
    }
}

	
	



