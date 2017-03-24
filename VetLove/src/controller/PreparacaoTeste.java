package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Animal;
import model.Cliente;

public class PreparacaoTeste {

    public static void main(String[] args) {
        
        int opcao;
        ArrayList<Cliente> cli = new ArrayList<Cliente>(); 
       
        do{
        System.out.println("Menu");
        System.out.println("1->Registo Cliente");
        System.out.println("2->Consulta Cliente");
        opcao = new Scanner(System.in).nextInt();
            switch(opcao)
            {
                case 1 : 
                    new RegCliente(cli);
                    break;
                case 2 :
                    new ConsultaCliente(cli);
                    break;
            }
        }while(opcao != 0);     
    }
    
}
