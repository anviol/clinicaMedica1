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
    private boolean realizada;
    private boolean cancelada;

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
     * Consulta dos valores de todos atributos da classe
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

    public boolean isRealizada() {
        return realizada;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    /*
     * Metodo para marcar uam consulta como realizada
     */
    public void realizar(){
        setRealizada(true);
    }

    /*
     * Metodo para cancelar uma consulta
     */
    public void cancelar(){
        setRealizada(true);
    }
}
