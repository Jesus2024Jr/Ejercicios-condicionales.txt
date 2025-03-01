package clases;

import java.util.Scanner;

public class Aves extends Animal{

    private String propietario;
    private int añoNacimiento;
    
    public Aves(String nombre, double peso, String propietario, int añoNacimiento){
        super(nombre, peso);
        this.propietario = propietario;
        this.añoNacimiento = añoNacimiento;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the añoNacimiento
     */
    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    /**
     * @param añoNacimiento the añoNacimiento to set
     */
    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
    
    public void edad(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("escriba el año actual por favor:");
        int año = entrada.nextInt();
        int edad = año - this.getAñoNacimiento();
        
        if(edad > 5){
            System.out.println("El ave es un " + this.getNombre() + " es adulta(tiene " + edad + " años), pesa :"+getPeso()+"k y le pertenece a: "+this.getPropietario());
        }
        else{
            System.out.println("El ave es un "  + this.getNombre() + " es menor(tiene " + edad + " años), pesa :"+getPeso()+"k y le pertenece a: "+this.getPropietario());
        }
    }
    
    
}
