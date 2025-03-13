import javax.swing.JOptionPane;

public class MainJoptionPane {
// Mensagem para teste alterada 
    public static void main(String[] args) {
        String stringEntrada= JOptionPane.showInputDialog("Entre com o valor para iniciar os cálculos");
        float valorInicial = Float.parseFloat(stringEntrada);
        Calculadora calc = new Calculadora(valorInicial);
        while (true) { 
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 para somar\n2 para subtrair\n3 para dividir\n4 para multiplicar\n5 para sair"));
            if (opcao == 5) {
                break;
            }
            else if (opcao < 1 || opcao > 4){
                JOptionPane.showMessageDialog(null,"Valor inválido\nDigite um valor entre 1 e 5\n1 para somar\n2 para subtrair\n3 para dividir\n4 para multiplicar\n5 para sair");
                continue;
            }
            Float valorOperador = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do operando:"));
            /*
             * if (opcao == 3 && valorOperador==0) {
             *      JOptionPane.ShowMessageDialog("Valor Inválido para divisão: não é possível dividir por zero");
             *      continue;
             * }
             * 
             */

            if(opcao == 1) {
                calc.somar(valorOperador);
            }
            else if (opcao == 2){
                calc.subtrair(valorOperador);
            }
            else if (opcao == 3) {
                if (valorOperador == 0) {
                    while (valorOperador == 0) {
                        valorOperador = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor diferente de zero"));
                    }
                    calc.dividir(valorOperador);
                }
                else {
                    calc.dividir(valorOperador);
                }

            }
            else if (opcao == 4) {
                calc.multiplicar(valorOperador);
            }
            JOptionPane.showMessageDialog(null,"O valor atual é: " + calc.valor);

        }
        JOptionPane.showMessageDialog(null,"O resultado é: " + calc.valor);
    }
}
