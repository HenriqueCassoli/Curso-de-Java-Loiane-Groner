package recusividade;



public class main {
    public static void main(String[] args) {
        for (int i=0; i<89; i++){
            System.out.print(Calculadora.fibonacci(i) + " ");
        }

        for (int i=0; i<10; i++){
            System.out.print(Calculadora.somatorio(i) + " ");
        }
    }
}
