package bankdetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankDetailsTest {

@SuppressWarnings("resource")
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
	SavingAccountDAO SavingDAO = context.getBean(SavingAccountDAO.class);
	CurrentAccountDAO CurrentDAO = context.getBean(CurrentAccountDAO.class);
Scanner sc=new Scanner(System.in);
System.out.println("Select Account Type,Press 1 for Savings Account , 2 for Current Account ");
int type=sc.nextInt();
int id;
String n;
double od=100000;
boolean is;
if(type==1){
System.out.println("You have Selected Savings Account ");


System.out.println("Please Select ");

System.out.println("Press 1 :- Create Account ");
System.out.println("Press 2 :- Retrieve Account ");
System.out.println("Press 3 :- Update Account Details");
System.out.println("Press 4 :- Delete Account ");
System.out.println("Press 5 :- Deposit Amount ");
System.out.println("Press 6 :- Withdraw from account ");

// switch statement with choice Selection
int choice=sc.nextInt();
switch (choice) {
case 1:
	System.out.println("Enter your name:");
	n=sc.next();
	System.out.println("Do you have a salary account? true/false");
	is=sc.nextBoolean();
	SavingDAO.create(n,0.0,is);
	System.out.println("Account created successfully!!");
    break;
case 2:
	 List<SavingAccount> list=SavingDAO.retrieve();
	 System.out.println(list);
    break;
case 3:
	System.out.println("Enter the account number:");
	id=sc.nextInt();
	System.out.println("Enter the new name:");
	n=sc.next();
	SavingDAO.update(id,n);
	System.out.println("Account updated successfully!!");
    break;
case 4:
	System.out.println("Enter the account number:");
	id=sc.nextInt();
	SavingDAO.delete(id);
	System.out.println("Account deleted successfully!!");
    break;
case 5:
	System.out.println("Enter the account number:");
	id=sc.nextInt();
	System.out.println("Enter the amount to be deposited:");
	double amt=sc.nextDouble();
	SavingDAO.depositAmt(id,amt);
	System.out.println("Amount deposited successfully!!");
    break;
case 6:
	System.out.println("Enter the account number:");
	id=sc.nextInt();
	System.out.println("Enter the amount to be withdrawn:");
	double amount=sc.nextDouble();
	SavingDAO.withdrawAmt(id,amount);
	break;
default:
System.out.println("Press Correct Key");
    break;
}


}
else if(type==2){

System.out.println("You have Selected Current Account ");
System.out.println("Please Select ");

System.out.println("Press 1 :- Create Account ");
System.out.println("Press 2 :- Retrieve Account ");
System.out.println("Press 3 :- Update Account Details");
System.out.println("Press 4 :- Delete Account ");
System.out.println("Press 5 :- Deposit Amount ");
System.out.println("Press 6 :- Withdraw from account ");
// switch statement with type selection
int choice=sc.nextInt();

switch (choice) {
case 1:
	System.out.println("Enter your name:");
	n=sc.next();
	CurrentDAO.create(n,0.0,od);
	System.out.println("Account created successfully!!");
    break;
case 2:
	 ArrayList<CurrentAccount> list=CurrentDAO.retrieve();
	 System.out.println(list);
	 break;
case 3:
	System.out.println("Enter the account number:");
	id=sc.nextInt();
	System.out.println("Enter the new name:");
	n=sc.next();
	CurrentDAO.update(id,n);
	System.out.println("Account updated successfully!!");
    break;
case 4:
	System.out.println("Enter the account number:");
	id=sc.nextInt();
	CurrentDAO.delete(id);
	System.out.println("Account deleted successfully!!");
    break;
case 5:
	System.out.println("Enter the account number:");
	id=sc.nextInt();
	System.out.println("Enter the amount to be deposited:");
	double amt=sc.nextDouble();
	CurrentDAO.depositAmt(id,amt);
	System.out.println("Amount deposited successfully!!");
    break;
case 6:
	System.out.println("Enter the account number:");
	id=sc.nextInt();
	System.out.println("Enter the amount to be withdrawn:");
	double amount=sc.nextDouble();
	CurrentDAO.withdrawAmt(id,amount);
	
    break;
default:
System.out.println("Press Correct Key");
    break;
}
}
else{

System.out.println("Wrong Choice..Please Try Again ");
System.exit(0);
}
}

}


