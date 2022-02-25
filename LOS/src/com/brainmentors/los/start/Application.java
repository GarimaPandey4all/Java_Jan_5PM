package com.brainmentors.los.start;

import com.brainmentors.los.operation.LOSProcess;
import com.brainmentors.los.utils.Utility;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LOSProcess process = new LOSProcess();
		
		while(true)
		{
			System.out.println("Do you have Application Number or Not (Enter 0) and Enter -1 to exit");
			int applicationNumner = Utility.scanner.nextInt();
			
			if(applicationNumner == -1)
			{
				System.out.println("Thanks for Using");
				System.exit(0);
			}
			if(applicationNumner == 0)
			{
				//New Customer
				process.sourcing();
			}
			else {
				//Existing Customer
				process.checkStage(applicationNumner);
			}
		}
	}

}
