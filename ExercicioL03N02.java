import javax.swing.JOptionPane;

public class ExercicioL03N02{
    public static void main(String[] args){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

       while(idade <= 128){
           idade = JOptionPane.showInputDialog("Digite sua idade");
       }
    }
}