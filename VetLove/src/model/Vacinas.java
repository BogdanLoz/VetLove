package model;

import java.util.ArrayList;
import java.util.Date;

public class Vacinas {
    Date dataVac;
    String nome;
    float preco;
    ArrayList<Vacinas> vacinas = new ArrayList<Vacinas>();

    public Vacinas(Date dataVac, String nome, float preco) {
        this.dataVac = dataVac;
        this.nome = nome;
        this.preco = preco;
    }

    public Date getDataVac() {
        return dataVac;
    }

    public void setDataVac(Date dataVac) {
        this.dataVac = dataVac;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ArrayList<Vacinas> getVacinas() {
        return vacinas;
    }

    public void setVacinas(ArrayList<Vacinas> vacinas) {
        this.vacinas = vacinas;
    }
    
    
}
