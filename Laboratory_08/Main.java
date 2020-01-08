package Laboratory_08;
import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 130);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JLabel title = new JLabel("Love math but don't know how to devide? No problems, enter two numbers below.");
        JLabel resultLabel = new JLabel();

        JTextArea error = new JTextArea();
        Font font = new Font("Monaco", Font.PLAIN, 12);
        error.setFont(font);
        error.setForeground(Color.RED);

        final JScrollPane scroll = new JScrollPane(error);
        JTextField dividend = new JTextField(5);
        JTextField divisor = new JTextField(5);
        JButton devide = new JButton("Devide");
        Color  grey  = new Color(152, 148, 175, 197);
        devide.setForeground(Color.BLACK);
        devide.setBackground(grey);


        JPanel panel = new JPanel();
        panel.setOpaque(true);
        panel.setBackground(grey);
        panel.setForeground(Color.WHITE);

        JPanel panel1 = new JPanel();

        panel.add(title);
        panel1.add(dividend);
        panel1.add(divisor);
        panel1.add(devide);
        panel1.add(resultLabel);

        devide.addActionListener(e -> {
            try {
                Double no1 = Double.valueOf(dividend.getText());
                String divizor = divisor.getText();
                if ("13".equals(divizor)) {
                    throw new UnluckyException();
                }

                Double no2 = Double.valueOf(divizor);
                String result = String.valueOf(no1 / no2);
                resultLabel.setText(result);
            } catch (NumberFormatException | ArithmeticException | UnluckyException t) {
                Main.displayError(t, error, scroll);
            }
        });

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, panel1);
        frame.getContentPane().add(BorderLayout.SOUTH, scroll);
        frame.setVisible(true);
    }

    private static void displayError(Throwable error, JTextArea jTextArea, JScrollPane scroll) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        error.printStackTrace(pw);
        jTextArea.setText(sw.toString());

        SwingUtilities.invokeLater(() -> scroll.getVerticalScrollBar().setValue(0));
    }

}