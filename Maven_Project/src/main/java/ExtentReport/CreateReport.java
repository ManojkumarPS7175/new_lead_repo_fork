package ExtentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CreateReport {
	
	@Test
	public void Report() {
		
		//Step1:create ExtentSparkReporter object
		ExtentSparkReporter spark= new ExtentSparkReporter("./HTML_reports/extentreport.html");
		
		//Step2:create ExtentReporters object
		ExtentReports eReport=new ExtentReports();
		
		//Step3:attach ExtentSparkReporter to ExtentReporters
		eReport.attachReporter(spark);
		
		//Step4:create ExtentTest object
		ExtentTest test =eReport.createTest("CreateReport");
		
		//Step5:call log(Status,"message")
		test.log(Status.PASS,"log message added into report");

		//Step6: Call flush()
		eReport.flush();
		
		
	}

}
