package lib;

public class Paciente extends Usuario{

    /*
     * Atributos da classe
     */
    public long CPF;

    /*
     * Atribuição de valores aos atributos da classe
     */
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    /*
     * lib.Consulta dos valores de todos atributos da classe
     */
    public long getCPF() {
        return CPF;
    }

    /**
     * @param numExame
     * @param chaveUnica
     * @return
     */
    public Exame verExame(int numExame, long chaveUnica) {
        // TODO implement here
        return null;
    }
}
