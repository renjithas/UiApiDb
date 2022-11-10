/* Automation coverage:
**Scenario 3**: Users are able to search for an item

- Navigate to the homepage
- Search for “iPhone 14”
- Validate that the search results returned matches the search criteria
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
import my.iprice.homePackage.HomeLibrary as Home
import my.iprice.laptopsPackage.LaptopsLibrary

String product = "iPhone 14"

//Navigate to homepage
Util.fn_browserNavigate(GlobalVariable.url)

//Search for “iPhone 14”
Home.fn_search(product)

//Validate that the results returned from page 1 matches the selected product
Util.fn_validateResults(product)

