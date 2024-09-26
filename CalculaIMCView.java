import java.util.Scanner; // Incluindo a biblioteca Scanner

public class CalcularIMCView {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Declarando um objeto da classe Scanner para receber as entradas

        System.out.print("Digite o peso: ");
        double pesoEntrada = input.nextDouble(); // Recebe o valor de peso

        System.out.print("Digite a altura: ");
        double alturaEntrada = input.nextDouble(); // Recebe o valor de altura

        Pessoa pessoa = new Pessoa(pesoEntrada, alturaEntrada); // Cria uma instância com as variáveis de entrada

        double imc = pessoa.calcularIMC();
        pessoa.setImc(imc); // Insere o valor calculado do imc no atributo da classe

        String categoria = pessoa.informarIMC(pessoa.getImc());
        pessoa.setCategoria(categoria); // Insere a categoria segundo o imc no atributo da classe

        pessoa.imprimirInformacoesDaPessoa(); // Imprime todas as informações o objeto
    }
}
