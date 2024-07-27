import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class  tsts{
    public static void main(String[] args) {
        // Cria o frame principal
        JFrame frame = new JFrame("Conversão de Celsius para Fahrenheit");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Cria os componentes da interface
        JLabel label = new JLabel("Digite a temperatura em Celsius:");
        label.setBounds(10, 10, 250, 25);
        frame.add(label);

        JTextField celsiusField = new JTextField();
        celsiusField.setBounds(10, 40, 100, 25);
        frame.add(celsiusField);

        JButton convertButton = new JButton("Converter");
        convertButton.setBounds(120, 40, 120, 25);
        frame.add(convertButton);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 70, 500, 25);
        frame.add(resultLabel);

        // Adiciona um listener ao botão
        convertButton.addActionListener((ActionEvent e) -> {
            try {
                int celsius = Integer.parseInt(celsiusField.getText());
                if (celsius >= 60) {
                    resultLabel.setText("O valor não pode ser maior e nem igual a 60.");
                } else {
                    int fahrenheit = (celsius * 9 / 5) + 32;
                    resultLabel.setText(String.format("%d graus Celsius é aproximadamente a %d graus Fahrenheit.", celsius, fahrenheit));
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Entrada inválida. Por favor, insira um número.");
            }
        });

        // Exibe o frame
        frame.setVisible(true);
    }
}