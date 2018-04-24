import javax.swing.JOptionPane;

public class ExercicioL03N01{
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(
            "Digite seu nome");
          
        while(!nome.equalsIgnoreCase("fim")){
            String nome1 = JOptionPane.showInputDialog(
                "Digite seu nome");     
        }
      

    }
}