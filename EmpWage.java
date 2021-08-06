
import java.util.Scanner;


class EmpWageUseCases
{
	public void EmpWageUC1() 
	{

		Scanner input=new Scanner(System.in);
		
		int perDaySal;
		int workingDay = 20;
		int monthSal;
		
		System.out.print("Enter per day wage: ");
		perDaySal =input.nextInt();
		
		 monthSal =perDaySal * workingDay;
		
		System.out.printf("The monthly wage of the employee is %d\n", monthSal);

	}


	public void EmpWageUC2andUC3(int empCheck ) 
	{

			
				
	      //  int employee_worker = 1; 
	        int hourly_worker;
		int overtime=2;
	        int wage;
		int employee;
		int salary;
	
	        Scanner input=new Scanner(System.in); 
	
	        switch(empCheck)
	
	        {
	
	            case 1:
	
	            System.out.print("Enter employee hours:");
	
	            employee=input.nextInt();
	
	            System.out.print("Enter employee wage:");
	
	            wage=input.nextInt();
	
	            salary=employee*wage;
	
	            System.out.printf("The weekly salary of the employee is %d\n",salary);
	
	            break;
	
	        
	
	            case 2: System.out.print("Hourly worker hours:");
	
	            hourly_worker=input.nextInt();
	
	            System.out.print("Hourly worker wage:");
	
	            wage=input.nextInt();
	
	            if(hourly_worker>40)
	
	            overtime*=hourly_worker;
	
	            System.out.printf("The hourly worker pay is %d\n",overtime);
	
	            break;
	
	             
	
	            default: System.out.print("No day");
	
	            break;


		}
	 }
}


	public class EmpWage 
	{

		public static void main(String[] args) 
		{

		
		int IS_FULL_TIME = 1;
		int empCheck = (int) Math.floor(Math.random() *10) % 2;

		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");


		EmpWageUseCases firstCase = new EmpWageUseCases();
		firstCase.EmpWageUC1(); 
		firstCase.EmpWageUC2andUC3(empCheck );
		
		}

	}