import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hesap Makinesi");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label1 = new JLabel("1. Sayiyi giriniz:");
        label1.setBounds(50, 50, 150, 30);
        frame.add(label1);

        JTextField text1 = new JTextField();
        text1.setBounds(200, 50, 100, 30);
        frame.add(text1);

        JLabel label2 = new JLabel("2. Sayiyi giriniz:");
        label2.setBounds(50, 100, 150, 30);
        frame.add(label2);

        JTextField text2 = new JTextField();
        text2.setBounds(200, 100, 100, 30);
        frame.add(text2);

        JLabel label3 = new JLabel("Sonuc:");
        label3.setBounds(50, 250, 150, 30);
        frame.add(label3);

        JTextField result = new JTextField();
        result.setBounds(200, 250, 100, 30);
        result.setEditable(false);
        frame.add(result);

        JButton addButton = new JButton("TOPLAMA");
        addButton.setBounds(50, 150, 100, 30);
        frame.add(addButton);

        JButton subButton = new JButton("CIKARMA");
        subButton.setBounds(200, 150, 100, 30);
        frame.add(subButton);

        JButton mulButton = new JButton("CARPMA");
        mulButton.setBounds(50, 200, 100, 30);
        frame.add(mulButton);

        JButton divButton = new JButton("BOLME");
        divButton.setBounds(200, 200, 100, 30);
        frame.add(divButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int sayi1 = Integer.parseInt(text1.getText());
                int sayi2 = Integer.parseInt(text2.getText());
                result.setText(String.valueOf(sayi1 + sayi2));
            }
        });

        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int sayi1 = Integer.parseInt(text1.getText());
                int sayi2 = Integer.parseInt(text2.getText());
                result.setText(String.valueOf(sayi1 - sayi2));
            }
        });

        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int sayi1 = Integer.parseInt(text1.getText());
                int sayi2 = Integer.parseInt(text2.getText());
                result.setText(String.valueOf(sayi1 * sayi2));
            }
        });

        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int sayi1 = Integer.parseInt(text1.getText());
                int sayi2 = Integer.parseInt(text2.getText());
                if (sayi2 != 0) {
                    result.setText(String.valueOf((float)sayi1 / sayi2));
                } else {
                    result.setText("Hata");
                }
            }
        });

        frame.setVisible(true);
    }
}

