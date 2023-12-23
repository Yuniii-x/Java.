// Fig. 9.10: CommissionEmployee.java
// CommissionEmployee class uses methods to manipulate its 
// private instance variables.
package PENG.polymorphism.employee.frame;

import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class CommissionEmployeeJFrame_V1 extends EmployeeBaseJFrame_V0{
	public JTextField txtFieldGrossSales;
	public JTextField txtFieldCommissionRate;
	public CommissionEmployeeJFrame_V1(String employeeType) {
		super(employeeType);
		
		JLabel lblGrossSales = new JLabel("Gross Sales:");
		lblGrossSales.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblGrossSales.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGrossSales.setForeground(Color.BLACK);
		lblGrossSales.setBackground(Color.WHITE);
		lblGrossSales.setBounds(25, 268, 86, 15);
		getContentPane().add(lblGrossSales);
		
		JLabel lblCommissionRate = new JLabel("Commission Rate:");
		lblCommissionRate.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblCommissionRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommissionRate.setForeground(Color.BLACK);
		lblCommissionRate.setBackground(Color.WHITE);
		lblCommissionRate.setBounds(258, 236, 169, 15);
		getContentPane().add(lblCommissionRate);
		
		txtFieldGrossSales = new JTextField();
		txtFieldGrossSales.setColumns(10);
		txtFieldGrossSales.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		txtFieldGrossSales.setBackground(Color.WHITE);
		txtFieldGrossSales.setBounds(129, 262, 96, 21);
		getContentPane().add(txtFieldGrossSales);
		
		txtFieldCommissionRate = new JTextField();
		txtFieldCommissionRate.setColumns(10);
		txtFieldCommissionRate.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(0, 0, 128), null, null));
		txtFieldCommissionRate.setBackground(Color.WHITE);
		txtFieldCommissionRate.setBounds(308, 265, 96, 21);
		getContentPane().add(txtFieldCommissionRate);
	}
	public static void main(String[] args) {
		employeeType="Commission Employee";
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					CommissionEmployeeJFrame_V1 frame = new CommissionEmployeeJFrame_V1(employeeType);
					frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
   } 