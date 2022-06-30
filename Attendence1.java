////import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

class Attendence1 
{

    public static void main(String[] args)
    {
        JFrame f = new JFrame("SELECT TYPE");
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JDesktopPane desktop = new JDesktopPane();
       // JPanel p = new JPanel();

        JButton b = new JButton("click me");
        //JButton admin=new JButton("ADMIN");
        
        b.setBounds(20,120,100,40);
         //admin.setBounds(20,120,100,40);
        
        b.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                JInternalFrame in = new JInternalFrame(("ATTENDANCE USER FORM"), true, true, true, true);
                //JInternalFrame jin = new JInternalFrame(("ATTENDANCE admin FORM"), true, true, true, true);

                
                //Label l1=new Label("NAME : ");
               // Label l2=new Label("ID   : ");
                               
                JPanel p1 = new JPanel();
                in.add(p1);
                //jin.add(p1);
               // in.add(l1);
                //in.add(l2);
                in.setVisible(true);
                // jin.setVisible(true);
                in.setSize(585, 560);
                // jin.setSize(585, 560);
                //in.setMinimumSize(new Dimension(1300, 240));
                desktop.add(in);
               // desktop.add(jin);
              //  in.moveToFront();
            }
        });
        
    
        
        f.add(b);
       // f.add(BorderLayout.NORTH, p);
        f.add(desktop);
        f.setSize(600, 600);
        f.setVisible(true);
        //f.setLocationRelativeTo(null);
    }
}