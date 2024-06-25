package cl.praxis.calculadora_2;

public class Calculadora {
    public int sumar(int numero1, int numero2) {
        return (numero1 + numero2);
    }

    public int restar(int numero1, int numero2) {
        return (numero1 - numero2);
    }

    public int multiplicar(int numero1, int numero2) {
        return (numero1 * numero2);
    }

    public int dividir(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (numero1 / numero2);
    }
}
