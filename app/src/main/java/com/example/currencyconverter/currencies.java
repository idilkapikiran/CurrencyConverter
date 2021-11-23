package com.example.currencyconverter;

public class currencies {
    private float eur;
    private float sek;
    private float usd;
    private float gbp;
    private float cny;
    private float jpy;
    private float krw;

    public currencies(float eur, float sek, float usd, float gbp, float cny, float jpy, float krw) {
        this.eur = eur;
        this.sek = sek;
        this.usd = usd;
        this.gbp = gbp;
        this.cny = cny;
        this.jpy = jpy;
        this.krw = krw;
    }

    public float getEUR() {
        return eur;
    }

    public float getSEK() {
        return sek;
    }

    public float getUSD() {
        return usd;
    }

    public float getGBP() {
        return gbp;
    }

    public float getCNY() {
        return cny;
    }

    public float getJPY() {
        return jpy;
    }

    public float getKRW() {
        return krw;
    }

    public void setEUR(float eur) {
        this.eur = eur;
    }


}
