package com.claudiajulian.conversoralura.modelos;

public class Operacion {
    private String origen_code;
    private String final_code;

    private double final_value;
    private double monto_ingresado;


    public String calculaMontoFinal(String origen_code, String final_code, double monto_ingresado, double final_value){
        double montoFinal = monto_ingresado * final_value;
        String montoFormateado = String.format("%.2f",montoFinal);
        String mensaje = monto_ingresado + " " + origen_code + " equivalen a " + montoFormateado + " " + final_code;
        return mensaje;
    }

    public Operacion(String origen_code, String final_code, double monto_ingresado, double final_value) {
        this.origen_code = origen_code;
        this.final_code = final_code;
        this.monto_ingresado = monto_ingresado;
        this.final_value = final_value;
    }



    public String getOrigen_code() {
        return origen_code;
    }

    public String getFinal_code() {
        return final_code;
    }
}
