package org.example;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexão() {
        LOGGER.info("Conexão Iniciada");
    }

    public static void finalizarConexão() {
        LOGGER.info("Conexão Finalizada");
    }
}