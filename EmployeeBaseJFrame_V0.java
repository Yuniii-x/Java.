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

public class EmployeeBaseJFrame_V0 extends JFrame {

	public static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textFieldSSN;
	public JTextField textField_3;
	public JTextField textFieldFN;
	public JTextField textFieldLN;
	public JTextField textFieldTE;
	public JTextField textFieldEC;
	public JTextField textFieldHE;
	public JTextField textFieldLE;
	public JTextField textFieldAE;
	public JTextField textFieldALevel;
	public JTextField textFieldBLevel1;
	public JTextField textFieldBLevel2;
	public JTextField textFieldCLevel;
	public JTextField textFieldaLevel;
	public JTextField textFieldbLevel;
	public JTextField textFieldcLevel;
	public JLabel lblBLevel1;
	public JLabel lblDistribution;
	public JLabel lblALevel;
	public JLabel lblBLevel;
	public JLabel lblCLevel;
	public JLabel lblThousand;
	public JLabel lblUnit;
	public JLabel lblLN;
	public JLabel lblFN;
	public JLabel lblSSN;
	public JLabel lblEarnings;
	public JButton btnClearRecord;
	public JLabel lblTE;
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
	public JLabel lblCompany;
	public JTextField textFieldCp;
	public JButton btnClearProfileresults;
	
	public static String employeeType;
	private JTextField textFieldGS;
	private JTextField textFieldCR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		employeeType="SuperBase Emplyee (by YU-EN PENG 2023/11/08)";
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeBaseJFrame_V0 frame = new EmployeeBaseJFrame_V0(employeeType);
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
	public EmployeeBaseJFrame_V0(String employeeYype) {
		setTitle("Employee-Book Application (by PENG 2023/11/08)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 708);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 0), new Color(0, 0, 128), null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCompany = new JLabel("Company:");
		lblCompany.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblCompany.setHorizontalAlignment(SwingConstants.LEFT);
		lblCompany.setBounds(42, 59, 69, 15);
		contentPane.add(lblCompany);
		
		lblTE = new JLabel("Total Employees:");
		lblTE.setHorizontalAlignment(SwingConstants.LEFT);
		lblTE.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblTE.setBounds(451, 59, 116, 15);
		contentPane.add(lblTE);
		
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
		textFieldSSN.setBounds(129, 201, 96, 21);
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
		
		lblSSN = new JLabel("SSN:");
		lblSSN.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSSN.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblSSN.setBounds(66, 204, 45, 15);
		contentPane.add(lblSSN);
		
		lblFN = new JLabel("First Name:");
		lblFN.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFN.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblFN.setBounds(25, 235, 86, 15);
		contentPane.add(lblFN);
		
		lblLN = new JLabel("Last Name:");
		lblLN.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLN.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblLN.setBounds(25, 266, 86, 15);
		contentPane.add(lblLN);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textField_3.setBounds(129, 121, 96, 21);
		contentPane.add(textField_3);
		
		textFieldFN = new JTextField();
		textFieldFN.setColumns(10);
		textFieldFN.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldFN.setBounds(129, 232, 96, 21);
		contentPane.add(textFieldFN);
		
		textFieldLN = new JTextField();
		textFieldLN.setColumns(10);
		textFieldLN.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldLN.setBounds(129, 263, 96, 21);
		contentPane.add(textFieldLN);
		
		JLabel lblRArea = new JLabel("Results Area");
		lblRArea.setBounds(525, 124, 78, 15);
		contentPane.add(lblRArea);
		
		textFieldCp = new JTextField();
		textFieldCp.setColumns(10);
		textFieldCp.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldCp.setBounds(129, 56, 96, 21);
		contentPane.add(textFieldCp);
		
		textFieldTE = new JTextField();
		textFieldTE.setColumns(10);
		textFieldTE.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldTE.setBounds(589, 56, 96, 21);
		contentPane.add(textFieldTE);
		
		JLabel lblEC = new JLabel("Employee Counter:");
		lblEC.setHorizontalAlignment(SwingConstants.LEFT);
		lblEC.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblEC.setBounds(451, 173, 128, 15);
		contentPane.add(lblEC);
		
		JLabel lblHE = new JLabel("Highest Earnings:");
		lblHE.setHorizontalAlignment(SwingConstants.LEFT);
		lblHE.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblHE.setBounds(451, 204, 115, 15);
		contentPane.add(lblHE);
		
		JLabel lblLE = new JLabel("Lowest Earnings:");
		lblLE.setHorizontalAlignment(SwingConstants.LEFT);
		lblLE.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblLE.setBounds(451, 235, 115, 15);
		contentPane.add(lblLE);
		
		JLabel lblAE = new JLabel("Average Earning:");
		lblAE.setHorizontalAlignment(SwingConstants.LEFT);
		lblAE.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblAE.setBounds(452, 266, 115, 15);
		contentPane.add(lblAE);
		
		textFieldEC = new JTextField();
		textFieldEC.setColumns(10);
		textFieldEC.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldEC.setBounds(589, 170, 96, 21);
		contentPane.add(textFieldEC);
		
		textFieldHE = new JTextField();
		textFieldHE.setColumns(10);
		textFieldHE.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldHE.setBounds(589, 201, 96, 21);
		contentPane.add(textFieldHE);
		
		textFieldLE = new JTextField();
		textFieldLE.setColumns(10);
		textFieldLE.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldLE.setBounds(589, 232, 96, 21);
		contentPane.add(textFieldLE);
		
		textFieldAE = new JTextField();
		textFieldAE.setColumns(10);
		textFieldAE.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldAE.setBounds(589, 263, 96, 21);
		contentPane.add(textFieldAE);
		
		lblDistribution = new JLabel("Distribution of Wage-Levels");
		lblDistribution.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.RED, null, null));
		lblDistribution.setBackground(Color.CYAN);
		lblDistribution.setOpaque(true);
		lblDistribution.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistribution.setBounds(36, 334, 649, 15);
		contentPane.add(lblDistribution);
		
