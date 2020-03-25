package com.capgemini.testing;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses(
		{
			ServiceTest.class,
			UpdateProductStockTesting.class
		})
public class SuiteClass
{
	public static void main(String[] args) 
	{
		Result results=JUnitCore.runClasses(SuiteClass.class);
		System.out.println("Test Result : "+results.wasSuccessful());
		System.out.println("Failure tests count are: "+results.getFailureCount());
		System.out.println("Total Test Cases in My Project are : " +results.getRunCount());
		List<Failure> failure=results.getFailures();
		for(Failure f:failure)
		{
			System.out.println("Failure is "+f);
		}	
	}
}
