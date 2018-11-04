package test;

import lib.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class UsuarioTest {

    Usuario usuario = new Usuario("André", "andre", "123");

    String nomeTeste1 = "André";
    String nomeTeste2 = "Bruno";
    String loginTeste1 = "andre";
    String loginTeste2 = "bruno";
    String senhaTeste1 = "123";
    String senhaTeste2 = "1234";


    @Test
    void setNome() {

        usuario.setNome("Bruno");

        assertEquals("A alteração do nome não foi feita.", 0, nomeTeste2.compareTo(usuario.getNome()));
    }

    @Test
    void setLogin() {
        usuario.setLogin("bruno");

        assertEquals("A alteração do login não foi feita.", 0, loginTeste2.compareTo(usuario.getLogin()));
    }

    @Test
    void setSenha() {
        usuario.setSenha("1234");

        assertEquals("A alteração do senha não foi feita.", 0, senhaTeste2.compareTo(usuario.getSenha()));
    }

    @Test
    void getNome() {
        assertEquals("Nome no construtor incorreto.", 0, nomeTeste1.compareTo(usuario.getNome()));
    }

    @Test
    void getLogin() {
        assertEquals("Login no construtor incorreto.", 0, loginTeste1.compareTo(usuario.getLogin()));
    }

    @Test
    void getSenha() {
        assertEquals("Senha no construtor incorreta.", 0, senhaTeste1.compareTo(usuario.getSenha()));
    }
}