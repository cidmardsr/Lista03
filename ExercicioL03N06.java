import javax.swing.JOptionPane;

public class ExercicioL03N06{
    public static void main(String[] args){
        
        int opcao = JOptionPane.showOptionDialog(null, 
            "Escolha uma opção do menu.", 
            "MENU PADARIA", 
            0, 
            JOptionPane.PLAIN_MESSAGE, 
            null, 
            new Object[]{
                "BOLOS", "DOCES", "SANDUÍCHES", "PIZZAS", "SAIR" 
            },
            "BOLOS");

        while(opcao != 4){
        
            if(opcao == 0){
                JOptionPane.showOptionDialog(null, 
                "Escolha um bolo do menu.", 
                "MENU BOLOS", 
                0, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                new Object[]{
                    "Bolo Brigadeiro", "Bolo Floresta Negra", "Bolo Leite com Nutella", 
                    "Bolo Mousse de Chololate", "Bolo Nega Maluca"
                    }, 
                    "");
            }else if(opcao == 1){
                JOptionPane.showOptionDialog(null, 
                "Escolha um doce do menu", 
                "MENU DOCES", 
                0, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                new Object[]{
                    "Bomba de Creme", "Bomba de Morango", 
                    },
                    ""); 
            }else if(opcao == 2){
                JOptionPane.showOptionDialog(null, 
                "Escolha um sanduíche do menu", 
                "MENU SANDUÍCHES", 
                0, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                new Object[]{
                    "Filé-Mignon com fritas e cheddar", "Hambúrguer com queijos, champignon e rúcula", 
                    "Provolone com salame", "Vegetariano de berinjela" 
                    },
                    "");
            }else if(opcao == 3){
                JOptionPane.showOptionDialog(null, 
                "Escolha um sabor de pizza do menu", 
                "MENU PIZZAS", 
                0, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                new Object[]{
                    "Calabresa", "Napolitana", "Peruana", "Portuguesa"
                    },
                    "");
            }
             opcao = JOptionPane.showOptionDialog(null, 
                "Escolha uma opção do menu.", 
                "MENU PADARIA", 
                0, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                new Object[]{
                    "BOLOS", "DOCES", "SANDUÍCHES", "PIZZAS", "SAIR" 
                },
                "");
        }
    }
}