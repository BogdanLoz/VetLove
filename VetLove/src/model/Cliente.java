package model;

import java.util.ArrayList;

public class Cliente {
    private String nome,
                   morada,
                   telefone,
                   email;
    private int id;
    private ArrayList<Animal> ani = new ArrayList<Animal>(); 

    public Cliente(String nome, String morada, String telefone, String email, int id, ArrayList<Animal> ani) {
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        this.email = email;
        this.id = id;
        this.ani = ani;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Animal> getAni() {
        return ani;
    }

    public void setAni(ArrayList<Animal> ani) {
        this.ani = ani;
    }

    
    
}
