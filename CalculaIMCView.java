import java.util.Scanner;

public class CalculaIMCView {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double pesoEntrada = input.nextDouble();

        System.out.print("Digite a altura: ");
        double alturaEntrada = input.nextDouble();

        Pessoa pessoa = new Pessoa(pesoEntrada, alturaEntrada);

        double imc = pessoa.calcularIMC();
        pessoa.setImc(imc);

        String categoria = pessoa.informarIMC(pessoa.getImc());
        pessoa.setCategoria(categoria);

        pessoa.imprimirInformacoesDaPessoa();
    }
}
