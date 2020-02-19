package area;

public class Piscina {

    public static void main(String[] args) {

        double volume = calcularVolume(10,5,3);

        double valor = calcularOrcamento(volume,45);

        System.out.println("Volume da piscina: "+volume);

        System.out.println("Valor total do orçamento: "+valor);
    }


    // calcularVolume
    private static double calcularVolume(double largura, double comprimento, double profundidade) {

        return (largura * comprimento * profundidade);
    }

    // calcularOrcamento
    private static double calcularOrcamento(double volume, double valorM3) {

        return (volume * valorM3);
    }
}
