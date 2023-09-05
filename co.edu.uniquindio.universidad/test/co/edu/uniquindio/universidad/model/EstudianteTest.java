package co.edu.uniquindio.universidad.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {

    @Test
    void promediarNotasTest() {
        Estudiante estudiante = new Estudiante();
        double promedio = estudiante.promediarNotas(5.0, 5.0, 5.0);
        assertEquals(5.0, promedio);
    }
}