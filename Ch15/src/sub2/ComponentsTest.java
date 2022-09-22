package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentsTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest frame = new ComponentsTest();
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
	public ComponentsTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 10, 129, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(12, 35, 97, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("New button");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.setBounds(12, 60, 97, 23);
		contentPane.add(btn1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(112, 60, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(212, 60, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(316, 60, 97, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(12, 93, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		txtf1 = new JTextField();
		txtf1.setBounds(12, 118, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 149, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(12, 180, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTxtf1Result = new JLabel("결과 : ");
		lblTxtf1Result.setBounds(269, 121, 57, 15);
		contentPane.add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과 : ");
		lblTxtf2Result.setBounds(269, 152, 57, 15);
		contentPane.add(lblTxtf2Result);
		
		JLabel lblTxtf3Result = new JLabel("결과 : ");
		lblTxtf3Result.setBounds(269, 183, 57, 15);
		contentPane.add(lblTxtf3Result);
		
		JButton btnTxtf1 = new JButton("New button");
		btnTxtf1.setBounds(140, 117, 97, 23);
		contentPane.add(btnTxtf1);
		
		JButton btnTxtf2 = new JButton("New button");
		btnTxtf2.setBounds(140, 148, 97, 23);
		contentPane.add(btnTxtf2);
		
		JButton btnTxtf3 = new JButton("New button");
		btnTxtf3.setBounds(140, 179, 97, 23);
		contentPane.add(btnTxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(12, 215, 129, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("취미를 고르세요.");
		lblNewLabel_4.setBounds(12, 240, 129, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(12, 261, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(73, 261, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(140, 261, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(201, 261, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(262, 261, 57, 23);
		contentPane.add(chk5);
		
		JLabel lblChkResult = new JLabel("결과 :");
		lblChkResult.setBounds(12, 290, 197, 23);
		contentPane.add(lblChkResult);
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> list = new ArrayList<>();
				
				if(chk1.isSelected()) {
					list.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					list.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					list.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					list.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					list.add(chk5.getText());
				}
				
				lblChkResult.setText("결과 : " + list);
				
			}
		});
		btnChk.setBounds(334, 261, 79, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_5.setBounds(12, 323, 141, 15);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rbMale = new JRadioButton("남자");
		rbMale.setBounds(12, 344, 57, 23);
		contentPane.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("여자");
		rbFemale.setBounds(85, 344, 57, 23);
		contentPane.add(rbFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		
		JLabel lblGenderResult = new JLabel("결과 :");
		lblGenderResult.setBounds(12, 374, 197, 23);
		contentPane.add(lblGenderResult);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s;
				
				if (rbMale.isSelected()) {
					s = "남자";
				} else {
					s = "여자";
				}
				
				lblGenderResult.setText("결과 : "+s);
			}
		});
		btnGender.setBounds(163, 344, 79, 23);
		contentPane.add(btnGender);
		
		
		
		
	}
}
