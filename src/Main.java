import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de Usuario: ");

        String nombreUsuario = myScanner.nextLine();
        String mensajeBienvenida = """
                ----------------------------------------
                              Bienvenido %s
                 ** Conversor de Moneda Alura Latam ** 
                """.formatted(nombreUsuario);

        System.out.println(mensajeBienvenida);

        int convertirMoneda = 0;

        while (convertirMoneda != -1) {

            System.out.println("Deseas realizar una conversión de moneda? (Y/N): ");
            convertirMoneda = myScanner.nextInt();

            if (convertirMoneda != -1) {
                String menuDeConversion = """
                    
                    Elije el método de Conversión:
                    1. De Pesos Argentinos a Dólares
                    2. De Pesos Argentinos a Euros
                    3. De Pesos Argentinos a Reales
                    4. De Dólares a Pesos Argentinos
                    5. De Euros a Pesos Argentinos
                    6. De Reales a Pesos Argentinos
                    
                    """;
                System.out.println(menuDeConversion);
                int opcionSeleccionada = myScanner.nextInt();

                System.out.println("Ingresa el monto a convertir: ");
                double montoAConvertir = myScanner.nextDouble();


                switch (opcionSeleccionada) {
                    case 1:
                        System.out.println("Has elegido la opción De Pesos Argentinos a Dólares");
                        System.out.println(montoAConvertir + " equivalen a " + montoAConvertir / 1000 + " dolares");
                        break;
                    case 2:
                        System.out.println("Has elegido la opción De Pesos Argentinos a Euros");
                        System.out.println(montoAConvertir + " equivalen a " + montoAConvertir / 1200 + " euros");
                        break;
                    case 3:
                        System.out.println("Has elegido la opción De Pesos Argentinos a Reales");
                        System.out.println(montoAConvertir + " equivalen a " + montoAConvertir / 600 + " reales");
                        break;
                    case 4:
                        System.out.println("Has elegido la opción De Pesos Dólares a Pesos Argentinos");
                        System.out.println(montoAConvertir + " equivalen a " + (montoAConvertir * 1000) + " pesos argentinos");
                        break;
                    case 5:
                        System.out.println("Has elegido la opción De Pesos Euros a Pesos Argentinos");
                        System.out.println(montoAConvertir + " equivalen a " + (montoAConvertir * 1000) + " pesos argentinos");
                        break;
                    case 6:
                        System.out.println("Has elegido la opción De Pesos Reales a Pesos Argentinos");
                        System.out.println(montoAConvertir + " equivalen a " + (montoAConvertir * 600) + " pesos argentinos");
                        break;
                    default:
                        System.out.println("Opción Incorrecta");
                        break;
                }

            } else {
                System.out.println( "Gracias por tu visita!");
            }

        }
    }
}
