package PENG.payablesys.employee.helper;

import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

import PENG.library.enummenu.FileStreamType_MenuOption;
import PENG.library.checkandvalidation.NumberType_MenuOption;
import PENG.ploymorphism.employee.CommissionEmployee;
import PENG.ploymorphism.employee.Employee;
import PENG.ploymorphism.employee.HourlyEmployee;
import PENG.payablesys.employeetype.earningbook.EmployeeBaseBook;
import PENG.polymorphism.employee.frame.CommissionEmpolyeeJFame_231108;
import PENG.polymorphism.employee.frame.HourlyEmployeeJFrame_V0;
import PENG.polymorphism.employee.menuoption.EmployeeRecordindices;
// import io.swingtest.app18.table.TableDemoPayrollSystem_23July19_v3;
// import io.swingtest2.app108.TableDemoPayrollSystem_23July19_v2;

public class Helper4HourlyEmployee extends Helper4SuperEmployeeBase {

	public Helper4HourlyEmployee(/* Component component */HourlyEmployeeJFrame_V0 component) {
		super(component);
		frameEmployee = (HourlyEmployeeJFrame_V0) component;
	}

	@Override
	public void checkInputRecordData() {
		super.checkInputRecordData();
		if (checkRecord) {
			checkRecord = validationNumber_GUI.checkNumberValueByComparing_iflag(
					((HourlyEmployeeJFrame_V0) frameEmployee).txtFieldHourlyWage.getText(),
					EmployeeRecordindices.HOURLY_WAGE.getRecordIndexType(), 0, 1,
					NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());

			if (!checkRecord)
				((HourlyEmployeeJFrame_V0) frameEmployee).txtFieldHourlyWage.setText("");
		}
		if (checkRecord) {
			checkRecord = validationNumber_GUI.checkNumberValueInRange_min0maxON1(
					((HourlyEmployeeJFrame_V0) frameEmployee).textFieldExtraHoursRate.getText(),
					EmployeeRecordindices.EXTRA_HOURS_RATE.getRecordIndexType(), min4rateOfExtraHours,
					max4rateOfExtraHours, false, false, NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());
			if (!checkRecord)
				((HourlyEmployeeJFrame_V0) frameEmployee).textFieldExtraHoursRate.setText("");
		}

		if (checkRecord) {
			checkRecord = validationNumber_GUI.checkNumberValueInRange_min0maxON1(
					((HourlyEmployeeJFrame_V0) frameEmployee).textFieldMaxWorkedHours.getText(),
					EmployeeRecordindices.MAX_WORKED_HOURS.getRecordIndexType(), 0.0,
					/* MAX_WORKED_HOURS */EmployeeRecordindices.MAX_WORKED_HOURS.getValue(), false, false,
					NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());
		}

		if (!checkRecord)
			((HourlyEmployeeJFrame_V0) frameEmployee).textFieldMaxWorkedHours.setText("");

		if (checkRecord) {
			_maxHoursPerWeek = Double
					.parseDouble(((HourlyEmployeeJFrame_V0) frameEmployee).textFieldMaxWorkedHours.getText());

			checkRecord = validationNumber_GUI.checkNumberValueInRange_min0maxON1(
					((HourlyEmployeeJFrame_V0) frameEmployee).textFieldHoursWorked.getText(),
					EmployeeRecordindices.HOURS_WORKED.getRecordIndexType(), 0.0, _maxHoursPerWeek, true, true,
					NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());

			if (!checkRecord)
				((HourlyEmployeeJFrame_V0) frameEmployee).textFieldHoursWorked.setText("");
		}
	}// end checkInputRecordData()

	@Override
	public void getInputDataReady(boolean _checkRecord) {
		super.getInputDataReady(_checkRecord);
		if (_checkRecord) {
			_hourlyWage = Double.parseDouble(((HourlyEmployeeJFrame_V0) frameEmployee).txtFieldHourlyWage.getText());
			_rate4ExtraHours = Double
					.parseDouble(((HourlyEmployeeJFrame_V0) frameEmployee).textFieldExtraHoursRate.getText());
			_hoursWorked = Double.parseDouble(((HourlyEmployeeJFrame_V0) frameEmployee).txtFieldHourlyWage.getText());
		}
	}

	@Override
	public void processAndShowWageRecordsUsingCheck() {
		if (employeeCounter < EmployeeNo) {
			checkInputRecordData();
			getInputDataReady(checkRecord);
			if (checkRecord) {
				HourlyEmployee record = new HourlyEmployee(_firstName, _lastName, _SSN, frameEmployee.isSimpleFormat,
						_hourlyWage, _hoursWorked, _rate4ExtraHours, _maxHoursPerWeek, _min4rateOfExtraHours,
						_max4rateOfExtraHours, _normalHoursWorked);
				addNprocessEveryNewRecord(record);
			} // end inner if
		} // end outer if
	} // end processAndShowWageRecordsUsingCheck

	@Override
	public Object[][] returnObjectArray() {
		Object[][] data = new Object[eList_Hourly.size()][frameEmployee.listTitleName4Table.size()];

		for (int i = 0; i < eList_Hourly.size(); i++) {
			Object[] object = { eList_Hourly.get(i).getSocialSecurityNumber(), eList_Hourly.get(i).getFirstName(),
					eList_Hourly.get(i).getLastName(), eList_Hourly.get(i).getAge(), eList_Hourly.get(i).getHours(),
					eList_Hourly.get(i).getExtraHourRate(), eList_Hourly.get(i).getEarnings(),
					eList_Hourly.get(i).getLevel(), eList_Hourly.get(i).getColor() };
			data[i] = object;
		}

		return data;
	} // end returnObjectArray()

	@Override
	public void readFile() throws NumberFormatException, ClassNotFoundException, NoSuchElementException,
			NullPointerException, ClassCastException, IOException {
		super.readFile();
	} // end readFile()

	@Override
	public void readRecordData() throws NumberFormatException, ClassNotFoundException, NoSuchElementException,
			NullPointerException, ClassCastException, IOException {

		HourlyEmployee record = null;
		if (isFileChooserOK()) {
			eList_Hourly = new ArrayList<HourlyEmployee>();

			if (streamType_MenuOption == FileStreamType_MenuOption.STANDARD_BASED) {
				while (inputT.hasNext()) { // while there is more to read
					inputT.next(); // Skips an entry, possibly a delimiter or unused data
					record = new HourlyEmployee(inputT.next(), inputT.next(), inputT.next(), true, inputT.nextDouble(),
							inputT.nextDouble(), inputT.nextDouble(), maxHoursPerWeek, minRateOfExtraHours,
							maxRateOfExtraHours, normalHoursWorked);
					System.out.println("record=" + record);

					addNprocessEveryNewRecord(record);
				} // end while
			} else if (streamType_MenuOption == FileStreamType_MenuOption.BYTE_BASED) {
				for (int i = 0; i < EmployeeNo; i++) {
					record = (HourlyEmployee) inputO.readObject();
					record = new HourlyEmployee(record.getFirstName(), record.getLastName(),
							record.getSocialSecurityNumber(), frameEmployee.isSimpleFormat, record.getGrossSales(),
							record.getCommissionRate(), record.getBaseSalary(), maxHoursPerWeek, minRateOfExtraHours,
							maxRateOfExtraHours, normalHoursWorked);

					addNprocessEveryNewRecord(record);
				} // end for
			} // end else
		} // end outer if

		closefile(); // MAKE SURE to Close Files Opened.
	} // end class Helper4CommissionEmployee
}
