package com.mycompany.programacion;

public class Administrador extends Usuario { 
    private String areaResponsable;

    public Administrador(String nombre, String email, String contrasena, String areaResponsable) {
       
        super(nombre, email, contrasena);
        this.areaResponsable = areaResponsable;
    }

    @Override
    public void actualizarDatos() {
       
        
    }
    
  
}

