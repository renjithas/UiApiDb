package my.iprice.dressesPackage

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

public class DressesLibrary {

	@Keyword
	public static void fn_navigateToClothingDressesPage() {
		TestObject obj_FashionTab_Button = findTestObject('Object Repository/DressPage/obj_FashionTab_Button')
		TestObject obj_ClothingDresses_Link = findTestObject('Object Repository/DressPage/obj_ClothingDresses_Link')

		WebUI.click(obj_FashionTab_Button)
		WebUI.click(obj_ClothingDresses_Link)
		KeywordUtil.logInfo("Clicked on Clothing/Dresses link")
	}

	@Keyword
	public static void fn_sortPriceInDescending(String sortOrder) {
		TestObject obj_PriceSort_Button = findTestObject('Object Repository/DressPage/obj_PriceSort_Button')
		String path = "//*[@data-vars-lb='Price']//i"

		WebDriver driver = DriverFactory.getWebDriver()
		for(int i=0; i<5; i++) {
			WebUI.click(obj_PriceSort_Button)
			String priceSortOrder  = driver.findElement(By.xpath(path)).getAttribute('class').toString()

			if(priceSortOrder.contains(sortOrder)){
				KeywordUtil.logInfo("sorted in "+sortOrder+" order")
				break
			}
			else {
				continue
			}
		}
	}

	@Keyword
	public static void fn_validateSortOrder(String sortOrder) {
		try {
			String path = "//*[@id='product-list']//a/div/div/div/div[3]/div"
			WebDriver driver = DriverFactory.getWebDriver()

			List<WebElement> priceList = driver.findElements(By.xpath(path))
			int length = priceList.size()

			Double[] priceArrayActual = new Double[length]
			Double[] priceArrayExpected = new Double[length]

			for(int i=0; i<length; i++) {

				priceArrayActual[i] = Double.parseDouble(priceList.get(i).getText().trim().replace('RM', '').replace(',', ''));

				priceArrayExpected[i] = Double.parseDouble(priceList.get(i).getText().trim().replace('RM', '').replace(',', ''));
			}

			Arrays.sort(priceArrayExpected, Collections.reverseOrder());

			Assert.assertTrue(Arrays.equals(priceArrayActual, priceArrayExpected));
		}
		catch(Exception e) {
			KeywordUtil.markFailed("Price is not sorted in the "+sortOrder)
		}
	}
}

