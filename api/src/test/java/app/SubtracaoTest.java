package app;

import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class SubtracaoTest {
    
    Subtracao subtracao;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll");
    }

    @BeforeEach
    public void before() {
        subtracao = new Subtracao();
    }

    @AfterEach
    public void after() {
       
        System.out.println("AfterEach");
    }


    @Test
    public void verificaCasoBase() {
        double resultado = subtracao.calcula("4", "2");
        assertEquals(2.0, resultado);
    }

    @Test
    public void verifica() {
        double resultado = subtracao.calcula("8", "4");
        assertEquals(4.0, resultado);
    }
}
