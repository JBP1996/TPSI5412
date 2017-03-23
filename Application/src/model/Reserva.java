/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author JBP1996 Atec
 */
public class Reserva {
    private int id;
    ArrayList<Restaurante> restaurantes;
    ArrayList<Cliente> clientes;
    private String prato;

    public Reserva(int id, ArrayList<Restaurante> restaurantes, ArrayList<Cliente> clientes, String prato) {
        this.id = id;
        this.restaurantes = restaurantes;
        this.clientes = clientes;
        this.prato = prato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }
    
}
