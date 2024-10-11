package com.claudiajulian.conversoralura.modelos;

public class Conversion_rates {
    private float ARS;
    private float USD;
    private float EUR;
    private float BRL;

    public Conversion_rates(float USD, float EUR) {
        //this.ARS = ARS;
        this.USD = USD;
        this.USD = EUR;
    }

    public float getARS() {
        return ARS;
    }

    public float getEUR() {
        return EUR;
    }

    public double getUSD() {
        return USD;
    }

    public float getBRL() {
        return BRL;
    }
}
