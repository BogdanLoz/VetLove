package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Cliente;


public class ConsultaCliente {
    public ConsultaCliente(ArrayList<Cliente> cli){
        int id;
        
        System.out.println("Procura por ID");
        id = new Scanner(System.in).nextInt();
        
           for(int i = 0;i<cli.size();i++){
              if(id == cli.get(i).getId()){
                System.out.println("Nome : "+cli.get(i).getNome());
                System.out.println("Morada : "+cli.get(i).getMorada());
                System.out.println("Telefone : "+cli.get(i).getTelefone());
                System.out.println("Email : "+cli.get(i).getEmail());
                
                  for(int j=0;j<cli.get(i).getAni().size();j++){
                    System.out.println("Classe do Animal : "+cli.get(i).getAni().get(j).getClasse());
                    System.out.println("Raca do Animal : "+cli.get(i).getAni().get(j).getRaca());
                    System.out.println("Data de Nasc do Animal : "+cli.get(i).getAni().get(j).getData_nasc());
                  }
              }
           }
    }
}
