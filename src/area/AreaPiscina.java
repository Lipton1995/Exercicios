package area;

public class AreaPiscina {

    public static void main(String[] args) {

        double valor = calcular(10,5,3);
        System.out.println(valor);

    }

    // UM MÉTODO QUE FAZ MAIS DE UMA COISA: CALCULAR ÁREA E O ORÇAMENTO
        private static double calcular(double largura, double comprimento, double profundidade ){
            double area = largura * comprimento * profundidade;

            //HARDCODED, MAGIC NUMBER - NAO É UMA BOA PRÁTICA
            double custo = area * 45;

            return custo;
        }
    }


