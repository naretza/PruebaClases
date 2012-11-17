/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaclases;

/**
 *
 * @author postgrado
 */
public class Ejecutivo extends Empleado {
    int presupuesto;
    
    Ejecutivo(){}
    public Ejecutivo(String nombre1, int sueldo1)
    {
        super(nombre1,sueldo1);//se llama al constructor de mi clase padre.
     //   Empleado obj = new Empleado();
    }
    
    void asignarPresupuesto(int p)
    {
        presupuesto = p;
        
    }
            
}
