package test;

import lib.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class PacienteTest {

    Paciente paciente = new Paciente("André", "andre", "123", 3110817039L);

    String nomeTeste1 = "André";
    String nomeTeste2 = "Bruno";
    String loginTeste1 = "andre";
    String loginTeste2 = "bruno";
    String senhaTeste1 = "123";
    String senhaTeste2 = "1234";
    Long CPFTeste1 = 3110817039L;
    Long CPFTeste2 = 7443371004L;

    @Test
    void setCPF() {
        paciente.setCPF(CPFTeste2);

        assertEquals("A alteração do CPF foi mal feita.", (long) CPFTeste2, paciente.getCPF());
        assertNotEquals("A alteração do CPF não foi feita.", (long) CPFTeste1, paciente.getCPF());
    }

    @Test
    void setNome() {

        paciente.setNome(nomeTeste2);

        assertEquals("A alteração do nome foi mal feita.", 0, nomeTeste2.compareTo(paciente.getNome()));
        assertNotEquals("A alteração do nome não foi feita.", 0, nomeTeste1.compareTo(paciente.getNome()));
    }

    @Test
    void setLogin() {
        paciente.setLogin(loginTeste2);

        assertEquals("A alteração do login não foi feita.", 0, loginTeste2.compareTo(paciente.getLogin()));
    }

    @Test
    void setSenha() {
        paciente.setSenha(senhaTeste2);

        assertEquals("A alteração do senha não foi feita.", 0, senhaTeste2.compareTo(paciente.getSenha()));
    }

    @Test
    void getCPF() {
        assertTrue("CPF no construtor incorreto", CPFTeste1 == paciente.getCPF());
    }

    @Test
    void getNome() {
        assertEquals("Nome no construtor incorreto.", 0, nomeTeste1.compareTo(paciente.getNome()));
    }

    @Test
    void getLogin() {
        assertEquals("Login no construtor incorreto.", 0, loginTeste1.compareTo(paciente.getLogin()));
    }

    @Test
    void getSenha() {
        assertEquals("Senha no construtor incorreta.", 0, senhaTeste1.compareTo(paciente.getSenha()));
    }

    @Test
    void verExame() {
    }
}