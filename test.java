import java.util.*;
class BankAccount{

	Scanner sc = new Scanner(System.in);
	String account_holdername;
	int account_holderID , account_holderCurrentamount;

	BankAccount(String account_holdername,int account_holderID,int account_holderCurrentamount){

		this.account_holdername=account_holdername;
		this.account_holderID=account_holderID;
		this.account_holderCurrentamount=account_holderCurrentamount;
	} 
		void deposit(){
			//System.out.println(" ");
			System.out.println("Enter the amount you want to deposited->");
			int extra_amount = sc.nextInt();
			account_holderCurrentamount += extra_amount;
			
			//System.out.println("");
			System.out.println("Congrats your amount is deposited :) ");
			System.out.println("After depostion Your updated amount is " +account_holderCurrentamount);

		}
			void withdraw(){
				System.out.println(" ");
				System.out.println("Enter the amount you want to withdraw-> ");
				int extract_amount = sc.nextInt();
				account_holderCurrentamount -= extract_amount;
				System.out.println(" your amount is Extracted :( ");
			System.out.println("After extraction Your current amount is " +account_holderCurrentamount);

			}
				void display(){
					System.out.println("The account holder name is " +account_holdername);
					System.out.println("The account holder amount is " +account_holderCurrentamount);
					System.out.println("The account holder id is " +account_holderID);

				}
		}

				class display1{
					public static void main(String arg[]){
						Scanner sc = new Scanner(System.in);
						String account_holderName;
						int account_holderId , account_holderCurrentAmount;
						System.out.println("Enter the acount holder name-> ");
						System.out.println("");
						account_holderName =sc.nextLine();
						System.out.println("Enter Id of the account holder:- ");
						account_holderId = sc.nextInt();
						System.out.println("Enter the amount");
						account_holderCurrentAmount = sc.nextInt();
						var ba = new BankAccount(account_holderName, account_holderId, account_holderCurrentAmount);
						ba.deposit();
						ba.withdraw();
						ba.display();


					}
				}