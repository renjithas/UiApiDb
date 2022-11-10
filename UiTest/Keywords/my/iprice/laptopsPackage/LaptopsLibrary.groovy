package my.iprice.laptopsPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

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
import internal.GlobalVariable

public class LaptopsLibrary {

	@Keyword
	//filter the desired laptop brand
	public static void fn_filterLaptopBrand(String laptopBrand) {

		TestObject obj_FilterPanel_Button = findTestObject('Object Repository/LaptopsPage/obj_FilterPanel_Button')
		String pathBrands = "(//*[@class='dp i-amphtml-element i-amphtml-built i-amphtml-layout-container i-amphtml-layout'])[1]//div//span/span"

		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> laptopList = driver.findElements(By.xpath(pathBrands))
		int size = laptopList.size()
		for(int i=0; i<size; i++) {
			String getLaptopBrand = laptopList.get(i).getText()

			if(getLaptopBrand.equalsIgnoreCase(laptopBrand)) {
				String pathLaptop = pathBrands+"[text()='"+laptopBrand+"']"
				driver.findElement(By.xpath(pathLaptop)).click()
				break
			}
		}
	}
}
