package scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtocartpage;
import pomPages.Skillararyloginpage;
import pomPages.SkillraryDemoLogin;

public class Testcase1 extends BaseClass {
	
	@Test
	public void tc1(){
		Skillararyloginpage s1=new Skillararyloginpage(driver);
		s1.gerasbutton();
		s1.skillrarydemoapp();
		
		driverutilities.switchtabs(driver); 
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingbtn();
        
        Addtocartpage ad= new Addtocartpage(driver);
        driverutilities.doubleClick(driver,ad.getPlus());
        ad.cartbutton();
	}
	

}
