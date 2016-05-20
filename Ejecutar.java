package com.manosenelcodigo.trabajo;

import javax.swing.JOptionPane;

public class Ejecutar 
{
    public static void main(String avgr[])
    {
        //Persona p=new Persona();
        //Persona p=new Persona("Carlos Mardónez");
        Persona p=new Persona();
        //System.out.println(p.getNombre());
        //System.out.println(p.retornaEdad());
        //System.out.println(p.retornaEdad(36));
       /* 
        String dato=JOptionPane.showInputDialog("Ingrese un nuevo nombre");
        System.out.println(p.getNombre());
        System.out.println(p.getNombre(dato));
        */
        String dato=JOptionPane.showInputDialog("Ingrese su edad");
        System.out.println("primeda edad "+p.retornaEdad());
        //refundición o cast
        int edad=Integer.parseInt(dato);
        System.out.println("segunda edad "+p.retornaEdad(edad));
    }
    
}