		lblALevel = new JLabel("A_Level>=");
		lblALevel.setHorizontalAlignment(SwingConstants.LEFT);
		lblALevel.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblALevel.setBounds(266, 362, 86, 15);
		contentPane.add(lblALevel);
		
		lblBLevel = new JLabel("B_Level=");
		lblBLevel.setHorizontalAlignment(SwingConstants.LEFT);
		lblBLevel.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblBLevel.setBounds(266, 393, 86, 15);
		contentPane.add(lblBLevel);
		
		lblCLevel = new JLabel("C_Level<=");
		lblCLevel.setHorizontalAlignment(SwingConstants.LEFT);
		lblCLevel.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblCLevel.setBounds(266, 424, 86, 15);
		contentPane.add(lblCLevel);
		
		textFieldALevel = new JTextField();
		textFieldALevel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		textFieldALevel.setBackground(new Color(250, 250, 210));
		textFieldALevel.setBounds(346, 359, 144, 21);
		contentPane.add(textFieldALevel);
		textFieldALevel.setColumns(10);
		
		textFieldBLevel1 = new JTextField();
		textFieldBLevel1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		textFieldBLevel1.setBackground(new Color(250, 250, 210));
		textFieldBLevel1.setBounds(346, 390, 40, 21);
		contentPane.add(textFieldBLevel1);
		textFieldBLevel1.setColumns(10);
		
		textFieldBLevel2 = new JTextField();
		textFieldBLevel2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		textFieldBLevel2.setBackground(new Color(250, 250, 210));
		textFieldBLevel2.setColumns(10);
		textFieldBLevel2.setBounds(450, 390, 40, 21);
		contentPane.add(textFieldBLevel2);
		
		textFieldCLevel = new JTextField();
		textFieldCLevel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		textFieldCLevel.setBackground(new Color(250, 250, 210));
		textFieldCLevel.setColumns(10);
		textFieldCLevel.setBounds(346, 421, 144, 21);
		contentPane.add(textFieldCLevel);
		
		textFieldaLevel = new JTextField();
		textFieldaLevel.setBackground(new Color(255, 234, 238));
		textFieldaLevel.setColumns(10);
		textFieldaLevel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldaLevel.setBounds(525, 359, 96, 21);
		contentPane.add(textFieldaLevel);
		
		textFieldbLevel = new JTextField();
		textFieldbLevel.setBackground(new Color(255, 234, 238));
		textFieldbLevel.setColumns(10);
		textFieldbLevel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldbLevel.setBounds(525, 390, 96, 21);
		contentPane.add(textFieldbLevel);
		
		textFieldcLevel = new JTextField();
		textFieldcLevel.setBackground(new Color(255, 234, 238));
		textFieldcLevel.setColumns(10);
		textFieldcLevel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldcLevel.setBounds(525, 421, 96, 21);
		contentPane.add(textFieldcLevel);
		
		lblUnit = new JLabel("Unit:");
		lblUnit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUnit.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblUnit.setBounds(66, 393, 45, 15);
		contentPane.add(lblUnit);
		
		lblThousand = new JLabel("Thousand");
		lblThousand.setOpaque(true);
		lblThousand.setBackground(new Color(255, 255, 0));
		lblThousand.setHorizontalAlignment(SwingConstants.CENTER);
		lblThousand.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblThousand.setBounds(142, 388, 96, 25);
		contentPane.add(lblThousand);
		
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
		
		lblBLevel1 = new JLabel("~");
		lblBLevel1.setBackground(new Color(250, 250, 210));
		lblBLevel1.setOpaque(true);
		lblBLevel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBLevel1.setBounds(393, 393, 47, 15);
		contentPane.add(lblBLevel1);
		
		JLabel lblGS = new JLabel("Gross Sales:");
		lblGS.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGS.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblGS.setBounds(25, 297, 86, 15);
		contentPane.add(lblGS);
		
		textFieldGS = new JTextField();
		textFieldGS.setColumns(10);
		textFieldGS.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldGS.setBounds(129, 294, 96, 21);
		contentPane.add(textFieldGS);
		
		JLabel lblCR = new JLabel("Commission Rate:");
		lblCR.setHorizontalAlignment(SwingConstants.CENTER);
		lblCR.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblCR.setBounds(266, 266, 170, 15);
		contentPane.add(lblCR);
		
		textFieldCR = new JTextField();
		textFieldCR.setColumns(10);
		textFieldCR.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldCR.setBounds(307, 294, 96, 21);
		contentPane.add(textFieldCR);
	}
}
