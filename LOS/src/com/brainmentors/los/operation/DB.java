package com.brainmentors.los.operation;

import java.util.ArrayList;

import com.brainmentors.los.customer.Customer;
import com.brainmentors.los.customer.PersonalInformation;

public interface DB {
	
	public static ArrayList<Customer> getNegativeCustomers()
	{
		
		ArrayList<Customer> negativeCustomers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setId(1010);
		PersonalInformation pd = new PersonalInformation();
		pd.setFirstName("Tim");
		pd.setLastName("Jackson");
		pd.setPhone("873268768");
		pd.setPanCard("BW1234M");
		pd.setVoterId("8271368");
		pd.setEmail("tim@gmail.com");
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		
		customer = new Customer();
		
		customer.setId(1011);
		pd = new PersonalInformation();
		pd.setFirstName("Tom");
		pd.setLastName("Bahl");
		pd.setPhone("8732832768");
		pd.setPanCard("BW124M");
		pd.setVoterId("80934808");
		pd.setEmail("tom@gmail.com");
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		
		return negativeCustomers;
	}

}
