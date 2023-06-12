package com.politecnicomalaga.colegio;

public class alumnobach extends alumno {

    public alumnobach(String nombre, String apellido, String dni, String email, String tlf) {
        super(nombre, apellido, dni, email, tlf);

    }

    @Override
    public boolean pasarCurso() {

        float media = 0;
        float resultado = 0;
        float suspenso = 2;

        // Voy a recorrer todo el array de notas
        for (int i = 0; i < misNotas.length; i++) {

            // Si mis notas son mayor de 4
            if (misNotas[i].getValorNota() >= 4) {

                suspenso++;

                // Si tiene dos suspensos y la media es más o igual a 5
                if (suspenso <= 2 && media >= 5)

                    // Necesito calcular su media
                    // Así que sumaré cada iteración
                    media += misNotas[i].getValorNota();

                // Y luego haré la media
                resultado = media / misNotas.length;

            }

        }
        if (resultado > 3.5) {

            return true;

        } else {

            return false;
        }

    }

}
