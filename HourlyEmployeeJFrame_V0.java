package PENG.polymorphism.employee.frame;

import java.awt.EventQueue;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class HourlyEmployeeJFrame_V0 extends EmployeeBaseJFrame_V0{
	public JTextField textFieldHoursWorked;
	public JTextField txtFieldHourlyWage;
	public JTextField textFieldMaxWorkedHours;
	public JTextField textFieldExtraHoursRate;
	public JLabel lblHoursWorked;
	public JLabel lblHourlyWage;
	public JLabel lblMaxWorkedHours;
	public JLabel lblExtraHoursRate;
	
	public HourlyEmployeeJFrame_V0(String employeeType) {
		super(employeeType);
		
		JLabel lblHoursWorked = new JLabel("Hours Worked:");
		lblHoursWorked.setHorizontalAlignment(SwingConstants.LEFT);
		lblHoursWorked.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblHoursWorked.setBounds(15, 263, 106, 15);
		getContentPane().add(lblHoursWorked);
		
		JLabel lblHourlyWage = new JLabel("Hourly Wage:");
		lblHourlyWage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHourlyWage.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblHourlyWage.setBounds(26, 292, 86, 15);
		getContentPane().add(lblHourlyWage);
		
		textFieldHoursWorked = new JTextField();
		textFieldHoursWorked.setColumns(10);
		textFieldHoursWorked.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldHoursWorked.setBounds(130, 260, 96, 21);
		getContentPane().add(textFieldHoursWorked);
		
		txtFieldHourlyWage = new JTextField();
		txtFieldHourlyWage.setColumns(10);
		txtFieldHourlyWage.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		txtFieldHourlyWage.setBounds(130, 289, 96, 21);
		getContentPane().add(txtFieldHourlyWage);
		
		JLabel lblMaxWorkedHours = new JLabel("Max Worked-Hours:");
		lblMaxWorkedHours.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaxWorkedHours.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblMaxWorkedHours.setBounds(276, 172, 145, 15);
		getContentPane().add(lblMaxWorkedHours);
		
		textFieldMaxWorkedHours = new JTextField();
		textFieldMaxWorkedHours.setColumns(10);
		textFieldMaxWorkedHours.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldMaxWorkedHours.setBounds(306, 197, 96, 21);
		getContentPane().add(textFieldMaxWorkedHours);
		
		JLabel lblExtraHoursRate = new JLabel("Extra-Hours Rate:");
		lblExtraHoursRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblExtraHoursRate.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblExtraHoursRate.setBounds(276, 245, 145, 15);
		getContentPane().add(lblExtraHoursRate);
		
		textFieldExtraHoursRate = new JTextField();
		textFieldExtraHoursRate.setColumns(10);
		textFieldExtraHoursRate.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		textFieldExtraHoursRate.setBounds(306, 274, 96, 21);
		getContentPane().add(textFieldExtraHoursRate);
	}
	
	/**
	 * Launch the application.
	 */
	 public static void main(String[] args) {
	        employeeType="Hourly Employee";
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    HourlyEmployeeJFrame_V0 frame = new HourlyEmployeeJFrame_V0(employeeType);
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
	}