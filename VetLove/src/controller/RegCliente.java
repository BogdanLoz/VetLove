package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.Animal;
import model.Cliente;
import model.Ficha;

public class RegCliente {
    String nome,
           morada,
           telefone,
           email;
    int id;
   
    String raca,
            classe;
    String data_nasc;
    Ficha ficha; 

    public RegCliente(String nome, String morada, String telefone, String email, int id, String classe, String raca, String data_nasc, Ficha ficha) {
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        this.email = email;
        this.id = id;
        this.classe = classe;
        this.raca = raca;
        this.data_nasc = data_nasc;
        this.ficha = ficha;
    }

    public RegCliente(ArrayList<Cliente> cli){
        int opcao;
        int escolha;
        ArrayList<Animal> ani = new ArrayList<Animal>();
       
       do{ 
            id = cli.size();
            System.out.println("Nome do Cliente : ");
            nome = new Scanner(System.in).nextLine();
            System.out.println("Morada do Cliente : ");
            morada = new Scanner(System.in).nextLine();
            System.out.println("Telefone do Cliente : ");
            telefone = new Scanner(System.in).nextLine();
            System.out.println("Email do Cliente : ");
            email = new Scanner(System.in).nextLine();
            System.out.println("Tem Animal ? \n1->[s]\n2->[n]");
            escolha = new Scanner(System.in).nextInt();
            if(escolha == 1){
                System.out.println("Dados do Animal");
                System.out.println("Classe do Animal");
                classe = new Scanner(System.in).nextLine();
                System.out.println("Raca do Animal");
                raca = new Scanner(System.in).nextLine();
                System.out.println("Data de nascimento do Animal");
                data_nasc = new Scanner(System.in).nextLine();
                
                Animal animal = new Animal(classe, raca, data_nasc, ficha);
                ani.add(animal);
            }

            Cliente cliente = new Cliente(nome , morada, telefone, email, id, ani);
            cli.add(cliente);
            
            
            System.out.println("Quer Introduzir mais Sim[1]Nao[0]");
            opcao = new Scanner(System.in).nextInt();

       }while(opcao != 0);
        
    }

    
             
}
