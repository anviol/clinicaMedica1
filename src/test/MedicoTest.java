package test;

import lib.Medico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    Medico medico = new Medico("Andr�", "andre", "123", 3110817039L);

    String nomeTeste1 = "Andr�";
    String nomeTeste2 = "Bruno";
    String loginTeste1 = "andre";
    String loginTeste2 = "bruno";
    String senhaTeste1 = "123";
    String senhaTeste2 = "1234";
    Long CPFTeste1 = 3110817039L;
    Long CPFTeste2 = 7443371004L;

    @Test
    void setCRM() {
    }

    @Test
    void getCRM() {
    }

    @Test
    void consultar() {
    }

    @Test
    void consultarHist�rico() {
    }
}