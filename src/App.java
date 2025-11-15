public class App {
    public static void main(String[] args) throws Exception {
        int ancho = Integer.parseInt(System.console().readLine("Por favor, introduzca la anchura del rectángulo (como mínimo 2): "));
        int altura = Integer.parseInt(System.console().readLine("Ahora introduzca la altura (como mínimo 2): "));

        if (ancho < 2 || altura < 2) {
            System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == ancho - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
