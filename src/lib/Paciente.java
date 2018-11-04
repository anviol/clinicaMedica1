package lib;

public class Paciente extends Usuario{

    /*
     * Atributos da classe
     */
    public long CPF;

    /*
     * Default constructor
     *
     * @param nome
     * @param login
     * @param senha
     * @param CPF
     */
    public Paciente(String nome, String login, String senha, long CPF) {
        super(nome, login, senha);
        setCPF(CPF);
    }

    /*
     * Atribuição de valores aos atributos da classe
     */
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    /*
     * Consulta dos valores de todos atributos da classe
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
