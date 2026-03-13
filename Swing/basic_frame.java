import java.awt.*;
import javax.swing.*;
class basic_frame
{
	public static void main(String args[])
	{
		JFrame jf = new JFrame("My First UI");
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);
		jf.setSize(400,400);
		jf.setBounds(500,100,220,340);
		JButton jb = new JButton("CLICK");
		jf.add(jb);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.getContentPane().setBackground(Color.BLUE);
		JLabel lb = new JLabel("HELLO WORLD");
		lb.setFont(new Font("Arial",Font.BOLD,40));
		lb.setForeground(Color.WHITE);
		jf.add(lb);
		JTextField t = new JTextField(15);
		jf.add(t);
		JButton bt = new JButton("SUBMIT");
		jf.add(bt);
	}
}