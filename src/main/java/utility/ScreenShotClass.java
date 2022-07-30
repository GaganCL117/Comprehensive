package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import reusableComponents.BaseClass;

public class ScreenShotClass extends BaseClass{

	public void screenshots() throws IOException {

		TakesScreenshot s = (TakesScreenshot) driver;
		File file = s.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		String timestamp = sdf.format(d);
		FileUtils.copyFile(file, new File("./screenShots/Screenshot "+ timestamp +".png"));		
	}
	
}
