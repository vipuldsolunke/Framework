package scripting;



import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Skillararyloginpage;
import pomPages.SkillraryDemoLogin;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException, InterruptedException {
		Skillararyloginpage s=new Skillararyloginpage(driver);
		s.gerasbutton();
		s.skillrarydemoapp();
		
		driverutilities.switchtabs(driver);
		
		SkillraryDemoLogin sd = new SkillraryDemoLogin(driver);
		driverutilities.dropdown(sd.getCourseadd(),pdata.getdata("dropdownopt"));
		
		TestingPage tp = new TestingPage(driver);
		driverutilities.draganddrop(driver,tp.getSeleniumtraining(),tp.getCart());
		
		//Thread.sleep(10000);
		
		 Point loc = tp.getTwitter().getLocation();
		 int x = loc.getX();
		 int y = loc.getY();
		 driverutilities.scrollBar(driver, x, y);
		 
		 tp.twitterlogo();
		 
		
	}

}
