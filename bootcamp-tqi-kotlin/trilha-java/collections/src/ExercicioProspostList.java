import javax.swing.JOptionPane;

public class ExercicioProspostList {

    public static void main(String[] args) {
        double[] temperaturas = new double[6];
        double mediaSemestral = 0;
        double soma = 0;
        int contador = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura do mês " + (i + 1)));
            soma += temperaturas[i];
        }

        mediaSemestral = soma / temperaturas.length;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > mediaSemestral) {
                contador++;
                System.out.println("Temperatura acima da média: " + temperaturas[i] + " Mês: " + (i + 1));
            }
        }

        System.out.println("Média semestral: " + mediaSemestral);
        System.out.println("Quantidade de temperaturas acima da média: " + contador);

    }


}
