package model;

import java.util.Date;

public class Animal {
    String classe,
           raca;
    String data_nasc;
    Ficha ficha; 

    public Animal(String classe, String raca, String data_nasc, Ficha ficha) {
        this.classe = classe;
        this.raca = raca;
        this.data_nasc = data_nasc;
        this.ficha = ficha;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

}
