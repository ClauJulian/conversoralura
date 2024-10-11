package com.claudiajulian.conversoralura.modelos;

public class Coin {
    private String base_code;
    private  Conversion_rates conversion_rates;

    public Coin(String base_code, Conversion_rates conversion_rates) {
        this.base_code = base_code;
        this.conversion_rates = conversion_rates;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public Conversion_rates getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Conversion_rates conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
