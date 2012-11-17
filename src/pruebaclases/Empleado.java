/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaclases;

/**
 *
 * @author postgrado
 */
public class Empleado {
    String nombre;
    int numEmpleado;
    int sueldo;
    static int contador;
    
    //public Empleado(){}
    public Empleado(String nombre, int sueldo)
    {
        nombre = nombre;
        sueldo = sueldo;
        numEmpleado = ++contador;
    }
    
}
