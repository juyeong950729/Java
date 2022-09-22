package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtfDisp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyCalculator() {
		setTitle("MyCalculator v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtfDisp = new JTextField();
		txtfDisp.setEditable(false);
		txtfDisp.setFont(new Font("굴림", Font.BOLD, 22));
		txtfDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtfDisp.setText("0");
		txtfDisp.setBounds(12, 10, 314, 46);
		contentPane.add(txtfDisp);
		txtfDisp.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 78, 60, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(95, 78, 60, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(179, 78, 60, 60);
		contentPane.add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(266, 78, 60, 60);
		contentPane.add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 157, 60, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(95, 157, 60, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(179, 157, 60, 60);
		contentPane.add(btn6);
		
		JButton btnMulti = new JButton("X");
		btnMulti.setBounds(266, 157, 60, 60);
		contentPane.add(btnMulti);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(12, 244, 60, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(95, 244, 60, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(179, 244, 60, 60);
		contentPane.add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(266, 244, 60, 60);
		contentPane.add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(12, 325, 60, 60);
		contentPane.add(btn0);
		
		JButton btnCancel = new JButton("C");
		btnCancel.setBounds(95, 325, 60, 60);
		contentPane.add(btnCancel);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(179, 325, 60, 60);
		contentPane.add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(266, 325, 60, 60);
		contentPane.add(btnPlus);
	}

}
