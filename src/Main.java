import lib.Exame;

import java.sql.*;
import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Conexão SQLite
        Connection connection = null;
        Statement statement = null;
        try {
            String url = "jdbc:sqlite:C:/projetosUFMG/clinicaMedica/src/banco/clinicaMedica.db";
            connection = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        Console console = System.console();
        Scanner entrada = new Scanner(System.in);
        String login, senhaCorreta = "123", senha;

        while (true){
            System.out.println("Master Clínica seu programa de clínicas médicas!\n");
            System.out.print("Login: ");
            login = entrada.next();

            System.out.print("Senha: ");
            senha = entrada.next();

            if (senha.compareTo(senhaCorreta) == 0){
                System.out.println("\nBem vindo, " + login + "!");
            }else {
                System.out.println("\nSenha incorreta!");
                break;
            }
        }

        Exame exame = new Exame();
    }
}
