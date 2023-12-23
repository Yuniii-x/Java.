package PENG.polymorphism.employee.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class EmployeeBaseJFrame_Lin2027 extends JFrame {

	public static final long serialVersionUID = 1L;
	public JTextField textFieldSSN;
	public JTextField textFieldEarnings;
	public JTextField textFieldFN;
	public JTextField textFieldLN;
	public JTextField textFieldTotalEmployee;
	public JTextField textFieldEmployeeCounter;
	public JTextField textFieldHighestEarnings;
	public JTextField textFieldLowestEarnings;
	public JTextField textFieldAverageEarning;
	public JTextField textFieldLA;
	public JTextField textFieldLB;
	public JTextField textFieldLC;
	public JButton btnSetProfile;
	public JButton btnClearProfileresults;
	public JButton btnClearRecord;
	public JButton btnCalculate;
	public JButton btnOpenFile;
	public JButton btnOutputToTextarea;
	public JButton btnWriteFile;
	public JButton btnPiechartDemo;
	public JButton btnReadFile;
	public JButton btnCloseFile;
	public JButton btnRefresh;
	public JButton btnExit;
	public JLabel lblNewLabel_3;
	public JLabel lblCp;
	public JLabel lblTotalEmployee;
	public JLabel lblEarnings;
	public JLabel lblResultsArea;
	public JLabel lblSSN;
	public JLabel lblFN;
	public JLabel lblEmployeeCounter;
	public JLabel lblHighestEarnings;
	public JLabel lblLN;
	public JLabel lblLowestEarnings;
	public JLabel lblAverageEarnings;
	public JLabel lblUnit;
	public JLabel lblAlevel;
	public JLabel lblBlevel;
	public JLabel lblClevel;
	public JLabel lblUnit_1;
	public JSeparator separator;
	public JSeparator separator_2;
	public JSeparator separator_1_1;
	public JPanel contentPane;
	private JLabel lblFN_1;
	private JTextField textFieldCp;
	private JLabel lblThousand;
	private JLabel lblDistributionOfWagelevels;
	private JLabel lblNewLabel;
	
	public static String employeeType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeBaseJFrame_Lin2027 frame = new EmployeeBaseJFrame_Lin2027(employeeType);
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
	public EmployeeBaseJFrame_Lin2027(String employeeYype) {
		setTitle("Employee-Book Application (by PENG 2023/11/08)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 708);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(251, 224, 252));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 0), new Color(0, 0, 128), null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCp = new JLabel("Company:");
		lblCp.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblCp.setHorizontalAlignment(SwingConstants.LEFT);
		lblCp.setBounds(42, 59, 69, 15);
		contentPane.add(lblCp);
		
		lblTotalEmployee = new JLabel("Total Employees:");
		lblTotalEmployee.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalEmployee.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblTotalEmployee.setBounds(451, 59, 116, 15);
		contentPane.add(lblTotalEmployee);
		
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
		
		textFieldEarnings = new JTextField();
		textFieldEarnings.setColumns(10);
		textFieldEarnings.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldEarnings.setBounds(129, 121, 96, 21);
		contentPane.add(textFieldEarnings);
		
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
		
		JLabel lblResultsArea = new JLabel("Results Area");
		lblResultsArea.setBounds(525, 124, 78, 15);
		contentPane.add(lblResultsArea);
		
		textFieldCp = new JTextField();
		textFieldCp.setColumns(10);
		textFieldCp.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldCp.setBounds(129, 56, 96, 21);
		contentPane.add(textFieldCp);
		
		textFieldTotalEmployee = new JTextField();
		textFieldTotalEmployee.setColumns(10);
		textFieldTotalEmployee.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldTotalEmployee.setBounds(589, 56, 96, 21);
		contentPane.add(textFieldTotalEmployee);
		
		JLabel lblEmployeeCounter = new JLabel("Employee Counter:");
		lblEmployeeCounter.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmployeeCounter.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblEmployeeCounter.setBounds(451, 173, 128, 15);
		contentPane.add(lblEmployeeCounter);
		
		JLabel lblHighestEarnings = new JLabel("Highest Earnings:");
		lblHighestEarnings.setHorizontalAlignment(SwingConstants.LEFT);
		lblHighestEarnings.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblHighestEarnings.setBounds(451, 204, 115, 15);
		contentPane.add(lblHighestEarnings);
		
		JLabel lblLowestEarnings = new JLabel("Lowest Earnings:");
		lblLowestEarnings.setHorizontalAlignment(SwingConstants.LEFT);
		lblLowestEarnings.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblLowestEarnings.setBounds(451, 235, 115, 15);
		contentPane.add(lblLowestEarnings);
		
		JLabel lblAverageEarning = new JLabel("Average Earning:");
		lblAverageEarning.setHorizontalAlignment(SwingConstants.LEFT);
		lblAverageEarning.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblAverageEarning.setBounds(452, 266, 115, 15);
		contentPane.add(lblAverageEarning);
		
		textFieldEmployeeCounter = new JTextField();
		textFieldEmployeeCounter.setColumns(10);
		textFieldEmployeeCounter.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldEmployeeCounter.setBounds(589, 170, 96, 21);
		contentPane.add(textFieldEmployeeCounter);
		
		textFieldHighestEarnings = new JTextField();
		textFieldHighestEarnings.setColumns(10);
		textFieldHighestEarnings.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldHighestEarnings.setBounds(589, 201, 96, 21);
		contentPane.add(textFieldHighestEarnings);
		
		textFieldLowestEarnings = new JTextField();
		textFieldLowestEarnings.setColumns(10);
		textFieldLowestEarnings.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldLowestEarnings.setBounds(589, 232, 96, 21);
		contentPane.add(textFieldLowestEarnings);
		
		textFieldAverageEarning = new JTextField();
		textFieldAverageEarning.setColumns(10);
		textFieldAverageEarning.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldAverageEarning.setBounds(589, 263, 96, 21);
		contentPane.add(textFieldAverageEarning);
		
		lblDistributionOfWagelevels = new JLabel("Distribution of Wage-Levels");
		lblDistributionOfWagelevels.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.RED, null, null));
		lblDistributionOfWagelevels.setBackground(Color.CYAN);
		lblDistributionOfWagelevels.setOpaque(true);
		lblDistributionOfWagelevels.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistributionOfWagelevels.setBounds(36, 334, 649, 15);
		contentPane.add(lblDistributionOfWagelevels);
		
		lblAlevel = new JLabel("A_Level>=");
		lblAlevel.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlevel.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblAlevel.setBounds(266, 362, 86, 15);
		contentPane.add(lblAlevel);
		
		lblBlevel = new JLabel("B_Level=");
		lblBlevel.setHorizontalAlignment(SwingConstants.LEFT);
		lblBlevel.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblBlevel.setBounds(266, 393, 86, 15);
		contentPane.add(lblBlevel);
		
		lblClevel = new JLabel("C_Level<=");
		lblClevel.setHorizontalAlignment(SwingConstants.LEFT);
		lblClevel.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblClevel.setBounds(266, 424, 86, 15);
		contentPane.add(lblClevel);
		
		textFieldLA = new JTextField();
		textFieldLA.setBackground(new Color(255, 234, 238));
		textFieldLA.setColumns(10);
		textFieldLA.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldLA.setBounds(525, 359, 96, 21);
		contentPane.add(textFieldLA);
		
		textFieldLB = new JTextField();
		textFieldLB.setBackground(new Color(255, 234, 238));
		textFieldLB.setColumns(10);
		textFieldLB.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldLB.setBounds(525, 390, 96, 21);
		contentPane.add(textFieldLB);
		
		textFieldLC = new JTextField();
		textFieldLC.setBackground(new Color(255, 234, 238));
		textFieldLC.setColumns(10);
		textFieldLC.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldLC.setBounds(525, 421, 96, 21);
		contentPane.add(textFieldLC);
		
		lblUnit = new JLabel("Unit:");
		lblUnit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUnit.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblUnit.setBounds(66, 393, 45, 15);
		contentPane.add(lblUnit);
		

		
		btnCalculate = new JButton("Calculate");
		btnCalculate.setBackground(Color.LIGHT_GRAY);
		btnCalculate.setBounds(33, 483, 96, 23);
		contentPane.add(btnCalculate);
		
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.setBackground(Color.LIGHT_GRAY);
		btnRefresh.setBounds(589, 483, 96, 23);
		contentPane.add(btnRefresh);
		
		
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
		lblNewLabel_3.setBounds(413, 388, 29, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblALowerThreshold = new JLabel("");
		lblALowerThreshold.setOpaque(true);
		lblALowerThreshold.setHorizontalAlignment(SwingConstants.CENTER);
		lblALowerThreshold.setBackground(new Color(250, 250, 210));
		lblALowerThreshold.setBounds(364, 357, 129, 20);
		contentPane.add(lblALowerThreshold);
		
		JLabel lblBLowerThreshold = new JLabel("");
		lblBLowerThreshold.setOpaque(true);
		lblBLowerThreshold.setHorizontalAlignment(SwingConstants.CENTER);
		lblBLowerThreshold.setBackground(new Color(250, 250, 210));
		lblBLowerThreshold.setBounds(364, 388, 45, 20);
		contentPane.add(lblBLowerThreshold);
		
		JLabel lblBUpperThreshold = new JLabel("");
		lblBUpperThreshold.setOpaque(true);
		lblBUpperThreshold.setHorizontalAlignment(SwingConstants.CENTER);
		lblBUpperThreshold.setBackground(new Color(250, 250, 210));
		lblBUpperThreshold.setBounds(448, 388, 45, 20);
		contentPane.add(lblBUpperThreshold);
		
		JLabel lblCLowerThreshold = new JLabel("");
		lblCLowerThreshold.setOpaque(true);
		lblCLowerThreshold.setHorizontalAlignment(SwingConstants.CENTER);
		lblCLowerThreshold.setBackground(new Color(250, 250, 210));
		lblCLowerThreshold.setBounds(364, 418, 129, 20);
		contentPane.add(lblCLowerThreshold);
		
		lblThousand = new JLabel("Thousand");
		lblThousand.setOpaque(true);
		lblThousand.setHorizontalAlignment(SwingConstants.CENTER);
		lblThousand.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblThousand.setBackground(Color.YELLOW);
		lblThousand.setBounds(129, 383, 96, 25);
		contentPane.add(lblThousand);
		
		lblDistributionOfWagelevels = new JLabel("Distribution of Wage-Levels");
		lblDistributionOfWagelevels.setOpaque(true);
		lblDistributionOfWagelevels.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistributionOfWagelevels.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.RED, null, null));
		lblDistributionOfWagelevels.setBackground(Color.CYAN);
		lblDistributionOfWagelevels.setBounds(33, 337, 649, 15);
		contentPane.add(lblDistributionOfWagelevels);
		
		JButton btnOpenFile = new JButton("Open File");
		btnOpenFile.setBackground(Color.LIGHT_GRAY);
		btnOpenFile.setBounds(33, 553, 96, 23);
		contentPane.add(btnOpenFile);
		
		JButton btnOutputToTextarea = new JButton("Output to TextArea");
		btnOutputToTextarea.setBackground(Color.LIGHT_GRAY);
		btnOutputToTextarea.setBounds(160, 483, 160, 23);
		contentPane.add(btnOutputToTextarea);
		
		JButton btnPiechartDemo = new JButton("Pie-Chart Demo");
		btnPiechartDemo.setBackground(Color.LIGHT_GRAY);
		btnPiechartDemo.setBounds(385, 483, 160, 23);
		contentPane.add(btnPiechartDemo);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBackground(Color.LIGHT_GRAY);
		btnRefresh.setBounds(589, 483, 96, 23);
		contentPane.add(btnRefresh);
		
		JButton btnWriteFile = new JButton("Write File");
		btnWriteFile.setBackground(Color.LIGHT_GRAY);
		btnWriteFile.setBounds(160, 553, 96, 23);
		contentPane.add(btnWriteFile);
		
		JButton btnReadFile = new JButton("Read File");
		btnReadFile.setBackground(Color.LIGHT_GRAY);
		btnReadFile.setBounds(299, 553, 96, 23);
		contentPane.add(btnReadFile);
		
		JButton btnCloseFile = new JButton("Close File");
		btnCloseFile.setBackground(Color.LIGHT_GRAY);
		btnCloseFile.setBounds(441, 553, 96, 23);
		contentPane.add(btnCloseFile);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(589, 553, 96, 23);
		contentPane.add(btnExit);
		
		lblNewLabel = new JLabel("~");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(250, 250, 210));
		lblNewLabel.setBounds(413, 388, 29, 20);
		contentPane.add(lblNewLabel);
		
	}
}