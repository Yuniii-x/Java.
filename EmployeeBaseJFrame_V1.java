package PENG.polymorphism.employee.frame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class EmployeeBaseJFrame_V1 extends JFrame {

	public static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textFieldSSN;
	public JTextField textField_3;
	public JTextField textFieldFN;
	public JTextField textFieldLN;
	public JTextField textField_1;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextField textField_8;
	public JTextField textField_9;
	public JTextField textField_10;
	public JTextField textField_11;
	public JTextField textField_12;
	public JTextField textField_14;
	public JTextField textField_15;
	public JTextField textField_16;
	public JTextField textField_17;
	public JLabel lblNewLabel_3;
	public JLabel lblDistribution;
	public JLabel lblNewLabel_1_3_1_1;
	public JLabel lblNewLabel_1_3_1_1_1;
	public JLabel lblNewLabel_1_3_1_1_2;
	public JLabel lblNewLabel_1_2_1_1;
	public JLabel lblNewLabel_1_2_1;
	public JLabel lblNewLabel_1_4;
	public JLabel lblNewLabel_1_3;
	public JLabel lblNewLabel_1_2;
	public JLabel lblEarnings;
	public JButton btnClearRecord;
	public JLabel lblNewLabel_1_1;
	public JButton btnCalculate;
	public JButton btnOpenFile;
	public JButton btnOutputToTextarea;
	public JButton btnWriteFile;
	public JButton btnPiechartDemo;
	public JButton btnReadFile;
	public JButton btnCloseFile;
	public JButton btnRefresh;
	public JButton btnExit;
	public JButton btnSetProfile;
	public JLabel lblNewLabel_1;
	public JTextField textFieldCp;
	public JButton btnClearProfileresults;
	
	public static String employeeType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		employeeType="SuperBase Emplyee (by YU-EN PENG 2023/11/08)";
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeBaseJFrame_V1 frame = new EmployeeBaseJFrame_V1(employeeType);
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
	public EmployeeBaseJFrame_V1(String employeeYype) {
		setTitle("Employee-Book Application (by PENG 2023/11/08)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 708);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(193, 202, 236));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 0), new Color(0, 0, 128), null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Company:");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(42, 59, 69, 15);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("Total Employees:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(451, 59, 116, 15);
		contentPane.add(lblNewLabel_1_1);
		
		lblEarnings = new JLabel("Earnings:");
		lblEarnings.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, null, null));
		lblEarnings.setHorizontalTextPosition(SwingConstants.LEFT);
		lblEarnings.setOpaque(true);
		lblEarnings.setHorizontalAlignment(SwingConstants.CENTER);
		lblEarnings.setForeground(new Color(0, 0, 0));
		lblEarnings.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblEarnings.setBackground(new Color(255, 248, 220));
		lblEarnings.setBounds(33, 121, 78, 20);
		contentPane.add(lblEarnings);
		
		textFieldSSN = new JTextField();
		textFieldSSN.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldSSN.setColumns(10);
		textFieldSSN.setBounds(129, 170, 96, 21);
		contentPane.add(textFieldSSN);
		
		btnSetProfile = new JButton("Set Profile");
		btnSetProfile.setBackground(Color.LIGHT_GRAY);
		btnSetProfile.setBounds(33, 10, 192, 23);
		contentPane.add(btnSetProfile);
		
		btnClearProfileresults = new JButton("Clear Profile/Results");
		btnClearProfileresults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClearProfileresults.setBackground(Color.LIGHT_GRAY);
		btnClearProfileresults.setBounds(431, 10, 254, 23);
		contentPane.add(btnClearProfileresults);
		
		btnClearRecord = new JButton("Clear Record");
		btnClearRecord.setBackground(Color.LIGHT_GRAY);
		btnClearRecord.setBounds(235, 120, 120, 23);
		contentPane.add(btnClearRecord);
		
		lblNewLabel_1_2 = new JLabel("SSN:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(66, 173, 45, 15);
		contentPane.add(lblNewLabel_1_2);
		
		lblNewLabel_1_3 = new JLabel("First Name:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(25, 204, 86, 15);
		contentPane.add(lblNewLabel_1_3);
		
		lblNewLabel_1_4 = new JLabel("Last Name:");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(25, 235, 86, 15);
		contentPane.add(lblNewLabel_1_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textField_3.setBounds(129, 121, 96, 21);
		contentPane.add(textField_3);
		
		textFieldFN = new JTextField();
		textFieldFN.setColumns(10);
		textFieldFN.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldFN.setBounds(129, 201, 96, 21);
		contentPane.add(textFieldFN);
		
		textFieldLN = new JTextField();
		textFieldLN.setBackground(new Color(255, 255, 255));
		textFieldLN.setColumns(10);
		textFieldLN.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldLN.setBounds(129, 232, 96, 21);
		contentPane.add(textFieldLN);
		
		JLabel lblNewLabel = new JLabel("Results Area");
		lblNewLabel.setBounds(525, 124, 78, 15);
		contentPane.add(lblNewLabel);
		
		textFieldCp = new JTextField();
		textFieldCp.setColumns(10);
		textFieldCp.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldCp.setBounds(129, 56, 96, 21);
		contentPane.add(textFieldCp);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textField_1.setBounds(589, 56, 96, 21);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Employee Counter:");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_3_1.setBounds(451, 173, 128, 15);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Highest Earnings:");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_2.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_3_2.setBounds(451, 204, 115, 15);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Lowest Earnings:");
		lblNewLabel_1_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_3.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_3_3.setBounds(451, 235, 115, 15);
		contentPane.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("Average Earning:");
		lblNewLabel_1_3_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_4.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_3_4.setBounds(452, 266, 115, 15);
		contentPane.add(lblNewLabel_1_3_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textField_6.setBounds(589, 170, 96, 21);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textField_7.setBounds(589, 201, 96, 21);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textField_8.setBounds(589, 232, 96, 21);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textField_9.setBounds(589, 263, 96, 21);
		contentPane.add(textField_9);
		
		lblDistribution = new JLabel("Distribution of Wage-Levels");
		lblDistribution.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.RED, null, null));
		lblDistribution.setBackground(Color.CYAN);
		lblDistribution.setOpaque(true);
		lblDistribution.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistribution.setBounds(36, 334, 649, 15);
		contentPane.add(lblDistribution);
		
		lblNewLabel_1_3_1_1 = new JLabel("A_Level>=");
		lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_1_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_3_1_1.setBounds(266, 362, 86, 15);
		contentPane.add(lblNewLabel_1_3_1_1);
		
		lblNewLabel_1_3_1_1_1 = new JLabel("B_Level=");
		lblNewLabel_1_3_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_1_1_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_3_1_1_1.setBounds(266, 393, 86, 15);
		contentPane.add(lblNewLabel_1_3_1_1_1);
		
		lblNewLabel_1_3_1_1_2 = new JLabel("C_Level<=");
		lblNewLabel_1_3_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_1_1_2.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_3_1_1_2.setBounds(266, 424, 86, 15);
		contentPane.add(lblNewLabel_1_3_1_1_2);
		
		textField_10 = new JTextField();
		textField_10.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		textField_10.setBackground(new Color(250, 250, 210));
		textField_10.setBounds(346, 359, 144, 21);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		textField_11.setBackground(new Color(250, 250, 210));
		textField_11.setBounds(346, 390, 40, 21);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		textField_12.setBackground(new Color(250, 250, 210));
		textField_12.setColumns(10);
		textField_12.setBounds(450, 390, 40, 21);
		contentPane.add(textField_12);
		
		textField_14 = new JTextField();
		textField_14.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		textField_14.setBackground(new Color(250, 250, 210));
		textField_14.setColumns(10);
		textField_14.setBounds(346, 421, 144, 21);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setBackground(new Color(255, 234, 238));
		textField_15.setColumns(10);
		textField_15.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textField_15.setBounds(525, 359, 96, 21);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setBackground(new Color(255, 234, 238));
		textField_16.setColumns(10);
		textField_16.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textField_16.setBounds(525, 390, 96, 21);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setBackground(new Color(255, 234, 238));
		textField_17.setColumns(10);
		textField_17.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textField_17.setBounds(525, 421, 96, 21);
		contentPane.add(textField_17);
		
		lblNewLabel_1_2_1 = new JLabel("Unit:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_2_1.setBounds(66, 393, 45, 15);
		contentPane.add(lblNewLabel_1_2_1);
		
		lblNewLabel_1_2_1_1 = new JLabel("Thousand");
		lblNewLabel_1_2_1_1.setOpaque(true);
		lblNewLabel_1_2_1_1.setBackground(new Color(255, 255, 0));
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_2_1_1.setBounds(142, 388, 96, 25);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.setBackground(Color.LIGHT_GRAY);
		btnCalculate.setBounds(33, 483, 96, 23);
		contentPane.add(btnCalculate);
		
		btnOpenFile = new JButton("Open File");
		btnOpenFile.setBackground(Color.LIGHT_GRAY);
		btnOpenFile.setBounds(33, 534, 96, 23);
		contentPane.add(btnOpenFile);
		
		btnOutputToTextarea = new JButton("Output to TextArea");
		btnOutputToTextarea.setBackground(Color.LIGHT_GRAY);
		btnOutputToTextarea.setBounds(180, 483, 160, 23);
		contentPane.add(btnOutputToTextarea);
		
		btnWriteFile = new JButton("Write File");
		btnWriteFile.setBackground(Color.LIGHT_GRAY);
		btnWriteFile.setBounds(180, 534, 96, 23);
		contentPane.add(btnWriteFile);
		
		btnPiechartDemo = new JButton("Pie-Chart Demo");
		btnPiechartDemo.setBackground(Color.LIGHT_GRAY);
		btnPiechartDemo.setBounds(407, 483, 160, 23);
		contentPane.add(btnPiechartDemo);
		
		btnReadFile = new JButton("Read File");
		btnReadFile.setBackground(Color.LIGHT_GRAY);
		btnReadFile.setBounds(329, 534, 96, 23);
		contentPane.add(btnReadFile);
		
		btnCloseFile = new JButton("Close File");
		btnCloseFile.setBackground(Color.LIGHT_GRAY);
		btnCloseFile.setBounds(471, 534, 96, 23);
		contentPane.add(btnCloseFile);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.setBackground(Color.LIGHT_GRAY);
		btnRefresh.setBounds(589, 483, 96, 23);
		contentPane.add(btnRefresh);
		
		btnExit = new JButton("Exit");
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(589, 534, 96, 23);
		contentPane.add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(385, 379, 170, 0);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(33, 459, 658, 14);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(new Color(0, 255, 64));
		separator_1_1.setBounds(33, 321, 658, 14);
		contentPane.add(separator_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBackground(new Color(0, 255, 64));
		separator_1_1_1.setBounds(25, 97, 660, 14);
		contentPane.add(separator_1_1_1);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setBackground(new Color(64, 0, 64));
		separator_1_1_1_1.setBounds(431, 149, 254, 14);
		contentPane.add(separator_1_1_1_1);
		
		JSeparator separator_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1.setBackground(new Color(64, 0, 64));
		separator_1_1_1_1_1.setBounds(431, 111, 254, 14);
		contentPane.add(separator_1_1_1_1_1);
		
		lblNewLabel_3 = new JLabel("~");
		lblNewLabel_3.setBackground(new Color(250, 250, 210));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(393, 393, 47, 15);
		contentPane.add(lblNewLabel_3);
	}
}
