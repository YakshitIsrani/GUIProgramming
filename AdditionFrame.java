package GuiProgramming;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AdditionFrame extends JFrame{
    private JPanel panel;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;

    public void initComponents(){
        panel.setLayout(null);
        l1.setBounds(50,50,100,20);
        t1.setBounds(160,50,100,20);
        l2.setBounds(50,100,100,20);
        t2.setBounds(160,100,100,20);
        b1.setBounds(100,150,100,20);
        l3.setBounds(50,200,300,20);
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(l3);
        panel.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a+b;
                l3.setText("Sum of "+a+" and "+b+" is "+c);
            }
        });
    }

    public AdditionFrame(){
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setContentPane(panel);
    }
}
