package test;

import lib.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

class ConsultaTest {

    Paciente paciente = new Paciente("André", "andre", "123", 3110817039L);
    Medico medico = new Medico("André", "andre", "123", 3110817039L);
    Consulta consulta = new Consulta(paciente, medico, 1);

    Paciente pacienteTeste = new Paciente("Bruno", "bruno", "1234", 7443371004L);
    Medico medicoTeste = new Medico("Bruno", "bruno", "1234", 7443371004L);

    int idTeste1 = 1;
    int idTeste2 = 2;

    @Test
    void setId() {
        consulta.setId(idTeste2);

        assertEquals("A alteração do ID foi mal feita.", idTeste2, consulta.getId());
        assertNotEquals("A alteração do nome não foi feita.", idTeste1, consulta.getId());
    }

    @Test
    void setPaciente() {
        consulta.setPaciente(pacienteTeste);

        assertEquals("A alteração do paciente foi mal feita.", pacienteTeste.getNome(), consulta.getNomePaciente());
        assertNotEquals("A alteração do nome não foi feita.", paciente.getNome(), consulta.getNomePaciente());
    }

    @Test
    void setMedico() {
        consulta.setMedico(medicoTeste);

        assertEquals("A alteração do medico foi mal feita.", medicoTeste.getNome(), consulta.getNomeMedico());
        assertNotEquals("A alteração do medido não foi feita.", medico.getNome(), consulta.getNomeMedico());
    }

    @Test
    void setInformacoes() {
    }

    @Test
    void setDataHora() {
    }

    @Test
    void setRealizada() {
    }

    @Test
    void setCancelada() {
    }

    @Test
    void getId() {
    }

    @Test
    void getMedico() {
    }

    @Test
    void getPaciente() {
    }

    @Test
    void getInformacoes() {
    }

    @Test
    void getDataHora() {
    }

    @Test
    void isRealizada() {
    }

    @Test
    void isCancelada() {
    }

    @Test
    void realizar() {
    }

    @Test
    void cancelar() {
    }
}