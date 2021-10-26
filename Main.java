import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Disciplina d = new Disciplina();
        MediaAritmetica ma = new MediaAritmetica();
        MediaGeometrica mg = new MediaGeometrica();

        //Variáveis
        String nome;
        int opcao;
        float p1, p2;

        //Entrada de Dados
        nome = JOptionPane.showInputDialog(null, "Insira o Nome: ");
        d.setNome(nome);
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Escolha o tipo de Média:" +
                        "\n1 - Média Aritmética\n2 - Média Geométrica"));

        switch(opcao){
            //Média Aritmética
            case 1:
                d.setCalculo(ma);
                break;
            //Média Geométrica
            case 2:
                d.setCalculo(mg);
                break;
            //Outra opção
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                System.exit(0);
        }

        p1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira Nota da P1: "));
        d.setP1(p1);
        p2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira Nota da P2: "));
        d.setP2(p2);

        //Exibição das Infomações
        System.out.println("Nome: " + d.getNome() + "\nNota da P1: " + d.getP1() + "\nNota da P2: " + d.getP2());
        d.calculo.CalculaMedia(d);
    }
}