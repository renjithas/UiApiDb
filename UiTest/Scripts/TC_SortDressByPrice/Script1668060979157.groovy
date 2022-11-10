/* Automation coverage:
 * **Scenario 2**: Users are able to sort results under dresses by price in descending order

- Navigate to the `/clothing/dresses` page
- Click on Price sorting until the indicator indicates that the list is sorted by price in descending order
- Validate that the results are sorted in descending order of Price
*/

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import my.iprice.utilPackage.UtilLibrary as Util
import my.iprice.dressesPackage.DressesLibrary as Dresses

String sortOrder = "descending"

//Navigate to homepage and then redirect to `/clothing/dresses` page
Util.fn_browserNavigate(GlobalVariable.url)
Dresses.fn_navigateToClothingDressesPage()

//sort the price in descending order
Dresses.fn_sortPriceInDescending(sortOrder)

//Validate that the results are sorted in descending order of Price - this step would fail. Though sorted in descending order, ads still appear in between and hence validation would fail
Dresses.fn_validateSortOrder(sortOrder)

