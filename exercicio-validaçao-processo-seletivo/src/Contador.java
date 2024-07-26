import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois = terminal.nextInt();
        
        try {
           contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
           System.out.println(exception.getMessage());
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
        
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}