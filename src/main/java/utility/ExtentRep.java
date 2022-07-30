package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentRep {

	ExtentReports report;
	ExtentSparkReporter spark;
	
	public ExtentReports extentReport() throws IOException {
		
		report = new ExtentReports();
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		String timestamp = sdf.format(d);
		spark = new ExtentSparkReporter(new File("./report/reports"+timestamp+".html"));
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("ActiTime Login");
		spark.config().setReportName("Gagan C L");
		report.attachReporter(spark);
		
		
		return report;

	}
	
}
