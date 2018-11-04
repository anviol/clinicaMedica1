package lib;

public class Consulta {

    /*
     * Atributos da classe
     */
    protected int id;
    protected Paciente paciente;
    protected Medico medico;
    protected String informacoes;
    protected String dataHora;
    protected boolean realizada;
    protected boolean cancelada;
    /*
     * Fim dos atributos
     */

    /*
     * Atribuição de valores aos atributos da classe
     */
    public void setId(int id) {
        this.id = id;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    /*
     * Fim das atribuições
     */

    /*
     * lib.Consulta dos valores de todos atributos da classe
     */

    public int getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public String getDataHora() {
        return dataHora;
    }

    public boolean setRealizada() {
        return realizada;
    }

    public boolean setCancelada() {
        return cancelada;
    }
    /*
     * Fim das consultas
     */
}
