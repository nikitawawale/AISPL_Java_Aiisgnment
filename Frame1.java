package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1357, 774);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\Flourish software\\hlogo.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\Flourish software\\h1.jpg"));
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBackground(Color.PINK);
		
		JLabel lblNewLabel_2 = new JLabel("Appoinment Details");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		
		JLabel lblNewLabel_3 = new JLabel("DOB");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3_1 = new JLabel("Name");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3_2 = new JLabel("Age");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3_3 = new JLabel("Blood Group");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3_4 = new JLabel("Address");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3_5 = new JLabel("Mobile No.");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3_6 = new JLabel("Email");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3_7 = new JLabel("Date Of Appoinment");
		lblNewLabel_3_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(568)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(574, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 648, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(97)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3_5, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3_6, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3_3)
										.addComponent(lblNewLabel_3_7, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
									.addGap(43)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
											.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
											.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
											.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
											.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
											.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
											.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
									.addGap(241))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(254)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(24))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(162)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(198)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 473, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_3_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_3_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_3_7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(47)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
