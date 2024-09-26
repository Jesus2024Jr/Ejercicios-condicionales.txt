/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jesus Leyva
 */
public class estudiante {
    
    private int cedula;
    private String nombre;
    private String apellido;
    private int telefono;
    private String clave;
    Map<String, String> Est = new HashMap();
    
    public estudiante(){
        
        Est.put("cedula", "1234567");
        Est.put("nombre", "jesus");
        Est.put("apellido", "leyva");
        Est.put("direccion", "cartagena");
        Est.put("telefono", "3016367426");
        Est.put("clave", "12345");
    }
    
    public boolean validardatos(String pcedula, String pclave){
        
        System.out.println(pcedula);
        System.out.println(pclave);
        boolean logueado = false;
        if(Est.get("cedula").equals(pcedula) && Est.get("clave").equals(pclave)){
            logueado = true;
            return logueado;
        }
        return logueado;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
