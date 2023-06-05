/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Administrador
 */
public class Cliente {
    
    private int id;
    private int numtarjeta;
    private String IBAN;
    private String nombre;
    private String direccion;

    public Cliente(int id,int numtarjeta, String IBAN, String nombre, String direccion) {
        this.id = id;
        this.numtarjeta = numtarjeta;
        this.IBAN = IBAN;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getNumtarjeta() {
        return numtarjeta;
    }

    public void setNumtarjeta(int numtarjeta) {
        this.numtarjeta = numtarjeta;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", numtarjeta=" + numtarjeta + ", IBAN=" + IBAN + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
}
