package completeTestNG_Tutorial_1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_in_TestNG_9 {
	
	@Test
	@Parameters({"userName","password"})
	public void test(@Optional("defaultUser")String userName,@Optional("defautPassword")String password)
	{
		System.out.println(userName+"  "+password);
	}

}
