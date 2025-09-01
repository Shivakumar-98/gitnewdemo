package rahulshettyacademy.TestComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

public class Retry implements IRetryAnalyzer {


	int count = 3;
	int maxTry = 2;

	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<maxTry)
		{
			count++;
			return true;
		}
		return false;
	}

	@BeforeMethod
	public void demo()
	{
		System.out.println("i am nealy addd");
	}
	
	
}
