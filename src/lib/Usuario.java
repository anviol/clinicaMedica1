package lib;

/*
 * Cria��o da classe Usuario
 * Superclasse para todas as personas do projeto
 */
public class Usuario {

    /*
     * Atributos da classe
     */
    private String nome;
    private String login;
    private String senha;

    /*
     * Atribui��o de valores aos atributos da classe
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /*
     * lib.Consulta dos valores de todos atributos da classe
     */
    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

}
