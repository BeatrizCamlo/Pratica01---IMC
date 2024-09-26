import java.util.Scanner;

public class CalculaIMCView {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        Pessoa pessoa = new Pessoa(peso,altura);

        pessoa.imprimirInformaçõesDaPessoa();
    }
}
