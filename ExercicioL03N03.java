import javax.swing.JOptionPane;

public class ExercicioL03N03{
    public static void main(String[] args){
        double peso = Double.parseDouble(
                   JOptionPane.showInputDialog(
        "Digite seu peso"
        ));

        int totalUsuarios = 0;

        while(peso >= 0 && peso <= 300){
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite eu peso"));

            totalUsuarios = totalUsuarios + 0;
        } 
        JOptionPane.showMessageDialog(null, 
        "A quatidade de pessoas que informaram o peso é: " 
        + totalUsuarios);
        
       
    }
}