/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

import com.toedter.calendar.JDateChooser;

/**
 *
 * @author tesoem
 */
public class Datos {
    String nombre;
    String fecha;
    String curp;

    public Datos(String nombre, String fecha, String curp) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.curp = curp;
    }
    public Datos() {
        
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Object getFecha(JDateChooser jdfecha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
