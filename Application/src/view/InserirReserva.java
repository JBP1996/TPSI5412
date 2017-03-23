/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Cliente;
import model.Restaurante;

/**
 *
 * @author JBP1996 Atec
 */
public class InserirReserva {
    Cliente c;
    Restaurante r;
    private void inserirCliente(){
        System.out.println("Insira o nome do cliente");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Insira a morada do cliente ");
        String morada = new Scanner(System.in).nextLine();
        System.out.println("Insira o email do cliente");
        String email = new Scanner(System.in).nextLine();
        System.out.println("Insira o telefone do cliente");
        String telefone = new Scanner(System.in).nextLine();
        
        c.setNome(nome);
        c.setMorada(morada);
        c.setEmail(email);
        c.setTelefone(telefone);
    }
    
    private void inserirRestaurante(){
        
        System.out.println("Insira o nome do restaurante");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Insira a morada do restaurante");
        String morada = new Scanner(System.in).nextLine();
        System.out.println("Insira o email do restaurante");
        String contacto = new Scanner(System.in).nextLine();
        System.out.println("Insira o telefone do restaurante");
        String especialidade = new Scanner(System.in).nextLine();
        
        r.setNome(nome);
        r.setMorada(morada);
        r.setContacto(contacto);
        r.setEspecialidade(especialidade);
        
    }
    
    public InserirReserva() {
        
        
    }
    
}
