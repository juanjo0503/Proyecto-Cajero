/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Movimiento {

    private int idcliente;
    private String tipo;
    private String concepto;
    private double importe;
    private Date fecha;

    public Movimiento(int idcliente, String tipo, String concepto, double importe, Date fecha) {
        this.idcliente = idcliente;
        this.tipo = tipo;
        this.concepto = concepto;
        this.importe = importe;
        this.fecha = fecha;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "idcliente=" + idcliente + ", tipo=" + tipo + ", concepto=" + concepto + ", importe=" + importe + ", fecha=" + fecha + '}';
    }

}
