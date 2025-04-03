/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller1;

/**
 *
 * @author jesus
 */
public class Usuario {
     private final String nombre;
    private final String email;
    private final String username;
    private final String clave;

    public Usuario(String nombre, String email, String username, String clave) {
        this.nombre = nombre;
        this.email = email;
        this.username = username;
        this.clave = clave;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getUsername() { return username; }
    public String getClave() { return clave; }
}


 
