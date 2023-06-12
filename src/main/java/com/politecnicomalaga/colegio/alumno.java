package com.politecnicomalaga.colegio;

public abstract class alumno extends Persona {

    protected Nota[] misNotas;

    public alumno(String nombre, String apellido, String dni, String email, String tlf) {
        super(nombre, apellido, dni, email, tlf);
        this.misNotas = new Nota[0];

    }

    @Override
    abstract public boolean pasarCurso();

}
