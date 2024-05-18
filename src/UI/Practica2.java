package UI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Practica2 {
    private JTabbedPane tabbedPane1;
    private JPanel tabProcesos;
    private JPanel tabNotaciones;
    private JButton btn_log_Execute;
    private JPanel contentPane;
    private JList list1;


    public Practica2() {

        btn_log_Execute.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Practica 2");
        frame.setContentPane(new Practica2().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
