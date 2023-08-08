/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_ejercicio7_robot;

/*En un nuevo proyecto, crear una clase de nombre Robot con los atributos: batería inicializado
en 500 unidades de energía y nombre; un constructor que permita inicializar únicamente a su
atributo nombre; los métodos getter y setter para sus atributos y los siguientes métodos
adicionales:

 avanzar(): Este método recibirá la cantidad de pasos que deberá dar el robot, sabiendo que
por cada 100 pasos consume 10 unidades de energía y que sólo avanzará si hay batería
suficiente.
 bateriaVacia(): Este método retornará true, sólo cuando la batería quede con un valor
menor o igual a cero.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Robot de nombre “Tito”
Luego utilizando sus métodos:
b) Hacerlo avanzar de a un paso hasta que se quede sin batería.
 */
public class Robot {
    private float bateria=500;
    private String nombre;
    
    public Robot(String nombre){
        this.nombre=nombre;
    }
    public void setNombre(String nombre){
      this.nombre=nombre;   
    } 

    public String getNombre() {
        return nombre;
    }
    public double getBateria(){
        return bateria;
    }
    public boolean bateriaVacia(int pasos){
    if (bateria<=0){
        return true;
    }else{
        return false;
    }
}    
    public float avanzar(int pasos){
        float cantBateria=this.bateria;
        int i = 1;
        while(cantBateria>0 && i<=pasos){
            for (i=1; i<=pasos ;i++){
                cantBateria = (float) (cantBateria - 0.1); 
                this.bateria=cantBateria;
                System.out.println(":"+cantBateria); 
        }
         
    }
        //System.out.println("La bateria es= "+ cantBateria);
        //return cantBateria;
        return cantBateria;

}}


