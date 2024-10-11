package com.claudiajulian.conversoralura.modelos;

public class Moneda {

    private String base_code;
    private double conversion_rates ;


    public Moneda(String base_code) {
        this.base_code = base_code;
    }
    public Moneda(String base_code, double conversion_rates) {
        this.base_code = base_code;
        this.conversion_rates = conversion_rates;
    }

    public String getBase_code() {
        return base_code;
    }

    public double getConversion_rates() {
        return conversion_rates;
    }


}
