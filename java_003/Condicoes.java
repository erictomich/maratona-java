
public class Condicoes {
    public static void main(String args[]) {

        int idade, tempoTrabalho, total;

        idade = 35;
        tempoTrabalho = 20;

        Matematica mat = new Matematica();

        total = Matematica.mat.somar(idade, tempoTrabalho);

        if(total > 50) {
            System.out.println("Maior que cinquenta.");
        } else {
            System.out.println("Menor que cinquenta.");
        }
    }

    static int soma(int numA, int numB) {
        return numA + numB;
    }
}

class Matematica {
    int fatorDivisao = 2;
    public static int somar(int A, int B) {
        return A + B;
    }
}