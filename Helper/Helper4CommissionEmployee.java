package PENG.payablesys.employee.helper;

import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.lang.model.element.Element;
import javax.swing.JOptionPane;

import PENG.library.checkandvalidation.InputNumberValidation_GUI_CONSOLE;
import PENG.library.enummenu.FileStreamType_MenuOption;
import PENG.library.checkandvalidation.NumberType_MenuOption;
import PENG.ploymorphism.employee.CommissionEmployee;
import PENG.ploymorphism.employee.Employee;
import PENG.payablesys.employeetype.earningbook.EmployeeBaseBook;
import PENG.polymorphism.employee.frame.CommissionEmployeeJFrame_V1;
import PENG.polymorphism.employee.menuoption.EmployeeRecordindices;
import PENG.polymorphism.employee.frame.EmployeeBaseJFrame_V0;

public class Helper4CommissionEmployee extends Helper4SuperEmployeeBase {

	public Helper4CommissionEmployee(CommissionEmployeeJFrame_V1 component) {
		super(component);
		frameEmployee = (CommissionEmployeeJFrame_V1) component;
	}

	@Override
	public void checkInputRecordData() {
		super.checkInputRecordData();
		if (checkRecord) {
			checkRecord = InputNumberValidation_GUI_CONSOLE.checkNumberValueByComparing_1flag(
					((CommissionEmployeeJFrame_V1) frameEmployee).txtFieldGrossSales.getText(),
					EmployeeRecordindices.GROSS_SALES.getRecordIndexType(), 0, 1,
					NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());

			if (!checkRecord)
				((CommissionEmployeeJFrame_V1) frameEmployee).txtFieldGrossSales.setText("");
		}
		if (checkRecord) {
			checkRecord = validationNumber_GUI.checkNumberValueInRange_main0P1max0N1(

					((CommissionEmployeeJFrame_V1) frameEmployee).txtFieldCommissionRate.getText(),
					EmployeeRecordindices.COMMISSION_RATE.getRecordIndexType(), 0.0, 1.0, false, false,
					NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());
			if (!checkRecord)
				((CommissionEmployeeJFrame_V1) frameEmployee).txtFieldCommissionRate.setText("");
		}
	}// end checkInputRecordData()

	@Override
	public void getInputDataReady(boolean _checkRecord) {
		super.getInputDataReady(_checkRecord);
		if (_checkRecord) {
			_grossSales = Double.parseDouble(((CommissionEmployeeJFrame_V1) frameEmployee).txtFieldGrossSales.getText());
			_commissionRate = Double
					.parseDouble(((CommissionEmployeeJFrame_V1) frameEmployee).txtFieldCommissionRate.getText());
		}
	}

	@Override
	public void processAndShowWageRecordsUsingCheck() {

		if (employeeCounter < EmployeeNo) {
			checkInputRecordData();
			getInputDataReady(checkRecord);
			if (checkRecord) {
				CommissionEmployee record = new CommissionEmployee(_firstName, _lastName, _SSN,
						frameEmployee.isSimpleFormat, _grossSales, _commissionRate);
				addNprocessEveryNewRecord(record);
			} // end inner if
		} // end outer if
	}// end processAndShowWageRecordsUsingCheck

	@Override
	public Object[][] returnObjectArray() {
		Object[][] data = new Object[eList_Commission.size()][frameEmployee.listTitleName4Table.size()];

		for (int i = 0; i < eList_Commission.size(); i++) {
			Object[] object = { eList_Commission.get(i).getSocialSecurityNumber(),
					eList_Commission.get(i).getFirstName(), eList_Commission.get(i).getLastName(),
					eList_Commission.get(i).getGrossSales(), eList_Commission.get(i).getCommissionRate(),
					eList_Commission.get(i).earnings(), eList_Commission.get(i), getLevel(),
					eList_Commission.get(i).getColor() };

			data[i] = object;
		}
		return data;
	}// end returnObjectArray()

	@Override
	public void readFile() throws NumberFormatException, ClassNotFoundException, NoSuchElementException,
			NullPointerException, ClassCastException, IOException {
		super.readFile();
	}// end readFile()

	@Override
		public void readRecordData()throws NumberFormatException,ClassCastException,NoSuchElementException,
		NullPointerException,ClassCastException,IOException
		{
			CommissionEmployee record = null;
			if(isFileChoosenOK) {
				eList_Commission = new ArrayListCommissionEmployee>();
			
			if(streamType_MenuOption == FileStreamType_MenuOption.STANDARD_BASED) {
				while(inputT.hasNext()) {//while there is more read
					inputT.next();
					record = new CommissionEmployee(inputT.next(), inputT.next(), inputT.next(), true, 
							inputT.nextDouble(), inputT.nextDouble());
					inputT.nextDouble();
					System.out.println("record=" + record);
					
					addNprocessEveryNewRecord(record);
				}//end while
			}else {//FileStreamType_MenuOption.BYTE_BASED
				for(int i = 0; i< EmployeeNo; i++) {
					record=(CommissionEmployee) inputO.readObject();
					record=new CommissionEmployee(record.getFirstName(), record.getLastName(),
							record.getSocialSecurityNumber(),frameEmployee.isSimpleFormat, record.getGrossSales(),
							record.getCommissionRate());
					addNprocessEveryNewRecord(record);
				}//end for
			}//end else
		}//end out if
			
			
			closefile();
			
	}
}// end class Helper4CommissionEmployee
