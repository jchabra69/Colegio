package com.politecnicomalaga.colegio;

public class alumnosecund extends alumno {

    public alumnosecund(String nombre, String apellido, String dni, String email, String tlf) {
        super(nombre, apellido, dni, email, tlf);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean pasarCurso() {

        float media = 0;
        float resultado = 0;

        // Voy a recorrer todo el array de notas
        for (int i = 0; i < misNotas.length; i++) {

            // Necesito calcular su media
            // Así que sumaré cada iteración
            media += misNotas[i].getValorNota();

            // Y luego haré la media
            resultado = media / misNotas.length;

        }
        if (resultado > 3.5) {

            return true;

        } else {

            return false;
        }

    }

}