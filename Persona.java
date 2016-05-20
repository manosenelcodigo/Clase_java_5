package com.manosenelcodigo.trabajo;

public class Persona 
{
    private String nombre;
    private String correo;
    private int edad;
    
    //sobre carga de constructores
    Persona()
    {
        this.nombre="César Cancino";
        this.edad=35;
    }
    Persona( String nom )
    {
        this.nombre=nom;
    }
    Persona(String nom,String apodo)
    {
        this.nombre=nom+" "+apodo;
        this.edad=35;
    }
    //sobre carga de métodos
    
    public int retornaEdad()
    {
        return this.edad;
    }
    public int retornaEdad(int numero)
    {
        this.edad=numero;
        return this.edad;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    public String getNombre(String nom)
    {
        this.nombre=nom;
        return this.nombre;
    }
    
    
}
