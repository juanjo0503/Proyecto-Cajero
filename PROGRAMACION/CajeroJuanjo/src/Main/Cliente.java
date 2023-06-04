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

    private long numtarjeta;
    private String IBAN;
    private String nombre;
    private String direccion;

    public Cliente(long numtarjeta, String IBAN, String nombre, String direccion) {
        this.numtarjeta = numtarjeta;
        this.IBAN = IBAN;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public long getNumtarjeta() {
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

}
