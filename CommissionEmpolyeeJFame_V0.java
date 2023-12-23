package PENG.polymorphism.employee.frame;

import java.awt.EventQueue;

public class CommissionEmpolyeeJFame_V0 extends EmployeeBaseJFrame_V0{
	
	public CommissionEmpolyeeJFame_V0(String employeeType) {
		super(employeeType);
	}

	
	/**
	 * * Launch the application.
	 */
	public static void main(String[] args) {
		employeeType="Commission Employee";
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CommissionEmpolyeeJFame_V0 frame= new CommissionEmpolyeeJFame_V0(employeeType);
					frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 
}
