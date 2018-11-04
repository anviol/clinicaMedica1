package lib;

public class Laboratorio extends Usuario {

    /*
     * Atributos da classe
     */
    public long CNPJ;

    /*
     * Default constructor
     *
     * @param nome
     * @param login
     * @param senha
     * @param CNPJ
     */
    public Laboratorio(String nome, String login, String senha,long CNPJ) {
        super(nome, login, senha);
        setCNPJ(CNPJ);
    }

    /*
     * Atribuição de valores aos atributos da classe
     */
    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    /*
     * Consulta dos valores de todos atributos da classe
     */
    public long getCNPJ() {
        return CNPJ;
    }

    /**
     * @param exame
     */
    public void realizarExame(Exame exame) {
        // TODO implement here
    }

    /**
     * @param paciente
     */
    public void enviarExame(Paciente paciente) {
        // TODO implement here
    }
}
