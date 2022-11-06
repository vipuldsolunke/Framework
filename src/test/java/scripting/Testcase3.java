package scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.Skillararyloginpage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass {

	@Test
	public void tc3() throws IOException, InterruptedException{
		Skillararyloginpage s1 = new Skillararyloginpage(driver);
		s1.searchtextbox(pdata.getdata("coursename"));
		s1.searchbutton();
		
		CorejavaPage cp= new CorejavaPage(driver);
	    cp.java();
	    
	    WishlistPage wp=new WishlistPage(driver);
	    wp.closeicon();
	    driverutilities.switchFrame(driver);
	    wp.playbutton();
	    Thread.sleep(10000);
	    wp.pausebutton();
	    driverutilities.switchbackframe(driver);
	    wp.addtowishlistbtn();
	}
}
