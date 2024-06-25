package cl.praxis.test;

import cl.praxis.calculadora_2.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void testSuma() {
        assertEquals(6, calculadora.sumar(3, 3));
    }

    @Test
    void testResta() {
        assertEquals(1, calculadora.restar(5, 4));
    }

    @Test
    void testMultiplicar() {
        assertEquals(12, calculadora.multiplicar(4, 3));
    }

    @Test
    void testDividir() {
        assertEquals(3, calculadora.dividir(9, 3));
    }

    @Test
    @DisplayName("Division by zero should throw IllegalArgumentException")
    void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(5, 0), "Cannot divide by zero.");
    }
}
