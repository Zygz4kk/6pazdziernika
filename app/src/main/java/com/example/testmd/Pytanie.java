package com.example.testmd;

public class Pytanie {
    private int idZdjecia;
    private String trescPytania;
    private boolean odpowiedz;
    //tak - true, nie - false
    private boolean poprawnaOdpowiedz;

    public Pytanie(int idZdjecia, String trescPytania, boolean odpowiedz) {
        this.idZdjecia = idZdjecia;
        this.trescPytania = trescPytania;
        this.odpowiedz = odpowiedz;
        poprawnaOdpowiedz = false;
    }

    public int getIdZdjecia() {
        return idZdjecia;
    }

    public String getTrescPytania() {
        return trescPytania;
    }

    public boolean isOdpowiedz() {
        return odpowiedz;
    }

    public boolean isPoprawnaOdpowiedz() {
        return poprawnaOdpowiedz;
    }

    public void setCzyPoprawnaOdpowiedz(boolean czyPoprawnaOdpowiedz){

    }
}
