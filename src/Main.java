import com.claudiajulian.conversoralura.modelos.Coin;
import com.claudiajulian.conversoralura.modelos.ConsultaMoneda;
import com.claudiajulian.conversoralura.modelos.Operacion;
import com.google.gson.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingrese nombre de Usuario: ");
        String nombreUsuario = myScanner.nextLine();

        String mensajeBienvenida = """
                ----------------------------------------
                              Bienvenido %s
                 ** Conversor de Moneda Alura Latam ** 
                """.formatted(nombreUsuario);

        System.out.println(mensajeBienvenida);


        int convertirMoneda = 1;

        while (convertirMoneda != 0) {
            System.out.println("Deseas realizar una conversión de moneda? (Yes -> 1  --  N -> 0): ");
            convertirMoneda = myScanner.nextInt();

            if (convertirMoneda != 0) {
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
                double cambio = 0;
                ConsultaMoneda otraconsulta = new ConsultaMoneda();

                if(opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3){
                    Coin coin = otraconsulta.buscaMoneda("ARS");



                    switch (opcionSeleccionada){
                        case 1:
                            Operacion operacion1 = new Operacion("ARS","USD", montoAConvertir, cambio);
                            String resultado1 = operacion1.calculaMontoFinal("ARS", "USD", montoAConvertir, coin.getConversion_rates().getUSD());
                            System.out.println("*****************************" + "\n" + resultado1 + "\n" + "*****************************");
                            break;
                        case 2:
                            Operacion operacion2 = new Operacion("ARS","EUR", montoAConvertir, cambio);
                            String resultado2 = operacion2.calculaMontoFinal("ARS", "EUR", montoAConvertir, coin.getConversion_rates().getEUR());
                            System.out.println("*****************************" + "\n" + resultado2 + "\n" + "*****************************");
                            break;
                        case 3:
                            Operacion operacion3 = new Operacion("ARS","BRL", montoAConvertir, cambio);
                            String resultado3 = operacion3.calculaMontoFinal("ARS", "BRL", montoAConvertir, coin.getConversion_rates().getBRL());
                            System.out.println("*****************************" + "\n" + resultado3 + "\n" + "*****************************");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                };

               if(opcionSeleccionada == 4){
                    Coin coin = otraconsulta.buscaMoneda("USD");

                   Operacion operacion4 = new Operacion("USD","ARS", montoAConvertir, cambio);
                   String resultado4 = operacion4.calculaMontoFinal("USD", "ARS", montoAConvertir, coin.getConversion_rates().getARS());
                   System.out.println("*****************************"+ "\n"  + resultado4 + "\n" +"*****************************");

                };
                if(opcionSeleccionada == 5){
                    Coin coin = otraconsulta.buscaMoneda("EUR");

                    Operacion operacion5 = new Operacion("EUR","ARS", montoAConvertir, cambio);
                    String resultado5 = operacion5.calculaMontoFinal("EUR", "ARS", montoAConvertir, coin.getConversion_rates().getARS());
                    System.out.println("*****************************+" +"\n" + resultado5 + "\n" + "*****************************");

                };
                if(opcionSeleccionada == 6){
                    Coin coin = otraconsulta.buscaMoneda("BRL");

                    Operacion operacion6 = new Operacion("BRL","ARS", montoAConvertir, cambio);
                    String resultado6 = operacion6.calculaMontoFinal("BRL", "ARS", montoAConvertir, coin.getConversion_rates().getARS());
                    System.out.println("*****************************" + "\n" + resultado6 + "\n" +"*****************************");

                };



            }else{
                System.out.println("\n" + nombreUsuario + ", Gracias por visitar nuestro sitio Alura Exchange Rate!\n");
            }
        }
    }
}

