/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Cliente;
import model.Restaurante;
import model.Reserva;

/**
 *
 * @author JBP1996 Atec
 */
public class GestaoReservas {
    ArrayList<Reserva> re;
    
    public GestaoReservas(ArrayList<Reserva> re) {
        this.re = re;
    }
    /*
    public void inserirCliente(String nome, String morada, String email, String telefone){
        Cliente c= new Cliente(nome, morada, email, telefone);
        int novo_id = 
        r.setId(novo_id);
        
        re.add(r);
    }
    
    public void inserirRestaurante(int id, ArrayList<Cliente> cliente,ArrayList<Restaurante> restaurante,String prato){
        Reserva r= new Reserva(id, restaurante, cliente, prato);
        int novo_id = re.size();
        r.setId(novo_id);
        
        re.add(r);
    }
    */
    public void inserirReserva(int id, ArrayList<Cliente> cliente,ArrayList<Restaurante> restaurante,String prato){
        Reserva r= new Reserva(id, restaurante, cliente, prato);
        int novo_id = re.size();
        r.setId(novo_id);
        
        re.add(r);
    }
    
}
