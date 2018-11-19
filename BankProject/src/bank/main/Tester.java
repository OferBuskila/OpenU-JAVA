package bank.main;

import java.util.Random;

import mmn12b.BankAccount;
import mmn12b.HighInterestSavings;
import mmn12b.IntrestChecking;
import mmn12b.NoServiceChargeChecking;
import mmn12b.SavingsAccount;
import mmn12b.ServiceChargeChecking;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BankAccount[] ba = new BankAccount[10];
		int acountNumber = 1000;
		String[] ownerName = {"haim", "moshe", "carmel", "shimon", "armond", "jack", "haimon",
				"lior", "iris", "ariel"};
		String[] idNum = {"03171819", "03171829", "53171819", "46171819", "03634819",
				"03171765", "44441819", "5554449", "03194949", "2222222"};
		
		for(int i = 0 ; i < ba.length ; i++){
			switch(i % 5){
			case 0:
				ba[i] = new ServiceChargeChecking();
				break;
				
			case 1:
				ba[i] = new NoServiceChargeChecking();
				break;
				
			case 2:
				ba[i] = new IntrestChecking();
				break;

			case 3:
				ba[i] = new SavingsAccount();
				break;

			case 4:
				ba[i] = new HighInterestSavings();
				break;
				
			}
//			ba[i].accNum = ++acountNumber;
//			ba[i].ownName = ownerName[i];
//			ba[i].id = idNum[i];
//			ba[i].balance = new Random().nextInt(1000);
			System.out.println(ba[i]);
		}

		System.out.println("**********************************************************");
		System.out.println("********************************************************");
		//
		for (int i = 0 ; i <ba.length ; i++){
//			ba[i].deposit(50.15);
			System.out.println(ba[i]);
		}
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");

		for (int i = 0 ; i <ba.length ; i++){
//			ba[i].withdraw(100.7);
			System.out.println(ba[i]);
		}
	}

}
