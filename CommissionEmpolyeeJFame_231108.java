package PENG.polymorphism.employee.frame;

import java.awt.EventQueue;

import javax.swing.JPanel;

public class CommissionEmpolyeeJFame_231108 extends EmployeeBaseJFrame_V0{
	
	private static final long serialVerionUID=1L;
	private JPanel contentPane;
	
	/**
	 * * Launch the application.
	 */
	public static void main(String[] args) {
		employeeType="Commission Employee (by Yu-En PENG 2023/11/08)";
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CommissionEmpolyeeJFame_231108 frame= new CommissionEmpolyeeJFame_231108(employeeType);
					frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public CommissionEmpolyeeJFame_231108(String employeeType) {
		super(employeeType);
	}

}
