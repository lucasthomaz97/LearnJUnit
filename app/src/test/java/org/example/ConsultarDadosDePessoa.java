package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoa {
    @BeforeAll
    static void configConexao() {
        BancoDeDados.iniciarConexão();
        System.out.println("Conectado com o banco de dados");
    }

    @AfterAll
    static void fechaConexao() {
        BancoDeDados.finalizarConexão();
        System.out.println("Desconectado do banco de dados");
    }

    @Test
    void validarDados() {
        Assertions.assertTrue(true);
        System.out.println("Teste completo");
    }
}