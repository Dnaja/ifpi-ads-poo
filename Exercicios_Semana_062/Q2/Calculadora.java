package exercicios.poo062.q02;

public class Calculadora {
    
    private int operando1;
    private int operando2;

    public Calculadora(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public int somar() {
        int soma = operando1 + operando2;
        return soma;
    }

    public int subtrair() {
        int subtracao = operando1 - operando2;
        return subtracao;
    }
    
    public double dividir() {
		double divisao = (double) operando1 / operando2;
		return divisao;
	}
     
}