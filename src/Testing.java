import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Testing
{
    public void buildGUI()
    {
        JPanel p = new JPanel(new BorderLayout());
        final JScrollPane sp = new JScrollPane(new JTextArea("Hello World",10,10));
        JButton btn = new JButton("Change scrollPane");
        p.add(sp,BorderLayout.CENTER);
        p.add(btn,BorderLayout.SOUTH);
        JFrame f = new JFrame();
        f.getContentPane().add(p);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                sp.setViewportView(new JTree());
            }
        });
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Testing().buildGUI();
            }
        });
    }
}