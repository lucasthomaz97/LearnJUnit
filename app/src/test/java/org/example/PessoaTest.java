package org.example;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    void ValidarCálculoDeIdadeCorreto() {
        Pessoa Dio = new Pessoa("Dio", LocalDateTime.of(1980, 6, 6, 15, 0, 0));
        Assertions.assertEquals(44, Dio.getIdade());
    }

    @Test
    void ValidarChecagemDeMaioridade() {
        Pessoa Dio = new Pessoa("Dio", LocalDateTime.of(1980, 6, 6, 15, 0, 0));
        Pessoa Duquesa = new Pessoa("Jotaro", LocalDateTime.of(2015, 9, 10, 15, 0, 0));
        Assertions.assertTrue(Dio.maiorDeIdade());
        Assertions.assertFalse(Duquesa.maiorDeIdade());
    }
}