package my.iprice.utilPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

import internal.GlobalVariable

public class UtilLibrary {
	@Keyword
	public static void fn_browserNavigate(String url) {
		WebUI.openBrowser(url)
		WebUI.maximizeWindow()
		WebUI.waitForPageLoad(30)
		KeywordUtil.logInfo("Navigated to url'"+url+"'")
	}

	@Keyword
	//validate the result returned
	public static void fn_validateResults(String product) {
		String path = "//*[@id='product-list']//h3"

		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> list = driver.findElements(By.xpath(path))
		int size = list.size()

		if(size>0) {
			for(int i=0; i<size; i++) {
				String getProduct = list.get(i).getText().toLowerCase()
				product = product.toLowerCase()

				if(getProduct.contains(product)) {
					Assert.assertTrue(true)
				}
				else {
					Assert.assertTrue(false)
				}
			}
		}
		else {
			Assert.assertTrue(false)
		}
	}
}
