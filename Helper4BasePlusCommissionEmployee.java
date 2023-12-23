package PENG.payablesys.employee.helper;

import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

import PENG.library.enummenu.FileStreamType_MenuOption;
import PENG.library.checkandvalidation.NumberType_MenuOption;
import PENG.ploymorphism.employee.BasePlusCommissionEmployee;
import PENG.ploymorphism.employee.CommissionEmployee;
import PENG.ploymorphism.employee.Employee;
import PENG.payablesys.employeetype.earningbook.BasePlusCommissionEmployeeBook;
import PENG.polymorphism.employee.frame.BasePlusCommissionEmployeeJFrame;
import PENG.polymorphism.employee.frame.CommissionEmpolyeeJFame_V0;
import PENG.polymorphism.employee.menuoption.EmployeeRecordindices;
import PENG.polymorphism.employee.frame.EmployeeBaseJFrame_V0;



public class Helper4BasePlusCommissionEmployee extends Helper4CommissionEmployee {
	
	public Helper4BasePlusCommissionEmployee(BasePlusCommissionEmployeeJFrame component) {
		super(component);
		frameEmployee = component;
	}
	
	@Override
	public void checkInputRecordData() {
		super.checkInputRecordData();
		
		if(checkRecord) {
			
			checkRecord = validationNumber_GUI.checkNumberValueByComparing_1flag(
					((BasePlusCommissionEmployeeJFrame) frameEmployee).txtFieldBaseSalary.getText(),
					EmployeeRecordindices.BASE_SALARY.getRecordIndexType(),0,1,
					NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());
			
			if(!checkRecord)
				((BasePlusCommissionEmployeeJFrame) frameEmployee).txtFieldBaseSalary.setText("");
		}
	}//end checkInputRecordData
		
		@Override
		public void getInputDataReady(boolean _checkRrcord)
		{
			super.getInputDataReady(_checkRrcord);
			
			if(_checkRrcord)
				_baseSalary = Double
				.parseDouble(((BasePlusCommissionEmployeeJRrame) frameEmployee).txtFielsBaseSalary.getText());
		}
		
		@Override
		public void processAndShowWageRecordsUsingCheck() {
			
			if(employeeCounter < EmployeeNo) {
				checkInputRecordData();
				getInputDataReady(checkRecord);
				if(checkRecord) {
					BasePlusCommissionEmployee record = new BasePlusCommissionEmployee(_firstName, _lastName, _SSN, 
							frameEmployee.isSimpleFormat, _grossSales, _commissionRate, _baseSalary);
					addNprocessEveryNewRecord(record);
				}//end inner if
			}//end outer if 
		}//end processAndShowWageRecordsUsingCheck
		
		@Override
		public Object[][] returnObjectArray(){
			Object[][] data = new Object[eList_BasePlusCommission.size()][frameEmployee.listTitleName4Table.size()];
			
			for(int i = 0; i < eList_BasePlusCommission.size(); i++) {
				Object[] object = {
						eList_BasePlusCommission.get(i).getSocialSecurityNumber(),
						eList_BasePlusCommission.get(i).getFirstName(),
						eList_BasePlusCommission.get(i).getLastName(),
						eList_BasePlusCommission.get(i).getGrossSales(),
						eList_BasePlusCommission.get(i).getCommissionRate(),
						eList_BasePlusCommission.get(i).earning(),
						eList_BasePlusCommission.get(i).getLevel(),
						eList_BasePlusCommission.get(i).getColor(),
						eList_BasePlusCommission.get(i).getBaseSalary()};
				
				data[i] = object;
						
				}//end for
			return data;
			}//end returnObjectArray()
		
		@Override
		public void readFile() throws NumberFormatException, ClassNotFoundException, NoSuchElementException,
		NullPointerException,ClassCastException,IOException{
			super.readFile();
		}//end readFile()
		
		@Override
		public void readRecordData()throws NumberFormatException, ClassNotFoundException, NoSuchElementException,
		NullPointerException, ClassCastException, IOException
		{
			BasePlusCommissionEmployee record = null;
			if(isFileChosenOK) {
				eList_BasePlusCommission = new ArrayList < BasePlusCommissionEmployee>();
				
				if(streamType_MenuOption == FileStreamType_MenuOption.STANDARD_BASED) {
					while(inputT.hasNext()) {
						inputT.next();
						record = new BasePlusCommissionEmployee(inputT.next(),inputT.next(),true,
								inputT.nextDouble(),inputT.nextDouble(),inputT.nextDouble());
						inputT.nextDouble();
						System.out.println("record=" + record);
						
						addNprocessEveryNewRecord((BasePlusCommissionEmployee)record);
					}//end while
				}else {
					for(int i = 0 ; i < EmployeeNo; i++) {
						record = (BasePlusCommissionEmployee) inputO.readObject();
						record = new BasePlusCommissionEmployee(record.getFirstName(),record.getLastName(),
								record.getSocialSecurityNumber(),
								frameEmployee.isSimpleFormat,
								record.getGrossSales(),record.getCommissionRate(),record.getBaseSalary());
						addNprocessEveryNewRecord((BasePlusCommissionEmployee)record);
					}//end for
				}//end else
			}//end outer if
			closefile();
		}
	}
