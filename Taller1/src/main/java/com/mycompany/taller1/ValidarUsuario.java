/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;


import java.util.ArrayList;

/**
 *
 * @author jesus
 */

public class ValidarUsuario {
    private static final ArrayList<Usuario> usuarios = new ArrayList<>();

    public boolean validarUsuario(String username, String clave) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getClave().equals(clave)) {
                return true;
            }
        }
        return false;
    }

    public void registrarUsuario(String nombre, String email, String username, String clave) {
        Usuario nuevoUsuario = new Usuario(nombre, email, username, clave);
        usuarios.add(nuevoUsuario);
    }
}