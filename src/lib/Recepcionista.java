package lib;

public class Recepcionista extends Usuario{

    /*
     * Atributos da classe
     */
    private int id;

    /*
     * Default constructor
     *
     * @param nome
     * @param login
     * @param senha
     * @param id
     */
    public Recepcionista(String nome, String login, String senha, int id) {
        super(nome, login, senha);
        setId(id);
    }

    /*
     * Atribuição de valores aos atributos da classe
     */
    public void setId(int id) {
        this.id = id;
    }

    /*
     * Consulta dos valores de todos atributos da classe
     */
    public int getId() {
        return id;
    }

    /**
     * @param paciente
     * @param medico
     * @param horarios
     * @param dataHora
     * @return
     */
    public Consulta marcarConsulta(Paciente paciente, Medico medico, Horarios horarios, String dataHora) {
        // TODO implement here
        return null;
    }

    /**
     * @param consulta
     */
    public void desmarcarConsulta(Consulta consulta) {
        // TODO implement here
    }

    /**
     * @param paciente
     * @param medico
     * @param horarios
     * @param dataHora
     * @return
     */
    public Exame marcarExame(Paciente paciente, Medico medico, Horarios horarios, String dataHora) {
        // TODO implement here
        return null;
    }

    /*
     * @param exame
     */
    public void desmarcarExame(Exame exame) {
        // TODO implement here
    }
}
