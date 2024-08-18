package GuiProgramming;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConverterFrame extends JFrame {
    private JPanel panel;
    private JTextField t1;
    private JComboBox<String> cb1;
    private JTextField t2;
    private JComboBox<String> cb2;
    private JButton b1;
    private JLabel l1;
    private JLabel l2;

    public void initComponents(){
        panel.setLayout(null);
        t1.setBounds(30,150,80,30);
        cb1.setBounds(115,150,50,30);
        t2.setBounds(200,150,80,30);
        cb2.setBounds(285,150,50,30);
        b1.setBounds(130,250,100,30);
        l1.setBounds(30,120,50,30);
        l2.setBounds(200,120,50,30);

        t1.setText("1");
        t2.setEditable(false);
        l1.setText("Input");
        l2.setText("Output");

        panel.add(t1);
        panel.add(cb1);
        panel.add(t2);
        panel.add(cb2);
        panel.add(b1);
        panel.add(l1);
        panel.add(l2);


        cb1.addItem("Km");
        cb1.addItem("m");
        cb1.addItem("cm");
        cb2.addItem("Km");
        cb2.addItem("m");
        cb2.addItem("cm");

//        panel.revalidate();
//        panel.repaint();

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (cb1.getSelectedIndex()){
                    case 0:
                        switch (cb2.getSelectedIndex()){
                            case 0:
                                t2.setText((t1.getText()));
                                break;
                            case 1:
                                t2.setText(Double.toString(Double.parseDouble(t1.getText())*1000));
                                break;
                            case 2:
                                t2.setText(Double.toString(Double.parseDouble(t1.getText())*100000));
                                break;
                        }
                        break;
                    case 1:
                        switch (cb2.getSelectedIndex()){
                            case 0:
                                t2.setText(Double.toString(Double.parseDouble(t1.getText())/1000));
                                break;
                            case 1:
                                t2.setText((t1.getText()));
                                break;
                            case 2:
                                t2.setText(Double.toString(Double.parseDouble(t1.getText())*100));
                                break;
                        }
                        break;
                        case 2:
                        switch (cb2.getSelectedIndex()){
                            case 0:
                                t2.setText(Double.toString(Double.parseDouble(t1.getText())/100000));
                                break;
                            case 1:
                                t2.setText(Double.toString(Double.parseDouble(t1.getText())/100));
                                break;
                            case 2:
                                t2.setText((t1.getText()));
                                break;
                        }
                }
            }
        });
    }


    public UnitConverterFrame(){
        super("Unit Converter");
        setContentPane(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        initComponents();
        setVisible(true);
    }
}
