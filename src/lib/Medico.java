package lib;

public class Medico extends Usuario{

    /*
     * Atributos da classe
     */
    private long CRM;

    /*
     * Default constructor
     *
     * @param nome
     * @param login
     * @param senha
     * @param CRM
     */
    public Medico(String nome, String login, String senha,long CRM) {
        super(nome, login, senha);
        setCRM(CRM);
    }

    /*
     * Atribuição de valores aos atributos da classe
     */
    public void setCRM(long CRM) {
        this.CRM = CRM;
    }

    /*
     * Consulta dos valores de todos atributos da classe
     */
    public long getCRM() {
        return CRM;
    }

    /**
     * @param consulta
     */
    public void consultar(Consulta consulta) {
        // TODO implement here
    }

    /**
     * @param paciente
     */
    public void consultarHistórico(Paciente paciente) {
        // TODO implement here
    }
}
