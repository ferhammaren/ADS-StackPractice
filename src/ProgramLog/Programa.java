package ProgramLog;

import java.util.Random;
import java.util.Stack;

public class Programa {
    public String Nombre;
    public Programa(String nombre){
        this.Nombre=nombre;
    }

    public String ToString(){
        return Nombre;
    }
    public boolean isSuccess(){
        Random r= new Random();
        return r.nextInt() % 2 == 0;
    }

}
