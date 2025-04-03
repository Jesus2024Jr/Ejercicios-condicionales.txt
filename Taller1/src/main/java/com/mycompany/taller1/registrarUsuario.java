/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jesus
 */
public class registrarUsuario {
// Configuración de la conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/Jesus";
    private static final String USER = "Jesus";
    private static final String PASSWORD = "12345";

    public void registrarUsuario(String nombre, String email, String username, String clave) {
        String sql = "INSERT INTO usuarios (nombre, email, username, clave) VALUES (?, ?, ?, ?)";
        
        try {
            try ( // Establecer conexión
                    Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement pstmt = conn.prepareStatement(sql)) {
                
                // Establecer parámetros
                pstmt.setString(1, nombre);
                pstmt.setString(2, email);
                pstmt.setString(3, username);
                pstmt.setString(4, clave);
                
                // Ejecutar la inserción
                int filasAfectadas = pstmt.executeUpdate();
                
                if (filasAfectadas > 0) {
                    System.out.println("Usuario registrado exitosamente");
                }
                // Cerrar conexiones

            }
            
        } catch (SQLException e) {
            System.err.println("Error al registrar usuario: " + e.getMessage());
            if (e.getSQLState().equals("23000")) {
                System.err.println("El username ya existe");
            }
        }
    }
}    

