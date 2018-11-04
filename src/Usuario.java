/*
* Criação da classe Usuario
* Superclasse para todas as personas do projeto
*/
public class Usuario {

    /*
    * Atributos da calsse Usuario
    */
    private String nome;
    private String login;
    private String senha;
    /*
    * Fim dos atributos
    */

    /*
    * Atribuição de valores aos atributos da classe
    */
    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setLogin(String login) {
        this.login = login;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }
    /*
    * Fim da atribuição de valores
    */

    /*
    * Consulta dos valores de todos atributos da classe
    */
    private String getNome() {
        return nome;
    }

    private String getLogin() {
        return login;
    }

    private String getSenha() {
        return senha;
    }
    /*
    * Fim da consulta aos valores
    */
}
