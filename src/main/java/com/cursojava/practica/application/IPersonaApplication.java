package com.cursojava.practica.application;

import com.cursojava.practica.dominio.Persona;

public interface IPersonaApplication {

    /**
     * 
     * @param p persona que se desea añadir a la base de datos, no puede haber otra persona con el mismo identificador.
     * @return true si 
     */
    public boolean addPersona(Persona p);

    public Persona getPersona (String id);

    public boolean removePersona (String id);

    
}