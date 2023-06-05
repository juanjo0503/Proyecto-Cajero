/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Administrador
 */
public class Tarjeta {
    private int numtarjeta;
    private int propietario;
    private int pin;
    private double saldo;

    public Tarjeta(int numtarjeta, int propietario, int pin, double saldo) {
        this.numtarjeta = numtarjeta;
        this.propietario = propietario;
        this.pin = pin;
        this.saldo = saldo;
    }

    public int getNumtarjeta() {
        return numtarjeta;
    }

    public void setNumtarjeta(int numtarjeta) {
        this.numtarjeta = numtarjeta;
    }

    public int getPropietario() {
        return propietario;
    }

    public void setPropietario(int propietario) {
        this.propietario = propietario;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "tarjeta{" + "numtarjeta=" + numtarjeta + ", propietario=" + propietario + ", pin=" + pin + ", saldo=" + saldo + '}';
    }
    
}
