package app;

import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class AdicaoTest {
    
    Adicao adicao;

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
        adicao = new Adicao();
    }

    @AfterEach
    public void after() {
        // deixando aqui como forma de documentar que existe.
        System.out.println("AfterEach");
    }


    @Test
    public void verificaCasoBase() {
        double resultado = adicao.calcula("15", "10");
        assertEquals(25.0, resultado);
    }

    @Test
    public void verificando() {
        double resultado = adicao.calcula("91", "9");
        assertEquals(100.0, resultado);
    }

    @Test
    public void verificandoAdicao() {
        double resultado = adicao.calcula("100", "50");
        assertEquals(150.0, resultado);
    }

    
}