import javax.swing.JOptionPane;

public class ExercicioL03N05{
    public static void main(String[] args){
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção do menu" +
        "\n1               Somar" +
        "\n2               Subtrair" +
        "\n3               Multiplicar" +
        "\n4               Dividir" +
        "\n5               Sair" ));

        if(numero ==1){
            int somar = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "A soma é: " + somar);

        }else if(numero ==2){
            int subtrair = numero1 - numero2;
            JOptionPane.showMessageDialog(null, "A subtração é: " + subtrair);
        }else if (numero ==3){
            int multiplicar = numero1 * numero2;
            JOptionPane.showMessageDialog(null, "A multiplicação é: " + multiplicar);
        }else if(numero ==4){
            int dividir = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "A divisão é: " + dividir);
        }

        

        while(numero != 5){
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção do menu" +
            "\n1               Somar" +
            "\n2               Subtrair" +
            "\n3               Multiplicar" +
            "\n4               Dividir" +
            "\n5               Sair" ));

            if(numero ==1){
                int somar = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "A soma é: " + somar);

            }else if(numero ==2){
                int subtrair = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "A subtração é: " + subtrair);
            }else if (numero ==3){
                int multiplicar = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "A multiplicação é: " + multiplicar);
            }else if(numero ==4){
                int dividir = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "A divisão é: " + dividir);
            }
        }
    }
}