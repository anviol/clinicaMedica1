package lib;

public class Recepcionista extends Usuario{

    /*
     * Atributos da classe
     */
    private int idRecepcionista;

    /*
     * Atribuição de valores aos atributos da classe
     */
    public void setIdRecepcionista(int idRecepcionista) {
        this.idRecepcionista = idRecepcionista;
    }

    /*
     * Consulta dos valores de todos atributos da classe
     */
    public int getIdRecepcionista() {
        return idRecepcionista;
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
