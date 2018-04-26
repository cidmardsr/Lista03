import javax.swing.JOptionPane;

public class ExercicioL03N04{
    public static void main(String[] args){
        int quantidadeCarros = Integer.parseInt(
                      JOptionPane.showInputDialog(null, 
                      "Informe a quantidade de veiculos que deseja cadastrar"
        ));
        int total = 0;

        
        
        while(total < quantidadeCarros){
            String modelo = JOptionPane.showInputDialog(null, 
                "Informe o modelo do veiculo");
            double valor = Double.parseDouble(JOptionPane.showInputDialog(
                "Informe o valor do veiculo"
            ));
            int ano = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe o ano do veiculo"
            ));
            total = total + 1;
            
            
            int mediaAno = ano * total / total;
            double mediaValor = valor * total / total;

            JOptionPane.showMessageDialog(null, 
                "A média do ano dos veiculos é: " 
                + mediaAno +
                "\nA média do valor dos carros é: " 
                + mediaValor);

        }  
        
            
    }
}