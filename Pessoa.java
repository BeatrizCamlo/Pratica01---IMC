public class Pessoa {
        private double peso;
        private double altura;

        // Construtor da classe Pessoa
        public Pessoa(double peso, double altura) {
            this.peso = peso;
            this.altura = altura;
        }

        // Insere o valor de entrada no atributo peso da classe
        public void setPeso(double pesoDeEntrada) {
            peso = pesoDeEntrada;
        }

        // Insere o valor de entrada no atributo altura da classe
        public void setAltura(double alturaDeEntrada) {
            altura = alturaDeEntrada;
        }

        // Retorna o peso
        public double getPeso() {
            return peso;
        }

        // Retorna a altura
        public double getAltura() {
            return altura;
        }

        // Retorna o valor do IMC
        public double calcularIMC() {
            double resultadoIMC = peso / (Math.pow(altura,2));

            return resultadoIMC;
        }

        // Retorna a classificação com base no imc calculado
        public String informarIMC(double imc) {
            if(imc < 18.5){
               return "Pessoa Abaixo do peso";
            }else if ((imc >= 18.5) && (imc <= 24.9)) {
                return "Pessoa com Peso normal";
            } else if ((imc > 24.9) && (imc <= 29.9)) {
                return "Pessoa com Pré-obesidade";
            } else if ((imc > 29.9) && (imc <= 34.9)) {
                return "Pessoa com Obesidade Grau 1";
            } else if ((imc > 34.9) && (imc <= 39.9)) {
                return "Pessoa com Obesidade Grau 2";
            } else {
                return "Pessoa com Obesidade Grau 3";
            }
        }

        // Imprime as informações da pessoa
        public void imprimirInformaçõesDaPessoa() {
            double imc = calcularIMC();
            System.out.println("Peso   => " + String.format("%.2f", peso));
            System.out.println("Altura => " + String.format("%.2f", altura));
            System.out.println("IMC = " + String.format("%.2f", imc));
            System.out.println(informarIMC(imc));

        }
}

